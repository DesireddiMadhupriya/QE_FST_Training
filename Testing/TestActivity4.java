package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity4 {

public static void main(String[] args) {
	

	   //Initialize driver
	  WebDriver driver = new FirefoxDriver();
	
	//open the browser or page
	 driver.get("https://training-support.net/webelements/target-practice");
	
	//print the page title
	 System.out.println(driver.getTitle());


   	
   	 //find the success message
   	 String message = driver.findElement(By.xpath("//h3[contains(@class, 'text-orange-600')]")).getText();
   	 System.out.println(message);
   	 System.out.println(message.equals("Heading #3"));
	 
   	  // String message1 = driver.findElement(By.xpath("//h5[contains(@class, 'text-purple-600')]")).getCssValue("color");
   	 // System.out.println(message1);
   	   //find the 5the header add color and print
   	    String c1=driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color");
   	    System.out.println("color of the 5th header: " + c1 );
   	    
   	   
   	 //Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
     //System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
     //System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());

   	    
   	    
   	 //Find the purple button and print all it's classes.
   	    String classes= driver.findElement(By.className("bg-purple-200")).getAttribute("class");
   	    System.out.println(" The total classes " + classes );
   	    
   	   
   	    
   	    
   	    
	   //Find the slate button and print it's text.
   	 String slate_text= driver.findElement(By.className("bg-slate-200")).getText();
	    System.out.println(" The total slate " + slate_text);
	    
		//Close the browser
   	driver.quit();


  }

}