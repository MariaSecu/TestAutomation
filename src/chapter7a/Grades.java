package chapter7a;

import java.util.Scanner;

public class Grades {
    public static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grade would you like to enter?");
        grades = new int[scanner.nextInt()];
        getGrade();
        System.out.println("Average: " + String.format("%2f", calculateAverage()));
        System.out.println("Highest" + getHighest());
        System.out.println("Lowest" + getLowest());
        System.out.println("Sum: " + calculateSum());

    }

    public static void getGrade() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #: " + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;

        }
        return sum;
    }

    public static double calculateAverage() {
        return calculateSum() / grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
