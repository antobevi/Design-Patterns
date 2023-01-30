package AbstractFactory.FabricaDeFamilias;

import AbstractFactory.TiposDeProductos.Mesa.Mesa;
import AbstractFactory.TiposDeProductos.Silla.Silla;
import AbstractFactory.TiposDeProductos.Sofa.Sofa;

public interface FabricaMuebles { // Abstract Factory o clase creadora

    Silla fabricarSilla();
    Sofa fabricarSofa();
    Mesa fabricarMesa();

}