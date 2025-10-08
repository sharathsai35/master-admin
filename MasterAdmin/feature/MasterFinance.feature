Feature: Check all modules in Master Finance

  @tag1
  Scenario: Login the Master Finance
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page
    
  @tag2
  Scenario: Click on feature tab & Click on any feature
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page  
    And Click on Feature tab in Master Finance
    And Validate the Features tab in Master Finance
    And Click on any Features in Master Finance
    Then Validate the Features is clickable or not
    
  @tag3
  Scenario: Click on Plans tab & Click on any Plans
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page  
    And Click on Plans tab in Master Finance
    And Validate the Plans tab in Master Finance
    And Click on any Plans in Master Finance
    Then Validate the Plans in Master Finance is clickable or not
    
  @tag4
  Scenario: Click on Setup tab & Click on any Setup
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page  
    And Click on Setup tab in Master Finance
    And Validate the Setup tab in Master Finance
    And Click on any Setup in Master Finance
    Then Validate the Setup in Master Finance is clickable or not
    
  @tag5
  Scenario: Click on Partner tab & Click on any Partner
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page  
    And Click on Partner tab in Master Finance
    And Validate the Partner tab in Master Finance
    And Click on any Partner in Master Finance
    Then Validate the Partner in Master Finance is clickable or not   
    
  @tag6
  Scenario: Click on Bulk Licenses tab & Click on Pending Licenses
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page  
    And Click on Bulk License tab in Master Finance
    And Validate the Bulk License tab in Master Finance
    And Click on pending License in Master Finance
    Then Validate the pending License in Master Finance is clickable or not
    Then Validate the Approve and Reject button 
    
  @tag7
  Scenario: Click on Bulk Licenses tab & Click on Pending Licenses & Reject the License
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page  
    And Click on Bulk License tab in Master Finance
    And Validate the Bulk License tab in Master Finance
    And Click on pending License in Master Finance
    Then Validate the pending License in Master Finance is clickable or not
    Then Validate the Approve and Reject button 
    And Click on Reject button for Pending License
    And Enter the reason for rejection
    And Click on next button in reason
    And Enter the MFA code for rejecting the License
    And Click on Submit button for MFA code
    And Validate the toast msg of Rejected License
    Then Validate the Rejected license     
    
  @tag8
  Scenario: Click on Bulk Licenses tab & Click on Pending Licenses & Approve the License
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page  
    And Click on Bulk License tab in Master Finance
    And Validate the Bulk License tab in Master Finance
    And Click on pending License in Master Finance
    Then Validate the pending License in Master Finance is clickable or not
    Then Validate the Approve and Reject button 
    And Click on Approve button for Pending License
    And Enter the reason for Approval
    And Click on next button in reason
    And Enter the MFA code for approving the License
    And Click on Submit button for MFA code
    And Validate the toast msg of Approved License
    Then Validate the Approved license 
    
  @tag9
  Scenario: Click on On-Demand License & Click on Pending License
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page  
    And Click on On-Demand License tab in Master Finance
    And Validate the On-Demand License tab in Master Finance
    And Click on pending or Approved On-Demand License in Master Finance  
    Then Validate the pending or Approved On-Demand License page in Master Finance 
    
  @tag10
  Scenario: Click on Notification
    Given User has navigate to Login Url
    When User enters valid Mobile num of Master Finance
    And User enter Password of Master Finance
    And User click on Proceed button of entered details
    And User Enter the MFA Code of Master Finance
    And User click Proceed button for MFA code of entered details
    Then Validate the Master Finance login page  
    And Click on Notification in Master Finance
    Then Validate the Notification page in Master Finance              
    
    
    
      