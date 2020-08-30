import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PocketpetsComponent } from './pocketpets.component';

describe('PocketpetsComponent', () => {
  let component: PocketpetsComponent;
  let fixture: ComponentFixture<PocketpetsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PocketpetsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PocketpetsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
