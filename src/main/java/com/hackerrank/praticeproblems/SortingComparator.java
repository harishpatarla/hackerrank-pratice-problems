package com.hackerrank.praticeproblems;

import java.util.Comparator;

public class SortingComparator implements Comparator<SortingComparator.Player> {

   @Override
   public int compare(Player a, Player b) {
      if (a.score == b.score) {
         return a.name.compareTo(b.name);
      }
      return b.score - a.score;
}

   class Player {
      String name;
      int score;
   }

}
