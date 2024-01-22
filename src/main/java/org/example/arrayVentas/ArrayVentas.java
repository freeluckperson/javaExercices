package org.example.arrayVentas;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayVentas {
    public static void main(String[] args) {
        double[] sales = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales for the month");

        for (int i = 0; i < sales.length; i++) {
            System.out.println("Sale " + (i + 1));
            sales[i] = sc.nextDouble();
        }

        double[] salesFilter = Arrays.stream(sales)
                .filter(sale -> sale > 2000)
                .toArray();

        System.out.println("Sales greater than 2000: " + Arrays.toString(salesFilter));
    }
}