package Prototype.Prototipos;

public class Circle extends Shape { // Concrete Prototype
    private Integer radius;

    public Circle(String color, Integer radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(Circle sourceShape) {
        super(sourceShape);
        this.radius = sourceShape.radius;
    }

    public Circle clone() {
        return new Circle(this);
    }

}
