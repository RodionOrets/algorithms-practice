package com.rodionorets.leetcode.lists;

public class LinkedListCycle {

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
