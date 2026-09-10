package com.icydrae.leetcode.DataStructures;

public class UnionFind {
    private int[] parent;
    private int count;

    public UnionFind(int n) {
        count = n;
        parent = new int[n];

        // Initially, every element is its own parent.
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // Find the root element of the tree.
    public int find(int x) {
        while (x != parent[x]) {
            x = parent[x];
        }

        return x;
    }

    // Connect two elements.
    public void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        // Already connected.
        if (rootA == rootB) {
            return;
        }

        // Connect the two trees.
        parent[rootA] = rootB;

        // Two components became one.
        count--;
    }

    // Check whether two elements are connected.
    public boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    // Return the number of connected components.
    public int count() {
        return count;
    }
}
