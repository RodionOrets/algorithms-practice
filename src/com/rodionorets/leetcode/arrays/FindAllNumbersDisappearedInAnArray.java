package com.rodionorets.leetcode.dynamicprogramming;

class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] flaggedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            flaggedNums[nums[i] - 1] = -1;
        }
        
        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int i = 0; i < flaggedNums.length; i++) {
            if (flaggedNums[i] != -1) {
                disappearedNumbers.add(i + 1);
            }
        }
        
        return disappearedNumbers;
    }
}
