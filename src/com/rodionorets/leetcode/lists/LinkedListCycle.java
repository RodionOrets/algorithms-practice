package com.rodionorets.leetcode.lists;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        ListNode iterator = head;
        while (iterator != null) {
            if (!nodes.add(iterator)) return true;
            iterator = iterator.next;
        }
        return false;
    }
}
