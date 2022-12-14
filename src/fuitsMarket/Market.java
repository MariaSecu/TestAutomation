package fuitsMarket;

public class Market {
    public static void main(String[] args) {
        Apple red1 = new Apple(35.8);
        red1.makeJuice();
        red1.removePell();

        Orange orange = new Orange(41.3);
        orange.makeJuice();
        orange.removeSeeds();


    }
}
