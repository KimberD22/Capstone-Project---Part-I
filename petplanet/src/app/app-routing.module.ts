import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ProductsComponent } from './products/products.component';
import { CartComponent } from './cart/cart.component';
import { ContactComponent } from './contact/contact.component';
import { DogsComponent } from './dogs/dogs.component';
import { CatsComponent } from './cats/cats.component';
import { PocketpetsComponent } from './pocketpets/pocketpets.component';
import { BirdsComponent } from './birds/birds.component';
import { FishComponent } from './fish/fish.component';
import { PetparentsComponent } from './petparents/petparents.component';



const routes: Routes = [
  { path: "home", component: HomeComponent },
  { path: "products", component: ProductsComponent},
  { path: "cart", component: CartComponent},
  { path: "contact", component: ContactComponent},
  { path: '', redirectTo: '/home', pathMatch: 'full'},
  { path: "dogs", component: DogsComponent},
  { path: "cats", component: CatsComponent},
  { path: "pocketpets", component: PocketpetsComponent},
  { path: "birds", component: BirdsComponent},
  { path: "fish", component: FishComponent},
  { path: "petparents", component: PetparentsComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
