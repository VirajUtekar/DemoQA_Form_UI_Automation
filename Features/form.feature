
@tag
Feature: Form Automation

  Scenario: verify form validation
  
    Given navigate to site url
    And enter "Viraj" into fullname field
    And enter "test@gmail.com" into email field
    And enter "mumbai" into currentAddress field
    And enter "mumbai" into permanentAddress fied
    Then click on submit
    



