package Package_TestNG;   

		// --> Add Category  //

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_1 {
	
	WebDriver driver;
	
	
	By Category_Input_Field = By.name("categorydata");
	By Add_Category_Button = By.xpath("//input[@type='submit' and @name='submit'  and @value='Add category']");
	
		String Category_Name = "Test9";
		
	@BeforeMethod
		public void init() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://techfios.com/test/101/");
			Thread.sleep(3000);
		}
	
	@Test
	public void addCatogory() throws InterruptedException {
//Add Category:
		
		driver.findElement(Category_Input_Field).sendKeys(Category_Name);
		Thread.sleep(3000);
		driver.findElement(Add_Category_Button).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
	
	
}
