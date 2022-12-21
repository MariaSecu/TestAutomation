package lesson4Array;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Array first = new Array(4);
        System.out.println(first.setData());
        System.out.println("The sum is: " + first.calculateSum());
        System.out.println("The average for this array is: " + first.calculateAverage());
        System.out.println("The highest number is : " + first.getHighest());
        System.out.println("The lowest number is: " + first.getLowest());


    }
}
