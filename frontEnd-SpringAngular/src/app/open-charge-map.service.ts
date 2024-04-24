import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OpenChargeMapService {

  constructor(private http: HttpClient) { }

  getChargingPoints(): Observable<any[]> {
    //Change to where do you want to return data JSON
    return this.http.get<any[]>('https://api.openchargemap.io/v3/poi/?output=json&countrycode=US&maxresults=10?key=5dc9be8d-6af7-43e0-822c-856923d71485'); 
  }
}
