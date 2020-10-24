package com.hackerrank.praticeproblems;

public class AlternatingCharacters {
   static int alternatingCharacters(String s) {
      int min_deletions = 0;
      for (int i = 0; i < s.length()-1; i++) {

         if (s.charAt(i) == s.charAt(i + 1)) {
            min_deletions++;
         }
      }
      return min_deletions;
   }

}
