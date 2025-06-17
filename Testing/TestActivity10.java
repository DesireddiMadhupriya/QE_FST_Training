//Open a new browser to https://training-support.net/webelements/drag-drop
//Get the title of the page and print it to the console.
//On the page, perform:
//Find the ball and simulate a click and drag to move it into "Dropzone 1".
//Verify that the ball has entered Dropzone 1.
//Once verified, move the ball into "Dropzone 2".
//Verify that the ball has entered Dropzone 2.
//Close the browser.

package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity10 {
   public static void main(String[] args) {
	
	 	
 	   //Initialize driver
 	  WebDriver driver = new FirefoxDriver();
 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	 Actions builder = new Actions(driver);
 	//open the browser or page
 	 driver.get("https://training-support.net/webelements/drag-drop");
 	 driver.manage().window().maximize();
 	//print the page title
 	 System.out.println(driver.getTitle());  
 	//Find the ball and simulate a click and drag to move it into "Dropzone 1".
 	 //find all the webelement
 	WebElement ball= driver.findElement(By.id("ball"));
 	WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
 	WebElement dropaone2 = driver.findElement(By.id("dropzone2"));
 	 
 	 builder.dragAndDrop(ball,dropzone1).build().perform();
 	 //Verify that the ball has entered Dropzone 1. 
 	 System.out.println(dropzone1.findElement(By.className("dropzone-text")).getText());
	   
	  // System.out.println(dropzone1.getText());
	   
	   
 	//Once verified, move the ball into "Dropzone 2". 
 	 
 	 builder.clickAndHold(ball).moveToElement(dropaone2).release().build().perform();
 	 
 	 
 	//Verify that the ball has entered Dropzone 1.
 	  System.out.println(dropaone2.getText());
 	  
 	//Close the browser.
 	 driver.quit();
	   
}

}
