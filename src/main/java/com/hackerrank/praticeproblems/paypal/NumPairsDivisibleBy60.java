package com.hackerrank.praticeproblems.paypal;

public class NumPairsDivisibleBy60 {
   public static void main(String[] args) {
      //[30,20,150,100,40]
   }
   static int numPairsDivisibleBy60(int[] time) {
      int count = 0;
      int n = time.length;
      for (int i = 0; i < n; i++) {
         for (int j = i+1; j < n; j++) {
            if ((time[i] + time[j]) % 60 == 0) {
               count++;
            }
         }
      }
      return count;
   }
}
