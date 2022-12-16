package fuitsMarket;

public class Apple extends Fruit {
    @Override
    public void makeJuice() {
        System.out.println("This is an apple's juice");
    }

    public void removePell() {
        System.out.println("Remove the peel from the apple.");
    }

    public Apple(double calories) {
        System.out.println("An apple have calories:" + calories);

    }

}
