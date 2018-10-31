package com.rodionorets.leetcode.lists;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> subset = new HashSet<>();

        for (int g : G) subset.add(g);

        ListNode iterator = head;

        int numComponents = 0;

        while (iterator != null) {
            if (!subset.contains(iterator.val)) {
                iterator = iterator.next;
            } else {
                while (iterator != null && subset.contains(iterator.val)) {
                    iterator = iterator.next;
                }
                numComponents++;
                iterator = iterator != null ? iterator.next : iterator;
            }
        }

        return numComponents;
    }
}
