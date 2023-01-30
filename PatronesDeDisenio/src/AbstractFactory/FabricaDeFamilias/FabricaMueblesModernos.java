package AbstractFactory.FabricaDeFamilias;

import AbstractFactory.TiposDeProductos.Mesa.Mesa;
import AbstractFactory.TiposDeProductos.Mesa.MesaModerna;
import AbstractFactory.TiposDeProductos.Silla.Silla;
import AbstractFactory.TiposDeProductos.Silla.SillaModerna;
import AbstractFactory.TiposDeProductos.Sofa.Sofa;
import AbstractFactory.TiposDeProductos.Sofa.SofaModerno;

public class FabricaMueblesModernos implements FabricaMuebles {

    public Silla fabricarSilla() {
        return new SillaModerna();
    }

    public Sofa fabricarSofa() {
        return new SofaModerno();
    }

    public Mesa fabricarMesa() {
        return new MesaModerna();
    }

}