import { TestBed } from '@angular/core/testing';

import { TribunalesService } from './tribunales.service';

describe('TribunalesService', () => {
  let service: TribunalesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TribunalesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
