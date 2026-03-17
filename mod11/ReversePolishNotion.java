//Leetcode 150 Reverse Polish Notion

import java.util.*;

public class ReversePolishNotion {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // If operator
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                }

                stack.push(result);
            } else {
                // Number
                stack.push(Integer.parseInt(token));
            }
            
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};

        int result = evalRPN(tokens);
        System.out.println(result); // Output: 9
    }
}