import {NgModule} from "@angular/core";
import {Routes, RouterModule} from "@angular/router";

const routes: Routes = [
  {
    path: '', redirectTo: '/homepage', pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule],
  providers: []
})
export class AppRoutingModule {
}
