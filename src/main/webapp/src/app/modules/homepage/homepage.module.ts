import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";
import {HomepageComponent} from "./homepage/homepage.component";
import {HomepageRoutes} from "./homepage.routes";
import {AppCommonModule} from "../../../common/appCommon.module";
import {PanelModule} from "primeng/components/panel/panel";

@NgModule({
  imports: [
    CommonModule,
    AppCommonModule,
    FormsModule,
    HomepageRoutes,
    PanelModule
  ],
  exports: [],
  declarations: [
    HomepageComponent,
  ],
  providers: []
})
export class HomepageModule {
}
