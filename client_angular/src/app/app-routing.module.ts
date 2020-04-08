import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegistrationComponent } from './registrar/registrar.component';
import { SerachDeleteComponent } from './opciones/opciones.component';

const routes: Routes = [
  {path:"",redirectTo:"registrarProducto",pathMatch:"full"},
   {path:"registrarProducto",component:RegistrationComponent},
   {path:"opciones",component:SerachDeleteComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
