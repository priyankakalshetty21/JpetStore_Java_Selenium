package pages;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
public class SignOut_Page {
	WebDriver driver;
	ConfigReader cr;
	//SignOut page
	public SignOut_Page(WebDriver driver) throws IOException
	{
		this.driver = driver;
	
	}
	public void click_SignOut() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(1000);

}}
