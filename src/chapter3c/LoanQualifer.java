package chapter3c;

import java.util.Scanner;

public class LoanQualifer {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;
        //Get what we don't.
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the numbers of years with your current employer");
        double years = scanner.nextDouble();
        scanner.close();
        //Make decisione
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats! You are qualify for the loan.");
            } else {
                System.out.println("Sorry, you must have worked at the curent job" + requiredYearsEmployed + "years.");
            }
        } else {
            System.out.println("Sorry, you must earn at least $: " + requiredSalary + " to qualify for the loan.");
        }
    }
}
