package com.abarnaselenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abarnaselenium.pages.HomePage;
import com.abarnaselenium.pages.LoginPage;
import com.abarnaselenium.pages.ProductPage;

public class ProductTest extends BaseTest {
	
	@Test
	public void addtoProductTest() {
		//driver.get("https://www.saucedemo.com/");
		LoginPage login_page = new LoginPage(driver);
		login_page.Login("standard_user", "secret_sauce"); 
		
		ProductPage products = new ProductPage(driver);
		products.products();
		Assert.assertTrue(products.display(), "Wrong Product");
		
		 HomePage home_page = new HomePage(driver);
		 home_page.logout();
		
		
	}

}
