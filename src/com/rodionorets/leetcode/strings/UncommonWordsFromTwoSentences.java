package com.rodionorets.leetcode.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        Set<String> uncommonFromSentences = new HashSet<>();
        Map<String, Integer> occurrences = new HashMap<>();

        String concatenated = A + " " + B;

        for (String s : concatenated.split(" ")) {
            if (!uncommonFromSentences.add(s)) {
                uncommonFromSentences.remove(s);
            }

            Integer occurrence = occurrences.get(s);

            if (occurrence == null) {
                occurrences.put(s, 1);
            } else {
                if (occurrence > 1) {
                    uncommonFromSentences.remove(s);
                }
                occurrences.put(s, occurrence + 1);
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
