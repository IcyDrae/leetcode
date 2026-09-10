package com.icydrae.leetcode.Solutions;

import com.icydrae.leetcode.DataStructures.UnionFind;

public class Problem009RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int count = edges.length + 1;
        UnionFind unionFind = new UnionFind(count);

        for (int[] edge : edges) {
            int edgeOne = edge[0];
            int edgeTwo = edge[1];

            // If both nodes are already connected,
            // adding this edge creates a cycle.
            if (unionFind.connected(edgeOne, edgeTwo)) {
                return edge;
            }

            // Otherwise, connect the two nodes.
            unionFind.union(edgeOne, edgeTwo);
        }

        return new int[0];
    }
}
