package com.rodionorets.leetcode.strings;

public class ValidParentheses {
    public boolean isValid(String parentheses) {
        char[] stack = new char[parentheses.length()];
        int top = 0;
        
        for (int i = 0; i < parentheses.length(); i++) {
            char bracket = parentheses.charAt(i);
            if (opening(bracket)) {
                stack[top] = bracket;
                top++;
            } else {
                if (top == 0) return false;
                char openingBracket = getOpeningBracket(bracket);
                if (stack[top - 1] == openingBracket) {
                    top--;
                } else {
                    return false;
                }
            }
        }
        
        return top == 0;
    }
    
    private boolean opening(char bracket) {
        return bracket == '(' || bracket == '[' || bracket == '{';
    }
    
    private char getOpeningBracket(char bracket) {
        return switch (bracket) {
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> '!';
        };
    }
}
