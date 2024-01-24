package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page {

	// Page Factory  Page Use in this syntax-
	WebDriver driver;

	public Search_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//textarea[@name=\"q\"]") public WebElement searchbox;
	@FindBy(xpath = "(//input[@name=\"btnK\"])[1]") public WebElement search_btn;
	@FindBy(xpath = "//a//h3[text()=\"Facebook - log in or sign up\"]") public WebElement facebook_link;
	
	
	
	
	public void searchgoogle(String searchinput) {
	
		try{
		    searchbox.sendKeys(searchinput);
		    search_btn.click();

		}
		catch(Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	
	}
	
	public void ClickFacebook() {
		try {
			driver.findElement((By) facebook_link).click();
			
		}
		catch(Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
}
