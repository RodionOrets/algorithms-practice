package com.rodionorets.leetcode.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        Set<String> uncommonFromSentences = new HashSet<>();
        Map<String, Integer> occurences = new HashMap<>();

        String concatenated = A + " " + B;

        for (String s : concatenated.split(" ")) {
            if (!uncommonFromSentences.add(s)) {
                uncommonFromSentences.remove(s);
            }

            Integer occurence = occurences.get(s);

            if (occurence == null) {
                occurences.put(s, 1);
            } else {
                if (occurence > 1) {
                    uncommonFromSentences.remove(s);
                }
                occurences.put(s, occurence + 1);
            }
        }

        String[] strings = new String[uncommonFromSentences.size()];

        int i = 0;
        for (String s : uncommonFromSentences) {
            strings[i++] = s;
        }

        return strings;
    }
}
