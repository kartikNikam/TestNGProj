package TestNGPKG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.Testutil;

public class DataProvideclassTest {
	WebDriver driver;
	
	@BeforeMethod
	  public void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe"); 
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	     driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]>testdata = Testutil.getdatafromexcel();
		return testdata.iterator();
	}
	

	@Test(dataProvider="getTestData")
	public void Registrationpage(String firstname ,String lastname,String username , String password ,String confirmed)
	{
		
		driver.findElement(By.xpath("//input[@id='firstName' ]")).clear();
		driver.findElement(By.xpath("//input[@id='firstName' ]")).sendKeys("firstname");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("lastname");
		
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");
		
		driver.findElement(By.xpath("//*[@name='Passwd']")).clear();
		driver.findElement(By.xpath("//*[@name='Passwd']")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[@name='ConfirmPasswd']")).clear();
		driver.findElement(By.xpath("//*[@name='ConfirmPasswd']")).sendKeys("confirmed");
		
				
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
		
			

}
