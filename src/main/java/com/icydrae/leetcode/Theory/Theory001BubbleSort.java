package com.icydrae.leetcode.Theory;

import java.util.Arrays;

public class Theory001BubbleSort {
    public void sort() {
        int[] arrayToBeSorted = new int[] { 10, 5, 40, 8, 9, 6 };
        int length = arrayToBeSorted.length;

        // 1. go through the array
        // 2. compare the current element with the element after it
        // 3. if the current element is larger than the element after it,
        // swap them
        // 4. otherwise, do not swap them.

        // Hold on, why do we need two loops? And why do we iterate (n - i -1) times?
        // Answer:
        // One loop/one run is not enough. One loops loops through the array
        // only once.
        //
        // We need two loops because:
        // 1. The outer loop (i) represents each pass through the array.
        // 2. The inner loop (j) compares neighboring elements and swaps them if they
        //    are in the wrong order.
        //
        // After every complete pass, the largest unsorted element "bubbles up" to
        // the end of the unsorted part of the array. Therefore, after each pass,
        // we can ignore one more element at the end.
        //
        // This is why we use (length - i - 1):
        //
        // length = 6
        //
        // i = 0 -> 6 - 0 - 1 = 5 comparisons
        // i = 1 -> 6 - 1 - 1 = 4 comparisons
        // i = 2 -> 6 - 2 - 1 = 3 comparisons
        // i = 3 -> 6 - 3 - 1 = 2 comparisons
        // i = 4 -> 6 - 4 - 1 = 1 comparison
        //
        // The "-1" is necessary because we compare j with j + 1.
        // We cannot let j reach the last index, otherwise j + 1 would be
        // outside the array.
        //
        // So basically:
        //
        // length - i - 1
        //
        // means: "Only compare the part of the array that is still unsorted,
        // and stop before the last element because we need to access j + 1."
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arrayToBeSorted[j] > arrayToBeSorted[j + 1]) {
                    int tmp = arrayToBeSorted[j];
                    arrayToBeSorted[j] = arrayToBeSorted[j + 1];
                    arrayToBeSorted[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arrayToBeSorted));
    }
}
