package testcases;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import browserImplementation.LaunchBrowser;
import pages.Home_Page;
import pages.Landing_Page;
import pages.PurchaseAndPlaceOrder;
import pages.Registration_Page;
import pages.SignOut_Page;
public class Verify_RegistrationPage {
	WebDriver driver;
    PurchaseAndPlaceOrder pp;
	LaunchBrowser lb;
	SignOut_Page so;
	Landing_Page lp;
	Home_Page hp;
	Registration_Page rp;
	//Verify user able to purchase the order Successfully
	@Test
	public void verify_LandingPage() throws IOException, InterruptedException
	{
		   lb = new LaunchBrowser();
		   driver = lb.chooseBrowser();
		   lp = new Landing_Page(driver);
		   lp.click_EnterTheStore();
		   lp.Search_Product();
		   lp.verify_WelcomeMsg();
		   Reporter.log("verify_LandingPage");
		   Reporter.log("Landing page opened successfully");
		   String expected_wlcm_msg = "JPetStore Demo";
		   String actual_wlcm_msg = driver.getTitle();
		   Assert.assertEquals( "Welcome msg matched",expected_wlcm_msg,actual_wlcm_msg );
		}	
		//Verify User able to Navigate homepage successfully
		@Test(dependsOnMethods="verify_LandingPage")
		public void verify_HomePage() throws InterruptedException
		{
			hp = new Home_Page(driver);
			hp.click_SignIn();
			Reporter.log("verify_HomePage");
			Reporter.log("HomePage opened Successfully");}
		//Verify Registration page
		@Test(dependsOnMethods="verify_HomePage")
		public void verify_RegistrationPage() throws InterruptedException, IOException
		{
			rp = new Registration_Page(driver);
			rp.register_Now();
			rp.click_Register();
			Reporter.log("verify_RegistrationPage");
			Reporter.log("Registration page opened Successfully");
			 String message =  "HTTP Status 500 – Internal Server Error";
			String actual_msg=driver.getTitle();
			Assert.assertEquals( "CopyRight msg matched", message,actual_msg );
			driver.quit();
		}}
	
	


