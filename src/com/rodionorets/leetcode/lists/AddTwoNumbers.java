package com.rodionorets.leetcode.lists;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int extraDigit) {
        if (l1 == null && l2 == null) {
            return extraDigit == 0 ? null : new ListNode(extraDigit);
        }

        int value
                = (l1 == null ? 0 : l1.val)
                + (l2 == null ? 0 : l2.val)
                + extraDigit;

        ListNode l1NextNode = l1 == null ? null : l1.next;
        ListNode l2NextNode = l2 == null ? null : l2.next;

        ListNode head = new ListNode(value % 10);

        head.next = addTwoNumbers(l1NextNode, l2NextNode, value / 10);

        return head;
    }
}
