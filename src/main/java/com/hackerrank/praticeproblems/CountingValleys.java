package com.hackerrank.praticeproblems;

public class CountingValleys {

   public static int countingValleys(int steps, String path) {
      int altitude = 0, countValley = 0;
      for (int i = 0; i < steps; i++) {
         if (path.charAt(i) == 'U') {
            if (altitude == -1) {
               countValley++;
            }
            altitude++;
         }
         if (path.charAt(i) == 'D') {
            altitude--;
         }
      }
      return countValley;
   }
}
