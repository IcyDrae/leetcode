package com.icydrae.leetcode;

import com.icydrae.leetcode.Solutions.Problem001MaximumSubarray;
import com.icydrae.leetcode.Solutions.Problem002Stocks;
import com.icydrae.leetcode.Solutions.Problem003MaximumSubarrayProduct;
import com.icydrae.leetcode.Solutions.Problem004ProductArrayExceptSelf;
import com.icydrae.leetcode.Solutions.Problem005RotateArray;

public class App 
{
    public static void main( String[] args )
    {
        new Problem005RotateArray()
            .rotate(
                new int[] {1,2,3,4,5,6,7},
                3
        );
    }
}
