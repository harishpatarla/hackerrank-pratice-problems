package com.hackerrank.praticeproblems;

import java.util.ArrayList;
import java.util.List;

public class LeftRotations {

   public static List<Integer> rotateLeft(int d, List<Integer> arr) {
      List<Integer> rotatedList = new ArrayList<>();
      int size = arr.size();
      int rotateIndex = d;
      int i = 0;
      while (rotateIndex < size) {
         rotatedList.add(i, arr.get(rotateIndex));
         i++;
         rotateIndex++;
      }
      rotateIndex = 0;
      while(rotateIndex < d) {
         rotatedList.add(i, arr.get(rotateIndex));
         i++;
         rotateIndex++;
      }
      return rotatedList;
   }
}
