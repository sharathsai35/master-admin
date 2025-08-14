Feature: Notifications

  @tag1
  Scenario: Login the user & click on Notification
    Given user has navigates to login page
    When user enter valid mobile num	
    And user enters password 
    And user click on proceed button with the details
    And user Enters the MFA code
    And user click proceed button for MFA code with the details
    And user click on Notification page
    Then validate the Notification page
    
  #@tag2
  #Scenario: click on Notification in heading partial link
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on Notification in heading partial link
    #Then validate the Notification page
    #
  #@tag3
  #Scenario: click on Home in heading partial link
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on Home in heading partial link
    #Then validate the Features page
    #
  #@tag4
  #Scenario: click on All radio button in filter
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on All radio button in Notifications
    #Then validate the All licenses added by Super Admin & Master Admin 
    #Then Validate the licenses with title, name & date
    #
  #@tag5
  #Scenario: click on Super Admin radio button in filter
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on Super Admin radio button in Notifications
    #Then validate the Super Admin licenses tab  
    #
  #@tag6
  #Scenario: click on Master Admin radio button in filter
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on Master Admin radio button in Notifications
    #Then validate the Master Admin licenses tab  
    #
  #@tag7
  #Scenario: click on any Licenses in All radio button
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on All radio button in Notifications
    #Then validate the All licenses added by Super Admin & Master Admin 
    #And Click on any Licenses in All Notification
    #Then Validate the highlighted tab       
    #
  #@tag8
  #Scenario: click on any Licenses in Super Admin radio button
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on Super Admin radio button in Notifications
    #Then validate the Super Admin licenses tab  
    #And Click on any Licenses in Super Admin Notification
    #Then Validate the clicked Licenses in Super Admin & highlighted tab   
    #
  #@tag9
  #Scenario: click on any Licenses in Master Admin radio button
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on Master Admin radio button in Notifications
    #Then validate the Master Admin licenses tab  
    #And Click on any Licenses in Master Admin Notification
    #Then Validate the clicked Licenses in Master Admin & highlighted tab  
    #
  #@tag10
  #Scenario: click on added/edited Partner company 
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on All radio button in Notifications
    #Then validate the All licenses added by Super Admin & Master Admin 
    #And Click on added or edited Partner company in All Notification
    #Then Validate the highlighted tab & Partner Company
    #
  #@tag11
  #Scenario: click on On-Demand Licenses request
    #Given user has navigates to login page
    #When user enter valid mobile num	
    #And user enters password 
    #And user click on proceed button with the details
    #And user Enters the MFA code
    #And user click proceed button for MFA code with the details
    #And user click on Notification page
    #Then validate the Notification page  
    #And Click on Super Admin radio button in Notifications
    #Then validate the Super Admin licenses tab 
    #And Click on On Demand Licenses in Super Admin Notification
    #Then Validate the highlighted tab & On Demand Licenses                
   #
