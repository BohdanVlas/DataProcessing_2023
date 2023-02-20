import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

import { Service1 } from '../services/service1';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent  {
  constructor(private service:Service1){}

  name: string = '';
  namee: string = '';
  nameee: string = '';
  imgsrc: string = '';
  imgalt: string = '';
  imgtitle: string = '';


  getName(val: string) {
    console.warn(val)
    this.name = val
  }
  getNamee(val: string) {
    console.warn(val)
    this.namee = val
  }
  getNameee(val: string) {
    console.warn(val)
    this.nameee = val
  }
  getImg1(val: string) {
    console.warn(val)
    this.imgsrc = val
  }
  getImg2(val: string) {
    console.warn(val)
    this.imgalt = val
  }
  getImg3(val: string) {
    console.warn(val)
    this.imgtitle = val
  }

  OnClick(): void { 
    console.log(this.name)
    console.log(this.namee)
    console.log(this.nameee)
    console.log(this.imgsrc)
    console.log(this.imgalt)
    console.log(this.imgtitle)
    this.service.postdata( this.name, this.namee, this.nameee, this.imgsrc, this.imgalt, this.imgtitle );
  }
}