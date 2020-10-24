package com.hackerrank.praticeproblems;

public class MakingAnagrams {
   static int makingAnagrams(String s1, String s2) {
      int minDeletions = 0;

      int[] a_frequencies = new int[26];
      int[] b_frequencies = new int[26];

      for (int i = 0; i < s1.length(); i++) {
         char current_char = s1.charAt(i);
         int charToInt = current_char;
         int position = charToInt - 97;
         a_frequencies[position]++;
      }

      for (int i = 0; i < s2.length(); i++) {
         char current_char = s2.charAt(i);
         int charToInt = current_char;
         int position = charToInt - 97;
         b_frequencies[position]++;
      }

      for (int i = 0; i < 26; i++) {
         minDeletions = minDeletions + Math.abs(a_frequencies[i] - b_frequencies[i]);
      }
      return minDeletions;
   }
}
