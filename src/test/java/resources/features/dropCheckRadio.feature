Feature: Select item from Drop Down menu
	Select options in Checkbox list
	Select Radio buttons
	
Background: 
	Given User opens webdriveruniversity DropDown, CheckBox, RadioButtons section

Scenario: Select Items from dropdown list
	And User select item from drop down menu
	|dropdowm-menu-1|dropdowm-menu-2|dropdowm-menu-3|
	And User checks check boxes
	|Option 1|Option 2|Option 3|Option 4|
	And user clicks on radio buttons 
	|green  |blue   |yellow |orange|purple|
	And User clicks on Selected and disabled Radio buttons 
	|lettuce|cabbage|pumpkin|
	And User selects enabled and not selected item from dropdown list 
	|apple|orange|pear|grape|
	
