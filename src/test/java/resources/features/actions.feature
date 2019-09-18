Feature: Perform various actions on the page

Background: 
	Given User opens Actions page

Scenario: User drags one item over to the other
	When User clicks on DRAG ME item and dropping it on the DROP HERE item
	Then DROP HERE should change to DROPPED 

Scenario: User double clicks on the button
	When User clicks on DOUBLE CLICK ME Button 
	Then The color should turn green

Scenario: User hovers over element and clicks on hidden links 
	When User hovers over element
	|Hover Over Me First!|Hover Over Me Second!|Hover Over Me Third!|
	And User clicks on link that appeared
	|float:left;|float:center;|float:right;|
	Then Popup message should appear

Scenario: User clics and holds button
	When User clicks and holds button
	Then Color of the button turns green
	When User releases hold
	Then Button turns red 