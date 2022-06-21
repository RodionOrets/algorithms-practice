package com.rodionorets.leetcode.datastructures;

public class MinStack {
    private int[] stack;

    private int capacity;

    private int top;

    private int min;

    /** initialize your data structure here. */
    public MinStack() {
        this(10);
    }

    public MinStack(int initialCapacity) {
        capacity = initialCapacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        ensureCapacity();

        stack[++top] = x;

        if (min == -1) {
            min += 1;
        }

        if (stack[top] <= stack[min]) {
            min = top;
        }
    }

    private void ensureCapacity() {
        if (top == capacity - 1) {
            increaseStackCapacity();
        }
    }

    private void increaseStackCapacity() {
        int[] buffer = new int[capacity];

        System.arraycopy(stack, 0, buffer, 0, capacity);

        int newCapacity = capacity * 2;

        stack = new int[newCapacity];

        System.arraycopy(buffer, 0, stack, 0, capacity);

        capacity = newCapacity;
    }

    public void pop() {
        if (top == -1) return;

        top--;

        if (top < min) {
            updateMin();
        }
    }

    private void updateMin() {
        min = top;
        for (int i = top; i >= 0; i--) {
            if (stack[i] < stack[min]) {
                min = i;
            }
        }
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return stack[min];
    }
}
