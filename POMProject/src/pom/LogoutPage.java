package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
		
		 public LogoutPage (WebDriver driver) 
	        {
	            PageFactory.initElements(driver, this);
	        }
	        
	        @FindBy(xpath= " //*[@id='login']/h3") public static WebElement LoginToYourAccouttxt;

	        public Boolean InLogoutPage()
	        {
	            return LoginToYourAccouttxt.isDisplayed();
	        }
		
	}

