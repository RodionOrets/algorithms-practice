package com.rodionorets.leetcode.lists;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slowRunner = head;
        ListNode fastRunner = head;

        while (fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }

        return slowRunner;
    }
}
