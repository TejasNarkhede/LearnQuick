// https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;
                if (ch == ')' && stack.peek() != '(') {
                    return false;
                } else if (ch == ']' && stack.peek() != '[') {
                    return false;
                } else if (ch == '}' && stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return (stack.size() == 0);
    }
}