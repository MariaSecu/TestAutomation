package chapter6c;

public class MonthConverter {
    public static void main(String[] args) {
        System.out.println("The month is: " + Month.getMonth(6));
        System.out.println("The number of the month is: " + Month.getMonth("Octomber"));
        System.out.println(Month.getMonth("tomorow"));
    }
}
