package com.abarnaselenium.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement login;
	
	public void Login(String usernames,String passwords) {
		username.sendKeys(usernames);
		password.sendKeys(passwords);
		login.click();
		
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	        wait.until(ExpectedConditions.alertIsPresent());
//	        Alert a = driver.switchTo().alert();
//	        System.out.println(a.getText());
//	        a.accept();
//		
		
	}
	
	
	
	
	

}
