Feature: Add, uncheck and delete items in to To-do list

Background: 
	Given User navigates to webdriveruniversity todolist website 

Scenario Outline: Add new itme to To-Do list
	And User enters item "<item_name>" name to the Add new todo field
	When User press Enter
	Then New Todo item "<item_name>" should be added to the list  
	Examples: 
	|item_name |
	|Stroke a cat|
	|Walk a dog|
	
Scenario: Add several new items in the list
	And User enters item name to the Add new todo field 
	|Wash Dishes|Stroke Cat|Walk dog|
	When User press Enter
	Then Check if items in the list
	|Wash Dishes|Stroke Cat|Walk dog|
