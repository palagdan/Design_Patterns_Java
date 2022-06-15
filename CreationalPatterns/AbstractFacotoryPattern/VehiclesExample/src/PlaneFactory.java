public class PlaneFactory extends AbstractVehiclesFactory{
    @Override
    Plane getPlane(String plane) {

        if(plane == null)
            return null;

        if(plane.equalsIgnoreCase("MILITARYAIRCRAFT"))
            return new MilitaryAircraft();
        else if(plane.equalsIgnoreCase("JET"))
            return new Jet();

        else
            return null;

    }

    @Override
    Car getCar(String car) {
        return null;
    }
}
