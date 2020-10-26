package com.crownstack.pages.dashboard;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crownstack.mywebutil.MyWebutil;
import com.crownstack.pages.LoginPage;



public class MyProfile {

	@FindBy(xpath="//div[@class='fL']")
	public static WebElement Mouseoveronprofile;

	@FindBy(xpath="//li[@id='myProfile']")
	public static WebElement clickonmyprofile;
	
	@FindBy(xpath = "//button[@class='sc-bdVaJa cYQqRL sc-bxivhb eTpeTG']")
	public WebElement CloseTutorialButton;
	
	@FindBy(xpath = "//input[@id='first_name']")
	public WebElement firstname;
	
	
	@FindBy(xpath = "//input[@id='address_one']")
	public WebElement addressline1;
	
	@FindBy(xpath = "//input[@id='address_two']")
	public WebElement addressline2;
	

	@FindBy(xpath = "//input[@id='phone_number']")
	public WebElement phoneno;

	@FindBy(xpath = "//input[@id='city']")
	public WebElement city;

	@FindBy(xpath = "//input[@id='state']")
	public WebElement State;

	@FindBy(xpath = "//input[@id='zip_code']")
	public WebElement zipcode;
	
	@FindBy(xpath = "//input[@id='push_notifications_enabled']")
	public WebElement disablenotification;
	@FindBy(xpath = "//button[@class='button save-btn'])[1]")
	public WebElement changeimage;

	@FindBy(xpath = "//button[text()='Save Profile']")
	public WebElement saveprofile;
	
	@FindBy(xpath = "//div[text()='My Organization']")
	public WebElement myOrganizationTab;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement organizationName;
	
	@FindBy(xpath = "//select[@name='primary_service']")
	public WebElement primaryService;
	
	@FindBy(xpath = "//select[@name='secondary_service']")
	public WebElement secondaryService;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement corporateEmail;
	
	@FindBy(xpath = "//input[@name='phone_no']")
	public WebElement coporatePhoneNumber;
	
	@FindBy(xpath = "//input[@name='address_one']")
	public WebElement addressLine1;
	
	@FindBy(xpath = "//input[@name='address_two']")
	public WebElement addressLine2;
	
	@FindBy(xpath = "//input[@name='website_url']")
	public WebElement websiteInbox;
	
	@FindBy(xpath = "//input[@name='city']")
	public WebElement cityInbox;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateInbox;
	
	@FindBy(xpath = "//input[@name='zip_code']")
	public WebElement zipCodeInbix;
	
	@FindBy(xpath = "//button[text()='UPDATE ORGANIZATION INFO']")
	public WebElement updateOrganizationInfoButton;
	
	
	
	
	
	@FindBy(xpath = "//div[text()='Subscription']")
	public WebElement subscriptionButton;
	
	@FindBy(xpath = "//span[text()='Change']")
	public WebElement changeButton;
	
	
	@FindBy(xpath = "//input[@name='number']")
	public WebElement creditCardNumberInbox;
	
	@FindBy(xpath = "//input[@name='name']")
	public WebElement cardHolderNameInbox;
	
	@FindBy(xpath = "//input[@name='expiry']")
	public WebElement expirationDateInbox;
	
	@FindBy(xpath = "//input[@name='cvc']")
	public WebElement CVC_Inbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement changeCardButton;
	
	@FindBy(xpath = "//span[@class='unSubscribeBtn']")
	public WebElement unSubscribeButton;
	
	@FindBy(xpath = "//button[text()='Subscribe Plan']")
	public WebElement subscribePlanButton;
	
	@FindBy(xpath = "//span[text()='SUBSCRIBE']")
	public WebElement subscribeButton;
	
	
	@FindBy(xpath = "//span[@class='float-r']")
	public WebElement cancelrequest;
	

	@FindBy(xpath = "//button[text()='Subscribe Plan']")
	public WebElement subscribeplan;
	
	
	@FindBy(xpath = "//span[text()='SUBSCRIBE']")
	public WebElement subsvribebutton;
	
@FindBy(xpath = "(//input[@class='inputs'])[1]")
public WebElement inputcardnumber;
@FindBy(xpath = "(//input[@class='inputs'])[2]")
public WebElement cardholdername;

@FindBy(xpath = "(//input[@class='inputs'])[3]")
public WebElement expirydate;
@FindBy(xpath = "(//input[@class='inputs'])[4]")
public WebElement cvc;

@FindBy(xpath = "//button[@class='button ']")
public WebElement changecardbutton;


@FindBy(xpath = "//span[@class='unSubscribeBtn']")
public WebElement unsubscribe;

@FindBy(xpath = "(//span[@class='Button-linkLabel'])[1]")
public WebElement unsubscribebuttonlink;


	
	@FindBy(xpath = "//div[text()='Public Profile']")
	public WebElement publicProfileButton;
	
	@FindBy(xpath = "//input[@name='files']")
	public WebElement addFilesText;
	
	public  void validMyprofile() throws Throwable{
		
		LoginPage logobj=PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();
//		PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//		MyWebutil.closetutorial();
		
		Thread.sleep(2000);
		MyWebutil.clickonmyprofile(Mouseoveronprofile, clickonmyprofile);
		//MyWebutil.closetutorial();
		MyWebutil.clear(firstname);
		Thread.sleep(2000);
		MyWebutil.sendKeys(firstname, "Towner", "firstname");
		MyWebutil.clear(addressline1);
		Thread.sleep(2000);
		MyWebutil.sendKeys(addressline1, "plazamall", "addressline1");
		
		MyWebutil.clear(addressline2);
		Thread.sleep(2000);
		MyWebutil.sendKeys(addressline2, "Delhi", "addressline2");
		
		MyWebutil.clear(phoneno);
		Thread.sleep(2000);
		MyWebutil.sendKeys(phoneno, "253-375-1556", "phoneno");
		
		
		MyWebutil.clear(city);
		Thread.sleep(2000);
		MyWebutil.sendKeys(city, "Gurgoan", "city");
		Thread.sleep(2000);
	
	MyWebutil.clear(zipcode);
	Thread.sleep(2000);
	MyWebutil.sendKeys(zipcode, "12345", "zipcode");
	Thread.sleep(2000);
	MyWebutil.Click(disablenotification, "disablenotification");
	Thread.sleep(2000);
	
	
	MyWebutil.Click(saveprofile, "saveprofile");

	}
public void validateMyOrganization() {
		
		MyWebutil.Click(myOrganizationTab, "Click On My Organization Tab");
		MyWebutil.clear(organizationName);
		MyWebutil.sendKeys(organizationName, "Sandeep_org", "Organization Name");
		
		MyWebutil.selectbyvisbletext(primaryService, "Plumber");
		
		
		MyWebutil.selectbyvisbletext(secondaryService, "General Contractor");
		
		MyWebutil.clear(corporateEmail);
		MyWebutil.sendKeys(corporateEmail, "towner@yopmail.com", "Corporate Email");
		MyWebutil.clear(coporatePhoneNumber);
		MyWebutil.sendKeys(coporatePhoneNumber, "7654645651", "Coporate Phone Number");
		MyWebutil.clear(addressLine1);
		MyWebutil.sendKeys(addressLine1, "Delhi", "Address Line 1");
		MyWebutil.clear(addressLine2);
		MyWebutil.sendKeys(addressLine2, "gurgoan", "Address Line 2");
		MyWebutil.clear(websiteInbox);
		MyWebutil.sendKeys(websiteInbox, "http://www.google.com", "website Inbox");
		MyWebutil.clear(cityInbox);
		MyWebutil.sendKeys(cityInbox, "UK", "city Inbox");
		MyWebutil.sendKeys(stateInbox, "WY", "stateInbox");
		MyWebutil.clear(zipCodeInbix);
		MyWebutil.sendKeys(zipCodeInbix, "34231", "Zip Code Inbix");
		MyWebutil.Click(updateOrganizationInfoButton, "Click On Update Organization Info Button");
		
		
	}
	
	
	public void validateSubscription() throws Throwable {
		
		MyWebutil.Click(subscriptionButton, "Click On Subscription Button");
		Thread.sleep(2000);
		MyWebutil.Click(changeButton, "Click On Change Button");
		Thread.sleep(2000);
		MyWebutil.sendKeys(inputcardnumber, "4242424242424242", "inputcardnumber");
		Thread.sleep(2000);
		MyWebutil.sendKeys(cardholdername, "ankityadav", "cardholdername");
		Thread.sleep(2000);
		MyWebutil.sendKeys(expirydate, "1225", "expirydate");
		Thread.sleep(2000);
		MyWebutil.sendKeys(cvc, "456", "cvc");
		Thread.sleep(2000);
		MyWebutil.Click(changeCardButton, "changeCardButton");
		Thread.sleep(2000);
		MyWebutil.Click(unsubscribe, "unsubscribe");
		Thread.sleep(2000);
		MyWebutil.Click(unsubscribebuttonlink, "unsubscribebuttonlink");
		Thread.sleep(2000);
		MyWebutil.Click(cancelrequest, "cancelrequest");
		Thread.sleep(2000);
		MyWebutil.Click(subscribeplan, "cancelrequest");
		Thread.sleep(2000);
		MyWebutil.Click(subscribeButton, "subscribeButton");
		Thread.sleep(2000);
		
		
	}
	
	public void validatePublicProfile() {
		
		MyWebutil.Click(publicProfileButton, "Click On Public Profile Button");
		
	String stringpath=new File("C:\\Users\\Ankit\\Desktop\\crownworks\\Gotasker\\GoTaskerLogo.png").getAbsolutePath();
		
		MyWebutil.sendKeys(addFilesText, stringpath, "Add Files Text");
		System.out.println("file sucessfully uploded");
		
	}
	
	
}
