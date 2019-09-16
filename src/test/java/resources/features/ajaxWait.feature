Feature: Click on the button after loading is finished

Scenario: Wait until the script is finished loading and click the button
	Given User opens ajax loader page
	When User waits until the button is available and clicks 
	Then Popum message is presented
	And User clicks on Close button 