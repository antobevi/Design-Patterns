package AbstractFactory;

import AbstractFactory.FabricaDeFamilias.FabricaMuebles;
import AbstractFactory.TiposDeProductos.Mesa.Mesa;
import AbstractFactory.TiposDeProductos.Silla.Silla;
import AbstractFactory.TiposDeProductos.Sofa.Sofa;

import java.util.Objects;

public class Aplicacion {
    private FabricaMuebles tipoFabrica;
    private Silla silla;
    private Sofa sofa;
    private Mesa mesa;

    public Aplicacion(FabricaMuebles tipoFabrica) {
        this.tipoFabrica = Objects.requireNonNull(tipoFabrica);
        this.silla = tipoFabrica.fabricarSilla();
        this.sofa = tipoFabrica.fabricarSofa();
        this.mesa = tipoFabrica.fabricarMesa();
    }

}