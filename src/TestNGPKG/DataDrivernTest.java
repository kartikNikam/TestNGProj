package TestNGPKG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.utility.Xls_Reader;

public class DataDrivernTest {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe"); 
//		 WebDriver driver;
//		 driver = new ChromeDriver();
//	     driver.manage().window().maximize();
//	     driver.manage().deleteAllCookies();
//	     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	     driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//	     driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
	      Xls_Reader reader = new Xls_Reader("C:\\Users\\kartikpc\\eclipse-workspace\\TestNGProj\\src\\testdata\\registration.xlsx");
		  String firstname = reader.getCellData("registration", "firstname", 2);
		  System.out.println(firstname);
		
		
	}

}
