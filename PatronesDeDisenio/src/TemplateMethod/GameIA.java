package TemplateMethod;

import java.util.List;

// La clase abstracta define un metodo plantilla que contiene un esqueleto de algun algoritmo compuesto por
// llamadas a operaciones primitivas abstractas (normalmente). Las subclases concretas implementan estas
// operaciones, pero dejan el propio metodo plantilla intacto.
public abstract class GameIA {
    protected List<Structures> builtStructures;
    protected List<Resource> resources;
    protected List<Enemy> enemies;
    protected Coordinates mapCentre;
    protected List<Scout> scouts;
    protected List<Warrior> warriors;

    public Enemy closestEnemy() {
        // TODO: Obtener el enemigo cuya posicion sea la mas cercana al centro del mapa
        return enemies.get(0);
    }

    // El metodo plantilla define el esqueleto de un algoritmo
    public void turn() {
        this.collectResources();
        this.buildStructures();
        this.buildUnits();
        this.attack();
    }

    // Algunos de los pasos se pueden implementar en una clase base directamente
    public void collectResources() {
        builtStructures.forEach(structure -> structure.collect());
    }

    public void attack() {
        Enemy enemy = this.closestEnemy();

        if(enemy == null) {
            this.sendScouts(this.mapCentre);
        } else {
            this.sendWarriors(enemy.getPosition());
        }

    }

    public abstract void buildStructures();

    public abstract void buildUnits();

    public abstract void sendScouts(Coordinates position);

    public abstract void sendWarriors(Coordinates position);

}
