import {NgModule} from "@angular/core";
import {FlexColumnLayoutComponent} from "./layout/flex-column-layout.component";
import {CommonModule} from "@angular/common";

@NgModule({
  imports: [
    CommonModule
  ],
  exports: [
    FlexColumnLayoutComponent
  ],
  declarations: [
    FlexColumnLayoutComponent
  ],
  providers: []
})
export class AppCommonModule {
}
