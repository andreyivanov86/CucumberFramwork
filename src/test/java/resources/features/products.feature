Feature: Products

Scenario Outline: Validate promo code alert is visible when clicking on special offers link
	Given User navigates to "<url>" website
	Then User clicks on "<button>" button
	Then User should be presented with promo alert 
	
	Examples:
	|url			    											|button   			     |
	|http://webdriveruniversity.com/Page-Object-Model/products.html|#container-special-offers|
	