Feature: HRM Login Test Case

Scenario: Check whether the user is able to login with valid username and password
	Given User should be able to navigate to HRM website
	And Enter Username and password and click Login button
	|UserName|Password|
	|Admin   |admin123|
	
Scenario: Search employee using username and also by employee name
	Given Now click on Admin element
	Then Enter Username as "Admin"
	Then Enter Username as "Admin" and employeeName as "Paul Collings"
	
Scenario: Apply for leave
	Given Click on Leave button
	Then Select Apply option
	Then Select leave type
	Then Choose the dates
	Then give the reason 
	Then click Apply button