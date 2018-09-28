package com.rodionorets.leetcode.strings;

public class GoatLatin {
    public String toGoatLatin(String S) {
        StringBuilder goatLatinStringBuilder = new StringBuilder();

        String[] words = S.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuilder goatWord = new StringBuilder();

            String word = words[i];

            char firstWordCharacter = word.charAt(0);

            if (isVowel(firstWordCharacter)) {
                goatWord.append(word);
            } else {
                goatWord.append(word.substring(1));
                goatWord.append(firstWordCharacter);
            }

            goatWord.append("ma");

            for (int j = 0; j < i + 1; j++) {
                goatWord.append("a");
            }

            goatLatinStringBuilder.append(goatWord);

            if (i + 1 < words.length) goatLatinStringBuilder.append(" ");
        }

        return goatLatinStringBuilder.toString();
    }

    private boolean isVowel(char c) {
        return
                c == 'a' || c == 'A' ||
                        c == 'e' || c == 'E' ||
                        c == 'i' || c == 'I' ||
                        c == 'o' || c == 'O' ||
                        c == 'u' || c == 'U';
    }
}
