//Leetcode 20 Valid Parentheses

import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If stack empty → invalid
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check matching
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";

        boolean result = isValid(s);
        System.out.println(result);  // Output: true
    }
}