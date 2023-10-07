package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
  
public class logintest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		launchchrome();
		positivelogintest();
		closechrome();
		  
		}
	public static void launchchrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonia\\Selenium\\session1\\driver\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
		
	}
	
	public static void closechrome() throws InterruptedException {
		Thread.sleep(3000);
	    driver.close();
	}
	
	public static void positivelogintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	    driver.findElement(By.name("Password")).sendKeys("abc123");
	    driver.findElement(By.name("login")).click();
		}
	

}
