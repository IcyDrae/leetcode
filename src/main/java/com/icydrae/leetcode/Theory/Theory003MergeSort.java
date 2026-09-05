package com.icydrae.leetcode.Theory;

import java.util.Arrays;
import java.util.LinkedList;

public class Theory003MergeSort {
    public void sort() {
        // These two arrays are already sorted.
        int[] arrayA = new int[] { 2, 5, 8, 9, 10 };
        int[] arrayB = new int[] { 2, 4, 7, 18 };

        // This will contain the final merged, sorted array.
        LinkedList<Integer> arrayC = new LinkedList<Integer>();

        // i keeps track of our current position in arrayA.
        int i = 0;

        // j keeps track of our current position in arrayB.
        int j = 0;

        int n = arrayA.length;
        int m = arrayB.length;

        // Keep going while there are still elements
        // left in EITHER array.
        while (i < n || j < m) {

            // If BOTH arrays still have elements,
            // compare their current elements.
            if (i < n && j < m) {

                // Compare the current element of A
                // with the current element of B.
                if (arrayA[i] <= arrayB[j]) {

                    // A's element is smaller (or equal),
                    // so add it to the result.
                    arrayC.add(arrayA[i]);

                    // Move to the next element in A.
                    i++;

                } else {

                    // B's element is smaller,
                    // so add it to the result.
                    arrayC.add(arrayB[j]);

                    // Move to the next element in B.
                    j++;
                }

            // A is finished, but B still has elements.
            } else if (i < n) {

                // Add the remaining element from A.
                arrayC.add(arrayA[i]);

                // Move forward in A.
                i++;

            // B is finished, so A must still have elements.
            } else {

                // Add the remaining element from B.
                arrayC.add(arrayB[j]);

                // Move forward in B.
                j++;
            }
        }

        System.out.println(
            Arrays.toString(
                arrayC.toArray()
            )
        );
    }
}
