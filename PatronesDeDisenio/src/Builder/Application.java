package Builder;

import Builder.BuilderTiposProductos.ElectricCarBuilder;
import Builder.BuilderTiposProductos.ManualCarBuilder;
import Builder.Productos.ElectricCar;
import Builder.Productos.ManualCar;

public class Application {
    private Director director;

    public ElectricCar makeElectricCar() {
        director = new Director();
        ElectricCarBuilder builder = new ElectricCarBuilder();

        director.changeBuilder(builder);
        director.constructsCar();

        return builder.getCar();
    }

    public ManualCar makeManualCar() {
        director = new Director();
        ManualCarBuilder builder = new ManualCarBuilder();

        director.changeBuilder(builder);
        director.constructsCar();

        return builder.getCar();
    }

}
