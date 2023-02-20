package TemplateMethod;

// Las subclases tambien pueden sobreescribir algunas operaciones con una implementacion por defecto.
public class MonstersIA extends GameIA {

    @Override
    public void collectResources() {
        // Los monstruos no recolectan recursos
    }

    public void buildStructures() {
        // Los monstruos no construyen estructuras
    }

    public void buildUnits() {
        // Los monstruos no construyen unidades
    }

    public void sendScouts(Coordinates position) {
        //this.scouts.forEach(scout -> scout.moveTo(position));
    }

    public void sendWarriors(Coordinates position) {
        //this.warriors.forEach(warrior -> warrior.moveTo(position));
    }

}
