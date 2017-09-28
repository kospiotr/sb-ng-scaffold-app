import {Routes, RouterModule} from "@angular/router";
import {ModuleWithProviders} from "@angular/core";
import {FilmsListComponent} from "./films-list/films-list.component";

export const routes: Routes = [
  {
    path: 'films/list', component: FilmsListComponent,
    data: {
      title: 'Work Items list',
      listable: true
    }
  }
];

export const FilmsRoutes: ModuleWithProviders = RouterModule.forChild(routes);
