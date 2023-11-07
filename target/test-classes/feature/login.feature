Feature: Login Functionality of HRM Web Application
	
	@ValidCredentials
	Scenario: Verification of Login using valid credentials
 
	Given User is on HRMLogin page "https://demowebshop.tricentis.com/register"
	When User enters username as "nishithaam24@gmail.com"
	And User enters password as "Advaiths@123"
	And Users clicks the login button
	Then User should be able to login successfully
 
	@InvalidCredentials
	Scenario: Verification of Login using valid credentials
 
	Given User is on HRMLogin page "https://demowebshop.tricentis.com/register"
	When User enters username as "nishithaam24@gmail.com"
	And User enters password as "admin123"
	And Users clicks the login button
	Then User should not be able to login using invalid Credentials