package com.rodionorets.leetcode.trees;

/*
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

1. The root is the maximum number in the array.
2. The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
3. The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.

Construct the maximum tree by the given array and output the root node of this tree.
* */

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int from, int to) {
        if (from > to) return null;

        int indexOfMaximum = getIndexOfMaximum(nums, from, to);

        TreeNode root = new TreeNode(nums[indexOfMaximum]);

        root.left = constructMaximumBinaryTree(nums, from, indexOfMaximum - 1);
        root.right = constructMaximumBinaryTree(nums, indexOfMaximum + 1, to);

        return root;
    }

    private int getIndexOfMaximum(int[] nums, int from, int to) {
        int indexOfMaximum = from;

        for (int i = from; i <= to; i++) {
            if (nums[i] > nums[indexOfMaximum]) {
                indexOfMaximum = i;
            }
        }

        return indexOfMaximum;
    }
}
