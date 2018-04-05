package pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Execution {
	
	WebDriver driver;
	
	@Test
	public void ExecuteHeroku() {
		driver= setBrowser.LaunchBrowser();

        LoginPage logPage = new LoginPage(driver);
        logPage.Login("olatundeoladeni@yahoo.com", "1Latunde");
        
        LandingPage landpage = new LandingPage(driver);
        //landpage.Document();
        landpage.Avartar();
        landpage.SignOut();
       
        LogoutPage logout = new LogoutPage(driver);
        
        logout.InLogoutPage();  
        
	}
	
	@Test
	public void TearDown() {
		
		driver.close();
	}
}


