import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

/*@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
  name : string;
  age : number;
  email : string;
  imagePath:string;
  fname : string;
  
  constructor(){
    this.name = "Dhivya";
    this.age = 20;
    this.email = "dhivya@gmail.com";
    this.imagePath = "https://images.pexels.com/photos/326055/pexels-photo-326055.jpeg?auto=compress&cs=tinysrgb&w=400";
    this.fname = "";
  }
  changeName(){
    this.name = "Dhivi";
  }
  changeImage(){
    this.imagePath = "https://images.pexels.com/photos/1133957/pexels-photo-1133957.jpeg?auto=compress&cs=tinysrgb&w=400";
  }
 
}

export class AppComponent {
  flag : boolean;
  vehicles : string[];
  selectedVehicle : string;
  myStyle : {};
  Myclass :string;

  constructor(){
    this.flag = true;
    this.vehicles = ["TwoWheeler","ThreeWheeler","FourWheeler"];
    this.selectedVehicle = "";
    this.myStyle ={'width':'30%','border': '2px solid green','border-radius':'25px'};
    this.Myclass = "Myclass1";
  }
  changeFlag(){
    this.flag = ! this.flag;
  }
  setSelectedItem(vec:string){
    this.selectedVehicle = vec ;

  }
  changeStyle(){
    this.myStyle ={'width':'30%','border': '2px solid red','border-radius':'25px'};
    
  }
}
*/

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  sum : number;
  
  constructor(private calc :CalculatorService){
    this.sum = calc.getAddition(10,20);
  
  }

}

