Feature: Elements on the page take time to load

Scenario: Wait untill all elements on the page are loaded and the click each one to confirm
	Given User open webdriverunivercity Accordition page
	And User waits for Loading Complete message
	When User clicks on each button to show hidden text
	|manual-testing-accordion|cucumber-accordion|automation-accordion|click-accordion|
	Then Check if hidden text is visible
	|manual-testing-description|cucumber-testing-description|automation-testing-description|click-accordion|