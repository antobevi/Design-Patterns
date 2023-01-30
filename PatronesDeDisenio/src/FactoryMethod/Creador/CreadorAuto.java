package FactoryMethod.Creador;

import FactoryMethod.Producto.Auto;
import FactoryMethod.Producto.Transporte;

public class CreadorAuto extends Creador {

    public Transporte fabricarTransporte() {
        return new Auto();
    }

}