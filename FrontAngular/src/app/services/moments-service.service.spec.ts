import { TestBed } from '@angular/core/testing';

import { MomentsServiceService } from './moments-service.service';

describe('MomentsServiceService', () => {
  let service: MomentsServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MomentsServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
