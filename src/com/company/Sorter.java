package com.company;

import java.util.ArrayList;

public class Sorter {

    // 快速排序实现
    public static ArrayList<Integer> qsort(ArrayList<Integer> input) {
        // 1. 选出一个数
        Integer p = pivot(input);

        // 2. 分块
        input = partition(p, input);

        // 3. 两个部分进行排序

        // 4. 合并

    }

    private static Integer pivot(ArrayList<Integer> input) {
        return input.get(0);
    }

    private static ArrayList<Integer> partition(Integer left, Integer right, Integer p, ArrayList<Integer> input) {
        int i = left, j = right;
        int tmp = input.get(p);

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
    }


}
