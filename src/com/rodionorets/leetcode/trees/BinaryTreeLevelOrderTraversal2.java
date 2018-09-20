package com.rodionorets.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> levelOrder = new LinkedList<>();

        Queue<TreeNode> nodes = new LinkedList<>();

        if (root != null) nodes.offer(root);

        while (!nodes.isEmpty()) {
            int levelNodesCount = nodes.size();
            List<Integer> levelValues = new ArrayList<>();
            for (int i = 0; i < levelNodesCount; i++) {
                TreeNode node = nodes.poll();
                levelValues.add(node.val);
                if (node.left != null) nodes.offer(node.left);
                if (node.right != null) nodes.offer(node.right);
            }
            levelOrder.addFirst(levelValues);
        }

        return levelOrder;
    }
}
