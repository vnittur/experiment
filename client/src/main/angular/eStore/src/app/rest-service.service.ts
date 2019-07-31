import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { DatePipe } from '@angular/common'
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RestServiceService {

  constructor(private http: HttpClient,public datepipe: DatePipe) { }

  createOrder()
  {
     return this.http.post<CreateOrderResponse>(`${environment.apiUrl}/order/create`,{}).toPromise();
  }

}
