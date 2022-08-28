package Package_TestNG;   

	//Validate the month drop down has all the months (jan, feb, mar ...) in the Due Date dropdown section.

		import java.util.List;

// --> Validate moth drop down  //

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_3 {
	
	WebDriver driver;
	
		
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
//Check Category exists:
		// Show all the months in the month field.		
				WebElement MonthToSelect = driver.findElement(By.xpath("//select[@name='due_month']"));
				
				Select sel = new Select(MonthToSelect);
				
				sel.selectByVisibleText("Jan");
				Thread.sleep(1000);
				sel.selectByVisibleText("Feb");
				Thread.sleep(1000);
				sel.selectByVisibleText("Mar");
				Thread.sleep(1000);		
				sel.selectByVisibleText("Apr");
				Thread.sleep(1000);
				sel.selectByVisibleText("May");
				Thread.sleep(1000);
				sel.selectByVisibleText("Jun");
				Thread.sleep(1000);
				sel.selectByVisibleText("Jul");
				Thread.sleep(1000);
				sel.selectByVisibleText("Aug");
				Thread.sleep(1000);
				sel.selectByVisibleText("Sep");
				Thread.sleep(1000);
				sel.selectByVisibleText("Oct");
				Thread.sleep(1000);
				sel.selectByVisibleText("Nov");
				Thread.sleep(1000);
				sel.selectByVisibleText("Dec");
			
		// Validating if the months are correct.		
				Select sel1 = new Select(MonthToSelect);
				List<WebElement> options = sel1.getOptions();  
				for(WebElement month:options)  
				{  
				 System.out.println(month.getText());
				 
				 if(month.getText().equals("Jan")) {
					 System.out.println("Jan is correct");
				 }
				 if(month.getText().equals("Feb")) {
					 System.out.println("Feb is correct");
				 }
				 if(month.getText().equals("Mar")) {
					 System.out.println("Mar is correct");
				 }
				 if(month.getText().equals("Apr")) {
					 System.out.println("Apr is correct");
				 }
				 if(month.getText().equals("May")) {
					 System.out.println("May is correct");
				 }
				 if(month.getText().equals("Jun")) {
					 System.out.println("Jun is correct");
				 }
				 if(month.getText().equals("Jul")) {
					 System.out.println("Jul is correct");
				 }
				 if(month.getText().equals("Aug")) {
					 System.out.println("Aug is correct");
				 }
				 if(month.getText().equals("Sep")) {
					 System.out.println("Sep is correct");
				 }
				 if(month.getText().equals("Oct")) {
					 System.out.println("Oct is correct");
				 }
				 if(month.getText().equals("Nov")) {
					 System.out.println("Nov is correct");
				 }
				 if(month.getText().equals("Dec")) {
					 System.out.println("Dec is correct");
				 }
				 		 
				}  
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
}
