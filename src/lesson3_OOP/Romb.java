package lesson3_OOP;

public class Romb extends FiguraGeometrica {
    public Romb(int theSizeOfTheSide, int height) {
        if (theSizeOfTheSide > 0 && height > 0) {
            this.theSizeOfTheSide = theSizeOfTheSide;
            this.height = height;
        } else
            System.out.println("The size of the side and the height variables is not valide");
    }
    private int theSizeOfTheSide;
    private int height;

    double returnArea() {
        return theSizeOfTheSide * height;
    }
    double returnPerimeter() {
        return 4 * theSizeOfTheSide;
    }
    public int getTheSizeOfTheSide() {
        return theSizeOfTheSide;
    }
    public int getHeight() {
        return height;
    }
}
