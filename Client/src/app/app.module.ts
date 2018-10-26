import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import {AppRoutingModule} from './app-routing.module';
import { NavbarComponent } from './home-page/navbar/navbar.component';
import { LoginComponent } from './authentification/login/login.component';
import { RegistrationComponent } from './authentification/registration/registration.component';
import {AuthentificationService} from './authentification/authentification.service';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    NavbarComponent,
    LoginComponent,
    RegistrationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AuthentificationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
