package com.isco.calculatorandroid;

import java.util.Stack;

/**
 * Created by ISCO on 10/27/17.
 */

public class CalculateParenthesis {


    public int calculate2(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        int res = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                sign = c == '+' ? 1: -1;
            } else if (c == '(') {
                stack.push(sign * stack.peek());
                sign = 1;
            } else if (c == ')') {
                sign = stack.pop();
            } else if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                res += sign * num * stack.peek();
            }
        }
        return res;
    }



}
