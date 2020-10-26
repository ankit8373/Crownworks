package com.crownstack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crownstack.mywebutil.MyWebutil;

public class MailinatorPage_Owner {

	@FindBy(xpath = "//input[@placeholder='Enter Public Mailinator Inbox']")
	public static WebElement Search_txt;
	@FindBy(xpath = "//button[@id='go-to-public']")
	public static WebElement Go_btn;
	@FindBy(xpath = "//a[@class='ng-binding']")
	public static WebElement Firstmail_click;
	@FindBy(xpath = "//a[text()='CONFIRM EMAIL']")
	public static WebElement Confirm_Email_Ltxt;
	
	@FindBy(xpath="//div[@class='BrandCard-content']//button")
	public static WebElement Accept;
	@FindBy(id = "msg_body")
	public static WebElement iframe;

	@FindBy (xpath="(//div[@class='fL'])[1]")
	public  WebElement Mouseoverelement;

	@FindBy (xpath="//*[contains(text(),'Logout')]")
	public  WebElement Logoutelement;
	
	@FindBy(xpath = "//a[contains(text(),' to join Gotasker')]")
	public static WebElement To_join_Gotasker;
	@FindBy(xpath = "//a[text()='Click here']")
	public static WebElement click_here;
	
	@FindBy(xpath = "//a[text()='Activate Account']")
	public static WebElement activateaccount;
	
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
        //MyWebutil.Click(Confirm_Email_Ltxt, "Confirm Email Link Text");
        MyWebutil.Click(activateaccount, "activateaccount");
        
        Thread.sleep(3000);
        MyWebutil.switchWindowFocusByTitle("gotasker | The Perfect Tool to Manage Your Service Business");
       
        
        
	}
	
	public void emailMailVerification1(String OwnerEmailID ) throws InterruptedException
	{
		emailMailVerification( OwnerEmailID );
		Thread.sleep(3000);
	    MyWebutil.ActionScroll();
	    Thread.sleep(3000);
	    MyWebutil.Click(Accept, "Accept button");
	    //MyWebutil.logout(Mouseoverelement, Logoutelement);
	}
	

	public void emailMailVerificationforEQprospect(String OwnerEmailID ) throws InterruptedException
	{
		emailMailVerification( OwnerEmailID );
		Thread.sleep(3000);
	    MyWebutil.ActionScroll();
	    Thread.sleep(3000);
	    MyWebutil.Click(Accept, "Accept button");
	   
	}
	public void email_verification_EQ_client_Quote(String OwnerEmailID1) throws InterruptedException
	{
		MyWebutil.OpenUrl("https://www.mailinator.com/");
		Thread.sleep(3000);
        MyWebutil.sendKeys(Search_txt, OwnerEmailID1, "Search_txt");
        Thread.sleep(3000);
        MyWebutil.Click(Go_btn, "Go button");
        Thread.sleep(5000);
        MyWebutil.Click(To_join_Gotasker, "click on mail to join gotasker");
        Thread.sleep(3000);
        //WebElement s = driver.findElement(By.id("msg_body"));
        
        MyWebutil.HandleIframe(iframe);
        Thread.sleep(3000);
        MyWebutil.Click(click_here, "click on click here");
	}

	
	
}
