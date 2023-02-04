package Builder.BuilderTiposProductos;

import Builder.Productos.Car;

public interface CarBuilder {

    void reset();

    void setSeats();

    void setEngine();

    void setGasolineTank();

    void setNumberDoors();

    void setGPS();

    Car getCar();

}
