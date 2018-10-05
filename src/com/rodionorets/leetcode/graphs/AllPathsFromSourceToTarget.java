package com.rodionorets.leetcode.graphs;

import java.util.ArrayList;
import java.util.List;

/*
Given a directed, acyclic graph of N nodes.  Find all possible paths from node 0 to node N-1, and return them in any order.

The graph is given as follows:  the nodes are 0, 1, ..., graph.length - 1.  graph[i] is a list of all nodes j for which the edge (i, j) exists.

Example:
Input: [[1,2], [3], [3], []]
Output: [[0,1,3],[0,2,3]]
Explanation: The graph looks like this:
0--->1
|    |
v    v
2--->3
There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
Note:

The number of nodes in the graph will be in the range [2, 15].
You can print different paths in any order, but you should keep the order of nodes inside one path.
* */

public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return findAllPaths(graph);
    }

    private List<List<Integer>> findAllPaths(int[][] graph) {
        return findAllPathsFromSourceToTarget(graph, 0, graph.length - 1);
    }

    private List<List<Integer>> findAllPathsFromSourceToTarget(int[][] graph, int source, int target) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> initialPath = new ArrayList<>();
        dfs(graph, source, target, initialPath, paths);
        return paths;
    }

    private void dfs(int[][] graph, int source, int target, List<Integer> path, List<List<Integer>> paths) {
        path.add(source);

        if (source == target) {
            paths.add(new ArrayList<>(path));
        } else {
            for (int adjacentVertice : graph[source]) {
                dfs(graph, adjacentVertice, target, path, paths);
            }
        }

        path.remove(Integer.valueOf(source));
    }
}
