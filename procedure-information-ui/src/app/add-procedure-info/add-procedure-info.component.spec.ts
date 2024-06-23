import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddProcedureInfoComponent } from './add-procedure-info.component';

describe('AddProcedureInfoComponent', () => {
  let component: AddProcedureInfoComponent;
  let fixture: ComponentFixture<AddProcedureInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddProcedureInfoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddProcedureInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
