package com.crownstack.mywebutil;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crownstack.testcase.Testscript;
import com.google.common.io.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MyWebutil{

	
	@FindBy(xpath = "//button[@class='sc-bdVaJa cYQqRL sc-bxivhb eTpeTG']")
	public static WebElement CloseTutorialButton;
	

	public static Map<String,String> data;
	public static WebDriver driver;
	private static Workbook workbook;
	public static ExtentTest testlogger;
	
	public static void main(String[] args) throws InterruptedException {
		BrowserLaunch("chrome");
		Thread.sleep(2000);
		MyWebutil.OpenUrl("https://facebook.com");
	}
	public static WebDriver BrowserLaunch(String BrowserName) throws InterruptedException {


		if (BrowserName.equalsIgnoreCase("Chrome"
				)) {
			
				
			System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
			driver = new ChromeDriver();
		
			System.out.println("pass");
			driver.manage().window().maximize();

		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Gotasker/Drivers/geckodriver.exe");
			//driver= new FirefoxDriver();

		} else if (BrowserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "/Gotasker/Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("Browser Name is Wrong");
		}

		driver.manage().window().maximize();
		return driver;

	}

public void ddd() {
	
}


	public static void sendKeys(WebElement element,String value, String elementName){
		testlogger=Testscript.logger;
		element.sendKeys(value);

		testlogger.log(Status.INFO, value+" entered successfully in "+elementName+" Textbox");

	}

	public static void jsSendKeys(WebElement element,String value, String elementName){
		testlogger=Testscript.logger;
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].value='"+value+"'", element);

		testlogger.log(Status.INFO, value+" entered successfully in "+elementName+" Textbox");

	}


	public static void Click(WebElement element, String elementName){
		try {
			element.click();
			
		}catch( ElementNotInteractableException e) {
			try {
				Thread.sleep(5000);
				element.click();
				
			}catch( Exception ne) {
				jsClick(element);
			}
		}
		testlogger=Testscript.logger;
		testlogger.log(Status.INFO, "clicked successfully on "+elementName);
	}

	public static void OpenUrl(String url) {

		driver.get(url);
	}

	public static Map getExcelData(String TestCaseId, String SheetName) throws IOException {
		String filepath = "./src/main/resources/TestData/TestData.xlsx";
		FileInputStream fls = new FileInputStream(new File(filepath));

		if (filepath.contains("xlsx") == true) {
			workbook = new XSSFWorkbook(fls);
		} else if (filepath.contains("xls") == true) {
			workbook = new HSSFWorkbook(fls);
		}
		Sheet sheet = workbook.getSheet(SheetName);
		int rowSize = sheet.getLastRowNum();
		data = new HashMap<String, String>();
		Row row;
		int desiredRow = 0;
		for (int i = 0; i <= rowSize; i++) {

			row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			if (cell.getStringCellValue().equalsIgnoreCase(TestCaseId)) {
				desiredRow = i;
				break;
			}
		}
		Row row1 = sheet.getRow(desiredRow);
		int cellSize = row1.getLastCellNum();
		for (int j = 1; j <= cellSize; j = j + 2) {
			Cell cell = row1.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String FieldName = cell.getStringCellValue();

			Cell cell2 = row1.getCell(j + 1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String FieldValue = cell2.getStringCellValue();

			data.put(FieldName, FieldValue);
		}
		return data;

	}



	public static void mouseover(WebElement element   ){
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
	}
	public static void Selectbyvalue(WebElement element ,String value){
		Select selctobj=new Select(element);
		selctobj.selectByValue(value);
	}

	public static void selectbyvisbletext(WebElement element ,String text){
		Select selctobj = new Select(element);
		selctobj.selectByVisibleText(text);
	}

	public static void selectbyindexing(WebElement element ,String indexing){
		Select selctobj=new Select(element);
		selctobj.selectByValue(indexing);
	}
	public static void jsScroll(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
	}
	public static void keys(WebElement element){
		element.sendKeys(Keys.ENTER);

	}
	public static void jsscrolldown(WebElement element){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void ActionScroll(){

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();

	}

	//	public static void randomemailaddressgen(WebElement we){
	//		we.click();  
	//		Random randomGenerator = new Random();  
	//		int randomInt = randomGenerator.nextInt(10000);  
	//		we.sendKeys("xyz"+ randomInt +"@yopmail.com");   
	//	}
	//	

	public static String RandomString( int length) {

		StringBuilder str = new StringBuilder(RandomStringUtils.randomAlphabetic(length));
		int idx = str.length()-8;

		while (idx > 0) {
			str.insert(idx, "");
			idx = idx-8;
		}
		return str.toString();

	}


	public static void HandleIframe(WebElement element){
		driver.switchTo().frame(element);
	}

	public static void switchWindowFocusByTitle(String title) {
		try{
			Set<String> handleValues=driver.getWindowHandles();
			for(String handleValue:handleValues){
				driver.switchTo().window(handleValue);	
				if(driver.getTitle().trim().equalsIgnoreCase(title)){
					break;
				}
			}
		}catch(Exception e){
			//logger.debug( Constants.ELEMENT_SEARCH_ERROR_MESSAGE, e);
		}
	}


	public static void HandleIframe(int num){
		driver.switchTo().frame(num);
	}

	

	public  static void validateText(WebElement we, String expectedText){
		String actualText=we.getText();
		if(actualText.trim().equalsIgnoreCase(expectedText.trim())){
			//Testscript.logger.log(Status.PASS, MarkupHelper.createLabel("Validation PASSED.  Actual:- "+actualText+",  Expected:- "+expectedText, ExtentColor.GREEN));	
		}else{
			Assert.assertEquals(actualText, expectedText);
		}
	}
//	public static boolean UserNameValidation(String ActualText,String ExpectedText)
//	{
//		if (ActualText.equalsIgnoreCase(ExpectedText))
//			// Testscript.logger.log(Status.PASS, MarkupHelper.createLabel("Validation PASSED.  Actual:- "+ActualText+",  Expected:- "+ExpectedText, ExtentColor.GREEN));	
//		{
//			return true;
//		}
////		return false;
//	}

	public static String takeScreenShot(String testName) {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=null;	
		try {		
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh_mm_ss");
			String timeStamp = formatter.format(calendar.getTime());

			destFile=new File(System.getProperty("user.dir")+File.separator+"test-output"+ File.separator+testName+"_"+timeStamp+".png");		
			Files.copy(scrFile, destFile);		
		} catch (Exception e) {		

		}		
		return destFile.getAbsolutePath();	
	}

	public static void clear(WebElement element){
		element.clear();
	}

	public static void launchApplication(){

	}


	public static boolean waitUntilElementVisible(WebElement we, int timeOut, String ElementName) {	
		int timeTaken=0;
		boolean flag=false;
		for(int i=1; i<=timeOut;i++){
			try{
				if(we.getSize().getHeight()>0 || we.getSize().getWidth()>0){
					driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
					flag=true;
					break;
				}
			}catch(Exception e){
				timeTaken=timeTaken+1;
			}

		}
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		if(!flag){
			Testscript.logger.log(Status.WARNING, MarkupHelper.createLabel(ElementName+" searched until "+"120"+" seconds but not found the element", ExtentColor.BLUE));	

			return false;
		}else{
			return true;
		}



	}
	public static void logout(WebElement mouseoverelement ,WebElement logoutelement ) throws InterruptedException {
		Thread.sleep(3000);
		for (int i = 0; i <= 4; i++) {
			try {
				MyWebutil.mouseover(mouseoverelement);
				Thread.sleep(3000);
				MyWebutil.Click(logoutelement, "Log out");
				break;
			} catch (Exception e) {
			}
		}
	
}
	public static String gettext(WebElement element)
	{
		testlogger=Testscript.logger;
		String text = element.getText();
		return text;
	}	
	
	public static void jsClick( WebElement element){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public static void clickonmyprofile(WebElement mouseoverelement ,WebElement myprofileelement ) throws InterruptedException {
		Thread.sleep(3000);
		for (int i = 0; i <= 4; i++) {
			try {
				MyWebutil.mouseover(mouseoverelement);
				Thread.sleep(3000);
				MyWebutil.Click(myprofileelement, "myprofileelement");
				break;
			} catch (Exception e) {
			}
		}
	
}
	public static void closewindow (WebDriver driver) {
		driver.close();
	}
	public static void closetutorial() {
		boolean status = false;
		try {
		

			status = CloseTutorialButton.isDisplayed();
		} catch (Exception e) {

		}
		
			MyWebutil.Click(CloseTutorialButton, "Login Button");
		

	}
	public static void mouseovertrycatch(WebElement mouseoverelement  ) throws InterruptedException {
		Thread.sleep(3000);
		for (int i = 0; i <= 4; i++) {
			try {
				MyWebutil.mouseover(mouseoverelement);
				Thread.sleep(3000);
				
				break;
			} catch (Exception e) {
			}
		}
	
}
}



