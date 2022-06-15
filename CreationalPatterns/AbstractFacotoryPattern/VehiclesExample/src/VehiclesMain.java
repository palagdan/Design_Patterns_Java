public class VehiclesMain {

    public static void main(String [] args){

        //get plane factory;
        AbstractVehiclesFactory planeFactory = new FactoryProducer().getFactory("PLANE");

        //get car factory
        AbstractVehiclesFactory carFactory = new FactoryProducer().getFactory("CAR");

        Plane plane = planeFactory.getPlane("JET");

        Car car = carFactory.getCar("Electric");

        plane.getTypePlane();
        plane.getAveragePrice();
        System.out.println("--------------------------------------------------------");
        car.getTypeCar();
        car.getAveragePrice();



    }
}
