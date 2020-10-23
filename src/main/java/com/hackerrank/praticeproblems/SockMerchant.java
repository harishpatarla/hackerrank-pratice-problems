package com.hackerrank.praticeproblems;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

   public static int matchingPairs(int n, int[] ar) {
      int pairs = 0;
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < n; i++) {
         if (!set.contains(ar[i])) {
            set.add(ar[i]);
         } else {
            pairs++;
            set.remove(ar[i]);
         }
      }
      return pairs;
   }
}
