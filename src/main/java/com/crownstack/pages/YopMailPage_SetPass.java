package com.crownstack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crownstack.mywebutil.MyWebutil;

public class YopMailPage_SetPass {
	@FindBy (xpath="//input[@id='login']")
	public  WebElement YopmailField;

	@FindBy (xpath="//input[@type='submit']")
	public  WebElement YopmailSubmit;

	@FindBy (xpath="//a[text()='CONFIRM EMAIL' or contains(text(),'Click here')]")
	public WebElement InvitationClickHere;

	@FindBy (xpath="//input[@id='session_email']")
	public WebElement OwnerPass;

	@FindBy (xpath="//input[@id='session_password']")
	public WebElement OwnerPassConf;

	@FindBy (xpath="//input[@name='commit']")
	public WebElement Commit;

	@FindBy (xpath="//iframe[@id='ifmail']")
	public WebElement SwitchIframe;

	@FindBy(xpath="//div[@class='BrandCard-content']//button")
	public WebElement Accp;

	
public void emailMailVerification(String fEmail) throws InterruptedException {
		
		MyWebutil.OpenUrl("http://www.yopmail.com/en/");
		Thread.sleep(3000);
		MyWebutil.jsSendKeys(YopmailField, fEmail, "Yop_Mail Field");
		Thread.sleep(3000);
		MyWebutil.Click(YopmailSubmit, "Yop_Mail Submit");
		Thread.sleep(3000);
		MyWebutil.HandleIframe(SwitchIframe);
		MyWebutil.Click(InvitationClickHere, "Click Here");
		Thread.sleep(3000);
		MyWebutil.switchWindowFocusByTitle("gotasker | The Perfect Tool to Manage Your Service Business");
		//MyWebutil.waitUntilElementVisible(OwnerPass, 1, "Owner's Password Setting Window");
		MyWebutil.sendKeys(OwnerPass, "xyz123", "Owner Password");
		Thread.sleep(3000);
		MyWebutil.sendKeys(OwnerPassConf, "xyz123", "Owner Password Confirmation");
		Thread.sleep(3000);
		MyWebutil.Click(Commit, "Commit Button");
		Thread.sleep(3000);
		MyWebutil.ActionScroll();
		Thread.sleep(3000);
		MyWebutil.Click(Accp, "Accept Button");
		//logout();

	}



}
