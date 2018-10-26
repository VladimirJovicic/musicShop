import { Component, OnInit } from '@angular/core';
import {AuthentificationService} from './../authentification.service'

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  newUser: any = {};

  constructor(private service:AuthentificationService) { }

  ngOnInit() {
  }

  register(){
    if(this.newUser.password !== this.newUser.repeatPassword){
      alert("Sifre se ne poklapaju!")
    }else {
    this.service.register(this.newUser).subscribe(
      (data:any)=>{
        alert("Uspesno je dodat korisnik");
      },error=>{
        alert(error.error);
      }
    );
  }
  }

}
