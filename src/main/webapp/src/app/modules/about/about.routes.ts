import {Routes, RouterModule} from "@angular/router";
import {ModuleWithProviders} from "@angular/core";
import {AboutComponent} from "./about/about.component";

export const routes: Routes = [
  {
    path: 'about', component: AboutComponent,
    data: {
      title: 'About',
      listable: true
    }
  }
];

export const AboutRoutes: ModuleWithProviders = RouterModule.forChild(routes);
