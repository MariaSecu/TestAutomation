package chapter2b;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("Enter the number of Sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales >= quota) {
            System.out.println("Congrats! You've met your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make you quota. You were " + salesShort + " sales short.");
        }
    }
}
