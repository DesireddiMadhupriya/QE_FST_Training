package Activities;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;



public class TestActivity1 {
	  //webdriver declaratio
		WebDriver driver;
		//WebDriverWait declaration
		WebDriverWait wait;
		
		@BeforeClass
		public void setUp() {
			//initialize driver
			driver = new FirefoxDriver();
			//initialise wait
			wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			
			//open the page
			driver.get("https://training-support.net/");
		}
		@Test(priority = 1)
		
		public void verifyHomePageTitle() {
			//assert page title
			assertEquals(driver.getTitle(), "Training Support");
			
			
		}
   
	   @Test(priority = 2)
	   public void verifyaboutPage(){
		   //find and click about us button
		   driver.findElement(By.linkText("About Us")).click();
		   //wait till page loads
		   wait.until(ExpectedConditions.titleContains("About"));
		 //assert page title
			assertEquals(driver.getTitle(), "About Training Support");
		
		  
	   }
	   @AfterClass
	   public void tearDown() {
		   //close the browser
		   driver.quit();
	   }

}
