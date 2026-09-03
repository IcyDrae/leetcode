package com.icydrae.leetcode;

import com.icydrae.leetcode.Solutions.Problem001MaximumSubarray;
import com.icydrae.leetcode.Solutions.Problem002Stocks;
import com.icydrae.leetcode.Solutions.Problem003MaximumSubarrayProduct;
import com.icydrae.leetcode.Solutions.Problem004ProductArrayExceptSelf;
import com.icydrae.leetcode.Solutions.Problem005RotateArray;
import com.icydrae.leetcode.Solutions.Problem006MaxConsecutiveOnes;
import com.icydrae.leetcode.Solutions.Problem007ValidSudoku;

public class App 
{
    public static void main( String[] args )
    {
        new Problem007ValidSudoku()
            .isValidSudoku(
                new char[][]{
                    {'5','3','.','.','7','.','.','.','.'},  // 9
                    {'6','.','.','1','9','5','.','.','.'},  // 9
                    {'.','9','8','.','.','.','.','6','.'},  // 9
                    {'8','.','.','.','6','.','.','.','3'},  // 9
                    {'4','.','.','8','.','3','.','.','1'},  // 9
                    {'7','.','.','.','2','.','.','.','6'},  // 9
                    {'.','6','.','.','.','.','2','8','.'},  // 9
                    {'.','.','.','4','1','9','.','.','5'},  // 9
                    {'.','.','.','.','8','.','.','7','9'}   // 9
                }
        );
    }
}
