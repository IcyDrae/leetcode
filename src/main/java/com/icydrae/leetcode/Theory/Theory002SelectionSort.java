package com.icydrae.leetcode.Theory;

public class Theory002SelectionSort {
    public void sort() {
        // Repeat until the array is sorted.
        //
        // On each pass:
        // 1. Search the unsorted portion of the array.
        // 2. Find the largest element.
        // 3. Remember its index.
        // 4. Swap it with the last element of the unsorted portion.
        // 5. The sorted portion grows by one element.
        //
        // We use two loops because the inner loop searches for the largest
        // element, while the outer loop repeats this process for the remaining
        // unsorted elements.
        //
        // length - i determines how much of the array is still unsorted.
        // As i increases, the sorted portion at the end grows.
        //
        // length - i - 1 is the index where the largest element should be placed.
        int[] arrayToBeSorted = new int[] { 10, 5, 8, 9, 16, 4, 0 };
        int length = arrayToBeSorted.length;

        for (int i = 0; i < length; i++) {
            int largestElement = arrayToBeSorted[0];
            int indexOfLargestElement = 0;

            for (int j = 0; j < length - i; j++) {
                if (arrayToBeSorted[j] > largestElement) {
                    largestElement = arrayToBeSorted[j];
                    indexOfLargestElement = j;
                }
            }

            int tmp = arrayToBeSorted[indexOfLargestElement];
            arrayToBeSorted[indexOfLargestElement] = arrayToBeSorted[length - i -1];
            arrayToBeSorted[length - i - 1] = tmp;
        }
    }
}
