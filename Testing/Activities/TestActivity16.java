package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestActivity16 {
   public static void main(String[] args) {
	
	 //Initialize driver
	 	  WebDriver driver = new FirefoxDriver();
	 	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	 Actions builder = new Actions(driver);
	 	//open the browser or page
	 	 driver.get("https://training-support.net/webelements/sliders");
	 	 driver.manage().window().maximize();
	 	 //page interactions
	      	//print the page title
	      	 System.out.println(driver.getTitle());
	      // find the initial values 
	      WebElement volumeValue= driver.findElement(By.cssSelector("h1.text-5xl.font-extrabold"));
	      	System.out.println(volumeValue.getText());
	      	 
	      //find the slide 
	      	
	      	
	      	WebElement slider=driver.findElement(By.id("volume"));
	      	//move to 25%
	      	builder.moveToElement(slider).clickAndHold(slider).moveByOffset(-120,0).release().pause(3000).build().perform();
	      	
	      	//print the value
	      	System.out.println(volumeValue.getText());
	      	 
	      	 //move it to new value
	      	builder.moveToElement(slider).clickAndHold(slider).moveByOffset(120,0).release().pause(3000).build().perform();
	      	
	      	
	      	//
	      	 System.out.println(volumeValue.getText());
	      	 
	      	 
	      	 
	   //close the console
	      	 driver.quit();	   
}

}
