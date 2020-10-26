package com.crownstack.testcase;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crownstack.Campaign.EQ_ClientQuotes;
import com.crownstack.Campaign.Eq_ProspectQuotes;
//import com.crownstack.Campaign.Eq_ProspectQuotes;
import com.crownstack.mywebutil.MyWebutil;
import com.crownstack.pages.Calendar;
import com.crownstack.pages.Cutomer_Signup;
import com.crownstack.pages.HandleSSL;
import com.crownstack.pages.InboxPage;
import com.crownstack.pages.LoginPage;
import com.crownstack.pages.MailinatorPage_Owner;
import com.crownstack.pages.Project;
import com.crownstack.pages.PromotionPage;
import com.crownstack.pages.Shortcuts;
import com.crownstack.pages.SignupPage;
import com.crownstack.pages.SignupPageNew;
import com.crownstack.pages.YopMail_SignUp;
import com.crownstack.pages.dashboard.ActiveJobs;
import com.crownstack.pages.dashboard.Contacts;
import com.crownstack.pages.dashboard.ExpressQuote;
import com.crownstack.pages.dashboard.MyProfile;

public class Testscript {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;

	@AfterSuite
	public void afterSuite() {
		extent.flush();
	}

	@BeforeSuite
	public void beforeSuite() {
		String extentPath = System.getProperty("user.dir") + "/test-output/GoTaskerResults.html";
		htmlReporter = new ExtentHtmlReporter(extentPath);
		// Create an object of Extent Reports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setDocumentTitle("Go Tasker Result");
		// Name of the report
		htmlReporter.config().setReportName("Go Tasker Automation Execution Result (Web)");
		// Dark Theme
		htmlReporter.config().setTheme(Theme.STANDARD);

	}

	@BeforeMethod
	public void beforeMethod(Method testMethod) throws InterruptedException {
		// https://dev.gotasker.build-release.com/sign_in

		logger = extent.createTest(testMethod.getName());
		MyWebutil.BrowserLaunch("chrome");
		MyWebutil.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MyWebutil.OpenUrl("https://qa.gotasker.build-release.com/");

		// https://dev.gotasker.build-release.com

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {

		if (result.getStatus() == ITestResult.FAILURE) {

			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			String screenshotPath = MyWebutil.takeScreenShot(result.getName());
			// To add it in the extent report
			logger.fail("Test Case Failed Snapshot is below " + logger.addScreenCaptureFromPath(screenshotPath));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		}

	MyWebutil.driver.close();
	MyWebutil.driver.quit();	

	}

	 @Test(priority=1) //pass
	public void validateInbox_TC_001() throws Exception {
//		HandleSSL handleobj=PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		handleobj.securityHandler();
		LoginPage logobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();
//		PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//	MyWebutil.closetutorial();
		InboxPage inbxObj = PageFactory.initElements(MyWebutil.driver, InboxPage.class);
		inbxObj.validatedashboard();
	}

	 @Test (priority = 2)
	public void validateActiveJobs_TC_002() throws InterruptedException {
//		
//		HandleSSL handleobj=PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		handleobj.securityHandler();

		LoginPage logobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();

//		
//	PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//	MyWebutil.closetutorial();
		ActiveJobs ActiveJobsobj = PageFactory.initElements(MyWebutil.driver, ActiveJobs.class);
		ActiveJobsobj.validatedashboard();
	}

	 @Test (priority = 3)//pass
	public void validateContacts_TC_003() throws Throwable {
		// logger = extent.createTest("validate Contacts");
//		HandleSSL handleobj=PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		handleobj.securityHandler();
//		
		LoginPage logobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();
//		PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//		MyWebutil.closetutorial();
		Contacts Contactsobj = PageFactory.initElements(MyWebutil.driver, Contacts.class);
		String fullName = Contactsobj.validateContacts();
		logobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();

		Contactsobj.validateInvitationContacts(fullName.replaceAll(" ", "") + "@mailinator.com");
	}

	 @Test (priority = 4)
	public void validateExpressQuotes_TC_004() throws InterruptedException {
		// logger = extent.createTest("validate Express Quotes");
//		HandleSSL handleobj=PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		handleobj.securityHandler();
//		
		LoginPage logobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();
//		PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//		MyWebutil.closetutorial();

		ExpressQuote expressobj = PageFactory.initElements(MyWebutil.driver, ExpressQuote.class);
		String fullName = expressobj.validatexpressquote();
		logobj.validlogin();
		expressobj.validateEQ(fullName);
	}

	 @Test(priority = 5)
	public void validate_EQ_ClientQuotes_TC_005() throws Exception {
		logger = extent.createTest("validate Campaign EQ_ClientQuotes");
//		HandleSSL HSSLobj = PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		HSSLobj.securityHandler();
		SignupPageNew signupPageObj = PageFactory.initElements(MyWebutil.driver, SignupPageNew.class);
		String OwnerEmailID = signupPageObj.validateEQ_OwnerSignUp();
		MailinatorPage_Owner mailiObj = PageFactory.initElements(MyWebutil.driver, MailinatorPage_Owner.class);
		mailiObj.emailMailVerification1(OwnerEmailID);

		EQ_ClientQuotes EQ1 = PageFactory.initElements(MyWebutil.driver, EQ_ClientQuotes.class);
		EQ1.valid_EQ_ClientQuotes();
	}

	 @Test (priority = 6)//double newtab issue same title
	public void validateEq_ProspectQuotes_TC_006() throws InterruptedException {
//		HandleSSL handleobj=PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		handleobj.securityHandler();

		Eq_ProspectQuotes eqobj = PageFactory.initElements(MyWebutil.driver, Eq_ProspectQuotes.class);

		eqobj.validEq_ProspectQuotes__anki();

	}

	 @Test(priority=7)//done
	public void validatePromotionTC_007() throws Exception {
//		HandleSSL handleobj=PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		handleobj.securityHandler();
//		

		LoginPage logobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();
//	PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//	MyWebutil.closetutorial();
		PromotionPage promo = PageFactory.initElements(MyWebutil.driver, PromotionPage.class);
		promo.ValidatePromotion();
	}

	@Test(priority = 8)
	public void validateCalendarTC_008() throws Exception {

		Calendar calenderobj = PageFactory.initElements(MyWebutil.driver, Calendar.class);
		calenderobj.validate_calendar();
	}

	 @Test (priority = 9)//pass
	public void validateSignup_TC_009() throws InterruptedException {
//		HandleSSL handleobj=PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		handleobj.securityHandler();
//		

		SignupPageNew signupobj = PageFactory.initElements(MyWebutil.driver, SignupPageNew.class);
		String OwnerEmailID = signupobj.validateEQ_OwnerSignUp();

		MailinatorPage_Owner mailiObj = PageFactory.initElements(MyWebutil.driver, MailinatorPage_Owner.class);
		mailiObj.emailMailVerification1(OwnerEmailID);
	}

	 @Test(priority = 10)
	public void validateMyprofile_TC_010() throws Throwable {

//			HandleSSL handleobj=PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//			handleobj.securityHandler();
		MyProfile myprofileobj = PageFactory.initElements(MyWebutil.driver, MyProfile.class);

		myprofileobj.validMyprofile();
		myprofileobj.validateMyOrganization();
		myprofileobj.validatePublicProfile();
		myprofileobj.validateSubscription();

	}

	// @Test(priority=11)//pass /*This test case working fine for our end,but while
	// signup with customer account this account is redirecting on
	// production server because there is no pages created yet on website.so this
	// account is creating on production server

	 @Test(priority=11)
	public void customersignup_TC_011() throws InterruptedException {
		logger = extent.createTest("validate Customer_SignUp page");
//		HandleSSL HSSLobj = PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		HSSLobj.securityHandler();
		Cutomer_Signup CusSignObj = PageFactory.initElements(MyWebutil.driver, Cutomer_Signup.class);
		CusSignObj.valid_customer_signup();
	}

	 @Test(priority = 12) // pass
	public void validateShortcuts_TC_012() throws Exception {
		logger = extent.createTest("validate Shortcut page");
//		HandleSSL HSSLobj = PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		HSSLobj.securityHandler();
		LoginPage logobj = PageFactory.initElements(MyWebutil.driver, LoginPage.class);
		logobj.validlogin();
//		PageFactory.initElements(MyWebutil.driver, MyWebutil.class);
//		MyWebutil.closetutorial();
		Shortcuts shrObj = PageFactory.initElements(MyWebutil.driver, Shortcuts.class);
		shrObj.validateAddNewServices();
		shrObj.validateAddNewEvents();
		shrObj.validateAddNewMessages();
		shrObj.validateAddNewQuotes();

	}

	 @Test(priority = 13)
	public void validateproject_TC_013() throws Throwable {
//		HandleSSL handleobj = PageFactory.initElements(MyWebutil.driver, HandleSSL.class);
//		handleobj.securityHandler();
		Project projobj = PageFactory.initElements(MyWebutil.driver, Project.class);
		projobj.validproject();
//		
		projobj.ValidQuotetab();
		projobj.validMessageTab();
		projobj.ValidTechSubs();

		projobj.ValidFile();

		projobj.ValidEventTab();

	}

}
