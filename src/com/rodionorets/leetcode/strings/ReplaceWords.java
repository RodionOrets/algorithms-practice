package com.rodionorets.leetcode.strings;

import java.util.Comparator;
import java.util.List;

public class ReplaceWords {
    public String replaceWords(List<String> roots, String sentence) {
        String[] words = sentence.split(" ");

        roots.sort(Comparator.comparingInt(String::length));

        StringBuilder wordsReplaces = new StringBuilder();

        for (String word : words) {
            wordsReplaces
                    .append(getWordRoot(word, roots))
                    .append(" ");
        }

        return wordsReplaces.toString().trim();
    }

    private String getWordRoot(String word, List<String> roots) {
        for (String root : roots) {
            if (word.startsWith(root)) {
                return root;
            }
        }

        return word;
    }
}
