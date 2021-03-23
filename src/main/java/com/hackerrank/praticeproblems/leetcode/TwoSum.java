package com.hackerrank.praticeproblems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
   public static int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> numIndexMap = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
         if (numIndexMap.containsKey(nums[i])) {
            return new int[]{numIndexMap.put(nums[i], i)};
         } else {
            numIndexMap.put(target - nums[i], i);
         }
      }
      return new int[]{0, 0};
   }
}
