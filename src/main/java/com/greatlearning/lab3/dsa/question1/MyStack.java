package com.greatlearning.lab3.dsa.question1;

import java.util.Stack;

public class MyStack {

    public boolean validate(String input) {

        Stack<Character> stack = new Stack<>();
        for (char character : input.toCharArray()) {
            if (character == '{' || character == '[' || character == '(') {
                stack.push(character);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char z;
            switch (character) {
                case '}':
                    z = stack.pop();
                    if (z == '(' || z == '[') {
                        return false;
                    }
                    break;
                case ']':
                    z = stack.pop();
                    if (z == '(' || z == '{') {
                        return false;
                    }
                    break;
                case ')':
                    z = stack.pop();
                    if (z == '{' || z == '[') {
                        return false;
                    }
                    break;
                default:
            }
        }
        return stack.isEmpty();
    }


}
