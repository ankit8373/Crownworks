package com.crownstack.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crownstack.mywebutil.MyWebutil;
import com.crownstack.pages.LoginPage;
import com.crownstack.pages.dashboard.Dashboard;




public class LoginTestcase {

	@Test
	public static void main(String[] args) throws InterruptedException{
		
		MyWebutil.BrowserLaunch("chrome");
		MyWebutil.OpenUrl(" https://qa.gotasker.build-release.com");
		LoginPage logobj=PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();
		MyWebutil.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Dashboard dashboardobj=PageFactory.initElements(MyWebutil.driver, Dashboard.class);
		dashboardobj.validatedashboard();
		
	}
	
	
	
	
	
	
}
