package Builder;

import Builder.BuilderTiposProductos.CarBuilder;

public class Director {
    private CarBuilder builder;

    public void changeBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public void constructsCar() { // tmb se le puede pasar x param el builder
        builder.reset(); // por si fue utilizada antes, para que este lista antes de construir de nuevo

        builder.setGPS();
        builder.setSeats();
        builder.setEngine();
        builder.setGasolineTank();
        builder.setNumberDoors();
        builder.setGPS();

        // La clase Director es opcional, pero sirve si queremos determinar un orden en los pasos de construccion.
        // Tambien nos abstraemos de llamar paso x paso cada uno desde el builder.
        // Es util cuando tenemos varios constructores de una misma familia (Ej. distintos autos).
    }

}
