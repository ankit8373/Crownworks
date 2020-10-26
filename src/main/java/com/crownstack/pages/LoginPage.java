package com.crownstack.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crownstack.mywebutil.MyWebutil;

public class LoginPage {
	

	@FindBy(xpath = "(//a[text()='LOGIN'])[2]")
	public static WebElement DashboardLoginButton;

	@FindBy(xpath = "//input[@id='session_email']")
	public static WebElement username;

	@FindBy(xpath = "//input[@id='session_password']")
	public static WebElement password;
	
	@FindBy(xpath = "//h3[text()='Sign In']")
	public static WebElement signin;

	@FindBy(xpath = "//div[contains(text(),'sandeeps owner')]")
	public static WebElement ValidateSignIn;

	@FindBy(xpath = "//a[text()='Login']")
	public static WebElement LoginButton;
	
	
//	@FindBy(xpath = "//button[@id='details-button']")
//	public static WebElement clickonadvancebutton;
//	
//	@FindBy(xpath = "//a[@id='proceed-link']")
//	public static WebElement proceedtoqa;

	
	
	public static void validlogin() {
		
	//	MyWebutil.Click(DashboardLoginButton, "DashboardLoginButton");
		boolean status = false;
		try {
			status = LoginButton.isDisplayed();
		} catch (Exception e) {

		}
		if (status) {
			MyWebutil.Click(LoginButton, "Login Button");
		}

		//String userMail = "aashishdhawan@crownstack.com";
		String userMail = "towner@yopmail.com";
		new Actions(MyWebutil.driver).moveToElement(username).click(username).build().perform();
		MyWebutil.sendKeys(username, userMail, "Owner's User Name");
		if (!username.getAttribute("value").trim().equalsIgnoreCase(userMail)) {
			JavascriptExecutor jse = (JavascriptExecutor) MyWebutil.driver;
			jse.executeScript("arguments[0].value='" + userMail + "'", username);
		}
		//MyWebutil.sendKeys(password, "123456", "Owner's Password");
		MyWebutil.sendKeys(password, "password", "Owner's Password");
		MyWebutil.Click(signin, "Signin Button");

		//MyWebutil.validateText(ValidateSignIn, "sandeeps owner");
		//MyWebutil.validateText(ValidateSignIn, "towner ");
		

	}

	public void ownerLogIn(String OwnerMailID) throws InterruptedException {

		new Actions(MyWebutil.driver).moveToElement(username).click(username).build().perform();
		MyWebutil.sendKeys(username, OwnerMailID, "Owner's User Name");
		if (!username.getAttribute("value").trim().equalsIgnoreCase(OwnerMailID)) {
			JavascriptExecutor jse = (JavascriptExecutor) MyWebutil.driver;
			jse.executeScript("arguments[0].value='" + OwnerMailID + "'", username);
		}
		MyWebutil.sendKeys(password, "xyz123", "Owner's Password");
		MyWebutil.Click(signin, "Signin Button");
		
	}

	
}
