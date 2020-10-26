package com.crownstack.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.crownstack.mywebutil.MyWebutil;
public class ClientLogin {
	@FindBy(xpath = "//input[@id='session_email']")
	public static WebElement username;
	@FindBy(xpath = "//input[@id='session_password']")
	public static WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement SignIn_btn;
	public void valid_client_login(String Email, String pwd) throws InterruptedException
	{
		MyWebutil.driver.navigate().refresh();
		Thread.sleep(4000);
		MyWebutil.jsSendKeys(username, Email, "Mail id for client");
		Thread.sleep(3000);
		MyWebutil.jsSendKeys(password, pwd, "Password for client");
		Thread.sleep(3000);
		MyWebutil.Click(SignIn_btn, "Sign in Button");
	}
}