package com.rodionorets.leetcode.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> sequence1 = getLeafSequence(root1);
        List<Integer> sequence2 = getLeafSequence(root2);

        if (sequence1.size() != sequence2.size()) {
            return false;
        }

        for (int i = 0; i < sequence1.size(); i++) {
            if (sequence1.get(i) != sequence2.get(i)) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> getLeafSequence(TreeNode root) {
        List<Integer> leafSequence = new ArrayList<>();

        Stack<TreeNode> nodes = new Stack<>();
        TreeNode node = root;

        while (node != null || !nodes.isEmpty()) {
            while (node != null) {
                nodes.push(node);
                node = node.left;
            }

            node = nodes.pop();

            if (node.left == null && node.right == null) {
                leafSequence.add(node.val);
            }

            node = node.right;
        }

        return leafSequence;
    }
}
