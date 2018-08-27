package com.rodionorets.leetcode.numbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<>();

        for (int number = left; number <= right; number++) {
            int tempNumber = number;
            boolean divisibleByDigit = true;
            while (tempNumber > 1) {
                int digit = tempNumber % 10;
                divisibleByDigit = divisibleByDigit && (digit != 0) && (number % digit == 0);
                tempNumber = tempNumber / 10;
            }

            if (divisibleByDigit) {
                selfDividingNumbers.add(number);
            }
        }

        return selfDividingNumbers;
    }
}
