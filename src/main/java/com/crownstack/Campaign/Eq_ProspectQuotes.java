package com.crownstack.Campaign;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.crownstack.mywebutil.MyWebutil;
import com.crownstack.pages.LoginPage;
import com.crownstack.pages.MailinatorPage_Owner;
import com.crownstack.pages.SignupPageNew;
import com.crownstack.pages.dashboard.Contacts;

public class Eq_ProspectQuotes {

	@FindBy(xpath="//*[contains(text(),'Express Quote')]")
	public static WebElement ExpressQuote;

	
	@FindBy(xpath="//*[text()='Prospect Quotes']")
	public static WebElement clickonProspectQuotes;
	
	

	@FindBy(xpath="//span[contains(text(),'ADD NEW')]")
	public  WebElement AddClient; 
	

	@FindBy(xpath="//input[@name='first_name']")
	public static WebElement EnterproFirstname;

	@FindBy(xpath="//input[@name='last_name']")
	public static WebElement EnterproLastname;

	@FindBy(xpath="//input[@id='email']")
	public static WebElement EnterproEmail;

	@FindBy(xpath="//input[@id='phone_number']")
	public static WebElement Enterphoneno;

	@FindBy(xpath="//input[@id='address']")
	public static WebElement Enteraddress;

	@FindBy(xpath="//input[@id='city']")
	public static WebElement EnterCity;

	@FindBy(xpath="//input[@id='zip_code']")
	public static WebElement EnterZipcode;


	@FindBy(xpath="//button[text()='Add']")
	public static WebElement Addbutton;

	@FindBy(xpath="//input[@id='searchInput']")
	public static WebElement prospsearchbar;

	@FindBy(xpath="//button[@id='actionButton']")
	public static WebElement mouseoverfloatingbutton;


	@FindBy(xpath="//span[text()='Add New Quote']")
	public static WebElement AddnewQuote;


	@FindBy(xpath="//input[@id='quote_item_desc']")
	public static WebElement quoteDescription;


	@FindBy(xpath=" //input[@id='quote_qty'] ")
	public static WebElement quantity;



	@FindBy(xpath="//input[@id='quote_price'] ")
	public static WebElement price;


	@FindBy(xpath=" //input[@id='quote_commission']  ")
	public static WebElement commision;

	@FindBy(xpath="//button[text()='ADD ITEM'] ")
	public static WebElement AddItem;
	//input[@id='title']

	@FindBy(xpath="//input[@id='title'] ")
	public static WebElement EnterquoteTitle;


	@FindBy(xpath="//input[@id='description']")
	public static WebElement quoteDescription2;


	@FindBy(xpath="//input[@name='partial']")
	public static WebElement PartialApprovelCheckbox;

	@FindBy(xpath="//button[text()='Send Quote']")
	public static WebElement SendQuote;

	@FindBy(xpath="//div[text()='Contacts']")
	public static  WebElement Contacts;

	@FindBy(xpath="(//li[@class='list '])[1]")
	public static  WebElement Clients;

	

	@FindBy(xpath="(//button[@class='Button Button--primary'])[1]")
	public static  WebElement AddNewService;

	@FindBy(xpath="(//input[@name='description'])[3]")
	public static  WebElement ServiceDescription;

	@FindBy(xpath="//button[@class='Button Button--widget save-btn']")
	public static  WebElement CreateService;

	@FindBy(xpath="//span[@id='dashboard']")
	public static  WebElement Dashboard;

//	@FindBy(xpath="//*[contains(text(),'Express Quote')]")
//	public static WebElement ExpressQuote;

	/**********************************************************************************/



	@FindBy(xpath="//div[@class='fL']")
	public static WebElement Mouseoveronprofile;

	@FindBy(xpath="//li[contains(text(),'Logout')]")
	public static WebElement Logout;

	@FindBy(xpath="//input[@id='session_email']")
	public static WebElement username;
	@FindBy(xpath="//input[@id='session_password']")
	public static WebElement password;

	@FindBy(xpath="//input[@class='Button Button--primary']")
	public static WebElement signin;

	@FindBy(xpath="//div[contains(text(),'Sandeepsowner')]")
	public static WebElement ValidateSignIn;


	@FindBy(xpath="	//i[@class='fa  fa-chevron-left']")
	public static WebElement backbutton;
	
	

	@FindBy(xpath="//h5[@class='fL attachmentHeader']")
	public static WebElement clickonpendingquote;

	
	
	@FindBy(xpath="//div[text()='SAVE PDF']")
	public static WebElement savepdf;

	@FindBy(xpath="//div[text()='VIEW PDF']")
	public static WebElement viewpdf;
	
	
public void validEq_ProspectQuotes__anki() throws InterruptedException {
	
	SignupPageNew signupPageObj=PageFactory.initElements(MyWebutil.driver, SignupPageNew.class);
	String OwnerEmailID = signupPageObj.validateEQ_OwnerSignUp();
	

    MailinatorPage_Owner mailiObj=PageFactory.initElements(MyWebutil.driver, MailinatorPage_Owner.class);
	mailiObj.emailMailVerificationforEQprospect(OwnerEmailID);

	MyWebutil.Click(ExpressQuote, "ExpressQuote Button");
	Thread.sleep(3000);
	
	
	MyWebutil.driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
	

	
	String winHandleBefore = MyWebutil.driver.getWindowHandle();
	
	Set<String> handle= MyWebutil.driver.getWindowHandles();
	
	for(String mywindows : handle){
	
	 String myTitle = MyWebutil.driver.switchTo().window(mywindows).getTitle();
	
	  if(myTitle.equals("gotasker | The Perfect Tool to Manage Your Service Business")){
	  // perform some action - as here m openning a new url
		  MyWebutil.driver.get("https://qa.gotasker.build-release.com/dashboard/transaction/prospects");
	}else{
		MyWebutil.driver.switchTo().window(winHandleBefore);
	}
	}

	MyWebutil.Click(clickonProspectQuotes, "clickonProspectQuotes");

	Thread.sleep(2000);
	MyWebutil.Click(AddClient, "AddClient Button");
//	Thread.sleep(5000);
	
	String proFirstName = MyWebutil.RandomString(4);	
	MyWebutil.sendKeys(EnterproFirstname, proFirstName, "Random First Name");
	String proLastName = MyWebutil.RandomString(4);	
	Thread.sleep(2000);
	MyWebutil.sendKeys(EnterproLastname, proLastName, "Random Last Name");		
	Thread.sleep(3000);
	String fEmail = proFirstName+proLastName+"@yopmail.com";
	System.out.println(fEmail); 
	Thread.sleep(2000);
	MyWebutil.sendKeys(EnterproEmail, fEmail, "Random Email_ID");
	Thread.sleep(2000);
	MyWebutil.sendKeys(Enterphoneno, "5454545454", "Enter Phone no");
	Thread.sleep(2000);
	MyWebutil.sendKeys(Enteraddress, "Delhi", "Enter Address");
	Thread.sleep(2000);
	MyWebutil.sendKeys(EnterCity, "uk", "Enter city ");
	Thread.sleep(2000);
	MyWebutil.sendKeys(EnterZipcode, "45344", "Enter zip code");
	Thread.sleep(2000);
	MyWebutil.Click(Addbutton, "Add Button");
	Thread.sleep(2000);
	
	MyWebutil.Click(MyWebutil.driver.findElement(By.xpath("//div[text()='"+proFirstName+" "+proLastName+"']")), "Random User");
	Thread.sleep(2000);
	MyWebutil.mouseover(mouseoverfloatingbutton);
	Thread.sleep(2000);
	MyWebutil.Click(AddnewQuote, "ADD NEW QUOTE");
	Thread.sleep(2000);
	MyWebutil.clear(quoteDescription);
	Thread.sleep(2000);
	MyWebutil.sendKeys(quoteDescription, "i need to renovate kitchen sink", "Quote Dscription");
	Thread.sleep(2000);
	MyWebutil.clear(quantity);
	Thread.sleep(2000);
	MyWebutil.sendKeys(quantity, "1", "quantity");
	Thread.sleep(2000);
	MyWebutil.clear(price);
	Thread.sleep(2000);
	MyWebutil.sendKeys(price, "100", "price");
	Thread.sleep(2000);
	MyWebutil.clear(commision);
	Thread.sleep(2000);
	MyWebutil.sendKeys(commision, "100", "commision");
	Thread.sleep(2000);
	MyWebutil.Click(AddItem, "ADD ITEM");
	Thread.sleep(2000);

	MyWebutil.sendKeys(EnterquoteTitle, "Renovation", "Enter Quote Title");
	Thread.sleep(2000);
	MyWebutil.sendKeys(quoteDescription2, "Renovate Kitchen Sink", "quote Description2");
	Thread.sleep(2000);

	MyWebutil.Click(PartialApprovelCheckbox, "Partial Approvel Checkbox");
	Thread.sleep(2000);
	MyWebutil.Click(SendQuote, "Send Quote");
	
	MyWebutil.Click(backbutton, "backbutton");
	Thread.sleep(2000);
	MyWebutil.Click(clickonpendingquote, "clickonpendingquote");
	Thread.sleep(2000);
	MyWebutil.Click(savepdf, "savepdf");
	Thread.sleep(2000);
	MyWebutil.Click(viewpdf, "viewpdf");
	
	
//	String searchProspect=proFirstName+" "+proLastName;
//	MyWebutil.sendKeys(prospsearchbar , searchProspect  , "Search bar");
//	prospsearchbar.sendKeys(Keys.ENTER);
//	prospsearchbar.sendKeys(Keys.ENTER);
	

	//return fullName;
}
public void logout() throws InterruptedException{
	Thread.sleep(3000);
	for(int i=0; i<=4; i++){
		try{
			MyWebutil.mouseover(Mouseoveronprofile);
			Thread.sleep(2000);
			MyWebutil.Click(Logout, "Log Out");
			break;
		}catch(Exception e){

		}

	}


}




}

