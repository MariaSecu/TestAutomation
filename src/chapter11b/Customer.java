package chapter11b;

public class Customer {
    public static void main(String[] args) {
        Product book = new Book();
        book.setName("Ugly");
        book.setColor("blue");
        book.setPrice(9.99);
        System.out.println("The name of the book is: " + book.getName());
        System.out.println(" And have the color: " + book.getColor());
        System.out.println("You are need to pay $: " + book.getPrice());
    }
}
