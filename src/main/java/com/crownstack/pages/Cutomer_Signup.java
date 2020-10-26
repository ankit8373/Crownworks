package com.crownstack.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crownstack.mywebutil.MyWebutil;
public class Cutomer_Signup {
	//div[@id='myHeader']//span[text()='Consumer']
	@FindBy(xpath = "//div[@id='myHeader']//a[text()='FOR CONSUMERS']")
	public static WebElement Cunsumer_btn;
	@FindBy(xpath = "//button[text()='CONTACT US ']")
	public static WebElement Reg_withus;
	@FindBy(xpath = "//*[@id=\"myDIV\"]/ul/li/div[2]")
	public static WebElement CustomerName;
	public void valid_customer_signup() throws InterruptedException
	{
		    // MyWebutil.OpenUrl("https://dev.gotasker.build-release.com/");
		     MyWebutil.jsClick(Cunsumer_btn);
	         Thread.sleep(3000);
	         MyWebutil.Click(Reg_withus,"click on register with Us");
	         Thread.sleep(3000);
	         SignupPageNew signupobj = PageFactory.initElements(MyWebutil.driver, SignupPageNew.class);
	         String fname = signupobj.SendInvitation();
	         MailinatorPage_Owner  mnatorObj=PageFactory.initElements(MyWebutil.driver, MailinatorPage_Owner.class);
	         mnatorObj.emailMailVerification(fname);
	         Thread.sleep(3000);
	          System.out.println(fname);
	          String actname =MyWebutil.gettext(CustomerName).replaceAll("[^a-zA-Z]", "");
	          System.out.println("Actname :"+ actname);
	        //  boolean result = MyWebutil.UserNameValidation(actname, fname);
	        //  System.out.println(result);
	        // MyWebutil.validateText(CustomerName,StringBuffer.class);
	}
}
