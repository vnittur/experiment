import { Component, OnInit } from '@angular/core';
import { RestServiceService } from '../rest-service.service';

@Component({
  selector: 'app-buy',
  templateUrl: './buy.component.html',
  styleUrls: ['./buy.component.scss']
})
export class BuyComponent implements OnInit {

  constructor(private restService : RestServiceService) { }

  ngOnInit() {
  }

  public onBuy()
  {
    alert('Buy');
    this.restService.createOrder()
    .then(
        data => {
          alert(data.url);
            if(data == undefined)
            {
              alert(data.url)
            }
        },
        error => {
                       console.error(error);
        });
  }
}
