Feature: Perform various actions on the page

Background: 
	Given User opens Actions page

Scenario: User drags one item over to the other
	When User clicks on DRAG ME item and dropping it on the DROP HERE item
	Then DROP HERE should change to DROPPED 

Scenario: User double clicks on the button
	When User clicks on DOUBLE CLICK ME Button 
	Then The color should turn green