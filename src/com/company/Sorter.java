package com.company;

import java.util.ArrayList;

public class Sorter {

    // 快速排序实现
    public static void qsort(Integer left, Integer right, ArrayList<Integer> input) {

        int i = left, j = right;
        int tmp = input.get(left);

        while (i < j) {
            while (i < j && input.get(i) > tmp) {
                j++;
            }
            while (i < j && input.get(j) < tmp) {
                j--;
            }
            // 交换到合理的位置
            if (i < j) {
                int mid = input.get(i);
                input.set(i, input.get(j));
                input.set(j, mid);
            }
        }
        // i == j = pivot
        // 递归
        if (left < i) {
            qsort(left, i, input);
        }
        if (i < right) {
            qsort(i, right, input);
        }

    }

    private static Integer pivot(ArrayList<Integer> input) {
        return input.get(0);
    }

    private static ArrayList<Integer> partition(Integer left, Integer right, Integer p, ArrayList<Integer> input) {

    }


}
