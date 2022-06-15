public class GasCar implements Car{
    @Override
    public void getTypeCar() {
        System.out.println("This is the Gas car. \uD83C\uDFCE");
    }

    @Override
    public void getAveragePrice() {
        System.out.println("Average price is: 15000$");
    }
}
