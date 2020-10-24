package com.hackerrank.praticeproblems;

import java.util.Arrays;

public class MaximumToys {
   static int maximumToys(int[] prices, int k) {
      int maxToys = 0;
      int sumOfToys = 0;
      int[] sortedPrices = Arrays.stream(prices).sorted().toArray();

      if (prices.length == 0 || k == 0) return maxToys;

      for (int j = 0; j < sortedPrices.length; j++) {
         if (sumOfToys + sortedPrices[j] < k) {
            sumOfToys = sumOfToys + sortedPrices[j];
            maxToys++;
         }
      }
      return maxToys;
   }
}
