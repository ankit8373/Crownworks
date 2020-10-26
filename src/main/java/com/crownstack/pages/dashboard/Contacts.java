package com.crownstack.pages.dashboard;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.crownstack.mywebutil.MyWebutil;
import com.crownstack.pages.LoginPage;
import com.crownstack.pages.MailinatorPage_CLient;
import com.crownstack.pages.YopMailPage_SetPass;
public class Contacts {
	@FindBy(xpath = "//input[@id='session_email']")
	public static WebElement username;
	@FindBy(xpath = "//input[@id='session_password']")
	public static WebElement password;
	@FindBy(xpath = "//input[@class='Button Button--primary']")
	public static WebElement signin;
	@FindBy(xpath = "//span[text()='Dashboard']")
	public static WebElement DashboardClick;
	@FindBy(xpath = "//button[@class='sc-bdVaJa cYQqRL sc-bxivhb eTpeTG']")
	public WebElement CloseTutorialButton;
	@FindBy(xpath = "//div[contains(text(),'Contacts')]")
	public static WebElement Contacts;
	@FindBy(xpath = "//span[contains(text(),'Clients')]")
	public static WebElement Clients;
	@FindBy(xpath = "//span[contains(text(),'Tech/Subs')]")
	public WebElement Tech_Subs;
	@FindBy(xpath = "(//li[@class='list '])[3]")
	public WebElement Managers;
	@FindBy(xpath = "(//li[@class='list '])[3]")
	public WebElement Organizations;
	@FindBy(xpath = "//button[contains(text(),'Add client')]")
	public WebElement AddClient;
	@FindBy(xpath="//button[contains(text(),'Add Manager')]")
	public WebElement AddManager;
	@FindBy(xpath = "//button[contains(text(),'Add Subcontractor')]")
	public WebElement AddSubcontractor;
	@FindBy(xpath = "//input[@id='name']")
	public WebElement NameField;
	@FindBy(xpath = "//input[@id='last_name']")
	public WebElement lastNameField;
	@FindBy(xpath = "//input[@id='email']")
	public WebElement inputrandomemailid_Contacts;
	@FindBy(xpath = "//button[contains(text(),'Send Invite')]")
	public WebElement SendInviteButton;
	@FindBy(xpath = "(//div[@class='fL'])[1]")
	public WebElement Mouseoveronprofile;
	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	public WebElement Logout;
	@FindBy(xpath = "//input[@id='login']")
	public WebElement YopmailField;
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement YopmailSubmit;
	@FindBy(xpath = "//a[contains(text(),'Click here')]")
	public WebElement InvitationClickHere;
	@FindBy(xpath = "//input[@id='session_email']")
	public WebElement ClientPass;
	@FindBy(xpath = "//input[@id='session_password']")
	public WebElement ClientPassConf;
	@FindBy(xpath = "//input[@name='commit']")
	public WebElement Commit;
	@FindBy(xpath = "//iframe[@id='ifmail']")
	public WebElement SwitchIframe;
	@FindBy(xpath = "//div[@class='BrandCard-content']//button")
	public WebElement Accp;
	@FindBys(@FindBy(xpath = "//td[contains(text(), '@yopmail.com')]"))
	public List<WebElement> emailListWe;
	@FindBy(xpath = "(//a[text()='LOGIN'])[2]")
	public WebElement Main_Login;
	public String validateContacts() throws Exception {
		// CloseSecondTab();
		// MyWebutil.Click(Main_Login, "Main Screen Log In");
		// Thread.sleep(3000);
		// MyWebutil.Click(DashboardClick, "DashboardClick");
		// Thread.sleep(2000);
		// MyWebutil.Click(CloseTutorialButton, "Close Tutorial");
		Thread.sleep(2000);
		MyWebutil.Click(Contacts, "Contacts Button");
		Thread.sleep(3000);
		MyWebutil.Click(Clients, "Clients Button");
		Thread.sleep(3000);
		MyWebutil.Click(AddClient, "AddClient Button");
		Thread.sleep(3000);
		String FirstName = MyWebutil.RandomString(4);
		MyWebutil.sendKeys(NameField, FirstName, "Random Name Field");
		String lastName = MyWebutil.RandomString(4);
		MyWebutil.sendKeys(lastNameField, lastName, "Random Last Name Field");
		Thread.sleep(3000);
		String fMail = FirstName + lastName + "@mailinator.com";
		System.out.println(fMail);
		MyWebutil.sendKeys(inputrandomemailid_Contacts, fMail, "Random Email ID with First Name and Last Name");
		Thread.sleep(3000);
		MyWebutil.Click(SendInviteButton, "Send Invite Button");
		logout();
		// return  fEmail;
		MailinatorPage_CLient yopObj = PageFactory.initElements(MyWebutil.driver, MailinatorPage_CLient.class);
		yopObj.emailMailVerification(fMail);
		MyWebutil.sendKeys(ClientPass, "xyz123", "Owner Password");
		Thread.sleep(3000);
		MyWebutil.sendKeys(ClientPassConf, "xyz123", "Owner Password Confirmation");
		Thread.sleep(3000);
		MyWebutil.Click(Commit, "Commit Button");
		Thread.sleep(3000);
		MyWebutil.ActionScroll();
		Thread.sleep(3000);
		MyWebutil.Click(Accp, "Accept Button");
		logout();
		// return fMail;
		LoginPage logobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();
		Thread.sleep(3000);
		MyWebutil.Click(Contacts, "Contacts Button");
		Thread.sleep(3000);
		MyWebutil.Click(Tech_Subs, "Tech_Subs Button");
		Thread.sleep(3000);
		MyWebutil.Click(AddSubcontractor, "AddSubcontractor Button");
		Thread.sleep(3000);
		String FirstNameTech = MyWebutil.RandomString(4);
		MyWebutil.sendKeys(NameField, FirstNameTech, "Random Name Field");
		String lastNameTech = MyWebutil.RandomString(4);
		MyWebutil.sendKeys(lastNameField, lastNameTech, "Random Last Name Field");
		Thread.sleep(3000);
		String fMailinator = FirstNameTech + lastNameTech + "@mailinator.com";
		System.out.println(fMailinator);
		MyWebutil.sendKeys(inputrandomemailid_Contacts, fMailinator, "Random Email ID with First Name and Last Name");
		Thread.sleep(3000);
		MyWebutil.Click(SendInviteButton, "Send Invite Button");
		logout();
		// return fEmail;
		MailinatorPage_CLient Obj = PageFactory.initElements(MyWebutil.driver, MailinatorPage_CLient.class);
		Obj.emailMailVerification(fMailinator);
		MyWebutil.sendKeys(ClientPass, "xyz123", "Owner Password");
		Thread.sleep(3000);
		MyWebutil.sendKeys(ClientPassConf, "xyz123", "Owner Password Confirmation");
		Thread.sleep(3000);
		MyWebutil.Click(Commit, "Commit Button");
		Thread.sleep(3000);
		MyWebutil.ActionScroll();
		Thread.sleep(3000);
		MyWebutil.Click(Accp, "Accept Button");
		logout();
		// Add Organization Now
		LoginPage logobjt = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobjt.validlogin();
		Thread.sleep(3000);
		MyWebutil.Click(Contacts, "Contacts Button");
		Thread.sleep(3000);
	//	MyWebutil.Click(Managers, "Managers");
		MyWebutil.jsClick(Managers);
		Thread.sleep(3000);
		MyWebutil.Click(AddManager, "AddManager");
		Thread.sleep(2000);
		String FirstNameMA = MyWebutil.RandomString(4);
		MyWebutil.sendKeys(NameField, FirstNameMA, "Random Name Field");
		String lastNameMA = MyWebutil.RandomString(4);
		MyWebutil.sendKeys(lastNameField, lastNameMA, "Random Last Name Field");
		Thread.sleep(3000);
		String fMailinatrs = FirstNameMA + lastNameMA + "@mailinator.com";
		System.out.println(fMailinatrs);
		MyWebutil.sendKeys(inputrandomemailid_Contacts, fMailinatrs, "Random Email ID with First Name and Last Name");
		Thread.sleep(3000);
		MyWebutil.Click(SendInviteButton, "Send Invite Button");
		logout();
		// return fEmail;
		MailinatorPage_CLient Objtv = PageFactory.initElements(MyWebutil.driver, MailinatorPage_CLient.class);
		Objtv.emailMailVerification(fMailinatrs);
		MyWebutil.sendKeys(ClientPass, "xyz123", "Owner Password");
		Thread.sleep(3000);
		MyWebutil.sendKeys(ClientPassConf, "xyz123", "Owner Password Confirmation");
		Thread.sleep(3000);
		MyWebutil.Click(Commit, "Commit Button");
		Thread.sleep(3000);
		MyWebutil.ActionScroll();
		Thread.sleep(3000);
		MyWebutil.Click(Accp, "Accept Button");
		logout();
		return fMailinatrs;
	}
	public void validateInvitationContacts(String randomEmailId) throws InterruptedException {
		MyWebutil.Click(Contacts, "Contacts Button");
		Thread.sleep(3000);
		MyWebutil.Click(Clients, "Clients Button");
		Thread.sleep(3000);
		//////////////// Matching of newly generated
		//////////////// Client'sEmail_ID////////////////
		boolean flag = false;
		for (WebElement weMailName : emailListWe) {
			String emailText = weMailName.getText().trim();
			if (emailText.equalsIgnoreCase(randomEmailId)) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Your Client Name EXISTS in Clients List");
		} else {
			System.out.println("Your Client Name DOESN'T exist in Clients List");
		}
		logout();
	}
	public static void CloseSecondTab() {
		WebDriver driver = null;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		// below code will switch to 3rd tab
		driver.switchTo().window(tabs.get(1));
		// close the tab
		driver.close();
		// Switch back to your original tab
		driver.switchTo().window(tabs.get(0));
	}
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		for (int i = 0; i <= 4; i++) {
			try {
				MyWebutil.mouseover(Mouseoveronprofile);
				Thread.sleep(2000);
				MyWebutil.Click(Logout, "Log Out");
				break;
			} catch (Exception e) {
			}
		}
	}
}