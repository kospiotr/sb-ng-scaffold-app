import {BrowserModule} from "@angular/platform-browser";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {NgModule} from "@angular/core";
import {FormsModule} from "@angular/forms";
import {HttpModule} from "@angular/http";
import {AppRoutingModule} from "./app-routing.module";
import {AppComponent} from "./app.component";
import {HomepageModule} from "./modules/homepage/homepage.module";
import {AboutModule} from "./modules/about/about.module";
import {AppCommonModule} from "../common/appCommon.module";
import {FilmsModule} from "./modules/films/films.module";
import {HeaderComponent} from "./globals/header/header.component";
import {ButtonModule} from "primeng/components/button/button";
import {InputTextModule} from "primeng/components/inputtext/inputtext";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent
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
    FilmsModule,
    ButtonModule,
    InputTextModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
