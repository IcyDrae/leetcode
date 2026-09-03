package com.icydrae.leetcode;

import com.icydrae.leetcode.Solutions.Problem001MaximumSubarray;
import com.icydrae.leetcode.Solutions.Problem002Stocks;
import com.icydrae.leetcode.Solutions.Problem003MaximumSubarrayProduct;
import com.icydrae.leetcode.Solutions.Problem004ProductArrayExceptSelf;
import com.icydrae.leetcode.Solutions.Problem005RotateArray;
import com.icydrae.leetcode.Solutions.Problem006MaxConsecutiveOnes;

public class App 
{
    public static void main( String[] args )
    {
        new Problem006MaxConsecutiveOnes()
            .findMaxConsecutiveOnes(
                new int[] {1,1,0,1,1,1}
        );
    }
}
