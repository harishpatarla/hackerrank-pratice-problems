package com.hackerrank.praticeproblems;

import java.util.Arrays;

public class LuckBalance {
   static int luckBalance(int k, int[][] contests) {
      int luck_balance = 0;
      int n = contests[0][0];
      k = contests[0][1];

      Arrays.sort(contests, (a, b) -> -1 * Integer.compare(a[0], b[0]));

      for (int i = 1; i < n; i++) {
         int luck = contests[i][0];
         int importance = contests[i][1];

         if (importance == 1 && k > 0) {
            k--;
            luck_balance += luck;
         } else if (importance == 1 && k ==0) {
            luck_balance -= luck;
         }

         if (importance == 0) {
            luck_balance += luck;
         }
      }

      return luck_balance;
   }
}
