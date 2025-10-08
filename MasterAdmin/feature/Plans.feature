Feature: Plans

  @tag1
  Scenario: Click on Plans tab
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab
    
  @tag2
  Scenario: Click on search & enter edition name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on search & Enter edition name
    Then Validate the searched edition name
    
  @tag3
  Scenario: Click on search & enter package name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on search & Enter package name
    Then Validate the searched package  
    
  @tag4
  Scenario: Click on search & enter invalid data
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on search & Enter invalid data
    Then Validate the searched invalid data    
    
  @tag5
  Scenario: Click on search & enter package name & Click on esc button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on search & Enter package name
    Then Validate the searched package  
    And Click on esc button in keyboard
    Then Validate the search in Plans tab 
    
  @tag6
  Scenario: Click on search & enter package name & Click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on search & Enter package name
    Then Validate the searched package  
    And Click on clear button in Plans
    Then Validate the search in Plans tab   
    
  @tag7
  Scenario: Click on search & enter package name & Click on backspace with clicking enter button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on search & Enter package name
    Then Validate the searched package  
    And Click on backspace in keyboard & click on enter button
    Then Validate the search in Plans tab 
    
  @tag8
  Scenario: Click on search & enter package name & Click on backspace without clicking enter button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on search & Enter invalid data
    Then Validate the searched invalid data  
    And Click on backspace in keyboard & without clicking on enter button
    Then Validate the search & list in Plans tab  
    
  @tag9
  Scenario: Click on Reference name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown  
    
  @tag10
  Scenario: Click on Reference name & search the reference name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on search in reference name & Enter name
    Then Validate the entered reference name    
    
  @tag11
  Scenario: Click on Reference name & invalid search the reference name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on search in reference name & Enter invalid name
    Then Validate the entered invalid reference name 
    
  @tag12
  Scenario: Click on Reference name & search the reference name & remove the searched data
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on search in reference name & Enter name
    And Remove the entered data with backspace
    Then Validate the search in reference name after remove the entered data
         
  @tag13
  Scenario: Click on Reference name & search the reference name & click on apply button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on search in reference name & Enter name
    And Click on apply button in reference name
    And Click on Reference name
    Then Validate the search in reference name 
    
  @tag14
  Scenario: Click on Reference name & Select All checkbox in reference name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on All checkbox in reference name
    Then Validate the selected All checkbox in reference name 
    
  @tag15
  Scenario: Click on Reference name & Select All checkbox & click on reset button in reference name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on All checkbox in reference name
    And Click on apply button in reference name
    And Again click on Reference name
    And Click on Reset button in reference name
    Then Validate the filter by reference name  
    
  @tag16
  Scenario: Click on Reference name & Select All checkbox & click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on All checkbox in reference name
    And Click on apply button in reference name
    And Click on clear button in Plans
    Then Validate the filter by reference name with All checkbox  
    
  @tag17
  Scenario: Click on Reference name & Search & Select checkbox & click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on search in reference name & Enter name
    And Select the Reference name
    And Click on apply button in reference name
    And Click on clear button in Plans
    Then Validate the filter by reference name      
    
  @tag18
  Scenario: Click on Reference name & Select All checkbox & Deselect all checkbox
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on All checkbox in reference name
    And Deselect All checkbox in reference name
    Then Validate the deselected all checkbox    
    
  @tag19
  Scenario: Click on Reference name & search & select the reference name & click on apply button & view the name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on search in reference name & Enter name
    And Select the Reference name
    And Click on apply button in reference name
    Then Validate the selected reference name     
    
  @tag20
  Scenario: Click on Reference name & search & select the reference name & click on apply button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And Click on Reference name
    Then Validate the Reference name dropdown
    And Click on search in reference name & Enter name
    And Select the Reference name
    And Click on apply button in reference name
    Then Validate the selected reference name in list        
    
  @tag21
  Scenario: Click on filter by Date drop down
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    
  @tag22
  Scenario: Click on filter by Date drop down & Select Today
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on today and click on done button in plans
    Then validate the today created data in plans
  
  @tag23
  Scenario: Select Today & try to select another date
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And And user click on today in dropdown list in plans
    Then validate to select the another dates in plans

  @tag24
  Scenario: Select Today & Click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on today and click on done button in plans
    Then validate the today created data in plans  
    And click on clear button in plans
    Then validate the selected date is cleared or not in plans

  @tag25
  Scenario: Select Today & Click on Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on today and click on done button in plans
    Then validate the today created data in plans
    And again click on Today dropdown in plans
    And user click on Reset button in plans
    Then validate the selected date is cleared or not in plans
  
  @tag26
  Scenario: Select Yesterday
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on yesterday and click on done button in plans
    Then validate the yesterday created data in plans
 
  @tag27
  Scenario: Select Yesterday & Try to select another date
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab  
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on yesterday in dropdown list in plans
    Then validate to select the another dates in plans
        
  @tag28
  Scenario: Select Yesterday & Click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab   
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on yesterday and click on done button in plans
    Then validate the yesterday created data in plans  
    And click on clear button in plans
    Then validate the selected date is cleared or not in plans
     
  @tag29
  Scenario: Select Yesterday & Click on Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on yesterday and click on done button in plans
    Then validate the yesterday created data in plans
    And again click on yesterday dropdown in plans
    And user click on Reset button in plans
    Then validate the selected date is cleared or not in plans
      
  @tag30
  Scenario: Select last week
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on last week and click on done button in plans
    Then validate the last week created data in plans  
   
  @tag31
  Scenario: Select last week & Try to select another date
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on last week in dropdown list in plans
    Then validate to select the another dates in plans 

  @tag32
  Scenario: Select last week & Click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on last week and click on done button in plans
    And click on clear button in plans
    Then validate the selected date is cleared or not in plans
     
  @tag33
  Scenario: Select last week & Click on Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on last week and click on done button in plans
	  And again click on last week dropdown in plans
    And user click on Reset button in plans
    Then validate the selected date is cleared or not in plans  
   
  @tag34
  Scenario: Select last 7 days
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on last 7 days and click on done button in plans
    Then validate the last 7 days created data in plans 
       
  @tag35
  Scenario: Select last 7 days & Try to select another date
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on last 7 days in dropdown list in plans
    Then validate to select the another dates in plans
     
  @tag36
  Scenario: Select last 7 days & Click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on last 7 days and click on done button in plans
    And click on clear button in plans
    Then validate the selected date is cleared or not in plans
     
  @tag37
  Scenario: Select last 7 days & Click on Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on last 7 days and click on done button in plans
    And again click on last 7 days dropdown in plans
    And user click on Reset button in plans
    Then validate the selected date is cleared or not in plans
     
  @tag38
  Scenario: Select This month
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on This month and click on done button in plans
    Then validate the This month created data in plans   
   
  @tag39
  Scenario: Select This month & Try to click on another dates
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on This month in plans
    Then validate to select the another date in plans
    Then user validate the active tab in plans
     
  @tag40
  Scenario: Select This month & Click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on This month and click on done button in plans
    Then validate the This month created data in plans  
    And click on clear button in plans
    Then validate the selected date is cleared or not in plans
     
  @tag41
  Scenario: Select This month & Click on Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on This month and click on done button in plans
    Then validate the This month created data in plans
    And again click on This month dropdown in plans
    And user click on Reset button in plans
    Then validate the selected date is cleared or not in plans
      
  @tag42
  Scenario: Select Last 30 days
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on Last 30 days and click on done button in plans
    Then validate the Last 30 days created data in plans

  @tag43
  Scenario: Select Last 30 days & Try to select another date
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on Last 30 days in dropdown list in plans
    Then validate to select the another dates in plans  
  
  @tag44
  Scenario: Select Last 30 days & click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on Last 30 days and click on done button in plans
    Then validate the Last 30 days created data in plans  
    And click on clear button in plans
    Then validate the selected date is cleared or not in plans
     
  @tag45
  Scenario: Select Last 30 days & Click on Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on Last 30 days and click on done button in plans
    Then validate the Last 30 days created data in plans
    And again click on Last 30 days dropdown in plans
    And user click on Reset button in plans
    Then validate the selected date is cleared or not in plans  
    
  @tag46
  Scenario: Select custom range & Select single date
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on custom range and select the single date in plans
    And user click on done button in plans
    Then validate the selected date data in plans      
  
  @tag47
  Scenario: Select custom range & Select single date & Click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on custom range and select the single date in plans
    And user click on done button in plans
    Then validate the selected date data in plans 
    And click on clear button in plans
    Then validate the selected date is cleared or not in plans
     
  @tag48
  Scenario: Select custom range & Select single date & Click on Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And  user click on custom range and select the single date in plans
    And user click on done button in plans
    Then validate the selected date data in plans  
    And click on filter by date dropdown in plans
    And user click on Reset button in plans
    Then validate the selected date is cleared or not in plans 
     
  @tag49
  Scenario: Select custom range & Select two dates
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on custom range and select the date range in plans
    And user click on done button in plans
    Then validate the selected dates data in plans   
    
  @tag50
  Scenario: Select custom range & Select two dates & click on clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on custom range and select the date range in plans
    And user click on done button in plans
    Then validate the selected dates data in plans 
    And click on clear button in plans
    Then validate the selected date is cleared or not in plans
     
  @tag51
  Scenario: Select custom range & Select two dates & click on Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on custom range and select the date range in plans
    And user click on done button in plans
    Then validate the selected dates data in plans 
    And click on filter by date dropdown for custom range in plans
    And user click on Reset button in plans
    Then validate the selected date is cleared or not in plans 
  
  @tag52
  Scenario: Select custom range & Select two dates from last date to starting date
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on custom range and select the date range from last to starting position in plans
    And user click on done button in plans
    Then validate the selected dates data in plans   
    
   @tag53
   Scenario: Select custom range & Select two dates from last date to starting date & Clear button
     Given user has navigate to login
     When user enter valid mobile number	
     And user enter the password 
     And user click on the proceed button
     And user enter the MFA code
     And user click on proceed button for MFA code
     And Click on Plans tab
     Then Validate the Plans tab 
     And user click on filter by Date dropdown in plans
     Then validate the filter by date in plans
     And user click on custom range and select the date range from last to starting position in plans
     And user click on done button in plans
     Then validate the selected dates data in plans 
     And click on clear button in plans
     Then validate the selected date is cleared or not in plans
     
  @tag54
  Scenario: Select custom range & Select two dates from last date to starting date & Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on filter by Date dropdown in plans
    Then validate the filter by date in plans
    And user click on custom range and select the date range from last to starting position in plans
    And user click on done button in plans
    Then validate the selected dates data in plans 
    And click on filter by date dropdown for custom range in plans
    And user click on Reset button in plans
    Then validate the selected date is cleared or not in plans 
    
  @tag55
  Scenario: Column Filters
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter
    
  @tag56
  Scenario: Column Filters with S.no
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter of s.no
    Then Validate the S.no in column filter 
    
  @tag57
  Scenario: Column Filters with Edition/Package
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter of Edition or Package
    Then Validate the Edition or Package in column filter 
    
  @tag58
  Scenario: Column Filters with Reference Name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter of Reference Name
    Then Validate the Reference Name in column filter     

  @tag59
  Scenario: Column Filters with Edition/Package ID
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter of Edition or Package ID
    Then Validate the Edition or Package ID in column filter 
    
  @tag60
  Scenario: Column Filters with Duration/tenure
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter of Duration or tenure
    Then Validate the Duration or tenure in column filter
    
  @tag61
  Scenario: Column Filters with Assigned To
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter of Assigned To
    Then Validate the Assigned To in column filter  
    
  @tag62
  Scenario: Column Filters with Model
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter of Model
    Then Validate the Model in column filter 
    
  @tag63
  Scenario: Column Filters with set default
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter of set default
    Then Validate the set default in column filter
    
  @tag64
  Scenario: Column Filters with search valid
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter search & Enter valid data
    Then Validate the searched valid data in column filter  
    
  @tag65
  Scenario: Column Filters with search invalid
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter search & Enter invalid data
    Then Validate the searched invalid data for column filter   
    
  @tag66
  Scenario: Column Filters with search invalid & again click on column filter
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter search & Enter invalid data
    Then Validate the searched invalid data for column filter
    And again click on column filter
    Then Validate the search in column filter  
    
  @tag67
  Scenario: Column Filters with search invalid & clear the search
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click on column filter
    Then validate the column filter 
    And user click on column filter search & Enter invalid data
    Then Validate the searched invalid data for column filter
    And Clear the data in column filter
    Then validate the column filter  
    
  @tag68
  Scenario: Sort by option Z to A for Edition/Package 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click sort by option Z to A in Edition or Package
    Then Validate the sorted option Z to A for Edition or Package    
    
  @tag69
  Scenario: Sort by option Z to A for Edition/Package with clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click sort by option Z to A in Edition or Package
    Then Validate the sorted option Z to A for Edition or Package 
    And Click on clear button in Plans
    Then Validate the Plan page 
    
  @tag70
  Scenario: Sort by option A to Z for Edition/Package 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click sort by option A to Z in Edition or Package
    Then Validate the sorted option A to Z for Edition or Package 
    
  @tag71
  Scenario: Sort by option A to Z for Edition/Package with clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click sort by option A to Z in Edition or Package
    Then Validate the sorted option A to Z for Edition or Package 
    And Click on clear button in Plans
    Then Validate the Plan page    
    
  @tag72
  Scenario: Sort by option Z to A for Reference Name 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click sort by option Z to A in Reference Name
    Then Validate the sorted option Z to A for Reference Name
    
  @tag73
  Scenario: Sort by option Z to A for Reference Name with clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click sort by option Z to A in Reference Name
    Then Validate the sorted option Z to A for Reference Name 
    And Click on clear button in Plans
    Then Validate the Plan page    
    
  @tag74
  Scenario: Sort by option A to Z for Reference Name 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click sort by option A to Z in Reference Name
    Then Validate the sorted option A to Z for Reference Name  
    
  @tag75
  Scenario: Sort by option A to Z for Reference Name with clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And user click sort by option A to Z in Reference Name
    Then Validate the sorted option A to Z for Reference Name 
    And Click on clear button in Plans
    Then Validate the Plan page  
    
  @tag76
  Scenario: In Pagination, Click on next button 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab
    And Click on next button in Plans page 
    Then Validate the next page in Plans 
    
  @tag77
  Scenario: In Pagination, Click on Previous button in first page 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab
    Then Validate the previous button is disabled or not 
    
  @tag78
  Scenario: In Pagination, Click on Previous button in 2nd page 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab
    And Click on next button in Plans page 
    Then Validate the next page in Plans
    And Click on previous button
    Then Validate the previous page in Plans  
    
  @tag79
  Scenario: In Pagination, Click on num 3 in pagination 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on 3rd num in pagination in Plans
    Then Validate the 3rd page in Plans 
    
  @tag80
  Scenario: In Pagination, Click on num 3 & again click on num 1 in pagination 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on 3rd num in pagination in Plans
    Then Validate the 3rd page in Plans 
    And Click on 1st num in pagination in Plans
    Then Validate the 1st page in Plans  
    
  @tag81
  Scenario: In Pagination, Click on last page in pagination 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on last page in pagination in Plans
    Then Validate the next button is clickable or not in Plans         
    
  @tag82
  Scenario: Click on Add New Plan button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    
  @tag83
  Scenario: In New Plan for Edition, Without entering data
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page  
    And Click on next button in add new plan page
    Then Validate the error msg in edition radio button 
    
  @tag84
  Scenario: In New Plan for Edition, With entering only Edition Name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page  
    And Enter the edition Name in new plan
    And Click on next button in add new plan page
    Then Validate the error msg with entering edition name 
    
  @tag85
  Scenario: In New Plan for Edition, With entering only Reference Name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page  
    And Enter the Reference Name in new plan
    And Click on next button in add new plan page
    Then Validate the error msg with entering Reference name 
    
  @tag86
  Scenario: In New Plan for Edition, By entering 1 character in Edition Name, Reference Name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name with 1 character in new plan 
    And Enter the Reference Name with 1 character in new plan
    And Click on next button in add new plan page
    Then Validate the toast msg in new plan    
    
  @tag87
  Scenario: In New Plan for Edition, By entering more than 50 characters Edition Name, Reference Name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name with more than 30 characters in new plan 
    And Enter the Reference Name with more than 50 characters in new plan
    And Click on next button in add new plan page
    Then Validate the toast msg in new plan  
    
  @tag88
  Scenario: In New Plan for Edition, By entering more than 500 characters Notes
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Enter Notes with more than 500 characters in new plan
    And Click on next button in add new plan page
    Then Validate the toast msg in new plan     
      
  @tag89
  Scenario: In New Plan for Edition, By entering Edition Name, Reference Name & Notes
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan      
    
  @tag90
  Scenario: In New Plan for Edition, With entering Edition Name, Reference Name, duration/tenure, Model & Notes
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan   
     
  @tag91
  Scenario: In New Plan for Edition, With entering all fields & Click on Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page        
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on Reset button in add new plan page
    Then Validate the Reset page in new plan
    
  @tag92
  Scenario: In New Plan for Edition, Click on Next button in Plan feature page without selecting any checkbox
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Click on next button in plan features page
    Then Validate the error msg without selecting any plan feature  
    
  @tag93
  Scenario: In New Plan for Edition, Click on Reset button in Plan feature page with selecting any checkbox
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Select the checkbox in features tab
    And Validate the selected checkboxes in plan feature
    And Click on Reset button in plan features page
    Then Validate the selected checkboxes in plan feature after Reset     
    
  @tag94
  Scenario: In New Plan for Edition, Click on Plan feature page with selecting all checkbox
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Select all checkbox in features tab
    And Select all checkbox in Add-on features tab
    And Select all checkbox in Add-on modules tab
    Then Validate the selected checkboxes of all tabs in plan feature
    
  @tag95
  Scenario: In New Plan for Edition, Click on Plan feature page with selecting all checkbox & removing with close button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Select the checkbox in features tab
    And Validate the selected checkboxes in plan feature
    And Click on close button to remove the selected features one by one
    Then Validate the count of the features after removing  
    
  @tag96
  Scenario: In New Plan for Edition, Click on Plan feature page & Search any feature
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Click on search & enter valid data
    Then Validate the entered search in plan features  
    
  @tag97
  Scenario: In New Plan for Edition, Click on next button in Plan feature page with selecting all checkbox
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Select all checkbox in features tab
    And Select all checkbox in Add-on features tab
    And Select all checkbox in Add-on modules tab
    Then Validate the selected checkboxes of all tabs in plan feature 
    And Click on next button in plan features page
    Then Validate the feature controls page   
    
  @tag98
  Scenario: In New Plan for Edition, Click on next button in Feature Controls page with selecting checkbox
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    And Validate the next page in new plan
    And Select the checkbox in features tab
    And Validate the selected checkboxes in plan feature 
    And Click on next button in plan features page
    And Validate the feature controls page  
    And Deselect the all checkboxes in feature control
    And Click on next button in feature controls
    Then Validate the error msg in the feature controls    
    
  @tag99
  Scenario: In New Plan for Edition, Click on Reset button in Feature Controls page with deselected checkbox
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    And Validate the next page in new plan
    And Select the checkbox in features tab
    And Validate the selected checkboxes in plan feature 
    And Click on next button in plan features page
    And Deselect the all checkboxes in feature control
    And Click on Reset button in feature controls
    Then Validate the feature controls page   
    
  @tag100
  Scenario: In New Plan for Edition, Click on next button in Feature controls page
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Select all checkbox in features tab
    And Select all checkbox in Add-on features tab
    And Select all checkbox in Add-on modules tab
    And Validate the selected checkboxes of all tabs in plan feature 
    And Click on next button in plan features page
    And Validate the feature controls page    
    And Click on next button in feature controls
    Then Validate the platform page in Plans
    
  @tag101
  Scenario: In New Plan for Edition, Click on Submit button in Platform page without selecting any checkbox
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Select all checkbox in features tab
    And Select all checkbox in Add-on features tab
    And Select all checkbox in Add-on modules tab
    And Validate the selected checkboxes of all tabs in plan feature 
    And Click on next button in plan features page
    And Validate the feature controls page    
    And Click on next button in feature controls
    Then Validate the platform page in Plans  
    And Click on Submit button in Platform
    Then Validate the error msg in Platform page
    
  @tag102
  Scenario: In New Plan for Edition, Click on Reset button in Platform page with selecting any checkbox
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Select all checkbox in features tab
    And Select all checkbox in Add-on features tab
    And Select all checkbox in Add-on modules tab
    And Validate the selected checkboxes of all tabs in plan feature 
    And Click on next button in plan features page
    And Validate the feature controls page    
    And Click on next button in feature controls
    And Select the platforms in plans
    And Click on reset button in Platform
    Then Validate the platform page in Plans 
    
  @tag103
  Scenario: In New Plan for Edition, Click on Submit button in Platform page 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter the edition Name in new plan 
    And Enter the Reference Name in new plan
    And Select the radio button in Duration or Tenure
    And Select the radio button in Model
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Select all checkbox in features tab
    And Select all checkbox in Add-on features tab
    And Select all checkbox in Add-on modules tab
    And Validate the selected checkboxes of all tabs in plan feature 
    And Click on next button in plan features page
    And Validate the feature controls page    
    And Click on next button in feature controls
    And Select the platforms in plans
    And Click on Submit button in Platform
    Then Validate the toast msg of added New Plan
    
  @tag104
  Scenario: In New Plan for Edition, By entering duplicate Edition Name, Reference Name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Enter duplicate edition Name in new plan 
    And Enter duplicate Reference Name in new plan
    And Click on next button in add new plan page
    And Validate the next page in new plan 
    And Select the checkbox in features tab
    And Validate the selected checkboxes in plan feature 
    And Click on next button in plan features page 
    And Validate the feature controls page    
    And Click on next button in feature controls
    And Select the platforms in plans
    And Click on Submit button in Platform
    Then Validate the toast msg of added duplicate Plan    
    
  @tag105
  Scenario: In New Plan for Package, Without entering data
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page  
    And Click on radio button of package
    And Click on next button in add new plan page
    Then Validate the error msg in package radio button 
    
  @tag106
  Scenario: In New Plan for Package, With entering only Package Name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page
    And Click on radio button of package  
    And Enter the package Name in new plan
    And Click on next button in add new plan page
    Then Validate the error msg with entering package name 
    
  @tag107
  Scenario: In New Plan for Package, With entering only Reference Name
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page  
    And Click on radio button of package
    And Enter the Reference Name in new plan in package radiobutton
    And Click on next button in add new plan page
    Then Validate the error msg with entering Reference name in package radio button
    
  @tag108
  Scenario: In New Plan for Package, With selecting only Edition
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page  
    And Click on radio button of package
    And Select the edition in new plan
    And Click on next button in add new plan page
    Then Validate the error msg with selecting edition   
    
  @tag109
  Scenario: In New Plan for Package, With entering Package Name, Reference Name & notes & selecting edition
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page 
    And Click on radio button of package
    And Enter the package Name in new plan 
    And Enter the Reference Name in new plan
    And Select the edition in new plan
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan  
    
  @tag110
  Scenario: In New Plan for Package, Click on Submit button in Platform page 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on Add New Plan button
    Then validate the Add New Plan page
    And Click on radio button of package 
    And Enter the package Name in new plan 
    And Enter the Reference Name in new plan
    And Select the edition in new plan
    And Enter Notes in new plan
    And Click on next button in add new plan page
    Then Validate the next page in new plan
    And Select all checkbox in features tab
    And Select all checkbox in Add-on features tab
    And Select all checkbox in Add-on modules tab
    And Validate the selected checkboxes of all tabs in plan feature 
    And Click on next button in plan features page
    And Validate the feature controls page    
    And Click on next button in feature controls
    And Select the platforms in plans
    And Click on Submit button in Platform
    Then Validate the toast msg of added New Plan  
    
  @tag111
  Scenario: View the Edit Plan 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan  
    
  @tag112
  Scenario: In Edit Plan, Select the radio button of Package/Edition 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on radiobutton of package in edit plan
    Then Validate the clickable package or not in edited plan
    
  @tag113
  Scenario: In Edit Plan, Edit the edition name 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on edition name and edit
    Then Validate the clickable edition name or not  
    
  @tag114
  Scenario: In Edit Plan, Edit the Reference name 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Reference name and edit
    Then Validate the clickable Reference name or not   
    
  @tag115
  Scenario: In Edit Plan, Edit the Plan ID 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Plan ID and edit
    Then Validate the clickable Plan ID or not  
    
  @tag116
  Scenario: In Edit Plan, Edit the Duration/Tenure 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Select the Duration or Tenure and edit
    Then Validate the clickable Duration or Tenure or not 
    
  @tag117
  Scenario: In Edit Plan, Edit the Model 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Select the Model and edit
    Then Validate the clickable Model or not 
    
  @tag118
  Scenario: In Edit Plan, Edit the Assign to 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Assign to and edit
    Then Validate the clickable Assign to or not 
    
  @tag119
  Scenario: In Edit Plan, Edit the Notes 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Notes and edit
    Then Validate the editable Notes or not 
    
  @tag120
  Scenario: In Edit Plan, Edit with Next button 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Notes and edit
    And Select the Model and edit
    And Select the Duration or Tenure and edit
    And Click on next button in edit Plan
    Then Validate the edited plan in plan feature 
    
  @tag121
  Scenario: In Edit Plan, Edit with Reset button 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Notes and edit
    And Select the Model and edit
    And Select the Duration or Tenure and edit
    And Click on Reset button in edit Plan
    Then Validate the data in the edit Plan 
    
  @tag122
  Scenario: In Edit Plan, Edit the Plan feature with Reset button 
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Notes and edit
    And Select the Model and edit
    And Select the Duration or Tenure and edit
    And Click on next button in edit Plan
    Then Validate the edited plan in plan feature 
    And Edit the features in the Plan
    And Validate the count of edited Plan feature
    And Click on Reset button in Plan feature
    Then Validate the count of edited Plan feature with Reset  
    
  @tag123
  Scenario: In Edit Plan, Edit the Plan feature with next button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Notes and edit
    And Select the Model and edit
    And Select the Duration or Tenure and edit
    And Click on next button in edit Plan
    Then Validate the edited plan in plan feature 
    And Edit the features in the Plan
    And Click on next button in Plan feature
    Then Validate the edited feature controls  
    
  @tag124
  Scenario: In Edit Plan, Edit the feature controls with Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Notes and edit
    And Select the Model and edit
    And Select the Duration or Tenure and edit
    And Click on next button in edit Plan
    Then Validate the edited plan in plan feature 
    And Edit the features in the Plan
    And Click on next button in Plan feature
    Then Validate the edited feature controls
    And Edit the controls in the Plans
    And Click on Reset button in edited feature controls
    Then Validate the feature controls tab   
    
  @tag125
  Scenario: In Edit Plan, Edit the feature controls with next button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Notes and edit
    And Select the Model and edit
    And Select the Duration or Tenure and edit
    And Click on next button in edit Plan
    Then Validate the edited plan in plan feature 
    And Edit the features in the Plan
    And Click on next button in Plan feature
    Then Validate the edited feature controls
    And Edit the controls in the Plans
    And Click on next button in edited feature controls
    Then Validate the Platform page of edited controls                          
    
  @tag126
  Scenario: In Edit Plan, Edit the Platform with Reset button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Notes and edit
    And Select the Model and edit
    And Select the Duration or Tenure and edit
    And Click on next button in edit Plan
    Then Validate the edited plan in plan feature 
    And Edit the features in the Plan
    And Click on next button in Plan feature
    Then Validate the edited feature controls
    And Edit the controls in the Plans
    And Click on next button in edited feature controls
    And Edit the Platform in Plans
    And Click on Reset button in edited Platform
    Then Validate the edited Platform   
    
  @tag127
  Scenario: In Edit Plan, Edit the Platform with next button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on Notes and edit
    And Select the Model and edit
    And Select the Duration or Tenure and edit
    And Click on next button in edit Plan
    Then Validate the edited plan in plan feature 
    And Edit the features in the Plan
    And Click on next button in Plan feature
    Then Validate the edited feature controls
    And Edit the controls in the Plans
    And Click on next button in edited feature controls
    Then Validate the Platform page of edited controls  
    And Click on Submit button in edited Platform
    Then Validate the toast msg of edited Plan    
    
  @tag128
  Scenario: In Edit Plan, Edit icon in Plan details with 6 digits MFA code
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on edit icon in plan details
    And Validate the MFA code of Plan details
    And Enter the MFA code of edit plan details & submit the details
    Then Validate the plan details which is edited or not
    
  @tag129
  Scenario: In Edit Plan, Edit icon in Plan details with 4 digits MFA code
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on edit icon in plan details
    And Validate the MFA code of Plan details
    And Enter the MFA code of edit plan details with 4 digits & submit the details
    Then Validate the submit button in MFA code of plan details
    
  @tag130
  Scenario: In Edit Plan, Edit icon in Plan details with 6 digits MFA code with enter button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on edit icon in plan details
    And Validate the MFA code of Plan details
    And Enter the MFA code of edit plan details & enter button in keypad
    Then Validate the MFA code with enter button 
    
  @tag131
  Scenario: In Edit Plan, Edit icon in Plan details with 6 digits MFA code with esc button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan 
    And Click on edit icon in plan details
    And Validate the MFA code of Plan details
    And Enter the MFA code of edit plan details 
    And Click on esc button in MFA code
    Then Validate the plan details which is edited or not without entering MFA code    
    
  @tag132
  Scenario: In Edit Plan, View the logs tab
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan  
    And Click on Logs tab
    Then Validate the Logs page in Plan details
    
  @tag133
  Scenario: In Edit Plan, Logs tab & Select the This month in dates
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan  
    And Click on Logs tab
    Then Validate the Logs page in Plan details  
    And Click on Filter by date in logs tab
    And Select This month date & Click on done
    Then Validate the Logs page in Plan details 
    
  @tag134
  Scenario: In Edit Plan, Logs tab & Select the date
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan  
    And Click on Logs tab
    Then Validate the Logs page in Plan details  
    And Click on Filter by date in logs tab
    And Select date & Click on done
    Then Validate the filter by date with empty data in Plan details    
    
  @tag135
  Scenario: In Edit Plan, Logs tab & Select the date with clear button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan  
    And Click on Logs tab
    Then Validate the Logs page in Plan details  
    And Click on Filter by date in logs tab
    And Select This month date & Click on done
    Then Validate the Logs page in Plan details 
    And Click on Clear button in logs tab
    Then Validate the Filter by date in Logs tab  
    
  @tag136
  Scenario: In Edit Plan, Logs tab & Select the User
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan  
    And Click on Logs tab
    Then Validate the Logs page in Plan details  
    And Click on Filter by User in logs tab
    And Select User & Click on Apply
    Then Validate the Logs page in Plan details 
    
  @tag137
  Scenario: In Edit Plan, Logs tab & Select the non edited User
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan  
    And Click on Logs tab
    Then Validate the Logs page in Plan details  
    And Click on Filter by User in logs tab
    And Select User1 & Click on Apply
    Then Validate the filter by User with empty data in Plan details  
    
  @tag138
  Scenario: In Edit Plan, Logs tab & Select the All User with clear
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab 
    And Click on edit icon for selected Plan
    Then Validate the selected edit Plan  
    And Click on Logs tab
    Then Validate the Logs page in Plan details  
    And Click on Filter by User in logs tab
    And Select All User & Click on Apply
    Then Validate the Logs page in Plan details 
    And Click on Clear button in logs tab
    Then Validate the Filter by User in Logs tab   
    
  @tag139
  Scenario: In Plan, Click on Clone button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab
    And Click on Clone button for Plan
    Then Validate the Clone Plan  
    
  @tag140
  Scenario: In Plan, Create the Plan with Clone button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab
    And Click on Clone button for Plan
    Then Validate the Clone Plan 
    And Enter the Edition name in clone
    And Enter the Reference name in clone
    And Select the radiobutton in Duration or Tenure in clone
    And Select the radiobutton in Model in clone
    And Enter the notes in clone
    And Click on next button of Plan details in clone
    And Validate the selected count of Plan feature in clone
    And Click on next button of Plan feature in clone
    And Validate the selected of Feature controls in clone
    And Click on next button of Feature controls in clone
    And Validate the selected Platform in clone
    And Click on Submit button in Platform
    Then Validate the toast msg of added Clone Plan 
    
  @tag141
  Scenario: In Plan, Delete the Plan with No button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab
    And Click on delete button for Plan
    And Validate the popup msg for delete
    And Select No button in popup msg
    Then Validate the plan is deleted or not  
    
  @tag142
  Scenario: In Plan, Delete the Plan with Yes button
    Given user has navigate to login
    When user enter valid mobile number	
    And user enter the password 
    And user click on the proceed button
    And user enter the MFA code
    And user click on proceed button for MFA code
    And Click on Plans tab
    Then Validate the Plans tab
    And Click on delete button for Plan
    And Validate the popup msg for delete
    And Select Yes button in popup msg
    Then Validate the toast msg of deleted plan           
   