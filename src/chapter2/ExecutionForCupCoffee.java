package chapter2;

public class ExecutionForCupCoffee {
    public static void main(String[] args) {
        System.out.println("On a " + CupOfCoffee.getAdjectiv("beautiful") + " " + CupOfCoffee.getSeason("summer") + " day, I drink a minimum of " + CupOfCoffee.cupOfCoffee(3) + " cups of coffee.");
    }
}
