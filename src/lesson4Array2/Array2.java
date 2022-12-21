package lesson4Array2;

import java.util.Scanner;

public class Array2 {
    private int length;
    private double[] dataTable;
    private static Scanner scanner = new Scanner(System.in);

    public Array2(int length) {
        this.length = length;
        this.dataTable = new double[length];
    }

    public double setData() {
        for (int i = 0; i < dataTable.length; i++) {
            System.out.println("Enter elements: " + i);
            dataTable[i] = scanner.nextDouble();
        }
        return 0;
    }

    public double calculateSum() {

        if (dataTable == null) {
            setData();
            System.out.println("Enter you elements ");
        } else {
            double sum = 0;
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

    public double getHighest() {
        double highest = dataTable[0];
        for (int i = 0; i < dataTable.length; i++) {
            double data = dataTable[i];
            if (data > highest) {
                highest = data;
            }
        }
        return highest;
    }

    public double getLowest() {
        double lowest = dataTable[0];
        for (int i = 0; i < dataTable.length; i++) {
            double data = dataTable[i];
            if (data < lowest) {
                lowest = data;
            }
        }
        return lowest;
    }
}
