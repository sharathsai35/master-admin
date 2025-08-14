Feature: Features

  #@tag1
  #Scenario: Login the user & click on Features
    #Given User has navigate to login page
    #When User enters valid mobile num	
    #And User enter password 
    #And User click on proceed button
    #And User Enter the MFA code
    #And User click proceed button for MFA code
    #And User click on Features page
    #Then Validate the Features page
    
  #@tag2
  #Scenario: Click on valid search in Features
    #Given User has navigate to login page
    #When User enters valid mobile num	
    #And User enter password 
    #And User click on proceed button
    #And User Enter the MFA code
    #And User click proceed button for MFA code
    #And User click on Features page
    #Then Validate the Features page  
    #And User click on search and enter the Feature name with enter button
    #Then User validate the Feature name
   
  #@tag3
  #Scenario: Click on invalid search in Features
    #Given User has navigate to login page
    #When User enters valid mobile num	
    #And User enter password 
    #And User click on proceed button
    #And User Enter the MFA code
    #And User click proceed button for MFA code
    #And User click on Features page
    #Then Validate the Features page  
    #And User click on search and enter the invalid data with enter button
    #Then User validate the invalid searched data 
    
  #@tag4
  #Scenario: Click on search in Features with Esc button
    #Given User has navigate to login page
    #When User enters valid mobile num	
    #And User enter password 
    #And User click on proceed button
    #And User Enter the MFA code
    #And User click proceed button for MFA code
    #And User click on Features page
    #Then Validate the Features page  
    #And User click on search and enter the invalid data with enter button
    #Then User validate the invalid searched data   
    #And Click on Esc button
    #Then validate the search field of Features
    
  #@tag5
  #Scenario: Click on search in Features with backspace
    #Given User has navigate to login page
    #When User enters valid mobile num	
    #And User enter password 
    #And User click on proceed button
    #And User Enter the MFA code
    #And User click proceed button for MFA code
    #And User click on Features page
    #Then Validate the Features page  
    #And User click on search and enter the invalid data with enter button
    #Then User validate the invalid searched data   
    #And Click on backspace for entered data
    #Then validate the search field of Features  
    
  #@tag6
  #Scenario: Click on search in Features with clear button
    #Given User has navigate to login page
    #When User enters valid mobile num	
    #And User enter password 
    #And User click on proceed button
    #And User Enter the MFA code
    #And User click proceed button for MFA code
    #And User click on Features page
    #Then Validate the Features page  
    #And User click on search and enter the invalid data with enter button
    #Then User validate the invalid searched data   
    #And Click on clear button
    #Then validate the search field of Features 
    
  #@tag7
  #Scenario: Click on filter by Platform
    #Given User has navigate to login page
    #When User enters valid mobile num	
    #And User enter password 
    #And User click on proceed button
    #And User Enter the MFA code
    #And User click proceed button for MFA code
    #And User click on Features page
    #Then Validate the Features page  
    #And user click on filter by Platform
    #Then validate the filter by Platform
    
  @tag8
  Scenario: Click on filter by Platform with Select All
    Given User has navigate to login page
    When User enters valid mobile num	
    And User enter password 
    And User click on proceed button
    And User Enter the MFA code
    And User click proceed button for MFA code
    And User click on Features page
    Then Validate the Features page  
    And user click on filter by Platform
    Then validate the filter by Platform
    And Click on All in platform dropdown
    And Click on Apply button for platform
    Then Validate the features page       
    
    
    
    