package Prototype.Prototipos;

public class Rectangle extends Shape { // Concrete Prototype
    private Integer width;
    private Integer height;

    public Rectangle(String color, Integer width, Integer height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle sourceShape) {
        super(sourceShape);
        this.width = sourceShape.width;
        this.height = sourceShape.height;
    }

    public Rectangle clone() {
        return new Rectangle(this);
    }

}
