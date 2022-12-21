package toys;

public class ToysMarket {
    public static void main(String[] args) {
        Dolls barbi1 = new Dolls(15);
        System.out.println("The price for one doll is: " + barbi1.getPrice(55.7));
        System.out.println("The total price for dolls are:" + barbi1.returnTotalPrice());
        Robots transformer = new Robots(12);
        System.out.println("For one robot you are need to pay: " + transformer.getPrice(75));
        System.out.println("The total price for the robots are: " + transformer.returnTotalPrice());
    }
}
