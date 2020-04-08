import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Factura } from './factura';
import { Producto } from './producto';

@Injectable({
  providedIn: 'root'
})
export class ProductoRegistationService {

  constructor(private http:HttpClient) { }


  public registrarProducto(producto){
    return this.http.post("http://localhost:9090/registrarProducto",producto,{responseType:'text' as 'json'});
  }

  public enviarFactura(factura){
    return this.http.post<Factura>("http://localhost:9090/registrarFactura",factura,{responseType:'text' as 'json'});
  }

  public getProductos(){
    return this.http.get("http://localhost:9090/consultarProductos");
  }

  public deleteProducto(id){
    return this.http.delete("http://localhost:9090/eliminarProducto/"+id);
  }

  updateProducto(producto){
    return this.http.put("http://localhost:9090/editarProducto/"+producto.id,producto);
  }

}
