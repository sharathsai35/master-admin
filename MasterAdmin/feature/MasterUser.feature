Feature: Check all modules in Master User

  @tag1
  Scenario: Login the Master User
    Given User has navigate to Login page
    When User enters valid Mobile num	
    And User enter Password 
    And User click on Proceed button
    And User Enter the MFA Code
    And User click Proceed button for MFA code
    Then Validate the Master User login page
    
  @tag2
  Scenario: Click on Features & Click on any feature
    Given User has navigate to Login page
    When User enters valid Mobile num	
    And User enter Password 
    And User click on Proceed button
    And User Enter the MFA Code
    And User click Proceed button for MFA code
    Then Validate the Master User login page
    And Click on Features tab
    And Validate the Features tab
    And Click on any Feature  
    Then Validate the Feature is clickable or not
    
  @tag3
  Scenario: Click on Plan & Click on any Plan
    Given User has navigate to Login page
    When User enters valid Mobile num	
    And User enter Password 
    And User click on Proceed button
    And User Enter the MFA Code
    And User click Proceed button for MFA code
    Then Validate the Master User login page
    And Click on Plans tab in Master User
    And Validate the Plans tab in Master User
    And Click on any Plan  
    Then Validate the Plan is clickable or not 
    
  @tag4
  Scenario: Click on Setup & Click on any Setup
    Given User has navigate to Login page
    When User enters valid Mobile num	
    And User enter Password 
    And User click on Proceed button
    And User Enter the MFA Code
    And User click Proceed button for MFA code
    Then Validate the Master User login page
    And Click on Setup tab
    And Validate the Setup tab
    And Click on any Setup  
    Then Validate the Setup is clickable or not 
    
  @tag5
  Scenario: Login the Master User & View the page
    Given User has navigate to Login page
    When User enters valid Mobile num	
    And User enter Password 
    And User click on Proceed button
    And User Enter the MFA Code
    And User click Proceed button for MFA code
    Then Validate the Master User login page
    Then Validate the Partner is displaying or not  
    
  @tag6
  Scenario: Click on Bulk License & Click on Pending License
    Given User has navigate to Login page
    When User enters valid Mobile num	
    And User enter Password 
    And User click on Proceed button
    And User Enter the MFA Code
    And User click Proceed button for MFA code
    Then Validate the Master User login page
    And Click on Bulk License tab in Master User
    And Validate the Bulk License tab in Master User
    And Click on pending or Approved License  
    Then Validate the pending or Approved License page  
    
  @tag7
  Scenario: Click on On-Demand License & Click on Pending License
    Given User has navigate to Login page
    When User enters valid Mobile num	
    And User enter Password 
    And User click on Proceed button
    And User Enter the MFA Code
    And User click Proceed button for MFA code
    Then Validate the Master User login page
    And Click on On-Demand License tab in Master User
    And Validate the On-Demand License tab in Master User
    And Click on pending or Approved On-Demand License  
    Then Validate the pending or Approved On-Demand License page
    
  @tag8
  Scenario: Click on Notification
    Given User has navigate to Login page
    When User enters valid Mobile num	
    And User enter Password 
    And User click on Proceed button
    And User Enter the MFA Code
    And User click Proceed button for MFA code
    Then Validate the Master User login page 
    And Click on Notification in Master User
    Then Validate the Notification page in Master User          
