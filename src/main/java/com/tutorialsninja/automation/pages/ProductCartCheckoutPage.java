package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ProductCartCheckoutPage {
	
	public ProductCartCheckoutPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Your Store']")
	public static WebElement store;
	
	@FindBy(xpath = "//div[@class='image']//img[@title='MacBook']")
	public static WebElement product;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	public static WebElement cart;
	
	@FindBy(xpath = "//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
	public static WebElement viewCart;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	public static WebElement checkout;
	
	@FindBy(xpath = "//input[@id='button-payment-address']")
	public static WebElement cont;
	
	@FindBy(xpath = "//input[@name='agree']")
	public static WebElement agree;
	
	@FindBy(xpath = "//input[@id='button-payment-method']")
	public static WebElement Paycheck;

}
