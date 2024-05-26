package pages;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import excelUtility.ExcelConfigReader;
import utils.ConfigReader;
public class PurchaseAndPlaceOrder {
	WebDriver driver;
	By Un = By.name("username");
	By pwd = By.name("password");
	ExcelConfigReader cfr;
	ConfigReader cr;
	public PurchaseAndPlaceOrder(WebDriver driver) throws IOException
	{
		this.driver = driver;
		cfr = new ExcelConfigReader();
		cr  = new ConfigReader();
	    driver.get(cr.getBaseURL());
	}
	public void Enter_Page() {
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.linkText("Sign In")).click();
	}
	// To place order
	public void selectplaceorder() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(Un).sendKeys(cfr.getData(0, 0, 0));
		driver.findElement(pwd).clear();
		driver.findElement(By.name("password")).sendKeys(cfr.getData(0, 0, 0));
		driver.findElement(By.name("signon")).click();
		driver.findElement(By.xpath("//*[@id='SidebarContent']/a[5]/img")).click();
		driver.findElement(By.linkText("AV-SB-02")).click();
		driver.findElement(By.linkText("EST-19")).click();
		driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		driver.findElement(By.linkText("Confirm")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		Thread.sleep(2000);
		
	}


}
