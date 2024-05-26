package pages;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import excelUtility.ExcelConfigReader;
import utils.ConfigReader;
public class Landing_Page {
	WebDriver driver;
	ConfigReader cr;
	ExcelConfigReader cfr;
		//LandingPage
		public Landing_Page(WebDriver driver) throws IOException
		{
			this.driver = driver;
			cr=new ConfigReader();
			driver.get(cr.getBaseURL());
		}
		
		public void click_EnterTheStore()
		{
			driver.findElement(By.linkText("Enter the Store")).click();
		}	
		public String verify_Title()
		{
			String title = driver.getTitle();
			return title;
		}	
		public String verify_WelcomeMsg()
		{
			String wlcmmsg = driver.getTitle();
			return wlcmmsg;
			}	
		public void Search_Product() throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\'SearchContent\']/form/input[1]")).sendKeys("Birds");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'SearchContent\']/form/input[2]")).click();
			Thread.sleep(2000);
		}
	}


