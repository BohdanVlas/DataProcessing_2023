import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core'
import { SelectItem } from 'primeng/api'
import { Subscription } from 'rxjs'
import { Hist } from 'src/app/interfaces/hist'
import { HistoryService } from 'src/app/services/history.service'
import { EditComponent } from 'src/app/edit/edit.component'

@Component({
    selector: 'app-history',
    templateUrl: './history.component.html',
    styleUrls: ['./history.component.scss']
})
export class HistoryComponent implements OnInit {
    title = 'History';

    clickEventSubscription!: Subscription

    History!: Hist[]

    selhist?: Hist

    constructor(private historyService: HistoryService) {
        this.clickEventSubscription = this.historyService
            .getClickEvent()
            .subscribe(() => {
                this.updateHistory()
            })
    }

    updateHistory() {
        this.historyService.getHistory().subscribe((hist) => {
            this.historyService.setList(hist)
            this.History = hist
        })
    }

    onSelect(hist: Hist) {
        if (this.selhist && hist.id == this.selhist.id) {
            this.selhist = undefined
        } else {
            this.selhist = hist
        }
    }

    @Output() newItemEvent = new EventEmitter<Hist>()
    addNewItem(hist: Hist) {
        this.newItemEvent.emit(hist)
    }
}