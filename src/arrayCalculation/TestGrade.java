package arrayCalculation;

import java.util.Scanner;

public class TestGrade {
    public static int[] grades;
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades you need to enter?");
        grades = new int[scanner.nextInt()];
        getGrades();
        System.out.println("The sum is: " + calculateSum());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Product: " + calculateProdus());

    }

   public static void getGrades(){
       for (int i = 0; i < grades.length; i++) {
           System.out.println("Enter grade #: " + (i + 1));
           grades[i] = scanner.nextInt();
       }
   }
   public static int calculateSum(){
        int sum =0;
        for(int grade: grades){
            sum += grade;
        }
        return sum;
   }
   public static double calculateAverage(){
        return calculateSum()/grades.length;
   }
   public static int calculateProdus(){
        int prod =1;
        for (int grade: grades){
            prod *= grade;
        }
        return prod;
   }

}
