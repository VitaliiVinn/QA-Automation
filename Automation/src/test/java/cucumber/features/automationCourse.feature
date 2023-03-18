Feature: AutomationCourse Page
  As a user,
  I want to open the AutomationCourse Page and do smth
#  Background:
#    Given I am on the AutomationCourse Page
#    When Click free consult button
#    Then I can see FreeConsultationPage button

  Scenario: Open AutomationCourse Page
    Given I am on the AutomationCourse Page
    Then I can see FreeConsultationPage button

#    Scenario: Verify can fill free consult details
#      Given I am on the FreeConsult page
#      When I fill the following parameters:
#      |name|email|phone|messenger|course|
#      |John|john@gmail.com|0678154521|tg|PHP|
#      Then Information is found
