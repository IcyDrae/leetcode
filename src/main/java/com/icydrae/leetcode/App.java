package com.icydrae.leetcode;

import com.icydrae.leetcode.Solutions.Problem001MaximumSubarray;
import com.icydrae.leetcode.Solutions.Problem002Stocks;
import com.icydrae.leetcode.Solutions.Problem003MaximumSubarrayProduct;
import com.icydrae.leetcode.Solutions.Problem004ProductArrayExceptSelf;
import com.icydrae.leetcode.Solutions.Problem005RotateArray;
import com.icydrae.leetcode.Solutions.Problem006MaxConsecutiveOnes;
import com.icydrae.leetcode.Solutions.Problem007ValidSudoku;
import com.icydrae.leetcode.Solutions.Problem008NumberOfProvinces;

import com.icydrae.leetcode.Theory.Theory001BubbleSort;
import com.icydrae.leetcode.Theory.Theory002SelectionSort;
import com.icydrae.leetcode.Theory.Theory003MergeSort;
import com.icydrae.leetcode.Theory.Theory003MergeSort2;

public class App
{
    public static void main( String[] args )
    {
        new Problem008NumberOfProvinces()
            .findCircleNum(
                new int[][] {
                    {1,1,0},
                    {1,1,0},
                    {0,0,1}
                }
            );
    }
}
