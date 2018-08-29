package com.rodionorets.leetcode.numbers;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }

        return singleNumber;
    }
}
