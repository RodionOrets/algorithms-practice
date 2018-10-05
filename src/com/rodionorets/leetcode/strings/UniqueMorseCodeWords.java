package com.rodionorets.leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseRepresentations = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> uniqueMorseRepresentations = new HashSet<>();

        for (String word : words) {
            StringBuilder morseRepresentation = new StringBuilder();
            for (char c : word.toCharArray()) {
                morseRepresentation.append(morseRepresentations[c - 'a']);
            }
            uniqueMorseRepresentations.add(morseRepresentation.toString());
        }

        return uniqueMorseRepresentations.size();
    }
}
