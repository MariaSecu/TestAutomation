package chapter9c;

public class Square extends Rectangle {
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    public void printed(String what) {
        System.out.println("I am a " + what);
    }
}
