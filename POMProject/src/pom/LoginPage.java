package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	
	 //@FindBy(how = How.ID, using = "email") private WebElement username;
     //@FindBy(how = How.ID, using = "password")private WebElement password;
     //@FindBy(how = How.NAME, using = "commit")private WebElement loginbtn;

	
	
	
	@FindBy(id = "email")public static WebElement username;
	@FindBy(id = "password")public static WebElement password;
	@FindBy(name = "commit")public static WebElement loginbtn;			

public void Login(String UserName, String Password)
{
    //LoginBtn.Click();
    username.sendKeys(UserName);
    password.sendKeys(Password);
    loginbtn.click();
}

}
