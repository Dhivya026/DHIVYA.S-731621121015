import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  navbar :string;
  MyStyle :{};
  button :string;
  constructor(){
    this.navbar="navbar";
    this.MyStyle={'font-style':'italic','color':'blue'};
    this.button="button";
  }
}
