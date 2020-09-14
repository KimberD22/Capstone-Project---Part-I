import { Component, OnInit } from '@angular/core';
import { fishies } from "../fishies";

@Component({
  selector: 'app-fish',
  templateUrl: './fish.component.html',
  styleUrls: ['./fish.component.css']
})
export class FishComponent implements OnInit {
  fishProducts: fishies[] = [


      
    
    {
        id: 3,
        name: 'Premium Fish Food',
        price: 5.00,
        description: '2lb container of fish flakes made with quality ingredients',
        animal: 'fish',
    },
    
      
    
    {
      id: 14,
    name: 'Fish Tank',
    price: 40.00,
    description: 'awesome home for your fish',
    animal: 'fish',
    },
   
    
    ];
  constructor() { }

  ngOnInit(): void {
  }

}
