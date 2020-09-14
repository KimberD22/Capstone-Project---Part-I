import { Component, OnInit } from '@angular/core';
import { petparent } from "../petparent";

@Component({
  selector: 'app-petparents',
  templateUrl: './petparents.component.html',
  styleUrls: ['./petparents.component.css']
})
export class PetparentsComponent implements OnInit {
  petparentsProducts: petparent[] = [

    
    {
    id: 10,
    name: 'T-Shirt Cat MoM',
    price: 10.00,
    description: 'fun, safe toy',
    animal: 'pet parents',
    },
    {
    id: 11,
    name: 'T-Shirt Doggy Daddy',
    price: 10.00,
    description: 'fun, safe toy',
    animal: 'pet parents',
    },
    {
    id: 12,
    name: 'T-Shirt Cat Daddy',
    price: 10.00,
    description: 'fun, safe toy',
    animal: 'pet parent',
    
    },
    {
    id: 13,
    name: 'T-Shirt Doggy Mommy',
    price: 10.00,
    description: 'fun, safe toy',
    animal: 'pet parents',
    },
    
    
    ];
  constructor() { }

  ngOnInit(): void {
  }

}
