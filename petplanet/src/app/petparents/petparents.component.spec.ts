import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PetparentsComponent } from './petparents.component';

describe('PetparentsComponent', () => {
  let component: PetparentsComponent;
  let fixture: ComponentFixture<PetparentsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PetparentsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PetparentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
