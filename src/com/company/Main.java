package com.company;

import java.util.Arrays;

import static com.company.Quicksort.quickSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 1, 5, 2};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {32, 6, 26, 12, 5, 2};
        quickSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {3, 5, 45, 1, 20, 2};
        quickSort(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {12, 15, 26, 1, 5, 2};
        quickSort(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}
