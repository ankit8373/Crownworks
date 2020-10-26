package com.crownstack.pages.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crownstack.mywebutil.MyWebutil;

public class Dashboard {
	//*[@id='root']/div[4]/div[1]/ul/li/div/div[1]/div[1]/ul/a[2]/li/div[2]

@FindBy(xpath="//*[contains(text(),'Active Jobs')]")
public  WebElement activejobs; 
@FindBy(xpath="//input[@id='searchInput']")
public  WebElement Searchbar; 
@FindBy(xpath="//*[@id='myTable']/ul/a[5]/li/div/div/span")
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
//@FindBy (xpath="//button[@class='sc-bxivhb eTpeTG sc-bdVaJa cYQqRL']")
//public  WebElement CloseTutorialButton;
@FindBy (xpath="//li[contains(text(),'Tech/Subs')]")
public  WebElement Tech_SubsTab;
//@FindBy (xpath="//div[@class='select__indicator select__dropdown-indicator css-tlfecz-indicatorContainer']")
//public  WebElement Subcontractordropdown;
@FindBy (xpath="//div[@class='select__value-container css-1hwfws3']")
public  WebElement search_subcontractorclick;

@FindBy (xpath="//input[@id='react-select-2-input']")
public  WebElement search_subcontractorvalue;


@FindBy (xpath="//button[@class='Button Button--primary save-btn  ']")
public  WebElement AddSubcontractor;
	

@FindBy (xpath="(//span[@class='Button-linkLabel'])[2]")
public  WebElement Nomessage;

@FindBy (xpath="(//div[@class='fL'])[1]")
public  WebElement Mouseoveronprofile;

@FindBy (xpath="//*[contains(text(),'Logout')]")
public  WebElement Logout;

	public  void validatedashboard() throws InterruptedException{
		MyWebutil.Click(activejobs ,"");
		Thread.sleep(3000);
		MyWebutil.sendKeys(Searchbar, "test" ,"Searchbar" );
		Thread.sleep(3000);
		MyWebutil.Click(Searchtest ,"Searchtest");
		Thread.sleep(3000);
		MyWebutil.mouseover(AddButton);
		Thread.sleep(3000);
		MyWebutil.Click(addnewservices,"addnewservices");
		Thread.sleep(3000);
		MyWebutil.sendKeys(ServiceDescription, "xyz","ServiceDescription");
		Thread.sleep(3000);
		MyWebutil.Click(CreateServiceButton,"CreateServiceButton");
		Thread.sleep(3000);
		MyWebutil.Click(ClickOnService ,"ClickOnService");
		//Thread.sleep(3000);
		//MyWebutil.Click(CloseTutorialButton);
		Thread.sleep(3000);
		MyWebutil.Click(Tech_SubsTab ,"Tech_SubsTab");
		Thread.sleep(3000);
		MyWebutil.Click(search_subcontractorclick,"search_subcontractorclick");
		Thread.sleep(3000);
		MyWebutil.sendKeys(search_subcontractorvalue, "Techs h","search_subcontractorvalue");
		Thread.sleep(3000);
		MyWebutil.keys(search_subcontractorvalue);
		Thread.sleep(3000);
		MyWebutil.Click(AddSubcontractor,"AddSubcontractor");
		Thread.sleep(3000);
		MyWebutil.Click(Nomessage,"Nomessage");
		Thread.sleep(3000);
		MyWebutil.mouseover(Mouseoveronprofile);
		Thread.sleep(3000);
		MyWebutil.Click(Logout,"Logout");
		
	}
}
