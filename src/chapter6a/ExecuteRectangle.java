package chapter6a;

public class ExecuteRectangle {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();
        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("The total area is: " + totalArea);
        System.out.println("The perimeters is: " + room2.calculatePerimeter());

    }
}
