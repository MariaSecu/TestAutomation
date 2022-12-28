package exercises;

public class Main {
    public static void main(String[] args) {
        System.out.println("The factorial for this number is: " + FactorialNumber.calculatefactorial(3));
        System.out.println("The factorial for this number is: " + FactorialNumber.calculatefactorial(6));
        System.out.println("The factorial for this number is: " + FactorialNumber.calculatefactorial(0));
        ReversArray newArray = new ReversArray(3);
        System.out.println(newArray.getTheArray());
        System.out.println(newArray.getReversArray());
        newArray.setData();
        System.out.println(newArray.returnReversArray());
        MaxAndMinArray element1 = new MaxAndMinArray(3);
        element1.setData();
        System.out.println("The highest element is: " + element1.findHighestElement());
        System.out.println("The low elements is: " + element1.findLowElement());
        System.out.println("The sum of this array is : " + element1.calculateSum());
        System.out.println("The average is: " + element1.getAverage());
    }
}
