import { Component, OnInit } from '@angular/core';
import { bird } from "../bird";

@Component({
  selector: 'app-birds',
  templateUrl: './birds.component.html',
  styleUrls: ['./birds.component.css']
})
export class BirdsComponent implements OnInit {
  birdProducts: bird[] = [

    
    {
        id: 5,
        name: 'Premium Bird Food',
        price: 8.00,
        description: '10lb container of bird seed made with quality ingredients',
        animal: 'bird', 
    },
    
    {
    id: 9,
    name: 'Bird Toy',
    price: 3.00,
    description: 'fun, safe toy',
    animal: 'bird',
    },
    
    
    ];
  constructor() { }

  ngOnInit(): void {
  }

}
