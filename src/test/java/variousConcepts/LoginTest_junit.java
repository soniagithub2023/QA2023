package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_junit {
  
	WebDriver driver;
	
	
	@Before
	public  void launchchrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonia\\Selenium\\session1\\driver\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
		
	}
	@After
	public void closechrome() throws InterruptedException {
		Thread.sleep(3000);
	    driver.close();
	}
	
	@Test
	public  void positivelogintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	    driver.findElement(By.name("password")).sendKeys("abc123");
	    driver.findElement(By.name("login")).click();
		}
}
