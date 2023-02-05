package Prototype;

import Prototype.Prototipos.Circle;
import Prototype.Prototipos.Rectangle;
import Prototype.Prototipos.Shape;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<Shape> shapes = new ArrayList<>(); // lista de prototipos

    public Application() {
        Circle redCircle = new Circle("Red", 20);
        shapes.add(redCircle);

        Circle anotherRedCircle = redCircle.clone();
        shapes.add(anotherRedCircle);

        Rectangle blueRectangle = new Rectangle("Blue", 10, 20);
        shapes.add(blueRectangle);

        Rectangle anotherBlueRectangle = blueRectangle.clone();
        shapes.add(anotherBlueRectangle);
    }

}
