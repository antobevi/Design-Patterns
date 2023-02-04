package Builder.BuilderTiposProductos;

import Builder.Productos.ManualCar;

public class ManualCarBuilder implements CarBuilder {
    private String engine;
    private Integer seats;
    private Double gasolineTank;
    private Integer numberDoors;

    public void reset() {
        engine = "";
        seats = 0;
        gasolineTank = 0.0;
        numberDoors = 0;
    }

    public void setSeats() {
        this.seats = 4;
    }

    public void setEngine() {
        this.engine = "turbo";
    }

    public void setGasolineTank() {
        this.gasolineTank = 50.5;
    }

    public void setNumberDoors() {
        this.numberDoors = 4;
    }

    public void setGPS() {
    }

    public ManualCar getCar() {
        ManualCar car = new ManualCar(engine, seats, gasolineTank, numberDoors);

        this.reset();

        return car;
    }

}
