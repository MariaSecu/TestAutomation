package chapter11;

public class ShapeTaster {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println("The area of rectangle is: " + rectangle.calculateArea());
    }
}
