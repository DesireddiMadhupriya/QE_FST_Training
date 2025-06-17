//Using Selenium:
//Open a new browser to https://training-support.net/webelements/keyboard-events
//Get the title of the page and print it to the console.
//On the page, type out a string from the Selenium script to show on the page
//Print the message to the console.
//Close the browser.

package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity9 {
         public static void main(String[] args) {
        	 	
  	 	   //Initialize driver
  	 	  WebDriver driver = new FirefoxDriver();
  	 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	 	 Actions builder = new Actions(driver);
  	 	//open the browser or page
  	 	 driver.get("https://training-support.net/webelements/keyboard-events");
  	 	 driver.manage().window().maximize();
  	 	//print the page title
  	 	 System.out.println(driver.getTitle());  
  	 	//On the page, type out a string from the Selenium script to show on the page
  	   builder.sendKeys("Hey ! I am Desireddi Madhupriya...").build().perform();
  	 //Print the message to the console.	 
       	 System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
  	 	 //close the console
         driver.quit();	 
        	 
		}
}
