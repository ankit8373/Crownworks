package com.crownstack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crownstack.mywebutil.MyWebutil;

public class SignupPage {
	@FindBy(xpath="//a[text()='Business Owner']")
	public static WebElement BusinessOwner_btn;


	@FindBy(id="user_first_name")
	public static WebElement F_Name_txt;

	@FindBy(id="user_last_name")
	public static WebElement L_Name_txt ;

	@FindBy(id="user_email")
	public static WebElement Email_txt;

	@FindBy(id="confirmation_mail")
	public static WebElement Email_conf_txt;

	@FindBy(id="user_phone_number")
	public static WebElement Phone_txt;

	@FindBy(id="user_password")
	public static WebElement Pwd_txt;

	@FindBy(id="user_password_confirmation")
	public static WebElement Confir_Pwd_txt;

	@FindBy(id="user_promocode")  // this field is optional 
	public static WebElement Promo_txt;

	@FindBy(xpath="//button[text()='Next']")
	public static WebElement Next_btn;

	@FindBy(xpath="//a[@href='/sign_in']")
	public static WebElement Sign_Ltxt;

	/*-----------------------------------------------*/

	@FindBy(xpath="//input[@id='user_organization_name']")
	public static WebElement Org_name_txt;

	@FindBy(xpath="//select[@id='user_organization_primary_service']")
	public static WebElement org_ddown;

	@FindBy(xpath="//input[@id='user_organization_website_url']")
	public static WebElement WebUrl_txt;

	@FindBy(xpath="//input[@id='user_organization_address_one']")
	public static WebElement Address_txt;

	@FindBy(id="user_organization_address_two")
	public static WebElement Address2_txt;

	@FindBy(id="user_organization_city")
	public static WebElement City_txt;

	@FindBy(id="user_organization_state")
	public static WebElement State_txt;

	@FindBy(id="user_organization_zip_code")
	public static WebElement Zip_code_txt;

	@FindBy(xpath="//button[text()='Prev']")
	public static WebElement Prev_btn;

	@FindBy(xpath = "//button[contains(text(),'1')]")
	public WebElement Card_pagination_btn1;

	@FindBy(xpath = "//button[contains(text(),'2')]")
	public WebElement Card_pagination_btn2;

	@FindBy(xpath = "//div[@id='0']")
	public WebElement ProStand_Serv_Click_btn;

	@FindBy(xpath = "//input[@id='card-number']")
	public WebElement Cardnumber;


	@FindBy(xpath = "//input[@id='card-expiry']")
	public WebElement Cardexpiry;

	@FindBy(xpath = "//input[@id='cvc']")
	public WebElement cvv;

	@FindBy(xpath = "//input[@id='terms']")
	public WebElement TC_cbox;

	@FindBy(xpath = "//a[contains(text(),'Terms & Conditions')]")
	public WebElement Terms_Cond_Ltxt;


	@FindBy(xpath = "//button[@id='submitBtn']")
	public WebElement Pay_btn;


	@FindBy(xpath = "//select[@id='user_organization_primary_service']")
	public WebElement OrgPriSer_ddn;

public String validateEQ_OwnerSignUp() throws InterruptedException {

		
		MyWebutil.Click(BusinessOwner_btn, "Business Owner button");
		Thread.sleep(3000);
		String FirstName = MyWebutil.RandomString(4);	
		MyWebutil.sendKeys(F_Name_txt, FirstName, "Random Name Field");
		String lastName = MyWebutil.RandomString(4);	
		MyWebutil.sendKeys(L_Name_txt, lastName, "Random Last Name Field");		
		Thread.sleep(1000);
		String fEmail = FirstName+lastName+"@mailinator.com";
		System.out.println(fEmail);
		MyWebutil.sendKeys(Email_txt, fEmail, "Random Email ID with First Name and Last Name");
		Thread.sleep(1000);
		MyWebutil.sendKeys(Email_conf_txt, fEmail, "Random Email ID with First Name and Last Name");
		Thread.sleep(1000);

		MyWebutil.sendKeys(Phone_txt, "9876543210", "Phone Number Field");
		Thread.sleep(1000);
		MyWebutil.sendKeys(Pwd_txt, "12345678", "Password Field");
		Thread.sleep(1000);
		MyWebutil.sendKeys(Confir_Pwd_txt, "12345678", "Confirm Password Field");
		Thread.sleep(3000);
		MyWebutil.Click(Next_btn, "Next button");
		Thread.sleep(3000);
		String Orgname = MyWebutil.RandomString(5);
		Thread.sleep(3000);
		MyWebutil.sendKeys(Org_name_txt, Orgname, "Organization Name Field");
		Thread.sleep(3000);
		Select dropdown = new Select(OrgPriSer_ddn);  
		dropdown.selectByValue("Electrician");  
		Thread.sleep(3000);
		MyWebutil.sendKeys(Address_txt, "address1", "Address1 Field");
		Thread.sleep(3000);
		//MyWebutil.sendKeys(Address2_txt, "Address2", "Address2 Field");
		//Thread.sleep(3000);
		MyWebutil.sendKeys(City_txt, "Alaska", "City Field ");
		Thread.sleep(3000);
		MyWebutil.sendKeys(Zip_code_txt, "123456", "Zip Code Field");
		Thread.sleep(3000);
		MyWebutil.ActionScroll();
		Thread.sleep(3000);
		MyWebutil.Click(Next_btn, "Next Button");
		Thread.sleep(3000);
		MyWebutil.Click(ProStand_Serv_Click_btn, "Pro Standerd Service Card Button Click");
		Thread.sleep(1000);

		Thread.sleep(1000);
		MyWebutil.Click(Cardnumber, "Cardnumber");
		MyWebutil.sendKeys(Cardexpiry, "12 / 20", "Cardexpiry");
		Thread.sleep(1000);
		MyWebutil.sendKeys(cvv, "456", "cvv");
		MyWebutil.sendKeys(Cardnumber, "4242 4242 4242 4242", "Cardnumber");
		MyWebutil.sendKeys(Cardexpiry, "12 / 20", "Cardexpiry");
		Thread.sleep(1000);
		MyWebutil.sendKeys(cvv, "456", "cvv");
		Thread.sleep(3000);
		MyWebutil.Click(TC_cbox, "Check Check-Box Terms and condition");
		Thread.sleep(3000);
		MyWebutil.Click(Pay_btn, "Click On Pay Button");
		Thread.sleep(4000);
		return fEmail;

		}
	
	
}
