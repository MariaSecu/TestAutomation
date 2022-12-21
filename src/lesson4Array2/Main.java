package lesson4Array2;

public class Main {
    public static void main(String[] args) {
        Array2 second = new Array2(3);
        System.out.println(second.setData());
        System.out.println("The sum of all elements are: " + second.calculateSum());
        System.out.println("The average is: " + second.calculateAverage());
        System.out.println("The highest element is:" + second.getHighest());
        System.out.println("The lowest element is:" + second.getLowest());

    }
}
