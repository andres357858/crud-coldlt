import { Component, OnInit } from '@angular/core';
import { Producto } from '../producto';
import { ProductoRegistationService } from '../producto-registrar.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registrar',
  templateUrl: './registrar.component.html',
  styleUrls: ['./registrar.component.css']
})
export class RegistrationComponent implements OnInit {


  producto: Producto = new Producto("", "", 0);
  message: any;

  constructor(private service: ProductoRegistationService, private router: Router) { }

  ngOnInit() {
  }


  public registrarProducto() {
    let resp = this.service.registrarProducto(this.producto);
    resp.subscribe((data) => this.message = data);
  }

  public goToPage(pageName:string){
    this.router.navigate([`${pageName}`]);
  }

}
