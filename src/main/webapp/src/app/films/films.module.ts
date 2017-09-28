import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {FilmsListComponent} from "./films-list/films-list.component";
import {FilmsRoutes} from "./films.routes";
import {SharedModule, InputTextModule} from "primeng/primeng";
import {FilmsResources} from "./films-list/films.resources";
import {AgGridModule} from "ag-grid-angular/main";
import {PanelModule} from "primeng/components/panel/panel";
import {ToolbarModule} from "primeng/components/toolbar/toolbar";
import {SplitButtonModule} from "primeng/components/splitbutton/splitbutton";

@NgModule({
  imports: [
    CommonModule,
    FilmsRoutes,
    InputTextModule,
    PanelModule,
    ToolbarModule,
    SplitButtonModule,
    SharedModule,

    AgGridModule.withComponents([])
  ],
  declarations: [FilmsListComponent],
  providers: [
    FilmsResources
  ]
})
export class FilmsModule {
}
