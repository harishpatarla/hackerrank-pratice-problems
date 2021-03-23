package com.hackerrank.praticeproblems.paypal;

public class PairsDivisibleByConstant {
   //arr = [1,2,3,4,5,10,6,7,8,9], k = 5
   public boolean canArrange(int[] arr, int k) {
      int[] frequency = new int[k];
      for (int num : arr) {
         num = num % k;
         if (num < 0) {
            num = num + k;
         }
         frequency[num]++;
      }
      if (frequency[0] % 2 != 0) {
         return false;
      }

      for (int i = 1; i <= k / 2; i++) {
         if (frequency[i] != frequency[k - i]) {
            return false;
         }
      }

      return true;
   }
}
