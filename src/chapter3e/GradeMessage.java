package chapter3e;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter you latter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;
        switch (grade) {
            case "A":
                message = "Excelent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to wprk a bit hard.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }
        System.out.println(message);
    }
}
