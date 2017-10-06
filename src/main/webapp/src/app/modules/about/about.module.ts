import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";
import {AboutComponent} from "./about/about.component";
import {AboutRoutes} from "./about.routes";
import {PanelModule} from "primeng/primeng";
import {AppCommonModule} from "../../../common/appCommon.module";

@NgModule({
  imports: [
    CommonModule,
    AppCommonModule,
    FormsModule,
    PanelModule,
    AboutRoutes
  ],
  exports: [],
  declarations: [
    AboutComponent],
  providers: []
})
export class AboutModule {
}
