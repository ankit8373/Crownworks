package com.crownstack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crownstack.mywebutil.MyWebutil;
import com.crownstack.pages.dashboard.ActiveJobs;

public class Calendar {
	/*
	@FindBy(xpath = "//button[@class='sc-bdVaJa cYQqRL sc-bxivhb eTpeTG']")
	public static WebElement CloseTutorialButton;
	@FindBy(xpath = "//li[text()='Events']")
	public static WebElement Events_tab;
	@FindBy(xpath = "//button[text()='Add Event']")
	public static WebElement Add_Event_btn;
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
	@FindBy(xpath = "//input[@name='clients client']")
	public static WebElement Client_cbox;
	@FindBy(xpath = "//button//span[text()='SCHEDULE EVENT']")
	public static WebElement Schedule_Eventbtn;
	@FindBy(xpath = "//span[text()='Calendar']")
	public static WebElement ClickOnCalendarTab;
	@FindBy(xpath="(//div[@class='rbc-day-bg'])[6]")
	public static WebElement ClickCalendarDate;
	
	@FindBy(xpath="(//span[@class='Link']")
	public static WebElement editinformation;
	public static void validate_calendar() throws Exception {
		LoginPage loginobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		loginobj.validlogin();
		ActiveJobs actjobsobj = PageFactory.initElements(MyWebutil.driver, ActiveJobs.class);
		actjobsobj.click_on_active_jobs();
		Thread.sleep(3000);
		// MyWebutil.Click(CloseTutorialButton, "close tuturial");
		Thread.sleep(3000);
		MyWebutil.Click(Events_tab, "click on event tab");
		Thread.sleep(3000);
		MyWebutil.Click(Add_Event_btn, "Click on add event button");
		Thread.sleep(3000);
		MyWebutil.Click(Visit_radiobtn, "click on visit radio button");
		Thread.sleep(3000);
		MyWebutil.sendKeys(Description_txt, MyWebutil.RandomString(5), "Description field ");
		Thread.sleep(3000);
		String time = "0930pm";
		MyWebutil.keys(Date_txt);
		Thread.sleep(3000);
		MyWebutil.sendKeys(time_txt, time, "time field");
		Thread.sleep(3000);
		MyWebutil.Click(Client_cbox, "click on check box");
		Thread.sleep(3000);
		MyWebutil.Click(Schedule_Eventbtn, "click on schedule event button ");
		Thread.sleep(3000);
		MyWebutil.Click(ClickOnCalendarTab, "ClickOnCalendarTab");
		
		MyWebutil.Click(MyWebutil.driver.findElement(By.xpath("//div[contains(text(),'"+time +" ')]")), "click on calender date");
		//Thread.sleep(3000);
	MyWebutil.Click(editinformation, "click edit button");
	}*/
	
	
	@FindBy(xpath = "//button[@class='sc-bdVaJa cYQqRL sc-bxivhb eTpeTG']")
	public static WebElement CloseTutorialButton;
	@FindBy(xpath = "//li[text()='Events']")
	public static WebElement Events_tab;
	@FindBy(xpath = "//button[text()='Add Event']")
	public static WebElement Add_Event_btn;
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
	@FindBy(xpath = "//span[text()='Calendar']")
	public static WebElement ClickOnCalendarTab;
	@FindBy(xpath="(//div[@class='rbc-day-bg'])[6]")
	public static WebElement ClickCalendarDate;
	@FindBy(xpath="(//span[@class='Link']")
	public static WebElement editinformation;
	
	
	@FindBy(xpath = "//a[text()='11']")// need to change 
	public static WebElement Cal_date;
	@FindBy(xpath = "//*[@id=\"GlobalCalendar-sidebar\"]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[3]")// need to change
	public static WebElement created_evnt;
	
	public static void validate_calendar() throws Exception {
		LoginPage loginobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		loginobj.validlogin();
		ActiveJobs actjobsobj = PageFactory.initElements(MyWebutil.driver, ActiveJobs.class);
		actjobsobj.click_on_active_jobs();
		Thread.sleep(3000);
//		PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//		MyWebutil.closetutorial();
		Thread.sleep(3000);
		MyWebutil.Click(Events_tab, "click on event tab");
		Thread.sleep(3000);
		MyWebutil.Click(Add_Event_btn, "Click on add event button");
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
		MyWebutil.Click(ClickOnCalendarTab, "ClickOnCalendarTab");
        Thread.sleep(3000);
		/*----------------------------------till here code fine--------------------------------------------------------------*/
		
//        
//        MyWebutil.Click(Cal_date, "click on calendar date ");
//		Thread.sleep(3000);
//		//WebElement randomtext=findElement(By.xpath("//div[text()='"+eventtxt+"']")), "Random User");
//
//		MyWebutil.validateText(created_evnt, eventtxt);
//		
//		
//		MyWebutil.Click(MyWebutil.driver.findElement(By.xpath("//div[contains(text(),'"+"07:30" +" ')]")), "click on calender date");
//		//Thread.sleep(3000);
//		MyWebutil.Click(editinformation, "click edit button");
	}

}



