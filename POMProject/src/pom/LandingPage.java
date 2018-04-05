package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	static WebDriver driver;
	public LandingPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
	
  @FindBy(className= "glostick__user__avatar") public static WebElement AvarterBtn ;
   
    public void Avartar()
   {
      AvarterBtn.click();
   }
    
    @FindBy(linkText = "Sign out") public static WebElement SignOutBtn;

    public void SignOut()
    {
        SignOutBtn.click();         
    }
}
