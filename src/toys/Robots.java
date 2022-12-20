package toys;

public class Robots extends Toys {
    public Robots(int stock) {
        this.stock = stock;
        if (stock > 0) {
            System.out.println("The stock of robots are: " + stock);
        } else {
            System.out.println("These toys are out of stock.");
        }
    }

    @Override
    public double returnTotalPrice() {
        if (price < 0 || stock < 0) {
            System.out.println("This robots aren't in stock");
        } else {
            return stock * price;
        }
        return 0;
    }

    public int stock;
    public double price;

    public double getPrice(double price) {
        this.price = price;
        return price;
    }

    public int getStock() {
        return stock;
    }


}
