import {Routes, RouterModule} from "@angular/router";
import {ModuleWithProviders} from "@angular/core";
import {WorkItemsListComponent} from "./work-items-list/work-items-list.component";

export const routes: Routes = [
  {
    path: 'work-items/list', component: WorkItemsListComponent,
    data: {
      title: 'Work Items list',
      listable: true
    }
  }
];

export const WorkItemsRoutes: ModuleWithProviders = RouterModule.forChild(routes);
