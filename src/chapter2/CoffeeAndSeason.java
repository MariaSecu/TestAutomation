package chapter2;

import java.util.Scanner;

public class CoffeeAndSeason {
    public static void main(String[] args) {
        //1.Get the adjectiv.//
        System.out.println("Enter an adjectiv for a good day");
        Scanner scanner = new Scanner(System.in);
        String adjectiv = scanner.next();
        //2.Enter a favorite season.//
        System.out.println("Enter your favorite season");
        String season = scanner.next();
        System.out.println("Enter how many cup of coffee you drink in a day");
        int cup = scanner.nextInt();
        scanner.close();
        //4.Display result//
        System.out.println("On a " + adjectiv + " " + season + " day, I drink a minimum of " + cup + " cups of coffee.");

    }
}
