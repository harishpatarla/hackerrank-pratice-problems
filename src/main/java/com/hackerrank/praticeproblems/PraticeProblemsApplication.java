package com.hackerrank.praticeproblems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticeProblemsApplication {

   public static void main(String[] args) {
      SpringApplication.run(PraticeProblemsApplication.class, args);
      System.out.println(BalancedBrackets.isBalanced("{[(])}"));
      System.out.println(CountingValleys.countingValleys(8, "UDDDUDUU"));  //the number of valleys traversed
      System.out.println(SockMerchant.matchingPairs(7, {1,2,1,2,1,3,2}));
   }

}
