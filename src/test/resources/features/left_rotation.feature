@AcceptanceTest
   Feature: When left rotation is done for an array move those
      Scenario:
         Given an array of number
         When i rotate them by "4"
         Then i see new array as expected
