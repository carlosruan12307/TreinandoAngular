import { ComponentFixture, TestBed } from '@angular/core/testing';

import { momentsComponent } from './moments.component';

describe('momentsComponent', () => {
  let component: momentsComponent;
  let fixture: ComponentFixture<momentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ momentsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(momentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
