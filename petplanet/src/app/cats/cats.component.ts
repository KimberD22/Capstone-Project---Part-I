import { Component, OnInit } from '@angular/core';
import { cat } from "../cat";

@Component({
  selector: 'app-cats',
  templateUrl: './cats.component.html',
  styleUrls: ['./cats.component.css']
})
export class CatsComponent implements OnInit {
  catProducts: cat[] = [

   
    {
        id: 2,
        name: 'Premium Cat Food ',
        price: 10.00,
        description: '10lb bag of cat food made with quality ingredients',
        animal: 'cat'
    
    },
    {
    id: 7,
    name: 'Cat Toy',
    price: 5.00,
    description: 'fun, safe toy',
    animal: 'cat',
    },
    
    ];

    selectedCat = true;
  constructor() { }

  ngOnInit(): void {
  }

}
