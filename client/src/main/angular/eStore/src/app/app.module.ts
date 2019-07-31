import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListItemsComponent } from './list-items/list-items.component';
import { BuyComponent } from './buy/buy.component';
import { OrderComponent } from './order/order.component';
import { RouterModule, Routes } from '@angular/router';


const appRoutes: Routes = [
  { path: 'buy', component: BuyComponent},
  { path: 'order',      component: OrderComponent },
  { path: 'list',      component: ListItemsComponent },
 
  { path: '',
    redirectTo: '/list',
    pathMatch: 'full'
  }
];

@NgModule({
  declarations: [
    AppComponent,
    ListItemsComponent,
    BuyComponent,
    OrderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
