package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.HomePage;
import page.LoginPage;

public class Test1 {
	@Test
	public void e2eTest() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/books");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	LoginPage loginpage	=new LoginPage(driver);
	HomePage homepage = new HomePage(driver);
	DashBoardPage dpage = new DashBoardPage(driver);
	 
	loginpage.ClickLogin();
	 
	homepage.enterUsername("harsha");
	homepage.enterPassword("Harsha@123");
	homepage.ClickLogin();
	 
	Thread.sleep(2000);
	 dpage.getTitle();
	 System.out.println(dpage.getTitle());
	 dpage.clickLogout();
	 
	 driver.quit();
} 
}