package Activities;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity14 {

	public static void main(String[] args) {
		  //Initialize driver
	 	  WebDriver driver = new FirefoxDriver();
	 	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	 
	 	//open the browser or page
	 	 driver.get("https://training-support.net/webelements/tables");
	 	 driver.manage().window().maximize();
	 	 
	 	 //page interactions
	      	//print the page title
	      	 System.out.println(driver.getTitle());
	      	 //find the no of rows and cols and print them
	       	List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
	      	System.out.println(rows.size());
	      	List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
	      	System.out.println(cols.size());
	      	//Find and print the Book Name in the 5th row.
	      	 System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText()); 	
	      	 
	      	//Click the header of the Price column to sort it in ascending order
	      	//List<WebElement> price = driver.findElements(By.xpath("//th[text()='price"]));
	      	 driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
	      	//Find and print the Book Name in the 5th row again.
	      	 System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText()); 	
	      	 
	      	 
	 		//close the console
	 		driver.quit();
		
		
		
	}
}
