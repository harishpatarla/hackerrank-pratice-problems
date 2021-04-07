package com.hackerrank.praticeproblems.leetcode;

public class TrappingRainWater {
   public int trap(int[] height) {
      int result = 0;
      int leftIndex = 0;
      int rightIndex = height.length - 1;

      if (height.length == 0) {
         return 0;
      }

      while(height[leftIndex] <= height[leftIndex + 1]) leftIndex++;
      while(height[rightIndex] <= height[rightIndex - 1]) rightIndex--;

      while(leftIndex < rightIndex) {
         int leftHeight = height[leftIndex];
         int rightHeight = height[rightIndex];
         if (leftHeight <= rightHeight) {

            // add volume until an edge larger than the left edge
            while (leftIndex < rightIndex && leftHeight >= height[++leftIndex]) {
               result += leftHeight - height[leftIndex];
            }
         leftIndex++;

         } else {

            rightIndex--;
         }
      }
      return result;
   }
}
