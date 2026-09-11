package com.icydrae.leetcode.Solutions;

import com.icydrae.leetcode.DataStructures.UnionFind;

/*
1. Process all == equations.
       ->
   Build the groups.

2. Process all != equations.
       ->
   Check whether either side is
   already in the same group.

3. Same group?
       ->
      false

4. Never found a contradiction?
       ->
      true
*/
public class Problem010SatisfiabilityOfEqualityEquations {
    public boolean equationsPossible(String[] equations) {
        UnionFind unionFind = new UnionFind(26);
        
        for (String equation : equations) {
            int variableA = equation.charAt(0) - 'a';
            int variableB = equation.charAt(3) - 'a';

            if (equation.contains("==")) {
                unionFind.union(variableA, variableB);
            }
        }

        for (String equation : equations) {
            int variableA = equation.charAt(0) - 'a';
            int variableB = equation.charAt(3) - 'a';

            if (equation.contains("!=")) {
                boolean isInGroup = unionFind.connected(variableA, variableB);

                if (isInGroup) {
                    return false;
                }
            }
        }

        return true;
    }
}
