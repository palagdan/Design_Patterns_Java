public abstract class Plan {
    protected double rate;
    abstract void getRate();

    public double calculateBill(int units){
        return rate * units;
    }
}
