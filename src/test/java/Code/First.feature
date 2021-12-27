Feature: Amazon Feature 1

Scenario: Verify product search 1
	Given User searches for a product
	Then Search should be successful


Scenario: Verify First Product Click 1
	Given User searches for a product
	When first product is clicked
	Then Click should be successful
