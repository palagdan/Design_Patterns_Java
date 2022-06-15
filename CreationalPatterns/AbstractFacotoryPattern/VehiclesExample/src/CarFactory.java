public class CarFactory extends AbstractVehiclesFactory{

    @Override
    Plane getPlane(String plane) {
        return null;
    }

    @Override
    Car getCar(String car) {

        if(car == null)
            return null;

        if(car.equalsIgnoreCase("GAS"))
            return new GasCar();
        else if(car.equalsIgnoreCase("ELECTRIC"))
            return new ElectricCar();
        else
            return null;
    }
}
