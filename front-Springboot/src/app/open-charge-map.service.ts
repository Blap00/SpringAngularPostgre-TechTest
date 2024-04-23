// Import the necessary dependencies
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

// Define the OpenChargeMapService as an Injectable service
@Injectable({
  providedIn: 'root'
})
export class OpenChargeMapService {

  // Inject an instance of HttpClient into the service constructor
  constructor(private http: HttpClient) { }

  // Define a method to fetch data from the Open Charge Map API
  getChargingPoints(): Observable<any[]> {
    // Use HttpClient.get() to make a GET request to the API endpoint
    // 'https://api.openchargemap.io/v3/poi/?output=json'
    // and return an Observable that emits the response
    return this.http.get<any[]>('https://api.openchargemap.io/v3/poi/?output=json');
  }
}