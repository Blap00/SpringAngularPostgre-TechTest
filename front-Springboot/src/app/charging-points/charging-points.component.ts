import { Component, OnInit } from '@angular/core';
import { OpenChargeMapService } from '../open-charge-map.service';

@Component({
  selector: 'app-charging-points',
  templateUrl: './charging-points.component.html',
  styleUrls: ['./charging-points.component.css']
})
export class ChargingPointsComponent implements OnInit {
  chargingPoints: any[] = [];

  constructor(private openChargeMapService: OpenChargeMapService) { }

  ngOnInit(): void {
    this.openChargeMapService.getChargingPoints().subscribe(
      (data: any[]) => {
        this.chargingPoints = data;
      },
      (error) => {
        console.error('Error fetching charging points:', error);
      }
    );
  }
}
