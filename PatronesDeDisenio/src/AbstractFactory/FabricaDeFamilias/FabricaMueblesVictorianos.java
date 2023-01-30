package AbstractFactory.FabricaDeFamilias;

import AbstractFactory.TiposDeProductos.Mesa.Mesa;
import AbstractFactory.TiposDeProductos.Mesa.MesaVictoriana;
import AbstractFactory.TiposDeProductos.Silla.Silla;
import AbstractFactory.TiposDeProductos.Silla.SillaVictoriana;
import AbstractFactory.TiposDeProductos.Sofa.Sofa;
import AbstractFactory.TiposDeProductos.Sofa.SofaVictoriano;

public class FabricaMueblesVictorianos implements FabricaMuebles {

    public Silla fabricarSilla() {
        return new SillaVictoriana();
    }

    public Sofa fabricarSofa() {
        return new SofaVictoriano();
    }

    public Mesa fabricarMesa() {
        return new MesaVictoriana();
    }

}