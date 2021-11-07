package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
   // @FindBy(id="userName")
	//WebElement userName;
	By username = By.id("userName");
   
  //  @FindBy(id="password")
	//WebElement password; 
    By  password = By.id("password");
    
    
  //  @FindBy(id="login")
  // 	WebElement login; 
    By Login = By.id("login");
    
  //  @FindBy(id="close-fixedban")
  //  WebElement addclose;
    
    By addclose = By.id("close-fixedban");
    
   // driver.findElement(By.id("close-fixedban")).click();
   public void enterUsername(String user) {
	   driver.findElement(username).sendKeys(user);
   }
	  // userName.sendKeys(user);
   
    
     public void enterPassword(String pass) {
    	 
      driver.findElement(password).sendKeys(pass);
     
     }
     
     
     public void ClickLogin()
     {
    	 driver.findElement(Login).click();
     
     }
     }
     

