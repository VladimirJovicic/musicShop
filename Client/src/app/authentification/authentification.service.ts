import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthentificationService {

  constructor(private http: HttpClient) { }

  register(newUser : any){
    return this.http.post("/musicShop/auth/register",newUser);
  }
}
