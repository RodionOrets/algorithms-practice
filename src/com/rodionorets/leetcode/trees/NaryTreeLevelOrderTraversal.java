package com.rodionorets.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(NaryTreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();

        Queue<NaryTreeNode> nodes = new LinkedList<>();

        if (root != null) nodes.offer(root);

        while (!nodes.isEmpty()) {
            int levelNodesCount = nodes.size();
            List<Integer> levelValues = new ArrayList<>();
            for (int i = 0; i < levelNodesCount; i++) {
                NaryTreeNode node = nodes.poll();
                levelValues.add(node.val);
                for (NaryTreeNode child : node.children) {
                    if (child != null) nodes.offer(child);
                }
            }
            levelOrder.add(levelValues);
        }

        return levelOrder;
    }
}
