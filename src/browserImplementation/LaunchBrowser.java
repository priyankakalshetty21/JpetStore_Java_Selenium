package browserImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.IOException;
import java.util.Scanner;
import org.testng.Reporter;
import utils.ConfigReader;

public class LaunchBrowser {
    WebDriver driver;
    ConfigReader cr;

    public WebDriver launchEdge() throws IOException {
        WebDriver driver;
        String path = "C:\\RestAssured\\Demo\\Browsers\\msedgedriver.exe";
        System.out.println(path);
        System.setProperty("webdriver.edge.driver", path);
        driver = new EdgeDriver();
        Reporter.log("Edge Browser opened successfully");
        return driver;
    }

    public WebDriver launchChrome() throws IOException {
        WebDriver driver;
        String path = "C:\\Users\\237766\\git\\repository\\Java_Selenium_JpetStore_Project\\Browsers\\chromedriver.exe"; // Path to Chrome driver
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        Reporter.log("Chrome Browser opened successfully");
        return driver;
    }

    public WebDriver chooseBrowser() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which browser do you want to execute? (Enter 1 for Edge, 2 for Chrome)");
        int choice = scanner.nextInt();
        scanner.close();
        switch (choice) {
            case 1:
                return launchEdge();
            case 2:
                return launchChrome();
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                return null;
        }
    }
}


	