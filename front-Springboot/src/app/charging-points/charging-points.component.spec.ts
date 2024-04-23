import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChargingPointsComponent } from './charging-points.component';

describe('ChargingPointsComponent', () => {
  let component: ChargingPointsComponent;
  let fixture: ComponentFixture<ChargingPointsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChargingPointsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ChargingPointsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
