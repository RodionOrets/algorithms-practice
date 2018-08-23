package com.rodionorets.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] symbolLastAppearances = new int[128];

        for(int i = s.length() - 1; i >= 0; i--) {
            if(symbolLastAppearances[s.charAt(i)] == 0) {
                symbolLastAppearances[s.charAt(i)] = i;
            }
        }

        List<Integer> partitionLabels = new ArrayList();
        int partitionStartIndex = 0;
        int partitionEndIndex = symbolLastAppearances[s.charAt(0)];

        for(int i = 0; i < s.length(); i++) {
            int symbolLastAppearanceIndex = symbolLastAppearances[s.charAt(i)];
            if(i == partitionEndIndex) {
                partitionLabels.add(partitionEndIndex - partitionStartIndex + 1);
                partitionStartIndex = partitionEndIndex + 1;
                partitionEndIndex = i + 1 < s.length() ? symbolLastAppearances[s.charAt(i+1)] : s.length();
            } else if(symbolLastAppearanceIndex > partitionEndIndex) {
                partitionEndIndex = symbolLastAppearanceIndex;
            }
        }

        return partitionLabels;
    }
}
