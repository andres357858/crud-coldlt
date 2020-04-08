import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { ProductoRegistationService } from '../producto-registrar.service';
import { Item } from '../item';
import { Factura } from '../factura';
import { Producto } from '../producto';
import { Router } from '@angular/router';

@Component({
  selector: 'app-opciones',
  templateUrl: './opciones.component.html',
  styleUrls: ['./opciones.component.css']
})
export class SerachDeleteComponent implements OnInit {

  productos: any;
  cliente: string = "";
  items: Item[] = new Array<Item>();
  item: Item;
  factura: Factura = new Factura("", new Array<Item>(), 0);
  message: any;
  agregar: boolean = true;
  facturar: boolean = false;
  editar: boolean = false;
  edit : any;

  constructor(private service: ProductoRegistationService,private router:Router) { }


  public deleteProducto(id: number) {
    let resp = this.service.deleteProducto(id);
    resp.subscribe((data) => this.productos = data);
  }
  public editarProducto(product) {
    this.editar= true;
    this.edit = product;
    
  }
  public guardarEdicion(edit) {
 
    let resp = this.service.updateProducto(edit);
    resp.subscribe((data) => this.productos = data);
    this.editar= false;
  }


  public anadirItem(producto: Producto) {
    this.agregar=true;
    this.facturar=true;

    this.item = new Item(producto.nombre, 1, producto.valor);

    //se realiza validacion si ya existe el item en la factura
    //para solo sumarle +1 a la cantidad y tambien habilitar 
    // el boton de facturar 
    if (this.items.length > 0) {
      this.items.forEach(function (dato) {
        if (dato.producto == producto.nombre) {
          dato.cantidad =  dato.cantidad +1;
          
          console.log("igual: " + producto.nombre)
          this.agregar=false;
        }
        return dato;
      });
    } else {
      this.agregar=false;
      this.items.push(this.item);
    }
    if(this.agregar==true){
      this.items.push(this.item);
    }

  }

  public enviarFactura(cliente: string) {

    //Enviamos la factura y se limpia la lista de items y el boton de facturar

    this.factura = new Factura(cliente, this.items, 0);
    let resp = this.service.enviarFactura(this.factura);
    resp.subscribe((data) => this.factura = data);
    this.items = new Array<Item>()
    this.facturar=false;
  }

  public goToPage(pageName:string){
    this.router.navigate([`${pageName}`]);
  }

  ngOnInit() {
    let resp = this.service.getProductos();
    resp.subscribe((data) => this.productos = data);
  }

}
