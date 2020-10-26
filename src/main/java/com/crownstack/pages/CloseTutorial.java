package com.crownstack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crownstack.mywebutil.MyWebutil;

public class CloseTutorial {

	@FindBy (xpath="//div[text()=' Next']")
	public WebElement nextbutton;
	
	
	
	public void validclosetutorial() {
		MyWebutil.Click(nextbutton, "nextbutton");
		
		
		
	}
}
