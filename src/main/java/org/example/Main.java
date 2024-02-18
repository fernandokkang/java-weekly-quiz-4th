package org.example;

import java.util.Stack;

public class Main {

    private static Stack<Character> stack;

    public static void main(String[] args) {

        String [] input = {"((())())", "(()()))(", "((())"};

        for(int i=0; i< input.length; i++) {

            stack = new Stack<>();
            System.out.println(solution(input[i]));
        }
    }

    private static boolean solution(String s) {

        if(s.length() % 2 != 0) {
            return false;
        }

        for(int i=0; i<s.length(); i++) {

            if(stack.empty()) {
                stack.push(s.charAt(i));
            } else{
                if(s.charAt(i) == ')') {
                    if(stack.peek() == '(') {
                        stack.pop();
                    }
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        return stack.empty();
    }
}