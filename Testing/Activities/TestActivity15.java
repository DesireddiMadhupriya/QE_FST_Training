package Activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.support.ui.ExpectedConditions;



public class TestActivity15 {

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
		 //find and click the add row button
	     driver.findElement(By.xpath("//button[contains(text(),'Add Row +')]")).click();
		 //find and edit the newly added row 
	     String[] dataToAdd= {"10","Hover Car Racer", "Matthew Railey", "03304405160 ", "$7.99"};
	     for(int i=0; i < dataToAdd.length; i++) {
	    	By lastRowCells =  By.xpath("//table/tbody/tr[last()]/td[" +(i+1)+ "]");
	    	driver.findElement(lastRowCells).clear();
	    	driver.findElement(lastRowCells).sendKeys(dataToAdd[i]);
	     } 
		 System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText()); 
		 
	 		//close the console
	 		driver.quit();
			 
	    		 
	 }
}