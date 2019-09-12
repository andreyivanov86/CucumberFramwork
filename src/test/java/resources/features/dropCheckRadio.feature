Feature: Select item from Drop Down menu
	Select option in Checkbox list
	Select Radio buttons

Scenario: Select Items from dropdown list
	Given User opens webdriveruniversity DropDown, CheckBox, RadioButtons section
	When User select item from drop down menu
	|dropdowm-menu-1|dropdowm-menu-2|dropdowm-menu-3|
	Then Item should be selected

	