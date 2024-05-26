package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Home_Page {
	WebDriver driver;
	//Home page
	public Home_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	public void click_SignIn() throws InterruptedException
	{
			driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
			 Thread.sleep(2000);
		}	
		
	}	
	

