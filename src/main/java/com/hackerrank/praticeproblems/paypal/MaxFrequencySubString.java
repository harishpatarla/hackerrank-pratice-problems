package com.hackerrank.praticeproblems.paypal;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencySubString {
   public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
      int result = 0, length = s.length();
      Map<String, Integer> map = new HashMap<>(); // substring -> count

      for (int i = 0; i < length - minSize + 1; i++) {
         String str = s.substring(i, i + minSize);
         // check the substring does not contains distinct letters more than maxLetters
         if (isValid(str, maxLetters)) {
            map.put(str, map.getOrDefault(str, 0) + 1);
            result = Math.max(map.get(str), result);
         }
      }
      return result;
   }

   private boolean isValid(String str, int maxLetters) {
      int[] freq = new int[26];
      int distinct = 0;
      for (char c : str.toCharArray()) {
         if (freq[c - 'a']++ == 0) distinct++;
      }
      return distinct <= maxLetters;
   }
}
