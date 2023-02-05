package Adapter;

import Adapter.Servicio.SquarePeg;

// Este finge ser una pieza redonda de un diametro minimo que entre en el cuadrado
// Asi podemos pasar un cuadrado por un agujero redondo (adapta un cuadrado a un circulo)
public class SquarePegAdapter { // Clase Adaptadora
    private SquarePeg squarePeg;

    public  SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public Integer getRadius() {
        // El adaptador simula que es una pieza redonda con un radio que pueda abergar la pieza cuadrada a la
        // cual el adaptador envuelve.
        return (int) (squarePeg.getWidth() * Math.sqrt(2) / 2);
    }

}
