package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {14.2, 23.5, 1.7, 7.2, -25.5, 33.3, -76.7, 50, -9, 98.9, 23.7, 39, 90.9, 56, 22};
        double sum = 0;
        for (double x: numbers) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum/numbers.length);
    }
}







