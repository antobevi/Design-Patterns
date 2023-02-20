package TemplateMethod;

// Las clases concretas (Orcs y Monsters) tienen que implementar todas las operaciones abstractas de la clase
// base, pero no deben sobreescribir el propio metodo plantilla (turn())
public class OrcsIA extends GameIA {

    public void buildStructures() {
        if(!this.builtStructures.isEmpty()) {
            // TODO: Construir granjas, cuarteles, fortaleza, etc.
        }
    }

    public void buildUnits() {
        if (!this.resources.isEmpty()) {
            if (this.scouts.isEmpty()) {
                // TODO: Crear peones y agregarlos a la lista de Scouts.
            } else {
            // TODO: Crear soldado y agregarlos a la lista de Warriors.
            }
        }
    }

    public void sendScouts(Coordinates position) {
        if(this.scouts.size() > 0) {
            this.scouts.forEach(scout -> scout.moveTo(position));
        }
    }

    public void sendWarriors(Coordinates position) {
        if(this.warriors.size() > 5) {
            this.warriors.forEach(warrior -> warrior.moveTo(position));
        }
    }

}
