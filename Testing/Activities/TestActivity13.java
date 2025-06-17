package Activities;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;




public class TestActivity13 {

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
	      	 
		//find the no of rows and colums in the table and print them.
	      	List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
	      	System.out.println(rows.size());
	      	List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
	      	System.out.println(cols.size());
		 
		//print all the cell values in the third row 
		
	    	List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
	    	for (WebElement cell : thirdRow) {
	    		System.out.println(cell.getText());
	    	}
	      	     System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]")).getText()); 	
	      	//find and print the cell value at the second row and second column
	      
	      	   System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText()); 	
		//close the console
		driver.quit();
	}

}
