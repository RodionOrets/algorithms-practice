package com.rodionorets.leetcode.arrays;

public class ConvertSortedArrayToBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int from, int to) {
        if (from > to) {
            return null;
        }

        int middle = (from + to) / 2;

        TreeNode root = new TreeNode(nums[middle]);

        root.left = sortedArrayToBST(nums, from, middle - 1);
        root.right = sortedArrayToBST(nums, middle + 1, to);

        return root;
    }
}
