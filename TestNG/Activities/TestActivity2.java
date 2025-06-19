package Activities;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;

public class TestActivity2 {
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
		driver.get("https://training-support.net/webelements/target-practice");
	}
	@Test(priority = 1)
	
	public void verifyHomePageTitle() {
		//assert page title
		assertEquals(driver.getTitle(), "Selenium: Target Practice");
		}
      @Test (priority=2)
      public void verifyButtonText() {
    	  //find the button with the text bvlack
    	  String buttonText=driver.findElement(By.cssSelector("button.bg-slate-200")).getText();
  		//assert page title
  		assertEquals(buttonText, "Black");
  		}
      @Test (priority=3,enabled=false)
      public void verifyHeadingText() {
    	  //find the button with the text bvlack
    	  String headingText=driver.findElement(By.tagName("h1")).getText();
  		//assert page title
  		assertEquals(headingText, "Heading #1");
  		}
      @Test (priority=4)
      public void verifyFooterText() {
    	  throw new SkipException("this test will be skipped");
      }
   @AfterClass
   public void tearDown() {
	   //close the browser
	   driver.quit();
   }

}

