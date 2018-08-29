package com.rodionorets.leetcode.numbers;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.contains(nums[i])) {
                numbers.add(nums[i]);
            } else {
                numbers.remove((Integer)nums[i]);
            }
        }

        return numbers.get(0);
    }
}
