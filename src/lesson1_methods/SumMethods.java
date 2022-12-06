package lesson1_methods;

public class SumMethods {
    public static boolean isPrime(int n) {
        if (n <= 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrimeNumbers(int n) {
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                System.out.println(i);
            }
        }
        return sum;
    }

    public static int sumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
