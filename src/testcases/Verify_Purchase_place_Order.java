package testcases;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import browserImplementation.LaunchBrowser;
import pages.PurchaseAndPlaceOrder;
import pages.SignOut_Page;
public class Verify_Purchase_place_Order {
	WebDriver driver;
    PurchaseAndPlaceOrder pp;
	LaunchBrowser lb;
	SignOut_Page so;
	//Verify user able to purchase the order Successfully
	@Test
	public void verify_placePage() throws IOException, InterruptedException
    {
        lb = new LaunchBrowser();
        driver = lb.chooseBrowser();
        pp = new PurchaseAndPlaceOrder(driver) ;
        pp.Enter_Page();
        Thread.sleep(2000);
        pp.selectplaceorder();
        Reporter.log("verify_placePage");
    }
    @Test(dependsOnMethods="verify_placePage")
	public void verify_signOutPage() throws InterruptedException, IOException
	{
		so = new SignOut_Page(driver);
		so.click_SignOut();
		 Thread.sleep(5000);
		Reporter.log("verify_signOutPage");
        driver.quit();
	}}

