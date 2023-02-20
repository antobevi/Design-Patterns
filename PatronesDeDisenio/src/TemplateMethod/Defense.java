package TemplateMethod;

public abstract class Defense {
    protected Coordinates position;

    public void moveTo(Coordinates position) {
        this.position = position;
    }

}
