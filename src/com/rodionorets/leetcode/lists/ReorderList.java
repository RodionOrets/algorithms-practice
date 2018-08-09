package com.rodionorets.leetcode.lists;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {


    public static void reorderList(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode iterator = head;
        while (iterator != null) {
            nodes.add(iterator);
            iterator = iterator.next;
        }

        int nodesCount = nodes.size();

        int front = 0;
        int back = nodesCount - 1;

        iterator = head;
        while (front <= back) {
            iterator = nodes.get(front);
            iterator.next = nodes.get(back);

            iterator = iterator.next.next;

            front++;
            back--;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        reorderList(head);

        ListNode iterator = head;
        while (iterator != null) {
            System.out.println(iterator.val);
            iterator = iterator.next;
        }
    }
}
