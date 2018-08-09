package com.rodionorets.leetcode.lists;

import com.rodionorets.leetcode.trees.TreeNode;

public class ConvertSortedListToBinarySearchTree {

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
