import { Component, OnInit } from '@angular/core';
import { dog } from "../dog";

@Component({
  selector: 'app-dogs',
  templateUrl: './dogs.component.html',
  styleUrls: ['./dogs.component.css']
})
export class DogsComponent implements OnInit {

  
  dogProducts: dog[] = [

    {
      id: 1,
      name: 'Premium Dog Food',
      price: 20.00,
      description: '10lb bag of dog food made with quality ingredients',
      animal: 'dog'
    },
    
    
    
    {
        id: 6,
      name: 'Dog Toy',
      price: 5.00,
      description: 'fun, safe toy',
      animal: 'dog',
    },
    
    
    ];
  selectedDog = true;

  constructor() { }

  ngOnInit(): void {
  }

  

}
