Feature: Products

Scenario Outline: Validate promo code alert is visible when clicking on special offers link
	Given User navigates to "<url>" website
	Then User clicks on "<button>" button
	Then User should be presented with promo alert 
	
	Examples:
	|url			    										   |button   			     |
	|http://webdriveruniversity.com/Page-Object-Model/products.html|special-offers|
	|http://webdriveruniversity.com/Page-Object-Model/products.html|cameras|
	|http://webdriveruniversity.com/Page-Object-Model/products.html|new-laptops|
	|http://webdriveruniversity.com/Page-Object-Model/products.html|used-laptops|
	|http://webdriveruniversity.com/Page-Object-Model/products.html|game-consoles|
	|http://webdriveruniversity.com/Page-Object-Model/products.html|components|
	|http://webdriveruniversity.com/Page-Object-Model/products.html|desktop-systems|
	|http://webdriveruniversity.com/Page-Object-Model/products.html|game-consoles|
	|http://webdriveruniversity.com/Page-Object-Model/products.html|audio|
	
	