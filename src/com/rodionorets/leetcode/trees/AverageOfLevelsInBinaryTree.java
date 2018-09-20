package com.rodionorets.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageOfLevels = new ArrayList<>();

        Queue<TreeNode> nodes = new LinkedList<>();

        nodes.offer(root);

        double levelSum = 0;
        while (!nodes.isEmpty()) {
            int levelNodesCount = nodes.size();
            levelSum = 0;
            for (int i = 0; i < levelNodesCount; i++) {
                TreeNode node = nodes.poll();
                levelSum += node.val;
                if (node.left != null) nodes.offer(node.left);
                if (node.right != null) nodes.offer(node.right);
            }
            averageOfLevels.add(levelSum / levelNodesCount);
        }

        return averageOfLevels;
    }
}
