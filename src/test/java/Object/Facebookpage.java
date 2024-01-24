package Object;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpage {

	WebDriver driver;

	public Facebookpage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("email");
	By password = By.id("pass");
	By login = By.name("login");
	
	
	public void EnterUsername() {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("9325579360");
	
		
	}
	
	public void EnterPassword() {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys("Ramdas@1204");
		
	}
	
	public void VerifyLogin() {
		driver.findElement(login).click();
		String title = driver.getTitle();
		assertEquals(title,"(1) Facebook");
	}
	
	
}
