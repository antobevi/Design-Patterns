# Design-Patterns
Practica y explicación de los patrones de diseño.

* ## **Patrones creacionales**:
  Estos proporcionan varios mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización del código existente.
  * **Factory Method**.
  * **Abstract Factory**.
  * **Builder**.
  * Prototype.
  * **Singleton**.
* ## **Patrones estructurales**:
  Estos explican cómo ensamblar objetos y clases en estructuras más grandes, a la vez que se mantiene la flexibilidad y eficiencia de estas estructuras.
  * **Adapter**.
  * Bridge.
  * **Composite**.
  * Decorator.
  * Facade.
  * Flyweight.
  * Proxy.
* ## **Patrones de comportamiento**:
  * Chain of Responsability.
  * **Command**.
  * Iterator.
  * Mediator.
  * Memento.
  * **Observer**.
  * **State**.
  * **Strategy**.
  * **Templete Method**.
  * Visitor.

## Ventajas, Desventajas y Cuándo utilizar c/u
### Factory Method
#### ¿Cuándo usarlo?
* Se utiliza cuando no se conoce de antemano las dependencias y los tipos exactos de los objetos con los que
  debe funcionar el código.
* Se utiliza cuando se quiere ahorrar recursos del sistema mediante la reutilizacion de objetos existentes en
  lugar de construirlos una y otra vez.
* Si hay demasiados productos, combiene el Abstract Factory.
* Es un caso particular del Template Method (que delega comportamiento).

#### Ventajas y Desventajas
* Me permite delegar construcción.
* Evitas un acoplamiento fuerte entre el creador y los productos concretos.
* Principio de responsabilidad única: Podes mover el código de creación de producto a un lugar del programa, haciendo que el código sea más fácil de mantener.
* Principio de abierto/cerrado: Podes incorporar nuevos tipos de productos en el programa sin descomponer el código cliente existente.
* Permite una abstracción simple para obtener un objeto determinado con valores ya definidos, sólo llamas al objeto creador.
* Puede ser que el código se complique, ya que tenes incorporar una multitud de nuevas subclases para implementar el patrón.
### Abstract Factory
...

### Builder
...

### Singleton
...