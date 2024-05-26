package eXceptions;

import java.io.IOException;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ElementNotInteractable{
	WebDriver driver;
	@Test
	public void launchEdge() throws IOException, InterruptedException {
		
		String path = "C:\\RestAssured\\Demo\\BrowserDrivers\\msedgedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.edge.driver", "https://www.google.com/");
		 driver=new EdgeDriver();
        driver.findElement(By.name("q")).sendKeys("Facebook");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class='UUbT9']/div[2]/ul[1]//following::span[1]")).click();
    Assert.assertTrue("facebook - Google Search", true);
     
     
}

}
