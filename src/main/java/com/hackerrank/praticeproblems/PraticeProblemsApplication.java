package com.hackerrank.praticeproblems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticeProblemsApplication {

   public static void main(String[] args) {
      SpringApplication.run(PraticeProblemsApplication.class, args);
      //System.out.println(BalancedBrackets.isBalanced("{[(])}"));
      //System.out.println(CountingValleys.countingValleys(8, "UDDDUDUU"));  //the number of valleys traversed
      //Return the total number of matching pairs of socks that Alex can sell.
      //System.out.println(SockMerchant.matchingPairs(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
      System.out.println(Candies.candies(8, new int[]{2, 4, 3, 5, 2, 6, 4, 5}));
   }

}
