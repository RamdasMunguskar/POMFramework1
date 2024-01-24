package TestScenario;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object.Facebookpage;
import Object.GoogleSearchpage;
import Object.Search_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	GoogleSearchpage objectrepo;
	Facebookpage objectrepo2;
	Search_page pagefactory;
	
	@BeforeTest
	public void beforetest() 
	{
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		  driver.get("https://www.google.co.uk/");
	}
  
	@Test(priority = 0)
	public void SearchOperation() throws InterruptedException 
	{
		GoogleSearchpage page = new GoogleSearchpage(driver);
		page.searchgoogle("facebook");
		
		/* // In page factory case use this syntax and enable false 1,2 prioprity.
		pagefactory = new Search_page(driver);
		pagefactory.searchgoogle("gmail");*/
	}	
		
	@Test(priority = 1)
	public void VerifyandAccessFacebook() {
		objectrepo = new GoogleSearchpage(driver);
		objectrepo.ClickFacebook();
	}
	
	@Test(priority = 2)
	public void VerifyLogin() {
		Facebookpage page = new Facebookpage(driver);
		page.EnterUsername();
		page.EnterPassword();
		page.VerifyLogin();
	}
	
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
