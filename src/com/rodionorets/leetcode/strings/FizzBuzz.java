package com.rodionorets.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean isMultiplyOfThree = i % 3 == 0;
            boolean isMultiplyOfFive = i % 5 == 0;

            if (isMultiplyOfThree && isMultiplyOfFive) {
                fizzBuzz.add("FizzBuzz");
            } else if (isMultiplyOfThree) {
                fizzBuzz.add("Fizz");
            } else if (isMultiplyOfFive) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(String.valueOf(i));
            }
        }

        return fizzBuzz;
    }
}
