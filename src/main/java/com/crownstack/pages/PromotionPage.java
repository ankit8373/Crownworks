package com.crownstack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.crownstack.mywebutil.MyWebutil;

import okio.Buffer;

public class PromotionPage {
	@FindBy(xpath = "//span[@id='promotion']")
	WebElement PromotionClick;
	@FindBy(xpath = "//button['actionButton ']")
	WebElement AddButton;
	@FindBy(xpath = "//*[contains(text(),'Add New Promotions')]")
	WebElement AddNewPromotions;
	@FindBy(xpath = "//input[@name='promotion_title']")
	WebElement PromotionTitle;
	@FindBy(xpath = "//textarea[@name='promotion_description']")
	WebElement PromotionDescription;
	@FindBy(xpath = "//input[@name='promotion_url']")
	WebElement URL;
	@FindBy(xpath = "//select[@name='promotion_category']")
	WebElement DropDownCategory;
	
	@FindBy(xpath = "//input[@class='inputs dateInput']")
	WebElement FromDate;
	
	@FindBy(xpath = "(//div[contains(@class,'react-datepicker__day--today')])[last()]")
	WebElement currentDateCalendar;
	
		@FindBy(xpath = "(//input[@class='inputs dateInput'])[last()]")	
	WebElement DateTo;
	
	@FindBy(xpath = "//label[text()='Upload image']")
	WebElement UploadImageText;

	@FindBy(xpath = "//input[@name='imageUpload']")
	WebElement ImageUpload;
	@FindBy(xpath = "//button[@class='button save-btn save-btn']")
	WebElement ButtonClick;
	@FindBy(xpath = "//span[text()='OK']")
	WebElement OKbutton;
	@FindBy(xpath = "//div[text()='Posted By You']")
	WebElement PostedByYouTAb;
	@FindBy(xpath = "(//div[@class='fL'])[1]")
	public WebElement Mouseoveronprofile;

	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	public WebElement Logout;

	public void ValidatePromotion() throws Exception {
		MyWebutil.Click(PromotionClick, "Promotion-Click");
		Thread.sleep(3000);
		MyWebutil.mouseover(AddButton);
		Thread.sleep(3000);
		MyWebutil.Click(AddNewPromotions, "AddNew-Promotions");
		Thread.sleep(3000);
		String ranPromoTitle = MyWebutil.RandomString(7);
		MyWebutil.sendKeys(PromotionTitle, ranPromoTitle, "Promotion-Title");
		Thread.sleep(2000);
		MyWebutil.sendKeys(PromotionDescription, "Gotasker descrption promotion added ", "Promotion-Description");
		Thread.sleep(2000);
		MyWebutil.sendKeys(URL, "www.google.com", "URl-Title");
		Thread.sleep(3000);
		MyWebutil.selectbyvisbletext(DropDownCategory, "Service Specials");
		Thread.sleep(2000);
		
		MyWebutil.Click(FromDate, "FromDate");
		Thread.sleep(1000);
		MyWebutil.Click(currentDateCalendar, "FromDate");
		
		Thread.sleep(1000);
		
		MyWebutil.Click(DateTo, "DateTo");
		Thread.sleep(1000);
		MyWebutil.Click(currentDateCalendar, "Todate");
	Thread.sleep(2000);
//		//C:/Users/Naveen/Desktop/Wrkspace/GoTasker/Gotasker/GoTaskerLogo.png
	MyWebutil.sendKeys(ImageUpload, "C:/Users/Ankit/Desktop/GoTasker/Gotasker/GoTaskerLogo.png","ImageUpload");
				
		Thread.sleep(2000);
		MyWebutil.Click(ButtonClick, "Button-Click");
		Thread.sleep(3000);
		MyWebutil.Click(OKbutton, "OK-button");
		Thread.sleep(2000);
		MyWebutil.Click(PostedByYouTAb, "PostedByYouTAb");
		Thread.sleep(3000);

		// MyWebutil.jsScroll();
		MyWebutil.driver.findElement(By.xpath("//h3[text()='" + ranPromoTitle + "']"));
		System.out.println("validate Promotion Title =" + ranPromoTitle);
		
		
		MyWebutil.logout(Mouseoveronprofile, Logout);
		
		
	
		
		

	}

}
