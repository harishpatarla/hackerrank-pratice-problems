package com.hackerrank.praticeproblems.leetcode;

import java.util.LinkedHashMap;

class LRUCache  extends LinkedHashMap<Integer, Integer> {
   private int capacity;

   public LRUCache(int capacity) {
      this.capacity = capacity;
   }

   public int get(int key) {
      return super.getOrDefault(key, -1);
   }

   public void put(int key, int value) {
      super.put(key, value);
   }
}
