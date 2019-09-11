Feature: Select item from Drop Down menu
	Select option in Checkbox list
	Select Radio buttons

Scenario Outline: Select Items from dropdown list
	Given User opens webdriveruniversity DropDown, CheckBox, RadioButtons section
	And User clicks on the "<drop_down>" DropDown menu
	When User clicks on "<menu_item>" item 
	Then Item "menu_item" should be selected
	Examples:
	|drop_down      |menu_item |
	|dropdowm-menu-1|JAVA      |
	|dropdowm-menu-2|Eclipse   |
	|dropdowm-menu-3|JavaScript|
	