package com.rodionorets.leetcode.lists;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode singleStepRunner = head;
        ListNode doubleStepRunner = head;

        while (singleStepRunner != null && doubleStepRunner != null && doubleStepRunner.next != null) {
            singleStepRunner = singleStepRunner.next;
            doubleStepRunner = doubleStepRunner.next.next;

            if (singleStepRunner == doubleStepRunner) return true;
        }

        return false;
    }
}
