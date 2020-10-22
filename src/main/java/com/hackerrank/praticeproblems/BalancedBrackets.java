package com.hackerrank.praticeproblems;

import java.util.Stack;

public class BalancedBrackets {
   public static String isBalanced(String s) {
      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < s.length(); i++) {

         if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
            stack.push(s.charAt(i));
         } else {
            if (stack.isEmpty()) {
               return "NO";
            } else {
               char pop_value = stack.pop();
               if (s.charAt(i) == ')' && pop_value != '(') {
                  return "NO";
               } else if (s.charAt(i) == '}' && pop_value != '{') {
                  return "NO";
               } else if (s.charAt(i) == ']' && pop_value != '[') {
                  return "NO";
               }
            }
         }
      }
      return stack.isEmpty() ? "YES" : "NO";
   }
}
