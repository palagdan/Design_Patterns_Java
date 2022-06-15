public class FactoryProducer {

    public AbstractVehiclesFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("PLANE"))
            return new PlaneFactory();
        else if(choice.equalsIgnoreCase("CAR"))
            return new CarFactory();
        else return null;

    }
}
