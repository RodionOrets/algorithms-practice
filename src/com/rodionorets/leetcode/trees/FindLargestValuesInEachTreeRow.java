package com.rodionorets.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValuesInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> largestValues = new ArrayList<>();

        Queue<TreeNode> nodes = new LinkedList<>();

        if (root != null) nodes.offer(root);

        while (!nodes.isEmpty()) {
            int levelNodesCount = nodes.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < levelNodesCount; i++) {
                TreeNode node = nodes.poll();
                max = Math.max(node.val, max);
                if (node.left != null) nodes.offer(node.left);
                if (node.right != null) nodes.offer(node.right);
            }
            largestValues.add(max);
        }

        return largestValues;
    }
}
