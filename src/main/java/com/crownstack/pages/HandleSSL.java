package com.crownstack.pages;


  
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import com.crownstack.mywebutil.MyWebutil;
	public class HandleSSL {
		@FindBy(xpath = "//button[@id='details-button']")
		public static WebElement clickonadvancebutton;
		@FindBy(xpath = "//a[@id='proceed-link']")
		public static WebElement proceedtoqa;
		public static void securityHandler () {
			MyWebutil.Click(clickonadvancebutton, "clickonadvancebutton");
			MyWebutil.Click(proceedtoqa, "clickonadvancebutton");
		}
	}

