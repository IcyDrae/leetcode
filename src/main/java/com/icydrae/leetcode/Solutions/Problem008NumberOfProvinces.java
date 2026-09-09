package com.icydrae.leetcode.Solutions;

// Using Union Find
// https://leetcode.com/problems/number-of-provinces
public class Problem008NumberOfProvinces {
    int[] parent;
    int count;

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        // Initially, every city is its own province.
        parent = new int[n];
        count = n;

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        // Connect cities that are directly connected.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    union(i, j);
                }
            }
        }

        return count;
    }

    // Find root element in the tree
    private int find(int x) {
        while (x != parent[x]) {
            x = parent[x];
        }

        return x;
    }

    private void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        // Already in the same province.
        if (rootA == rootB) {
            return;
        }

        // Connect the two provinces.
        parent[rootA] = rootB;

        // Two provinces became one.
        count--;
    }
}
