package com.rodionorets.leetcode.trees;

public class MaximumBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int from, int to) {
        if (from > to) {
            return null;
        }

        if (from == to) {
            return new TreeNode(nums[from]);
        }

        int maxElementIndex = findMaxElementIndex(nums, from, to);

        TreeNode root = new TreeNode(nums[maxElementIndex]);

        root.left = constructMaximumBinaryTree(nums, from, maxElementIndex - 1);
        root.right = constructMaximumBinaryTree(nums, maxElementIndex + 1, to);

        return root;
    }

    private int findMaxElementIndex(int[] nums, int from, int to) {
        int maxIndex = from;
        int max = nums[from];

        for (int i = from; i <= to; i++) {
            if (nums[i] > max) {
                maxIndex = i;
                max = nums[i];
            }
        }

        return maxIndex;
    }
}
