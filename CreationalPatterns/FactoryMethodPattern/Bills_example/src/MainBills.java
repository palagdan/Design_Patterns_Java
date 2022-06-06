public class MainBills {

    public static void main(String [] args){

        FactoryPlan factoryPlan = new FactoryPlan();

        String commercialPlan = "commercialplan";
        int units = 100;

        Plan p = factoryPlan.getPlan(commercialPlan);

        p.getRate();
        System.out.println("Bill amount for " + commercialPlan + "of" + units + "units is: " + p.calculateBill(units));

    }
}
