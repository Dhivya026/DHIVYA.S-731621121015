import { Component } from '@angular/core';
import { title } from 'node:process';
import { Patient } from '../model/Patient';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Project';
  Pat:Patient;
  constructor(){
    this.Pat=new Patient();
  }
}
