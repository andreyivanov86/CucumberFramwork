Feature: Add, uncheck and delete items in to To-do list

Scenario Outline: Add new itme to To-Do list
	Given User navigates to "<url>" webdriveruniversity todolist website
	And User enters item "<item_name>" name to the Add new todo field
	When User press Enter
	Then New Todo item "<item_name>" should be added to the list  
	Examples: 
	|url												 |item_name |
	|http://webdriveruniversity.com/To-Do-List/index.html|Do dishes |
	|http://webdriveruniversity.com/To-Do-List/index.html|Stroke Cat|