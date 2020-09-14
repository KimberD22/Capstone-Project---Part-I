import { Component, OnInit } from '@angular/core';
//import { ProductsComponent } from '../products/products.component'

import { pocketpet } from "../pocketpet";

@Component({
  selector: 'app-pocketpets',
  templateUrl: './pocketpets.component.html',
  styleUrls: ['./pocketpets.component.css']
})
export class PocketpetsComponent implements OnInit {
  
  pocketpetProducts: pocketpet[] = [

    
    {
      id: 4,
      name: 'Premium Hamster Food',
      price: 7.00,
      description: '5lb container of hamster pellets made with quality ingredients',
      animal: 'pocket pet',
    },
    
    {
    id: 8,
    name: 'Pocket Pet Toy',
    price: 3.00,
    description: 'fun, safe toy',
    animal: 'pocket pet',
    },
    
    {
      id: 15,
      name: 'Pocket Pet Cage',
      price: 40.00,
      description: 'awesome home for your pocket pet',
      animal: 'pocket pet',
    }
    
    ]; 
  
  
  constructor() { }

  ngOnInit(): void {
  }

}
