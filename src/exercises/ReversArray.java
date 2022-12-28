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

    public int setData() {
        for (int i = 0; i < table.length; i++) {
            System.out.println("Enter elements: " + i);
            table[i] = scanner.nextInt();
        }

        return 0;
    }

    public int returnReversArray() {

        for (int i = table.length - 1; i >= 0; i--) {
            System.out.println("Revers elements are: " + table[i]);
        }
        return 0;
    }

}