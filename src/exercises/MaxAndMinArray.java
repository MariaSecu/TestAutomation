package exercises;

import java.util.Scanner;

public class MaxAndMinArray {
    private int length;
    private int[] elementTable;
    private static Scanner scanner = new Scanner(System.in);

    public MaxAndMinArray(int length) {
        this.length = length;
        this.elementTable = new int[length];
    }

    public int setData() {
        for (int i = 0; i < elementTable.length; i++) {
            System.out.println("Enter your elements: " + i);
            elementTable[i] = scanner.nextInt();
        }
        return 0;
    }

    public int findHighestElement() {
        int highest = elementTable[0];
        for (int i = 0; i < elementTable.length; i++) {
            int data = elementTable[i];
            if (data > highest)
                highest = data;
        }
        return highest;
    }

    public int findLowElement() {
        int low = elementTable[0];
        for (int i = 0; i < elementTable.length; i++) {
            int data = elementTable[i];
            if (data < low)
                low = data;
        }
        return low;
    }

    public int calculateSum() {
        if (elementTable == null) {
            //setData();
            System.out.println("Enter your elements: ");
        } else {
            int sum = 0;
            for (int i = 0; i < elementTable.length; i++) {
                sum += elementTable[i];
            }
            return sum;
        }
        return 0;
    }

    public int getAverage() {
        int average = 0;
        average = calculateSum() / elementTable.length;
        return average;
    }
}
