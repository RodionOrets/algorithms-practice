package com.rodionorets.leetcode.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {
    private Map<Integer, Integer> cachedFib = new HashMap<>();

    public int fib(int n) {
        if (cachedFib.containsKey(n)) return cachedFib.get(n);

        if (n < 2) return n;

        int fib = fib(n - 2)  + fib(n - 1);

        cachedFib.put(n, fib);

        return fib;
    }
}
