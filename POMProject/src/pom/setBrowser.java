package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setBrowser {
	
	static WebDriver driver;
	
	public static WebDriver LaunchBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars_Extensions\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://id.heroku.com/login");
		 driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 
		return driver;
	}
	
}
