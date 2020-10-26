package com.crownstack.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.reporters.jq.Main;

import com.crownstack.mywebutil.MyWebutil;
import com.crownstack.pages.dashboard.ActiveJobs;

public class Project {

	@FindBy(xpath = "//button[text()='Edit Name']")
	public static WebElement editname;

	@FindBy(xpath = "//input[@id='projectName']")
	public static WebElement newprojectnameinput;

	@FindBy(xpath = "//button[text()='Update']")
	public static WebElement updatebutton;

	@FindBy(xpath = "//button[text()='Archive Project']")
	public static WebElement archiveproject;

	@FindBy(xpath = "//span[text()='Archive Project']")
	public static WebElement archivebutton;

	@FindBy(xpath = "//button[text()='UnArchive Project']")
	public static WebElement unarchivebutton;

	@FindBy(xpath = "//button[text()='UnArchive Project']")
	public static WebElement unarchiveproject;

	@FindBy(xpath = "//input[@id='notificationLabel']")
	public static WebElement turnoffclientparticipation;

	@FindBy(xpath = "//li[text()='Quotes']")
	public static WebElement ClickOnQuoteTab;

	@FindBy(id = "quote_item_desc")
	public static WebElement EnterDataInDesc;

	@FindBy(id = "quote_price")
	public static WebElement QuotePrice;

	@FindBy(id = "quote_commission")
	public static WebElement QuoteCommission;

	@FindBy(xpath = "//button[@class='Button Button--primary ']")
	public static WebElement ClickAddButton;

	@FindBy(xpath = "//span[text()='Send Quote']")
	public static WebElement ClickSendButton;

	@FindBy(xpath = "//input[@id='title'] ")
	public static WebElement EnterquoteTitle;

	@FindBy(xpath = "//input[@id='description']")
	public static WebElement quoteDescription2;

	@FindBy(xpath = "//input[@name='partial']")
	public static WebElement PartialApprovelCheckbox;

	@FindBy(xpath = "//button[text()='Send Quote']")
	public static WebElement SendQuote;

	@FindBy(xpath = "//li[text()='Events']")
	public static WebElement Events_tab;
	
	@FindBy(xpath = "//span[text()='visit']")
	public static WebElement Visit_radiobtn;
	
	@FindBy(xpath = "//input[@id='description']")
	public static WebElement Description_txt;
	@FindBy(xpath = "//input[@placeholder='mm/dd/yyyy']")
	public static WebElement Date_txt;
	@FindBy(xpath = "//label[text()='Date']")
	public static WebElement normalclick;
	@FindBy(xpath = "//input[@id='time']")
	public static WebElement time_txt;
	@FindBy(xpath = "//input[@type='checkbox']")
	public static WebElement Client_cbox;
	@FindBy(xpath = "//button[text()='SCHEDULE EVENT']")
	public static WebElement Schedule_Eventbtn;

	@FindBy(xpath = "//button[text()='SCHEDULE EVENT']")
	public static WebElement clickoneventdate;

	@FindBy(xpath = "//li[text()='Messages']")
	public static WebElement messagetab;
	@FindBy(xpath = "//*[contains(text(),'SEND MESSAGE')]")
	public static WebElement ClickOnSendMessage;

	@FindBy(xpath = "//textarea[@class='form-control ']")
	public static WebElement SendTextMessage;
	@FindBy(xpath = "//button[text()='Send']")
	public static WebElement ClickOnSendbutton;
	@FindBy(xpath = "//li[text()='Files']")
	public static WebElement File_tab;
	/*--------------------------------------Filter----------------------------------*/
	@FindBy(xpath = "//input[@name='filename']")
	public static WebElement FileName_txt;
	@FindBy(xpath = "//input[@name='description']")
	public static WebElement FileDesc_txt;
	@FindBy(xpath = "//div[@class='FileForm-field FileForm-fieldFromDate']//input[@placeholder='mm/dd/yyyy']")
	public static WebElement From_date;
	@FindBy(xpath = "//div[@class='FileForm-field FileForm-fieldToDate']//input[@placeholder='mm/dd/yyyy']")
	public static WebElement To_date; 
	@FindBy(xpath = "//span[text()='FILTER']")
	public static WebElement Filter_btn;
	/*-------------------------------------------------------------------------------*/
	@FindBy(xpath = "//div[@id='myBtn']")
	public static WebElement Click_here_to_addfile;
	/*---------popup-----------*/
	@FindBy(xpath = "//input[@name='file-upload-field']")
	public static WebElement Upload_file;
	@FindBy(xpath = "//*[@id=\"myModal\"]/div/form/div/div[2]/input")    //Need to change
	public static WebElement FileName_pfld;
	@FindBy(xpath = "//*[@id=\"myModal\"]/div/form/div/div[3]/input")   //Need to change 
	public static WebElement FileDsp_pfld;
	@FindBy(xpath = "//label[@class='new-checkbox']//input[@type='checkbox']")
	public static WebElement Check_box;
	@FindBy(xpath = "//button[text()='Add File']")
	public static WebElement Add_btn;
	@FindBy(xpath = "//i[@class='fa fa-edit']")
	public static WebElement Edit_button;
	@FindBy(xpath = "//button[text()='Update File']")
	public static WebElement Update_File_btn;
	@FindBy(xpath = "//i[@class='fa fa-trash']")
	public static WebElement delete_btn;
	@FindBy(xpath = "//span[text()='Remove']")
	public static WebElement Remove_btn;
	@FindBy (xpath="//li[contains(text(),'Tech/Subs')]")
	public  WebElement Tech_SubsTab;
	
	@FindBy (xpath="//div[starts-with(@class,'select__indicators')]")
	public  WebElement SubContractorDropdown;

	@FindBy (xpath="//input[@id='react-select-2-input'] ")
	public  WebElement searchContactorED;

	
	
	
	@FindBy (xpath="//button[text()='Add Event'] ")
	public  WebElement addevent;
	
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
	
	@FindBy (xpath="//span[text()='Dashboard']")
	public  WebElement clickondashboard;
	
	

	public void validproject() throws Throwable {

		
		LoginPage logobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();
//		PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//		MyWebutil.closetutorial();
		ActiveJobs actobj = PageFactory.initElements(MyWebutil.driver, ActiveJobs.class);
		actobj.click_on_active_jobs();

		MyWebutil.Click(editname, "editname");
		Thread.sleep(2000);
		MyWebutil.sendKeys(newprojectnameinput, "Kitchen Renovation", "newprojectnameinput");
		Thread.sleep(2000);
		MyWebutil.Click(newprojectnameinput, "projectnameinput");
		Thread.sleep(2000);
		MyWebutil.Click(updatebutton, "updatebutton");
		Thread.sleep(2000);
		MyWebutil.Click(archiveproject, "archiveproject");
		Thread.sleep(2000);
		MyWebutil.Click(archivebutton, "archivebutton");
		Thread.sleep(2000);
		MyWebutil.Click(unarchivebutton, "unarchivebutton");
		Thread.sleep(2000);
		MyWebutil.Click(unarchiveproject, "unarchiveproject");
		Thread.sleep(2000);

		MyWebutil.Click(turnoffclientparticipation, "turnoffclientparticipation");
		Thread.sleep(2000);
		MyWebutil.Click(turnoffclientparticipation, "turnoffclientparticipation");	

	}

	public void ValidQuotetab() throws InterruptedException {
		Thread.sleep(3000);
		MyWebutil.Click(ClickOnQuoteTab, "ClickOnQuoteTab");
		Thread.sleep(2000);
		MyWebutil.sendKeys(EnterDataInDesc, "the value of work", "EnterDataInDesc");
		Thread.sleep(2000);
		MyWebutil.sendKeys(QuotePrice, "100", "QuotePrice");
		Thread.sleep(2000);

		MyWebutil.clear(QuoteCommission);
		MyWebutil.sendKeys(QuoteCommission, "100", "QuoteCommission");
		Thread.sleep(2000);
		MyWebutil.Click(ClickAddButton, "ClickAddButton");

		MyWebutil.sendKeys(EnterquoteTitle, "Renovation", "Enter Quote Title");
		Thread.sleep(2000);
		MyWebutil.sendKeys(quoteDescription2, "Renovate Kitchen Sink", "quote Description2");
		Thread.sleep(2000);

		MyWebutil.Click(PartialApprovelCheckbox, "Partial Approvel Checkbox");
		Thread.sleep(2000);
		MyWebutil.jsscrolldown(SendQuote);
		MyWebutil.Click(SendQuote, "Send Quote");
	}

	public void ValidEventTab() throws Throwable {
		MyWebutil.Click(Events_tab, "click on event tab");
		Thread.sleep(3000);
        MyWebutil.Click(addevent, "addevent");
		Thread.sleep(3000);
		MyWebutil.Click(Visit_radiobtn, "click on visit radio button");
		Thread.sleep(3000);
		String eventtxt = MyWebutil.RandomString(5);
		MyWebutil.sendKeys(Description_txt, eventtxt, "Description field ");
		Thread.sleep(3000);
		String time = "1030PM";
		MyWebutil.keys(Date_txt);
		Thread.sleep(3000);
		MyWebutil.sendKeys(time_txt, time, "time field");
		Thread.sleep(3000);
		MyWebutil.Click(Client_cbox, "click on check box");
		Thread.sleep(3000);
		MyWebutil.Click(Schedule_Eventbtn, "click on schedule event button ");
		Thread.sleep(3000);
		//MyWebutil.Click(clickoneventdate, "clickoneventdate");

	}

	public void validMessageTab() throws Throwable {
		MyWebutil.Click(messagetab, "messagetab");
		//MyWebutil.Click(ClickOnSendMessage, "ClickOnSendMessage");
		Thread.sleep(3000);
		MyWebutil.sendKeys(SendTextMessage, "This message send to client", "SendTextMessage");
		Thread.sleep(3000);
		MyWebutil.Click(ClickOnSendbutton, "ClickOnSendbutton");
		Thread.sleep(3000);

	}
	public void ValidFile() throws InterruptedException {
		MyWebutil.Click(File_tab, "File tab");
		String filename;
		String filedesc;
		for (int i = 1; i <=2; i++) 
		{
			MyWebutil.Click(Click_here_to_addfile, "Add file");
			File uploadFile=new File("GoTaskerLogo.png");
			MyWebutil.sendKeys(Upload_file, uploadFile.getAbsolutePath(), "Upload File");
			filename = MyWebutil.RandomString(5);
			Thread.sleep(3000);
			MyWebutil.sendKeys(FileName_pfld, filename, "File name field");
			filedesc = MyWebutil.RandomString(10);
			Thread.sleep(3000);
			MyWebutil.sendKeys(FileDsp_pfld, filedesc, "File description field");
			Thread.sleep(3000);
			MyWebutil.Click(Check_box, "check box");
			Thread.sleep(3000);
			MyWebutil.Click(Add_btn, "Add File Button");
		}
		MyWebutil.Click(Edit_button, "Edit button");
		Thread.sleep(2000);
		MyWebutil.clear(FileName_pfld);
		Thread.sleep(3000);
		MyWebutil.sendKeys(FileName_pfld, "updated file name", "File name");
		Thread.sleep(3000);
		MyWebutil.clear(FileDsp_pfld);
		MyWebutil.sendKeys(FileDsp_pfld, "updated file description", "File description");
		Thread.sleep(3000);
		MyWebutil.Click(Update_File_btn, "Update file button");
		Thread.sleep(3000);
		MyWebutil.Click(delete_btn, "Delete button");
		Thread.sleep(2000);
		MyWebutil.Click(Remove_btn, "Remove Button");
		/*
		MyWebutil.sendKeys(From_date, "12/03/2020", "From Date field");
		From_date.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		MyWebutil.sendKeys(To_date, "15/03/2020", "From Date field");
		From_date.sendKeys(Keys.ENTER);
		MyWebutil.Click(Filter_btn, "Filter button");
		*/

	}
	public void ValidTechSubs() throws Throwable {
		Thread.sleep(3000);
		MyWebutil.Click(Tech_SubsTab, "Tech_SubsTab");
		Thread.sleep(3000);
		//MyWebutil.Click(search_subcontractorclick, "Search Sub Contractor");
		//Thread.sleep(3000);
	
		MyWebutil.sendKeys(searchContactorED, "newtech", "searchContactorEDitBox");
		Thread.sleep(1000);
		searchContactorED.sendKeys(Keys.ENTER);
//		MyWebutil.Click(techvalue, "tech value");
		Thread.sleep(3000);
		MyWebutil.Click(AddSubcontractor, "Add SubContractor");
		Thread.sleep(3000);
		MyWebutil.Click(Nomessage, "No Message");
		Thread.sleep(3000);
		
		
//		MyWebutil.Click(clickondashboard, "clickondashboard");
//		
//		MyWebutil.logout(Mouseoveronprofile, Logout);
		
		
			}
}
