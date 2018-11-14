package com.rodionorets.leetcode.systemdesign;

public class MaxStack {

    private static final int DEFAULT_CAPACITY = 10;

    private int[] stack;

    private int capacity;

    private int top;

    private int max;

    public MaxStack() {
        this(DEFAULT_CAPACITY);
    }

    private MaxStack(int initialCapacity) {
        capacity = initialCapacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        System.out.println("pushing " + x);

        ensureCapacity();

        stack[++top] = x;

        if (max < 0 || x >= stack[max]) {
            max = top;
        }
    }

    private void ensureCapacity() {
        if (top + 1 == capacity) {
            increaseCapacity();
        }
    }

    private void increaseCapacity() {
        int increasedCapacity = capacity * 2;

        int[] tempStack = new int[capacity];

        System.arraycopy(stack, 0, tempStack, 0, stack.length);

        stack = new int[increasedCapacity];

        System.arraycopy(tempStack, 0, stack, 0, tempStack.length);

        capacity = increasedCapacity;
    }

    public void pop() {
        if (top < 0) return;

        top--;

        if (top < max) {
            updateMax();
        }
    }

    private void updateMax() {
        max = top;
        for(int i = top; i >= 0; i--) {
            if (stack[i] > stack[max]) {
                max = i;
            }
        }
    }

    public int top() {
        if (top < 0) throw new RuntimeException("Stack is empty");

        return stack[top];
    }

    public int getMax() {
        if (max < 0) throw new RuntimeException("Stack is empty");

        return stack[max];
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();

        maxStack.push(1);
        maxStack.push(2);
        maxStack.push(3);
        maxStack.push(4);
        maxStack.push(5);

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        maxStack.pop();

        maxStack.push(1);
        maxStack.push(2);
        maxStack.push(3);
        maxStack.push(4);
        maxStack.push(5);

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        maxStack.pop();

    }
}
