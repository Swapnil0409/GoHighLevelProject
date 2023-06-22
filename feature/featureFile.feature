Feature: Go High Level Create Calendar

  Scenario: Create calendar for go high level

    Given Launch chrome browser
    When User open URL "https://app.gohighlevel.com/"
    And User enter username as "ghlqa4@gohighlevel.com"
    And User enter password as "Test123!"
    And Click on Sign In button
    Then Verify Dashboard Page Is Displayed
    And Click on Calendars Tab, Click on Calendar Setting
    And Click on Create Calendar Button, Select Round Robin Calendar Type, Click on Add User, Select User, Enter Meeting Location, Calendar name, Calendar URL, Click on Save and Continue Button two times, Click on Complete Button
    Then Verify Calendar is added
    And Close the Browser
