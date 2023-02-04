package Builder.BuilderTiposProductos;

import Builder.Productos.ElectricCar;

public class ElectricCarBuilder implements CarBuilder {
    private String engine;
    private Integer seats;
    private Double gasolineTank;
    private Integer numberDoors;
    private String  gps;
    private ElectricCar electricCar;

    public void reset() {
        engine = "";
        seats = 0;
        gasolineTank = 0.0;
        numberDoors = 0;
        gps = "";
    }
    public void setSeats() {
        this.seats = 2;
    }

    public void setEngine() {
        this.engine = "super turbo 2000";
    }

    public void setGasolineTank() {
        this.gasolineTank = 100.0;
    }

    public void setNumberDoors() {
        this.numberDoors = 2;
    }

    public void setGPS() {
        this.gps = "Google GPS";
    }

    public ElectricCar getCar() {
        ElectricCar car = new ElectricCar(engine, seats, gasolineTank, numberDoors, gps);

        this.reset();

        return car;
    }

}
