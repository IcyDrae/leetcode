package com.icydrae.leetcode.Theory;

public class Theory003MergeSort2 {
    /*
     * Merge Sort works using the "divide and conquer" approach.
     *
     * 1. DIVIDE:
     *    Keep splitting the array into smaller halves
     *    until every piece contains only one element.
     *
     * 2. CONQUER:
     *    Merge those small pieces back together in sorted order.
     *
     * Example:
     *
     * [20, 10, 0, 80, 40, 15]
     *
     *          ↓ split
     *
     * [20, 10, 0]       [80, 40, 15]
     *
     *          ↓ split
     *
     * [20] [10, 0]      [80] [40, 15]
     *
     *          ↓ split
     *
     * [20] [10] [0]     [80] [40] [15]
     *
     * Then we start MERGING them back together:
     *
     * [10, 20]           [40, 80]
     *
     * [0, 10, 20]        [15, 40, 80]
     *
     * Finally:
     *
     * [0, 10, 15, 20, 40, 80]
     */
    public void sort(int[] arr, int start, int end) {
        /*
         * If start == end, we have reached an array/piece
         * containing only ONE element.
         *
         * A single element is already sorted,
         * so we stop splitting.
         */
        if (start < end) {
            /*
             * Find the middle of the current section.
             *
             * Example:
             *
             * start = 0
             * end = 5
             *
             * mid = (0 + 5) / 2
             *     = 2
             *
             * So we split the array between index 2 and 3.
             */
            int mid = (start + end) / 2;

            /*
             * Recursively sort the LEFT half.
             *
             * For example:
             *
             * sort(arr, 0, 2)
             *
             * This will keep splitting the left side
             * until we reach individual elements.
             */
            sort(arr, start, mid);

            /*
             * Recursively sort the RIGHT half.
             *
             * mid + 1 is the first index of the right half.
             */
            sort(arr, mid + 1, end);

            /*
             * At this point BOTH halves have been sorted.
             *
             * Now combine/merge them into one sorted section.
             */
            this.combine(arr, start, mid, end);
        }
    }

    /*
     * Combines TWO SORTED sections of the array.
     *
     * Example:
     *
     * arr:
     *
     * [10, 20, 15, 40]
     *  ↑       ↑
     * left    right
     *
     * Left half:
     * [10, 20]
     *
     * Right half:
     * [15, 40]
     *
     * combine() produces:
     *
     * [10, 15, 20, 40]
     */
    private void combine(int[] arr, int start, int mid, int end) {
        /*
         * Calculate how many elements are in this section.
         *
         * Example:
         *
         * start = 0
         * end = 3
         *
         * 3 - 0 + 1 = 4 elements
         */
        int totalLength = end - start + 1;

        /*
         * Temporary array where we will build
         * the sorted result.
         *
         * We need this because we don't want to
         * overwrite elements in arr while we are
         * still comparing them.
         */
        int[] c = new int[totalLength];


        /*
         * We use THREE pointers:
         *
         * i = current position in the LEFT half
         * j = current position in the RIGHT half
         * k = current position in temporary array c
         *
         * Example:
         *
         * [10, 20] [15, 40]
         *   ↑        ↑
         *   i        j
         *
         * c:
         * [_, _, _, _]
         *  ↑
         *  k
         */
        int i = start;
        int j = mid + 1;
        int k = 0;


        /*
         * Keep comparing elements while BOTH halves
         * still contain elements.
         */
        while (i <= mid && j <= end) {

            /*
             * Compare the current element from the
             * left half with the current element
             * from the right half.
             *
             * Whichever is SMALLER goes into c.
             */
            if (arr[i] < arr[j]) {

                // Left element is smaller.
                c[k] = arr[i];

                // Move to the next element in the left half.
                i++;

                // Move to the next empty position in c.
                k++;

            } else {

                // Right element is smaller or equal.
                c[k] = arr[j];

                // Move to the next element in the right half.
                j++;

                // Move to the next empty position in c.
                k++;
            }
        }

        /*
         * At this point, ONE of the two halves is empty.
         *
         * If there are still elements in the LEFT half,
         * copy them into c.
         *
         * We don't need to compare them anymore because
         * the left half is already sorted.
         */
        while (i <= mid) {
            c[k] = arr[i];

            k++;
            i++;
        }

        /*
         * Same thing for the RIGHT half.
         *
         * If elements remain there, simply copy them.
         */
        while (j <= end) {

            c[k] = arr[j];

            k++;
            j++;
        }

        /*
         * Now c contains the sorted version of this section.
         *
         * Example:
         *
         * arr section:
         *
         * [20, 10, 15, 40]
         *
         * c:
         *
         * [10, 15, 20, 40]
         *
         * We now copy c back into arr.
         */
        for (i = 0; i < totalLength; i++) {
            /*
             * IMPORTANT:
             *
             * c starts at index 0, but our section of arr
             * might start somewhere else.
             *
             * Therefore:
             *
             * arr[start + i] = c[i]
             *
             * Example:
             *
             * start = 2
             *
             * c = [10, 20, 30]
             *
             * arr[2] = 10
             * arr[3] = 20
             * arr[4] = 30
             */
            arr[start + i] = c[i];
        }
    }
}
