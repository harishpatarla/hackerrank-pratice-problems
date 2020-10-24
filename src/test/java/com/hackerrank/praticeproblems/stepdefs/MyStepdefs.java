package com.hackerrank.praticeproblems.stepdefs;

import com.hackerrank.praticeproblems.MakingAnagrams;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
   int minDeletions = 0;

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
}
