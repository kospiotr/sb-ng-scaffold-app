import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {WorkItemsListComponent} from "./work-items-list/work-items-list.component";
import {WorkItemsRoutes} from "./work-iterms.routes";
import {DataTableModule, SharedModule} from "primeng/primeng";
import {WorkItemsResources} from "./work-items-list/work-items.resources";

@NgModule({
  imports: [
    CommonModule,
    WorkItemsRoutes,
    DataTableModule,
    SharedModule
  ],
  declarations: [WorkItemsListComponent],
  providers: [
    WorkItemsResources
  ]
})
export class WorkItemsModule {
}
