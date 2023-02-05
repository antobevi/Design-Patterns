package Adapter.ClasesCliente;

public class RoundHole {
    private Integer radius;

    public RoundHole(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public Boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }

}
