import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import {LoginComponent} from './authentification/login/login.component';
import {RegistrationComponent} from './authentification/registration/registration.component';

const routes: Routes = [
    {path: '', component: HomePageComponent,pathMatch: 'full'},
    {path: 'login', component: LoginComponent},
    {path: 'registration', component: RegistrationComponent}
  ];

  @NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forRoot(routes)]
  })
  export class AppRoutingModule {
  }