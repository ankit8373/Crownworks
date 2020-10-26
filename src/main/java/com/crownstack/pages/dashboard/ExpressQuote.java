

package com.crownstack.pages.dashboard;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crownstack.mywebutil.MyWebutil;
import com.crownstack.pages.LoginPage;
import com.crownstack.pages.MailinatorPage_CLient;
import com.crownstack.pages.MailinatorPage_Owner;

import net.bytebuddy.asm.Advice.Enter;

public class ExpressQuote {

	@FindBy(xpath="//*[contains(text(),'Express Quote')]")
	public static WebElement ExpressQuote;

	@FindBy(xpath="(//li[@class='list '])[1]")
	public static WebElement Clientsquote;

	@FindBy(xpath="//input[@id='searchInput']")
	public static WebElement searchbar;

	@FindBy(xpath="//input[@id='searchInput']")
	public static WebElement searchtest;

	@FindBy(xpath="//span[text()='getta ']")
	public static WebElement clickontest;

	@FindBy(xpath="//span[@class='name editLinkButton']")
	public static WebElement Addnewclient;

	@FindBy(xpath="//input[@id='name']")
	public static WebElement F_Name_txt;


	@FindBy(xpath="//input[@id='last_name']")
	public static WebElement L_Name_txt; 

	@FindBy(xpath="//input[@id='email']")
	public static WebElement inputrandomemailid_expressquote;



	@FindBy(xpath="//button[@class='button']")
	public static WebElement sendinvite;


	@FindBy(xpath="//div[@class='fL']")
	public static WebElement Mouseoveronprofile;


	@FindBy(xpath="//li[contains(text(),'Logout')]")
	public static WebElement Logout;


	@FindBy (xpath="//input[@id='login']")
	public  WebElement YopmailField;

	@FindBy (xpath="//input[@type='submit']")
	public  WebElement YopmailSubmit;

	@FindBy (xpath="//a[contains(text(),'Click here')]")
	public WebElement InvitationClickHere;

	@FindBy (xpath="//input[@id='session_email']")
	public WebElement ClientPass;

	@FindBy (xpath="//input[@id='session_password']")
	public WebElement ClientPassConf;

	@FindBy (xpath="//input[@name='commit']")
	public WebElement Commit;

	@FindBy (xpath="//iframe[@id='ifmail']")
	public WebElement SwitchIframe;

	@FindBy(xpath="//div[@class='BrandCard-content']//button")
	public WebElement Accp;

	@FindBy(xpath="//div[text()='Contacts']")
	public static  WebElement Contacts;

	@FindBy(xpath="(//li[@class='list '])[1]")
	public static  WebElement Clients;

	@FindBy(xpath="//button[contains(text(),'Add client')]")
	public static  WebElement AddClient;

	@FindBy(xpath="(//button[@class='Button Button--primary'])[1]")
	public static  WebElement AddNewService;

	@FindBy(xpath="(//input[@name='description'])[2]")
	public static  WebElement ServiceDescription;

	@FindBy(xpath="//button[@class='Button Button--widget save-btn']")
	public static  WebElement CreateService;

	@FindBy(xpath="//span[@id='dashboard']")
	public static  WebElement Dashboard;

	@FindBy(xpath="//span[text()='Clients Quotes']")
	public static  WebElement ClientsQuotes;

	@FindBy(xpath="//input[@id='searchInput']")
	public static  WebElement SearchC_Name;

	@FindBy(xpath="//div[@class='TTU icon']")
	public static  WebElement ServiceClick;

	@FindBy(xpath="//button[text()='Upload']")
	public static  WebElement UploadButton;

	@FindBy(xpath="//input[@id='files']")
	public static  WebElement Upload;

	@FindBy(xpath="//input[@id='description']")
	public static  WebElement UploadDescription;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	public static  WebElement UploadQuote;
	
	@FindBy(xpath="//input[@id='session_email']")
	public static WebElement username;
	
	@FindBy(xpath="//input[@id='session_password']")
	public static WebElement password;

	@FindBy(xpath="//input[@class='Button Button--primary']")
	public static WebElement signin;

	@FindBy (xpath="(//a[text()='LOGIN'])[2]")
	public  WebElement Main_Login;



	public static String FirstName;
	public static String LastName;

	public  String validatexpressquote() throws InterruptedException{


		MyWebutil.Click(ExpressQuote, "ExpressQuote Button");
		Thread.sleep(3000);
		MyWebutil.Click(Clientsquote, "Clientsquote Button");
		Thread.sleep(3000);
		MyWebutil.Click(searchbar, "searchbar Button");
		Thread.sleep(3000);
		MyWebutil.sendKeys(searchtest, "AlishaS  ", "Search Test");
		Thread.sleep(3000);
		MyWebutil.Click(clickontest, "Test Field");
		Thread.sleep(3000);
		MyWebutil.Click(Addnewclient, "Add New Client");
		Thread.sleep(3000);
		FirstName = MyWebutil.RandomString(4);	
		MyWebutil.sendKeys(F_Name_txt, FirstName, "Random First Name");
		LastName = MyWebutil.RandomString(4);	
		MyWebutil.sendKeys(L_Name_txt, LastName, "Random Last Name");		
		Thread.sleep(3000);
		String fEmail = FirstName+LastName+"@mailinator.com";


		System.out.println(fEmail);

		/*--------------xpath for client name search-------------------*/

		MyWebutil.sendKeys(inputrandomemailid_expressquote, fEmail, "Random Email_ID");
		MyWebutil.Click(sendinvite, "Send_Invite Button");
		logout();

		MailinatorPage_CLient yopObj=PageFactory.initElements(MyWebutil.driver, MailinatorPage_CLient.class);
		yopObj.emailMailVerification(fEmail);;
		
		MyWebutil.sendKeys(ClientPass, "xyz123", "Owner Password");
		Thread.sleep(3000);
		MyWebutil.sendKeys(ClientPassConf, "xyz123", "Owner Password Confirmation");
		Thread.sleep(3000);
		MyWebutil.Click(Commit, "Commit Button");
		Thread.sleep(3000);
		MyWebutil.ActionScroll();
		Thread.sleep(3000);
		MyWebutil.Click(Accp, "Accept Button");
		
		
		
		
		logout();
		return FirstName+" "+LastName;
		
		
		

	}

	public void validateEQ(String fullName) throws InterruptedException{
		
		
		MyWebutil.Click(Contacts, "Contacts Button");
		Thread.sleep(3000);
		MyWebutil.Click(Clients, "Clients Button");
		Thread.sleep(3000);
		//MyWebutil.Click(AddClient);

		MyWebutil.Click(MyWebutil.driver.findElement(By.xpath("//div[text()='"+fullName+"']")), "Random User");
		Thread.sleep(3000);
		MyWebutil.Click(AddNewService, "Add New Service Button");
		Thread.sleep(3000);
		MyWebutil.sendKeys(ServiceDescription, "Kitchen Renovation", "Service Description");
		Thread.sleep(3000);
		MyWebutil.Click(CreateService, "Create Service Button");
		Thread.sleep(3000);
		MyWebutil.Click(Dashboard, "Dashboard");
		Thread.sleep(3000);
		MyWebutil.Click(ExpressQuote, "ExpressQuote");
		Thread.sleep(3000);
		MyWebutil.Click(ClientsQuotes, "ClientsQuotes");
		Thread.sleep(3000);
		MyWebutil.sendKeys(SearchC_Name, fullName, "Client's Name");
		Thread.sleep(3000);
		MyWebutil.Click(MyWebutil.driver.findElement(By.xpath("//span[text()='"+fullName+"']")), "Client's Name");
		Thread.sleep(3000);
		MyWebutil.Click(ServiceClick, "Service");
		Thread.sleep(3000);
		MyWebutil.Click(UploadButton, "Upload Button");
		Thread.sleep(3000);
		File uploadFile=new File("GoTaskerLogo.png");
		MyWebutil.sendKeys(Upload, uploadFile.getAbsolutePath(), "Upload File");
		Thread.sleep(3000);
		MyWebutil.sendKeys(UploadDescription, "xyz", "Upload Description");
		Thread.sleep(3000);
		MyWebutil.Click(UploadQuote, "Upload Quote Button");
		Thread.sleep(3000);
		//MyWebutil.Click(Mouseoveronprofile, "Profile");
		//Thread.sleep(3000);
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


}


