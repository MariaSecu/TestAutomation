package exercises;

import java.util.Scanner;

public class ReversArray {
    int length;
    int[] table;
    private static Scanner scanner = new Scanner(System.in);

    public ReversArray(int length) {
        this.length = length;
        this.table = new int[length];

    }

    public void setData() {
        for (int i = 0; i < table.length; i++) {
            System.out.println("Enter elements: " + i);
            table[i] = scanner.nextInt();
        }
    }

    public int returnReversArray() {

        for (int i = table.length - 1; i >= 0; i--) {
            System.out.println("Revers elements are: " + table[i]);
        }
        return 0;
    }

    public int[] array = {2, 5, 7, 9};

    public int getTheArray() {
        System.out.println("Original array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return 0;
    }

    public int getReversArray() {
        System.out.println("Print the revers array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        return 0;
    }

}