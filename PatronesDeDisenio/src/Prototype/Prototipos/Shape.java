package Prototype.Prototipos;

public abstract class Shape { // clase base Prototype
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape(Shape shapeSource) {
        this.color = shapeSource.color;
    }

    public abstract Shape clone();

}
