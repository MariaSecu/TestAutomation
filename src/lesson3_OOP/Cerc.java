package lesson3_OOP;

public class Cerc extends FiguraGeometrica {
    public Cerc(int circleRadius) {
        if (circleRadius > 0)
            this.circleRadius = circleRadius;
        else
            System.out.println("The object was created but, the circle radius properity is not populated");
    }
    private double circleRadius;
    private final double PI = 3.14;

    double returnArea() {
        return PI * circleRadius * circleRadius;
    }
    double returnPerimeter() {
        return 2 * PI * circleRadius;
    }
    public double getCircleRadius() {
        return circleRadius;
    }
}
