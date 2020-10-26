package com.crownstack.Campaign;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crownstack.mywebutil.MyWebutil;
import com.crownstack.pages.ClientLogin;
import com.crownstack.pages.HandleSSL;
import com.crownstack.pages.MailinatorPage_Owner;
import com.crownstack.pages.SignupPageNew;
public class EQ_ClientQuotes {
	@FindBy(xpath = "//div[text()='Express Quote']")
	public static WebElement Exp_Quote;
	@FindBy(xpath = "//span[text()='Clients Quotes']")
	public static WebElement Client_Quote;
	@FindBy(xpath="//span[@class='name editLinkButton']")
	public static WebElement Addnewclient;
	@FindBy(xpath="//input[@id='name']")
	public static WebElement F_Name_txt;
	@FindBy(xpath="//input[@id='last_name']")
	public static WebElement L_Name_txt;
	@FindBy(xpath="//input[@id='email']")
	public static WebElement inputrandomemailid_expressquote;
	@FindBy(xpath = "//input[@type='checkbox']")
	public static WebElement Chek_bx;
	@FindBy(xpath="//button[@class='button']")
	public static WebElement sendinvite;
	@FindBy(xpath = "//span[text()='getta ']")
	public static WebElement srch_rsult;
	@FindBy(xpath = "//div[@class=\"TTU icon\"]")
	public static WebElement Top_project_card;
	// suspected
	@FindBy(xpath = "//button[@class='sc-bdVaJa cYQqRL sc-bxivhb eTpeTG']")
	public WebElement CloseTutorialButton;
	@FindBy (xpath="(//div[@class='fL'])[1]")
	public  WebElement Mouseoveronprofile;
	@FindBy (xpath="//*[contains(text(),'Logout')]")
	public  WebElement Logout;
	@FindBy (xpath = "//input[@id='session_email']")
	public static WebElement Enter_pwd_fld;
	@FindBy(xpath = "//input[@id='session_password']")
	public static WebElement confirm_pwd_fld;
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement Choose_pwd_btn;
	@FindBy(xpath="//div[@class='BrandCard-content']//button")
	public static WebElement Accept;
	/*------------------------------------------------------*/
	public void valid_EQ_ClientQuotes() throws InterruptedException
	{
//		MyWebutil.OpenUrl("https://qa.gotasker.build-release.com/registration/organization/sign_up");
//		HandleSSL HSSLobj = PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		HSSLobj.securityHandler();
//		SignupPageNew signupObj=PageFactory.initElements(MyWebutil.driver, SignupPageNew.class);
//		String email = signupObj.validB_Ownersignup();
//		MailinatorPage_Owner mailiObj =PageFactory.initElements(MyWebutil.driver, MailinatorPage_Owner.class);
//		mailiObj.emai_verification_EQ_clientQuote(email);
		Thread.sleep(3000);
		MyWebutil.Click(Exp_Quote, "click on express Quote");
		Thread.sleep(3000);
		MyWebutil.driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
		String winHandleBefore = MyWebutil.driver.getWindowHandle();
		Set<String> handle= MyWebutil.driver.getWindowHandles();
		for(String mywindows : handle)
		{
			String myTitle = MyWebutil.driver.switchTo().window(mywindows).getTitle();
			if(myTitle.equals("gotasker | The Perfect Tool to Manage Your Service Business")){
				// perform some action - as here m openning a new url
				//  MyWebutil.driver.get("https://qa.gotasker.build-release.com/dashboard/transaction/prospects");
			}else{
				MyWebutil.driver.switchTo().window(winHandleBefore);
			}
		}
		MyWebutil.Click(Client_Quote, "click on Client Quote");
		/*--------------------------------------------------------------------------------*/
		String FirstName;
		String LastName;
		String client_pwd="12345678";
		MyWebutil.Click(Addnewclient, "Add New Client");
		Thread.sleep(3000);
		FirstName = MyWebutil.RandomString(5);	
		MyWebutil.sendKeys(F_Name_txt, FirstName, "Random First Name");
		LastName = MyWebutil.RandomString(5);	
		MyWebutil.sendKeys(L_Name_txt, LastName, "Random Last Name");		
		Thread.sleep(3000);
		String fEmail = FirstName+LastName+"@mailinator.com";
		Thread.sleep(3000);
		MyWebutil.sendKeys(inputrandomemailid_expressquote, fEmail, "fill Random Email_ID");
		Thread.sleep(3000);
		MyWebutil.Click(sendinvite, "Send_Invite Button");
		Thread.sleep(3000);
		MyWebutil.logout(Mouseoveronprofile, Logout);
		Thread.sleep(3000);
		MyWebutil.driver.close();
		MyWebutil.switchWindowFocusByTitle("gotasker | The Perfect Tool to Manage Your Service Business");
		MailinatorPage_Owner mailObj=PageFactory.initElements(MyWebutil.driver, MailinatorPage_Owner.class);
		mailObj.email_verification_EQ_client_Quote(fEmail);
		MyWebutil.switchWindowFocusByTitle("gotasker | The Perfect Tool to Manage Your Service Business");
		Thread.sleep(3000);
		MyWebutil.sendKeys(Enter_pwd_fld, client_pwd, " Password field");
		Thread.sleep(3000);
		MyWebutil.sendKeys(confirm_pwd_fld, client_pwd, "Confirm password field");
		Thread.sleep(3000);
		MyWebutil.Click(Choose_pwd_btn, "Choose password button");
		Thread.sleep(3000);
		//--------------------------------------------------------------------------/
		Thread.sleep(3000);
	    MyWebutil.ActionScroll();
	    Thread.sleep(3000);
	    MyWebutil.Click(Accept, "Accept button");
		//MyWebutil.jsClick(CloseTutorialButton);
		//MyWebutil.Click(CloseTutorialButton, "Close Tutorial Button");
		Thread.sleep(3000);
		MyWebutil.logout(Mouseoveronprofile, Logout);
		Thread.sleep(3000);
		ClientLogin clientloginObj = PageFactory.initElements(MyWebutil.driver, ClientLogin.class );
		clientloginObj.valid_client_login(fEmail, client_pwd);
		/*--------------------------------------------------------------------------------*/
		//MyWebutil.Click(Client_Quote, "click on Client Quote");
		//Contacts contactObj=PageFactory.initElements(MyWebutil.driver, Contacts.class);
		//contactObj.valid_contacts();
		System.out.println(fEmail);
	}
}