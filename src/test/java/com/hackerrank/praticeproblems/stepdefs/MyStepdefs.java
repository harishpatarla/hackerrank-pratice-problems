package com.hackerrank.praticeproblems.stepdefs;

import com.hackerrank.praticeproblems.LeftRotations;
import com.hackerrank.praticeproblems.MakingAnagrams;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class MyStepdefs {
   int minDeletions = 0;
   int[] arr;
   List<Integer> afterRotation;

   @Given("^two strings \"([^\"]*)\" and \"([^\"]*)\"$")
   public void twoStringsAnd(String s1, String s2) throws Throwable {
      minDeletions = MakingAnagrams.makingAnagrams(s1, s2);
   }

   @When("^i ask to make anagrams$")
   public void iAskToMakeAnagrams() {
   }

   @Then("^i see \"([^\"]*)\" expected$")
   public void iSeeExpected(String expectedMinDeletions) throws Throwable {
      assertEquals(Integer.parseInt(expectedMinDeletions), minDeletions);
   }

   @Given("^an array of number$")
   public void anArrayOfNumber() {
      arr = new int[]{1, 2, 3, 4, 5};
   }

   @When("^i rotate them by \"([^\"]*)\"$")
   public void iRotateThemBy(String rotation) throws Throwable {

      afterRotation = LeftRotations.rotateLeft(Integer.parseInt(rotation), Arrays.stream(arr).boxed().collect(Collectors.toList()));
   }

   @Then("^i see new array as expected$")
   public void iSeeNewArrayAsExpected() {
   }
}
