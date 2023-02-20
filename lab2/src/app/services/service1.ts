import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

export interface Ka226 {
    name:string;
    namee:string;
    nameee:string;
    imgsrc:string;
    imgalt:string;
    imgtitle:string;
}

@Injectable({
  providedIn: 'root'
})
export class Service1 { 
  url:string="http://localhost:8300/Ka226MainServlet"

  constructor(private http:HttpClient) { }

  getKa226():Observable<Ka226[]>{
    return this.http.get<Ka226[]>(this.url);
  }

  public postdata( Name: Object, Namee: Object, Nameee: Object, Imgsrc: Object, Imgalt: Object, Imgtitle: Object) {
    this.http.put(this.url, "?name="+Name+"&namee="+Namee+"&nameee="+Nameee+"&imgsrc="+Imgsrc+"&imgalt="+Imgalt+"&imgtitle="+Imgtitle).subscribe(Ka226 => {
      console.log(Ka226);
    });
  }
}
