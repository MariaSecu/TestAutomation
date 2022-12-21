package lesson4Array;

import java.util.Scanner;

public class Array {
    private int length;
    private int[] dataTable;
    private static Scanner scanner = new Scanner(System.in);

    public Array(int length) {
        this.length = length;
        this.dataTable = new int[length];
    }

    public int setData() {
        for (int i = 0; i < dataTable.length; i++) {
            System.out.println("Enter elements: " + i);
            dataTable[i] = scanner.nextInt();
        }

        return 0;
    }

    public int calculateSum() {

        if (dataTable == null) {
            setData();
            System.out.println("Enter you elements ");
        } else {
            int sum = 0;
            for (int i = 0; i < dataTable.length; i++) {
                sum += dataTable[i];
            }
            return sum;
        }
        return 0;
    }

    public double calculateAverage() {
        return calculateSum() / dataTable.length;
    }

    public int getHighest() {
        int highest = dataTable[0];
        for (int data : dataTable) {
            if (data > highest) {
                highest = data;
            }
        }
        return highest;
    }

    public int getLowest() {
        int lowest = dataTable[0];
        for (int data : dataTable) {
            if (data < lowest) {
                lowest = data;
            }
        }
        return lowest;
    }
}
