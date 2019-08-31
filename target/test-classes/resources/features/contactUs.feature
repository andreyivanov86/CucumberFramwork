Feature: Submit user info usin Contact Us form

Scenario: Submit valid user info via Contact Us fomr
	Given User access webdriveruniversity Contact us form
	When User enters valid user name 
	And User enters valid last name
	|Woods|Jackson|Jones|
	And User enters valid email address
	And User enters comments
	|comment 1|comment 2|
	When User clicks on Sumbit button
	Then the information should successfully be submited 