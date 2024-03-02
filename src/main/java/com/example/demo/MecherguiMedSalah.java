package com.example.demo;

import java.util.Arrays;

public class MecherguiMedSalah {
    public static int calculatePGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to sort an array of integers in ascending order
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }
}
