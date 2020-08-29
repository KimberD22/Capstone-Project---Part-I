import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
export const product = [
  {
    id: 1,
    name: 'Premium Dog Food',
    price: 20.00,
    description: '10lb bag of dog food made with quality ingredients',
    animal: 'dog'
  },
  {
      id: 2,
      name: 'Premium Cat Food ',
      price: 10.00,
      description: '10lb bag of cat food made with quality ingredients',
      animal: 'cat'
  },
  {
      id: 3,
      name: 'Premium Fish Food',
      price: 5.00,
      description: '2lb container of fish flakes made with quality ingredients',
      animal: 'fish',
  },
  {
    id: 4,
    name: 'Premium Hamster Food',
    price: 7.00,
    description: '5lb container of hamster pellets made with quality ingredients',
    animal: 'pocket pet',
  },
  {
      id: 5,
      name: 'Premium Bird Food',
      price: 8.00,
      description: '10lb container of bird seed made with quality ingredients',
      animal: 'bird', 
  },
  {
      id: 6,
    name: 'Dog Toy',
    price: 5.00,
    description: 'fun, safe toy',
    animal: 'dog',
  },
  {
  id: 7,
  name: 'Cat Toy',
  price: 5.00,
  description: 'fun, safe toy',
  animal: 'cat',
},
{
id: 8,
  name: 'Pocket Pet Toy',
  price: 3.00,
  description: 'fun, safe toy',
  animal: 'pocket pet',
},
{
id: 9,
  name: 'Bird Toy',
  price: 3.00,
  description: 'fun, safe toy',
  animal: 'bird',
},
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
}

];