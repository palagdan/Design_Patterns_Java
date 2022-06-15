public class ElectricCar implements Car{
    @Override
    public void getTypeCar() {
        System.out.println("This is the Electric car. \uD83D\uDE97");
    }

    @Override
    public void getAveragePrice() {
        System.out.println("Average price is: 150000$");
    }
}
