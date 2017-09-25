import {BrowserModule} from "@angular/platform-browser";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {NgModule} from "@angular/core";
import {FormsModule} from "@angular/forms";
import {HttpModule} from "@angular/http";
import {AppRoutingModule} from "./app-routing.module";
import {AppComponent} from "./app.component";
import {HomepageModule} from "./homepage/homepage.module";
import {AboutModule} from "./about/about.module";
import {AppCommonModule} from "../common/appCommon.module";
import {WorkItemsModule} from "./work-items/work-items.module";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppCommonModule,
    FormsModule,
    HttpModule,
    AppRoutingModule,
    HomepageModule,
    AboutModule,
    WorkItemsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
