Feature: Shopping Cart and Checkout
		
		@Login
	  Scenario: Verify adding product to the cart and checking out
    Given I launch the application
    And I click on My Account 
    And I click on Login 
    And I enter the Email Address "preeti.sajjan@diatoz.com"
    And I enter the Password "sajjan"
    And I click on Login button
    Then I select the product
		And I add product to the Cart
		And I click on Cart
		And I click on Checkout
		And I click on Continue
		And I check on Terms and Conditions
		And I click on Continue Payment