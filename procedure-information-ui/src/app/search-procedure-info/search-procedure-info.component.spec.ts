import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchProcedureInfoComponent } from './search-procedure-info.component';

describe('SearchProcedureInfoComponent', () => {
  let component: SearchProcedureInfoComponent;
  let fixture: ComponentFixture<SearchProcedureInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SearchProcedureInfoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchProcedureInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
