import {async, ComponentFixture, TestBed} from "@angular/core/testing";
import {FlexColumnLayoutComponent} from "./flex-column-layout.component";

describe('FlexColumnLayoutComponent', () => {
  let component: FlexColumnLayoutComponent;
  let fixture: ComponentFixture<FlexColumnLayoutComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [FlexColumnLayoutComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FlexColumnLayoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
