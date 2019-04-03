Feature: Test
  
  The purpose of the feature 
  is to make sure
  that user is able to add Company

  Background: Verify that user is ble to login
    Given user is on login page
    And user enter username and "xyz@gmail.com" and password as "password!" and click Login button
    Then home page is displayed
    
  Scenario: Verify that user is able to copy event multiple times
  	When user is navgate to manage events page
  	And user clicks on Draft tab
		And user clicks on first Manage button
		And user copy event 100 times
		And user is navgate to manage events page
		Then verify event is copied 100 times
