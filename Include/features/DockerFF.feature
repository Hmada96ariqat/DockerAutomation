Feature: Automating Docker Hub

  Scenario: login
    Given Open Browser
    And Navigate to URL
    Then Click on sign-in button
    And Sign-in with your credintials
    When Verify the homePage
    Then Create new repo
    And Fill repo info
    Then Create repo button
    And Navigate to settings
    When Verify the setting page
    Then Delete the repo

    Then Verify home page
    Then Create new repo
    And Fill repo info
    Then Create repo button
    And Navigate to settings
    When Verify the setting page
    Then Delete the repo
    Then Verify home page
    
    Then Verify home page
    Then Create new repo
    And Fill repo info
    Then Create repo button
    And Navigate to settings
    When Verify the setting page
    Then Delete the repo
    Then Verify home page
    
    Then Close browser
    
