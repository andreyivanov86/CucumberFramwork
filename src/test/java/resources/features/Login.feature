Feature: Login to account

Scenario Outline: Login to account using valid  and invalid credentials
	Given User navigates to "<url>" login page
	And User type "<username>" username
	And User type "<password>" password
	When User clicks on Login Button
	Then User should be presented with "<message>" message 
	Examples:
	|url												 |username	  |password		 |message		   |
	|http://webdriveruniversity.com/Login-Portal/run.html|andreyivanov|198632 	     |validation failed|
	|http://webdriveruniversity.com/Login-Portal/run.html|webdriver   |webdriver123  |validation succeeded|
	
