import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { BehaviorSubject, Observable, Subject } from 'rxjs'
import { Hist } from '../interfaces/hist'

@Injectable({
  providedIn: 'root'
})
export class HistoryService {
  list = new BehaviorSubject<Hist[]>([])
  private subject = new Subject<any>()

  get_url: string = 'http://localhost:5300/retrieve'
  post_url: string = 'http://localhost:5300/create'
  put_url: string = 'http://localhost:5300/update'
  del_url: string = 'http://localhost:5300/delete'

  constructor(private http: HttpClient) {}

  getHistory(): Observable<Hist[]> {
    return this.http.get<Hist[]>(this.get_url)
  }

  createHist(history: Hist): Observable<any> {
    return this.http.post(this.post_url, history)
  }

  updateHistory(history: Hist): Observable<Object> {
    return this.http.put(`${this.put_url}/${history.id}`, history)
  }

  deleteHist(history: Hist): Observable<Hist[]> {
    return this.http.delete<Hist[]>(this.del_url + '/' + history.id)
  }

  setList(history: Hist[]) {
    this.list.next(history)
  }

  sendClickEvent() {
    this.subject.next(1)
  }

  getClickEvent(): Observable<any> {
    return this.subject.asObservable()
  }
}