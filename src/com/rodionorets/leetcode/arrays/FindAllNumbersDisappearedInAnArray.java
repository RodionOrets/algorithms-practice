package com.rodionorets.leetcode.dynamicprogramming;

class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int positionToFlag = Math.abs(nums[i]) - 1;
            nums[positionToFlag] = 
                nums[positionToFlag] > 0 ? -nums[positionToFlag] : nums[positionToFlag];
        }
        
        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                disappearedNumbers.add(i + 1);
            }
        }
        
        return disappearedNumbers;
    }
}
