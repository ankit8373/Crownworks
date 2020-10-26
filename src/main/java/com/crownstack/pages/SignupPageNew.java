package com.crownstack.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	import com.crownstack.mywebutil.MyWebutil;

	public class SignupPageNew {
	@FindBy(xpath = "//a[text()='Business Owner']")
	public static WebElement BusinessOwner_btn;

	@FindBy(xpath = "//input[@id='user_organization_name']")
	public static WebElement Org_name_txt;

	@FindBy(id = "user_first_name")
	public static WebElement F_Name_txt;

	@FindBy(id = "user_last_name")
	public static WebElement L_Name_txt;

	@FindBy(id = "user_email")
	public static WebElement Email_txt;

	@FindBy(id = "user_password")
	public static WebElement Pwd_txt;

	@FindBy(id = "user_password_confirmation")
	public static WebElement Confir_Pwd_txt;

	@FindBy(xpath="//input[@id='terms']")
	public static WebElement TermsCondition;

	@FindBy(xpath = "//button[@id='submitBtn']")
	public static WebElement Pay_btn;
	
	@FindBy(xpath = "//a[text()='Go to LogIn']")
	public static WebElement GotoLoginBtn;
	
	public String validateEQ_OwnerSignUp() throws InterruptedException {
		Thread.sleep(3000);
	MyWebutil.Click(BusinessOwner_btn, "Business Owner button");
	Thread.sleep(3000);
	String Orgname = MyWebutil.RandomString(5);
	Thread.sleep(3000);
	MyWebutil.sendKeys(Org_name_txt, Orgname, "Organization Name Field");
	Thread.sleep(3000);

	String FirstName = MyWebutil.RandomString(4);
	MyWebutil.sendKeys(F_Name_txt, FirstName, "Random Name Field");
	String lastName = MyWebutil.RandomString(4);
	MyWebutil.sendKeys(L_Name_txt, lastName, "Random Last Name Field");
	Thread.sleep(1000);
	String fEmail = FirstName + lastName + "@mailinator.com";
	//String FullName= FirstName+lastName;
	System.out.println(fEmail);
	MyWebutil.sendKeys(Email_txt, fEmail, "Random Email ID with First Name and Last Name");

	Thread.sleep(3000);
	MyWebutil.sendKeys(Pwd_txt, "12345678", "Password Field");
	Thread.sleep(1000);
	MyWebutil.sendKeys(Confir_Pwd_txt, "12345678", "Confirm Password Field");
	Thread.sleep(3000);
	MyWebutil.Click(TermsCondition, "ClickOnTermsCondition");
	Thread.sleep(3000);
	MyWebutil.Click(Pay_btn, "Click On Pay Button");

	return fEmail;
	}
	
	public static String SendInvitation() throws InterruptedException
	{
		String FirstName = MyWebutil.RandomString(4);
		MyWebutil.sendKeys(F_Name_txt, FirstName, "Random Name Field");
		String lastName = MyWebutil.RandomString(4);
		MyWebutil.sendKeys(L_Name_txt, lastName, "Random Last Name Field");
		Thread.sleep(1000);
		String fEmail = FirstName + lastName + "@mailinator.com";
		String FullName = FirstName + lastName;
		System.out.println(fEmail);
		MyWebutil.sendKeys(Email_txt, fEmail, "Random Email ID with First Name and Last Name");
		MyWebutil.sendKeys(Pwd_txt, "12345678", "Password Field");
		Thread.sleep(1000);
		MyWebutil.sendKeys(Confir_Pwd_txt, "12345678", "Confirm Password Field");
		Thread.sleep(3000);
		MyWebutil.Click(TermsCondition, "ClickOnTermsCondition");
		Thread.sleep(3000);
		MyWebutil.Click(Pay_btn, "Click On Pay Button");
		Thread.sleep(3000);
		MyWebutil.Click(GotoLoginBtn, "click on Go to login button");
		return FullName;
	}
	
	}

