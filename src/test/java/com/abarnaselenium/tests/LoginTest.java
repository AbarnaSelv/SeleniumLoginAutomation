package com.abarnaselenium.tests;

import org.testng.annotations.Test;

import com.abarnaselenium.pages.BasePage;
import com.abarnaselenium.pages.HomePage;
import com.abarnaselenium.pages.LoginPage;

public class LoginTest extends BaseTest{
	@Test
	public void testLogin() {
	driver.get("https://www.saucedemo.com/");
	LoginPage login_page = new LoginPage(driver);
	 login_page.Login("standard_user", "secret_sauce"); 
	 HomePage home_page = new HomePage(driver);
	 home_page.logout();
	}
	
	
	

}
