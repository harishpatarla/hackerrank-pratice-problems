package com.hackerrank.praticeproblems;

import java.util.Arrays;

public class Candies {
   static long candies(int n, int[] arr) {
      int[] candy = new int[n];
      Arrays.fill(candy, 1);

      for (int i = 0; i < n - 1; i++) {
         if ((arr[i + 1] > arr[i])) {
            candy[i + 1] = candy[i] + 1;
         }
      }
      for (int k = n - 1; k > 0; k--) {
         if ((arr[k - 1] > arr[k])) {
            candy[k - 1] = Math.max(candy[k - 1], candy[k] + 1);
         }
      }
      long sum =0;
      for (int i = 0; i < n; i++) {
         sum = sum + candy[i];
      }
      return sum;
   }
}
