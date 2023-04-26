import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-template-driven',
  templateUrl: './template-driven.component.html',
  styleUrls: ['./template-driven.component.css']
})
export class TemplateDrivenComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    //create an instance of form f
  }

  // to print the values of registration page 
  onRegister(form:NgForm){
    console.log(form.value)
  }

}