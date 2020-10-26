package com.crownstack.pages.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crownstack.mywebutil.MyWebutil;

public class ActiveJobs {
	

	@FindBy(xpath="//*[contains(text(),'Active Jobs')]")
	public  WebElement activejobs; 
	@FindBy(xpath="//input[@id='searchInput']")
	public  WebElement Searchbar; 
	@FindBy(xpath="//span[text()='AlishaS ']")
	public  WebElement Searchtest; 

	@FindBy(xpath="//button[@class='actionButton ']")
	public  WebElement AddButton; 
	@FindBy(xpath="//*[contains(text(),'Add New Services')]")
	public  WebElement addnewservices; 
	@FindBy (xpath="//input[@id='serviceName']")
	public  WebElement ServiceDescription;
	@FindBy (xpath="//button[@class='Button Button--primary save-btn ']")
	public  WebElement CreateServiceButton;
	@FindBy (xpath="(//div[@class='TTU icon'])[1]")
	public  WebElement ClickOnService;
	@FindBy (xpath="//button[@class='sc-bdVaJa cYQqRL sc-bxivhb eTpeTG']")
	public  WebElement CloseTutorialButton;
	@FindBy (xpath="//li[contains(text(),'Tech/Subs')]")
	public  WebElement Tech_SubsTab;
	
	@FindBy (xpath="//div[starts-with(@class,'select__indicators')]")
	public  WebElement SubContractorDropdown;

	@FindBy (xpath="//input[@id='react-select-2-input'] ")
	public  WebElement searchContactorED;

	
	
	
	
	@FindBy(xpath = "//div//span[text()='clients client']")
	public static WebElement Click_on_client;

	@FindBy (xpath="//button[@class='Button Button--primary save-btn  ']")
	public  WebElement AddSubcontractor;


	@FindBy (xpath="(//span[@class='Button-linkLabel'])[2]")
	public  WebElement Nomessage;

	@FindBy (xpath="(//div[@class='fL'])[1]")
	public  WebElement Mouseoveronprofile;

	@FindBy (xpath="//*[contains(text(),'Logout')]")
	public  WebElement Logout;
	
	@FindBy (xpath="//input[@id='session_email']")
	public  WebElement LogInUserField;
	
	@FindBy (xpath="//input[@id='session_password']")
	public  WebElement LogInPasswordField;
	
	@FindBy (xpath="//input[@class='Button Button--primary']")
	public  WebElement SignInButton;
	
	@FindBy (xpath="//div[@class='fL']/p[text()='xyz']")
	public  WebElement validateActiveJobs;
	
	@FindBy (xpath="(//a[text()='LOGIN'])[2]")
	public  WebElement Main_Login;
	
	@FindBy(xpath = "//input[@id='searchInput']")
	public WebElement Search_txt;
	
	@FindBy(xpath = "//span[text()='Tclien ']")
	public static WebElement search_result;
	@FindBy(xpath = "(//div[@class='TTU icon'])[1]")
	public static WebElement clickonservice;
	
	
	public  void validatedashboard() throws InterruptedException{
//		MyWebutil.Click(Main_Login, "Main Screen Log In");
//		Thread.sleep(3000);
		MyWebutil.Click(activejobs, "Active-Jobs");
		Thread.sleep(5000);
		MyWebutil.sendKeys(Searchbar, "AlishaS ", "Search Bar");
		Thread.sleep(7000);
		MyWebutil.Click(Searchtest, "Search Text");
		Thread.sleep(3000);
		MyWebutil.mouseover(AddButton);
		Thread.sleep(3000);
		MyWebutil.Click(addnewservices, "Add New Services");
		Thread.sleep(3000);
		String RandomServiceDesp = MyWebutil.RandomString(5);
		
		MyWebutil.sendKeys(ServiceDescription, RandomServiceDesp, "Service Description");
		Thread.sleep(3000);
		MyWebutil.Click(CreateServiceButton, "Create Service Button");
		Thread.sleep(3000);
		
		MyWebutil.Click(clickonservice, "clickonservice");
		//MyWebutil.Click(MyWebutil.driver.findElement(By.xpath("//div[text()='"+RandomServiceDesp+"']")), "click on client");
		Thread.sleep(3000);
//		PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//		MyWebutil.closetutorial();
		
		Thread.sleep(3000);
		MyWebutil.Click(Tech_SubsTab, "Tech_SubsTab");
		Thread.sleep(3000);
		//MyWebutil.Click(search_subcontractorclick, "Search Sub Contractor");
		//Thread.sleep(3000);
	
		MyWebutil.sendKeys(searchContactorED, "san techh", "searchContactorEDitBox");
		Thread.sleep(1000);
		searchContactorED.sendKeys(Keys.ENTER);
//		MyWebutil.Click(techvalue, "tech value");
		Thread.sleep(3000);
		MyWebutil.Click(AddSubcontractor, "Add SubContractor");
		Thread.sleep(3000);
		MyWebutil.Click(Nomessage, "No Message");
		Thread.sleep(3000);
		logout();
		Thread.sleep(3000);
		MyWebutil.sendKeys(LogInUserField, "newtech@yopmail.com", "SubContractor Login User Name");
		Thread.sleep(3000);
		MyWebutil.sendKeys(LogInPasswordField, "123456", "SubContractor Login Password");
		Thread.sleep(3000);
		MyWebutil.Click(SignInButton, "SignIn Button");
		Thread.sleep(3000);
	//	MyWebutil.Click(CloseTutorialButton, "Close Tutorial");
		
		//MyWebutil.validateText(validateActiveJobs, "xyz");
		
		logout();
		
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

	public void click_on_active_jobs() throws InterruptedException
	{
		Thread.sleep(3000);
		MyWebutil.Click(activejobs, "Active-Jobs");
		Thread.sleep(3000);
		MyWebutil.sendKeys(Search_txt, "tclien", "enter valiue into search field");
		Thread.sleep(5000);
		MyWebutil.Click(search_result, "click on search result");
		Thread.sleep(3000);
		MyWebutil.mouseover(AddButton);
		Thread.sleep(3000);
		MyWebutil.Click(addnewservices, "Add New Services");
		Thread.sleep(3000);
		String RandomServiceDesp = MyWebutil.RandomString(5);
		MyWebutil.sendKeys(ServiceDescription, RandomServiceDesp, "Service Description");
		Thread.sleep(3000);
		MyWebutil.Click(CreateServiceButton, "Create Service Button");
		MyWebutil.Click(MyWebutil.driver.findElement(By.xpath("//div[text()='"+RandomServiceDesp+"']")), "Random User");
		System.out.println(RandomServiceDesp);
		//		MyWebutil.Click(ClickOnService,"Click On Service");
		//		Thread.sleep(3000);
		//		MyWebutil.Click(CloseTutorialButton, "Close Tutorial");
		//		Thread.sleep(3000);
	}






	
}
