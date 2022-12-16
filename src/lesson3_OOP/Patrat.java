package lesson3_OOP;

public class Patrat extends FiguraGeometrica {
    public Patrat(int theLengthOfTheSide) {
        if (theLengthOfTheSide > 0) {
            this.theLengthOfTheSide = theLengthOfTheSide;
        } else
            System.out.println("The object was created, but the length property is not populated");
    }
    private int theLengthOfTheSide;
    double returnArea() {
        return theLengthOfTheSide * theLengthOfTheSide;
    }
    double returnPerimeter() {
        return 4 * theLengthOfTheSide;
    }
    public int getTheLengthOfTheSide() {
        return theLengthOfTheSide;
    }
}
