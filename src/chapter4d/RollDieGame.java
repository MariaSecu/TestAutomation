package chapter4d;

import java.util.Scanner;

public class RollDieGame {
    public static void main(String[] args) {
        int numberOfSteps = 5;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            int total = 0;
            for (int j = 0; j < numberOfSteps; j++) {
                System.out.println("Enter the number" + (j + 1));
                int score = scanner.nextInt();
                total += score;

            }
            if (total >= 20) {
                System.out.println("You won");
            } else {
                System.out.println("You die");
            }
        }
        scanner.close();
    }
}
