package pages;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import excelUtility.ExcelConfigReader;
import utils.ConfigReader;
public class Registration_Page {
	WebDriver driver;
	  ExcelConfigReader cfr;
	  ConfigReader cr;
	  By Uname = By.name("username");
	  By pwd = By.name("password");
	  By login = By.name("Signon");
	  By rpwd = By.name("repeatedPassword");
	  By af = By.name("account.firstName");
	  By al = By.name("account.lastName");
	  By ae = By.name("account.email");
	  By ph = By.name("account.phone");
	  By ad1 = By.name("account.address1");
      By ad2 = By.name("account.address2");
      By cy = By.name("account.city");
      By st = By.name("account.state");
      By zip = By.name("account.zip");
      By ct = By.name("account.country");
	public Registration_Page(WebDriver driver) throws IOException
	{
		this.driver = driver;
		
	}
	public void register_Now() {
		driver.findElement(By.linkText("Register Now!")).click();
		
	}
	//Registration page
	public void click_Register() throws InterruptedException, IOException
	{
		cfr = new ExcelConfigReader();
		cr = new ConfigReader();
		driver.findElement(Uname).sendKeys(cfr.getData(0, 0, 0));
		driver.findElement(pwd).sendKeys(cfr.getData(0, 0, 1));
		driver.findElement(rpwd).sendKeys(cfr.getData(0, 0, 2));
		driver.findElement(af).sendKeys(cfr.getData(0, 0, 3));
		driver.findElement(al).sendKeys(cfr.getData(0, 0, 4));
		driver.findElement(ae).sendKeys(cfr.getData(0, 0, 5));
		driver.findElement(ph).sendKeys(cfr.getData(0, 0, 6));
		driver.findElement(ad1).sendKeys(cfr.getData(0, 0, 7));
		driver.findElement(ad2).sendKeys(cfr.getData(0, 0, 8));
		driver.findElement(cy).sendKeys(cfr.getData(0, 0, 9));
		driver.findElement(st).sendKeys(cfr.getData(0, 0, 10));
		driver.findElement(zip).sendKeys(cfr.getData(0, 0, 11));
		driver.findElement(ct).sendKeys(cfr.getData(0, 0, 12));
		Select preffered_Lang = new Select(driver.findElement(By.xpath("//*[@id=\'Catalog\']/form/table[3]/tbody/tr[1]/td[2]/select")));
		 preffered_Lang .selectByVisibleText("english");
		Select item = new Select(driver.findElement(By.xpath("//*[@id=\'Catalog\']/form/table[3]/tbody/tr[2]/td[2]/select")));
		item.selectByVisibleText("BIRDS");
		driver.findElement(By.xpath("//*[@id=\'Catalog\']/form/table[3]/tbody/tr[3]/td[2]/input")).click();
		boolean status = driver.findElement(By.xpath("//*[@id=\'Catalog\']/form/table[3]/tbody/tr[3]/td[2]/input")).isSelected();
		System.out.println(status);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'Catalog\']/form/table[3]/tbody/tr[4]/td[2]/input")).click();
		boolean status1 = driver.findElement(By.xpath("//*[@id=\'Catalog\']/form/table[3]/tbody/tr[4]/td[2]/input")).isSelected();
		System.out.println(status1);
		driver.findElement(By.name("newAccount")).click();	
		 
	}

}
