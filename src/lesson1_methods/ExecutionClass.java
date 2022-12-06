package lesson1_methods;

public class ExecutionClass {
    public static void main(String[] args) {
        System.out.println("The prime number is: " +SumMethods.isPrime(6));
        System.out.println("The sum of the peime numbers are: " +SumMethods.sumOfPrimeNumbers(10));
        System.out.println("The sum of even numbers is: " +SumMethods.sumOfEvenNumbers(9));
        System.out.println("The sum of odd numbers is: " + SumMethods.sumOfOddNumbers(10));
    }
}
