package com.rodionorets.leetcode.lists;

public class DesignLinkedList {

    public static class MyLinkedList {

        class Node {
            int value;
            Node next;
            Node prev;

            Node(int value) {
                this.value = value;
            }
        }

        private Node begin;
        private Node end;
        private int length;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            begin = null;
            end = null;
            length = 0;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if (index < 0 || index > length || begin == null) {
                return -1;
            }

            if (index == 0) {
                return begin.value;
            } else if (index > length - 1) {
                return -1;
            } else if (index == length - 1) {
                return end.value;
            } else {
                Node iterator = begin;
                while (index != 0) {
                    iterator = iterator.next;
                    index--;
                }
                return iterator != null ? iterator.value : -1;
            }
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            Node newNode = new Node(val);

            if (begin == null) {
                begin = end = newNode;
            } else {
                newNode.next = begin;
                begin.prev = newNode;
                begin = newNode;
            }

            length++;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node newNode = new Node(val);

            if (begin == null) {
                begin = end = newNode;
            } else {
                end.next = newNode;
                newNode.prev = end;
                end = newNode;
            }

            length++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if (index < 0 || index > length || begin == null) {
                return;
            }

            if (index == 0) {
                addAtHead(val);
            } else if (index == length) {
                addAtTail(val);
            } else {
                Node iterator = begin;
                while (index != 0) {
                    iterator = iterator.next;
                    index--;
                }

                Node newNode = new Node(val);
                newNode.next = iterator;
                newNode.prev = iterator.prev;
                iterator.prev.next = newNode;
                iterator.prev = newNode;
            }

            length++;
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= length || begin == null) {
                return;
            }

            if (index == 0) {
                begin = begin.next;
            } else if (index == length - 1) {
                end = end.prev;
            } else {
                Node iterator = begin;
                while (index != 0) {
                    iterator = iterator.next;
                    index--;
                }

                iterator.prev.next = iterator.next;
                iterator.next.prev = iterator.prev;
            }

            length--;
        }
    }
}
