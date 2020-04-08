import { Item } from './item';

export class Factura {

    cliente: string
    items:  Array<Item> = [];
    valorTotal: number
    constructor(
        cliente1: string,
        items1:   Array<Item>,
        valorTotal1: number
    ) {
        this.cliente = cliente1
        this.items =  items1
        this.valorTotal = valorTotal1
    }
}