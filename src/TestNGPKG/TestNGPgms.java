package TestNGPKG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGPgms {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void Setup() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kartikpc\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	}
	
	@Test
	public void Googletitle() {
		String title =driver.getTitle();
         System.out.println(title);
	}
	@Test
	public void GoogleLogo() {
		boolean b = driver.findElement(By.xpath("//*[@class=\"lnXdpd\"]")).isDisplayed();
		}
	@Test
	public void LinkTest() {
	boolean	b1=driver.findElement(By.linkText("mail")).isDisplayed();
	}
	
	@AfterMethod
	public void Teardown() {
		//driver.quit();
	}
	

}
