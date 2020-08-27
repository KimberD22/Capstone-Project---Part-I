import { Component, OnInit } from '@angular/core';

import { products } from '../products';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {
  products = products;

  constructor() { 
    id: Number
    name: String
    price: Number
    description: String
    animal: String
  
  

 
  }

}
