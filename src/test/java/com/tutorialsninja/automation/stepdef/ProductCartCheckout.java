package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ProductCartCheckoutPage;

import cucumber.api.java.en.*;

public class ProductCartCheckout {
	
	ProductCartCheckoutPage prod = new ProductCartCheckoutPage();
	
	@Then("^I select the product$")
	public void i_select_the_product(){
		
		Elements.click(ProductCartCheckoutPage.store);
		Elements.click(ProductCartCheckoutPage.product);
		
	}

	@And("^I add product to the Cart$")
	public void i_add_product_to_the_Cart(){
		
		Elements.click(ProductCartCheckoutPage.cart);
		
	}

	@And("^I click on Cart$")
	public void i_click_on_Cart(){
		
		Elements.click(ProductCartCheckoutPage.viewCart);
		
	}

	@And("^I click on Checkout$")
	public void i_click_on_Checkout(){
		
		Elements.click(ProductCartCheckoutPage.checkout);
		
	}

	@And("^I click on Continue$")
	public void i_click_on_Continue(){
		
		Elements.click(ProductCartCheckoutPage.cont);
		
	}

	@And("^I check on Terms and Conditions$")
	public void i_check_on_Terms_and_Conditions(){
		
		Elements.click(ProductCartCheckoutPage.agree);
	}
	
	@And("^I click on Continue Payment$")
	public void i_click_on_Continue_Payment() throws InterruptedException {
		
		Elements.click(ProductCartCheckoutPage.Paycheck);
		Thread.sleep(5000);
	}

}
