package com.rodionorets.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        // Beats 33.96% of Java submissions, 17ms runtime
//        Map<Integer, Integer> numbersToAppearances = new HashMap<>();
//        int majorityElement = nums[0];
//        int majorityElementAppearancesCount = 0;
//
//        for (int num : nums) {
//            if (numbersToAppearances.containsKey(num)) {
//                int n = numbersToAppearances.get(num) + 1;
//                numbersToAppearances.put(num, n + 1);
//                if (n > majorityElementAppearancesCount) {
//                    majorityElement = num;
//                    majorityElementAppearancesCount = n;
//                }
//            } else {
//                numbersToAppearances.put(num, 1);
//            }
//        }
//
//        return majorityElement;

        int appearanceCount = 0;
        int majorityElement = 0;

        for(int num : nums){
            if(majorityElement == num){
                appearanceCount += 1;
            } else if (appearanceCount == 0){
                majorityElement = num;
                appearanceCount = 1;
            }else {
                appearanceCount -= 1;
            }
        }

        return majorityElement;
    }
}
