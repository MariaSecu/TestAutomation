package lesson3_OOP;

public class Main {
    public static void main(String[] args) {
        Cerc newCircle = new Cerc(4);
        System.out.println("The area of the circle is: " + newCircle.returnArea());
        System.out.println("And the perimeter is: " + newCircle.returnPerimeter());
        Patrat square001 = new Patrat(5);
        System.out.println("The square area is equale of: " + square001.returnArea());
        System.out.println("And the perimeters of square is: " + square001.returnPerimeter());
        Romb rhombus001 = new Romb(3, 7);
        System.out.println("The area of the Rhombus is: " + rhombus001.returnArea());
        System.out.println("And the perimeters is: " + rhombus001.returnPerimeter());

    }
}
