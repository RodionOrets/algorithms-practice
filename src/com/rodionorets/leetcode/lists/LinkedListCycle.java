package com.rodionorets.leetcode.lists;

public class LinkedListCycle {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slowRunner = head;
        ListNode fastRunner = head;

        boolean hasCycle = false;

        while (slowRunner != null && fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
            if (slowRunner == fastRunner) {
                hasCycle = true;
                break;
            }
        }

        return hasCycle;
    }
}
