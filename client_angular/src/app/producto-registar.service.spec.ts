import { TestBed } from '@angular/core/testing';

import { ProductoRegistationService } from './producto-registrar.service';

describe('UserRegistationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProductoRegistationService = TestBed.get(ProductoRegistationService);
    expect(service).toBeTruthy();
  });
});
