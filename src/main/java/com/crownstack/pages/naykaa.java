package com.crownstack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naykaa {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();

	  driver.navigate().to("https://www.nykaa.com/giftcard/list?ptype=giftcard");

	  driver.manage().window().maximize();

	  driver.findElement(By.xpath("//button[contains(.,\'SEND\')]")).click();

	  driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("Recipent Name");

	  driver.findElement(By.xpath("//input[@placeholder=\"Recipient’s Phone or Email\"]")).sendKeys("Recipient@test.com");

	  driver.findElement(By.xpath("//button[text()=\"250\"]")).click();

	  driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Test Name");

	  driver.findElement(By.xpath("//input[@placeholder=\"Email ID\"]")).sendKeys("9999999999");

	  driver.findElement(By.xpath("//button[contains(text(),\"PAY\")]")).click(); 

}
	
}
