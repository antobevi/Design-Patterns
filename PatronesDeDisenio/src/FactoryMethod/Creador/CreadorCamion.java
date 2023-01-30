package FactoryMethod.Creador;

import FactoryMethod.Producto.Camion;
import FactoryMethod.Producto.Transporte;

public class CreadorCamion extends Creador {

    public Transporte fabricarTransporte() {
        return new Camion();
    }

}