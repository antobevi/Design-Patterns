package Composite;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Componente { // Componente compuesto
    private List<Componente> componentes; // puede tener productos o cajas

    public void addComponent(Componente componente) {
        componentes.add(componente);
    }

    public void removeComponent(Componente componente) {
        componentes.remove(componente);
    }
    public Double getWeight() {
        Double totalWeight = (double) 0;

        totalWeight = componentes.stream().mapToDouble(componente -> componente.getWeight()).sum();

        return totalWeight;
    }

}
