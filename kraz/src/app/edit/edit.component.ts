import { Component, OnInit } from '@angular/core'
import { Hist } from 'src/app/interfaces/hist'
import { HistoryService } from 'src/app/services/history.service'
import { MessageService } from 'primeng/api'
import { AboutComponent } from 'src/app/about/about.component'

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.scss'],
  providers: [MessageService, AboutComponent]
})
export class EditComponent implements OnInit {
  History!: Hist[]
  uploadedFiles: any[] = []
  new_hist: Hist = new Hist()
  add = true
  selhist!: Hist

  constructor(
    private histService: HistoryService,
    private messageService: MessageService
  ) {}

  ngOnInit(): void {
    this.histService.getHistory().subscribe((hist) => {
      this.History = hist
      if (hist) {
        this.selhist = hist[1]
      }
    })
  }

  onAdd() {
    this.histService.createHist(this.new_hist).subscribe((data) => {
      this.updateHistory()
      this.histService.sendClickEvent()
    })
  }

  onUpdate() {
    this.histService.updateHistory(this.selhist).subscribe((hist) => {
      this.updateHistory()
      this.histService.sendClickEvent()
    })
  }

  onDelete(hist: Hist) {
    this.histService.deleteHist(hist).subscribe(() => {
      this.updateHistory()
      this.histService.sendClickEvent()
    })
  }

  onSelect(hist: Hist) {
    this.selhist = hist
  }

  updateHistory() {
    this.histService.getHistory().subscribe((hist) => {
      this.histService.setList(hist)
      this.History = hist
    })
  }

  showViaServiceAdd() {
    if (
      this.new_hist.num == undefined  ||
      this.new_hist.id == undefined ||
      this.new_hist.clas == '' ||
      this.new_hist.year == '' ||
      this.new_hist.imgsrc == '' ||
      this.new_hist.text == ''
    ) {
        this.onAdd()
        this.messageService.add({
          detail: 'Hist has been added'
        })
    }
  }
  showViaServiceUpdate() {
    if (
      this.selhist.num == undefined  ||
      this.selhist.id == undefined ||
      this.selhist.clas == '' ||
      this.selhist.year == '' ||
      this.selhist.imgsrc == '' ||
      this.selhist.text == ''
    ) {
        this.onUpdate()
        this.messageService.add({
          detail: 'Hist has been updated'
        })
    }
  }
}