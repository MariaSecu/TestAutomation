package fuitsMarket;

public class Orange extends Fruit {
    @Override
    public void makeJuice() {
        System.out.println("This is an orange's juice");
    }

    public void removeSeeds() {
        System.out.println("Remove the seeds from the orange.");
    }

    public Orange(double calories) {
        System.out.println("One orange have calories:" + calories);
    }
}
