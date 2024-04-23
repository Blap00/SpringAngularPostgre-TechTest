import { TestBed } from '@angular/core/testing';

import { OpenChargeMapService } from './open-charge-map.service';

describe('OpenChargeMapService', () => {
  let service: OpenChargeMapService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OpenChargeMapService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
