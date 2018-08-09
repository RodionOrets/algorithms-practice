package com.rodionorets.leetcode.lists;

public class ConvertSortedListToBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public TreeNode sortedListToBST(ListNode head) {
        if (head==null){
            return null;
        }

        return sortedListToBST(head, null);
    }

    private TreeNode sortedListToBST(ListNode head, ListNode tail){
        ListNode slowRunner = head;
        ListNode fastRunner = head;

        if(head == tail) return null;

        while(fastRunner != tail && fastRunner.next != tail){
            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;
        }

        TreeNode newHead = new TreeNode(slowRunner.val);
        newHead.left = sortedListToBST(head, slowRunner);
        newHead.right = sortedListToBST(slowRunner.next, tail);
        return newHead;
    }
}
