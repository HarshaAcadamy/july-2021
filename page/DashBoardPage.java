package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver= driver;
		//PageFactory.initElements(driver, this);
	}	
	
	
	//@FindBy(xpath="//*[@id='app']//div[@class='main-header']")
  // WebElement pageTitle;
	
	
	  By pageTitle =By.xpath("//*[@id='app']//div[@class='main-header']");
       By LogoutBtn = By.id("submit");

    public  String  getTitle() {
    	  String pagetitle = driver.findElement(pageTitle).getText();
		 return pagetitle;
		 
    	}
    public void clickLogout()
    {
    	driver.findElement(LogoutBtn).click();
    	
    }
}
