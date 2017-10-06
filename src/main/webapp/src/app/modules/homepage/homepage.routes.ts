import {Routes, RouterModule} from "@angular/router";
import {ModuleWithProviders} from "@angular/core";
import {HomepageComponent} from "./homepage/homepage.component";

export const routes: Routes = [
  {
    path: 'homepage', component: HomepageComponent,
    data: {
      title: 'Homepage',
      listable: true
    }
  }
];

export const HomepageRoutes: ModuleWithProviders = RouterModule.forChild(routes);
