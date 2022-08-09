package TestNGPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameter {
	
 WebDriver driver;
	@Test
	@Parameters({"url","email"})
	   public void yahoologin(String url,String email) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kartikpc\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(url);
	    Thread.sleep(5000);
	
	    
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	    Thread.sleep(10000);
	    driver.quit();
	
	
	}

}
