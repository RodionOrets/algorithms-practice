package com.rodionorets.leetcode.lists;

class ListNode {
    int value;
    ListNode next;
    ListNode(int value) {
        this.value = value;
    }
}

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        Set<ListNode> addressesOfA = new HashSet<>();
        for (ListNode iterator = a; iterator != null; iterator = iterator.next) {
            addressesOfA.add(iterator);
        }
    
        ListNode intersectionNode = null;
        for (ListNode iterator = b; iterator != null && intersectionNode == null; iterator = iterator.next) {
            intersectionNode = addressesOfA.contains(iterator) ? iterator : intersectionNode;
        }
        
        return intersectionNode;
    }
}
