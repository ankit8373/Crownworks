package com.crownstack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crownstack.mywebutil.MyWebutil;

public class MailinatorPage_CLient {

	@FindBy(xpath = "//input[@placeholder='Enter Public Mailinator Inbox']")
	public static WebElement Search_txt;
	@FindBy(xpath = "//button[@id='go-to-public']")
	public static WebElement Go_btn;
	@FindBy(xpath = "//a[contains(text(),'Invitation to join Gotasker.')]")
	public static WebElement Firstmail_click;
	@FindBy(xpath = "//a[@class='button success']")
	public static WebElement join;
	
	@FindBy(xpath="//div[@class='BrandCard-content']//button")
	public static WebElement Accept;
	@FindBy(xpath="//iframe[@id='msg_body' and @title='Email Message Body']")
	public static WebElement iframe;
	public void emailMailVerification(String OwnerEmailID ) throws InterruptedException
	{
		/*----------------------------------------------*/
		MyWebutil.OpenUrl("https://www.mailinator.com/");
		Thread.sleep(3000);
        MyWebutil.sendKeys(Search_txt, OwnerEmailID, "Search_txt");
        Thread.sleep(3000);
        MyWebutil.Click(Go_btn, "Go button");
        Thread.sleep(3000);
        MyWebutil.Click(Firstmail_click, "First mail click");
        Thread.sleep(3000);
        //WebElement s = driver.findElement(By.id("msg_body"));
        MyWebutil.HandleIframe(iframe);
        Thread.sleep(3000);
        MyWebutil.jsClick(join);
        Thread.sleep(3000);
        MyWebutil.switchWindowFocusByTitle("gotasker | The Perfect Tool to Manage Your Service Business");
       
        
       /*
        Thread.sleep(3000);
        MyWebutil.ActionScroll();
        Thread.sleep(3000);
        MyWebutil.Click(Accept, "Accept button");
        */
        
	}}
