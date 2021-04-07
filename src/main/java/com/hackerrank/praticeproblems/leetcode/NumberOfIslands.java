package com.hackerrank.praticeproblems.leetcode;

public class NumberOfIslands {
   public static int numIslands(char[][] grid) {
      int count = 0;
      int rows = grid.length;
      int columns = grid[0].length;

      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            if (grid[i][j] == '1') {
               count++;
               callBFS(grid, i ,j);
            }
         }
      }
      return count;
   }

   private static void callBFS(char[][] grid, int i, int j) {
      if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
         return;
      }
      grid[i][j] = '0';
      callBFS(grid, i+1, j);
      callBFS(grid, i-1, j);
      callBFS(grid, i, j+1);
      callBFS(grid, i, j-1);
   }
}
