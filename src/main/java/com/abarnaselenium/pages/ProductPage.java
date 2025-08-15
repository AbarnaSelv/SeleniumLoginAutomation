package com.abarnaselenium.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage  extends BasePage{

	public ProductPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button[text()='Add to cart']")
	private WebElement cartButton;

	
	@FindBy(id="shopping_cart_container")
	private WebElement trolleyIcon;
	
	@FindBy(xpath = "//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']")
	private WebElement productNameInCart;
	
	public void products() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(cartButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(trolleyIcon)).click();
		wait.until(ExpectedConditions.visibilityOf(productNameInCart));
		System.out.println(productNameInCart.getText());
	}
	
	public boolean display() {
		return this.productNameInCart.isDisplayed();
		
	}

}
