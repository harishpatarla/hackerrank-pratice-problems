package com.hackerrank.praticeproblems.paypal;

public class LongestMountain {
   public static void main(String[] args) {
      //longestMountain(Arrays.stream(args).toArray());
   }

   static int longestMountain(int[] arr) {
      //[1, 2, 3, 2, 1, 0, 2, 3, 1]
      int n = arr.length;
      int ans = 0, base = 0;
      while (base < n) {
         int end = base;
         // if base is a left-boundary
         if (end + 1 < n && arr[end] < arr[end + 1]) {
            // set end to the peak of this potential mountain
            while (end + 1 < n && arr[end] < arr[end + 1]) end++;
            // if end is really a peak..
            if (end + 1 < n && arr[end] > arr[end + 1]) {
               // set end to the right-boundary of mountain
               while (end + 1 < n && arr[end] > arr[end + 1]) end++;
               // record candidate answer
               ans = Math.max(ans, end - base + 1);
            }
         }
         base = Math.max(end, base + 1);
      }
      return ans;
   }
}
