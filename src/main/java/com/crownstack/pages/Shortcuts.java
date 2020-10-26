package com.crownstack.pages;
import java.io.File;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crownstack.mywebutil.MyWebutil;
public class Shortcuts {
	@FindBy(xpath = "//button[@id='actionButton']")
	public WebElement AddButton;
	@FindBy(xpath = "//*[contains(text(),'Add New Services')]")
	public WebElement addnewservices;
	@FindBy(xpath = "//div[@class='select__indicator select__dropdown-indicator css-tlfecz-indicatorContainer']")
	public WebElement arrowclick;
	@FindBy(xpath = "//input[@id='serviceName']")
	public WebElement ServiceDescription;
	@FindBy(xpath = "//button[@class='Button Button--primary save-btn ']")
	public WebElement CreateServiceButton;
	@FindBy(xpath = "//input[@id='searchInput']")
	public WebElement Searchbar;
	@FindBy(xpath = "//span[text()='test ']")
	public WebElement Searchtest;
	@FindBy(xpath = "//input[contains(@id, 'react-select-2-')]")
	public WebElement selectclient;
	@FindBy(xpath = "//span[text()='Add New Messages']")
	public WebElement AddNewMessages;
	@FindBy(xpath = "//input[contains(@id, 'react-select-5-input')]")
	public WebElement SelectclientInMessage;
	@FindBy(xpath = "//button[@class='sc-bdVaJa cYQqRL sc-bxivhb eTpeTG']")
	public WebElement CloseTutorialButton;
	@FindBy(xpath = "//*[contains(text(),'Active Jobs')]")
	public WebElement ActiveJobs;
	@FindBy(xpath = "//div[@class='TTU icon']")
	public static WebElement ClickOnService;
	@FindBy(xpath = "//span[text()='Dashboard']")
	public static WebElement ClickOnDashboard;
	@FindBy(xpath = "//*[contains(text(),'Add New Events')]")
	public static WebElement AddNewEvent;
	@FindBy(xpath = "//input[contains(@id,'react-select-3-input')]")
	public static WebElement SelectEvent;
	@FindBy(xpath = "//input[contains(@id,'react-select-4-input')]")
	public static WebElement SelectProject;
	@FindBy(xpath = "//input[contains(@id,'react-select-6-input')]")
	public static WebElement SelectProjectInMessage;
	@FindBy(xpath = "//span[text()='ADD NEW EVENT']")
	public static WebElement ClickOnAddNewEvent;
	@FindBy(xpath = "//button[text()='Add Event']")
	public static WebElement AddEventButton;
	@FindBy(xpath = "//span[text()='visit']")
	public static WebElement CheckVisit;
	@FindBy(xpath = "//input[contains(@id,'description')]")
	public static WebElement Description;
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
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public static WebElement Client_cbox;
	@FindBy(xpath = "//button[text()='SCHEDULE EVENT']")
	public static WebElement Schedule_Eventbtn;
	@FindBy(xpath = "//*[contains(text(),'Add New Messages')]")
	public static WebElement ClickOnNewMessage;
	@FindBy(xpath = "//*[contains(text(),'SEND MESSAGE')]")
	public static WebElement ClickOnSendMessage;
	@FindBy(xpath = "//textarea[@class='form-control ']")
	public static WebElement SendTextMessage;
	@FindBy(xpath = "//button[text()='Send']")
	public static WebElement ClickOnSendbutton;
	@FindBy(xpath = "//*[contains(text(),'Add New Quotes')]")
	public static WebElement ClickOnQuote;
	@FindBy(xpath = "//*[contains(text(),'SEND QUOTE')]")
	public static WebElement ClickOnSendQuote;
	@FindBy(xpath = "//input[contains(@id, 'react-select-7-input')]")
	public static WebElement selectclientQuote;
	@FindBy(id = "quote_item_desc")
	public WebElement EnterDataInDesc;
	@FindBy(id = "quote_price")
	public WebElement QuotePrice;
	@FindBy(id = "quote_commission")
	public WebElement QuoteCommission;
	@FindBy(xpath = "//button[text()='ADD ITEM']")
	public WebElement ClickAddButton;
	@FindBy(xpath = "//span[text()='Send Quote']")
	public WebElement ClickSendButton;
	@FindBy(xpath = "//input[@id='title']")
	public WebElement EnterTitle;
	@FindBy(xpath = "//input[@id='description']")
	public WebElement EnterDescription;
	@FindBy(xpath = "//button[text()='Send Quote']")
	public WebElement SendQuoteButton;
	@FindBy(xpath = "//button[text()='Upload']")
	public WebElement UploadFile;
	@FindBy(xpath = "//input[contains(@id,'react-select-8-input')]")
	public WebElement SelectProjectQuote;
	public void validateAddNewServices() throws Exception {
		// PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
		// MyWebutil.closetutorial();
		Thread.sleep(3000);
		MyWebutil.mouseovertrycatch(AddButton);
		Thread.sleep(3000);
		MyWebutil.Click(addnewservices, "Add New Services");
		Thread.sleep(3000);
		MyWebutil.sendKeys(selectclient, "test", "selectclient");
		Thread.sleep(4000);
		selectclient.sendKeys(Keys.ENTER);
		String RandomServiceDesp = MyWebutil.RandomString(3);
		MyWebutil.sendKeys(ServiceDescription, RandomServiceDesp, "Service Description");
		Thread.sleep(3000);
		MyWebutil.Click(CreateServiceButton, "Create Service Button");
		Thread.sleep(4000);
		MyWebutil.Click(ActiveJobs, "ActiveJobs");
		Thread.sleep(3000);
		MyWebutil.sendKeys(Searchbar, "test", "Search Bar");
		Thread.sleep(4000);
		MyWebutil.Click(Searchtest, "Search Text");
		Thread.sleep(3000);
		// MyWebutil.mouseover(AddButton);
		MyWebutil.Click(ClickOnService, "ClickOnService");
		Thread.sleep(3000);
		MyWebutil.Click(ClickOnDashboard, "ClickOnDashboard");
		Thread.sleep(3000);
	}
	public void validateAddNewEvents() throws Exception {
		MyWebutil.mouseovertrycatch(AddButton);
		Thread.sleep(4000);
		MyWebutil.Click(AddNewEvent, "Add New Event");
		Thread.sleep(3000);
		MyWebutil.sendKeys(SelectEvent, "test", "SelectEvent");
		Thread.sleep(4000);
		SelectEvent.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		MyWebutil.sendKeys(SelectProject, "Project #748", "SelectProject");
		Thread.sleep(3000);
		SelectProject.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		MyWebutil.Click(ClickOnAddNewEvent, "ClickOnAddNewEvent");
		Thread.sleep(3000);
		MyWebutil.Click(AddEventButton, "AddEventButton");
		Thread.sleep(3000);
		MyWebutil.Click(CheckVisit, "CheckVisit");
		Thread.sleep(3000);
		MyWebutil.sendKeys(Description, "visit on client side", "Description");
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
		MyWebutil.Click(ClickOnDashboard, "ClickOnDashboard");
		Thread.sleep(3000);
	}
	public void validateAddNewMessages() throws Exception {
		MyWebutil.mouseovertrycatch(AddButton);
		Thread.sleep(2000);
		MyWebutil.Click(AddNewMessages, "SelectclientInMessage");
		Thread.sleep(3000);
		MyWebutil.sendKeys(SelectclientInMessage, "test", "selectclient");
		Thread.sleep(4000);
		SelectclientInMessage.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		MyWebutil.sendKeys(SelectProjectInMessage, "Project #748", "SelectProject");
		Thread.sleep(3000);
		SelectProjectInMessage.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		MyWebutil.Click(ClickOnSendMessage, "ClickOnSendMessage");
		Thread.sleep(3000);
		MyWebutil.sendKeys(SendTextMessage, "This message send to client", "SendTextMessage");
		Thread.sleep(3000);
		MyWebutil.Click(ClickOnSendbutton, "ClickOnSendbutton");
		Thread.sleep(3000);
		MyWebutil.Click(ClickOnDashboard, "ClickOnDashboard");
	}
	public void validateAddNewQuotes() throws Exception {
		Thread.sleep(3000);
		MyWebutil.mouseovertrycatch(AddButton);
		Thread.sleep(3000);
		// MyWebutil.Click(addnewservices, "Add New Services");
		// Thread.sleep(3000);
		MyWebutil.Click(ClickOnQuote, "ClickOnQuote");
		Thread.sleep(3000);
		MyWebutil.sendKeys(selectclientQuote, "test", "selectclient");
		Thread.sleep(3000);
		selectclientQuote.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		MyWebutil.sendKeys(SelectProjectQuote, "Project #748", "SelectProject");
		Thread.sleep(3000);
		SelectProjectQuote.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		MyWebutil.Click(ClickOnSendQuote, "ClickOnSendQuote");
		Thread.sleep(3000);
		MyWebutil.sendKeys(EnterDataInDesc, "quote for kitchen renovation", "EnterDataInDesc");
		Thread.sleep(3000);
		MyWebutil.sendKeys(QuoteCommission, "10", "QuoteCommission");
		Thread.sleep(3000);
		MyWebutil.Click(ClickAddButton, "ClickAddButton");
		Thread.sleep(3000);
		MyWebutil.sendKeys(EnterTitle, "heading of the quote", "EnterTitle");
		Thread.sleep(3000);
		MyWebutil.sendKeys(EnterDescription, "This is the Description", "EnterDescription");
		Thread.sleep(3000);
		MyWebutil.Click(SendQuoteButton, "SendQuoteButton");
		Thread.sleep(3000);
		String stringpath = new File("C:/Users/manish/Desktop/goanki/GoTasker/Gotasker/GoTaskerLogo.png")
				.getAbsolutePath();
		MyWebutil.sendKeys(UploadFile, stringpath, "Add Files Text");
		System.out.println("file sucessfully uploded");
	}
}