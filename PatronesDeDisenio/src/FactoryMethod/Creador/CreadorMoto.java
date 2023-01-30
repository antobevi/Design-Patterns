package FactoryMethod.Creador;

import FactoryMethod.Producto.Moto;
import FactoryMethod.Producto.Transporte;

public class CreadorMoto extends Creador {

    public Transporte fabricarTransporte() {
        return new Moto();
    }

}
