package Activities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity1 {
	 public static void main(String[] args) {
	       //Initialize driver
      	WebDriver driver = new FirefoxDriver();
      	
      	//open the browser or page
      	driver.get("https://training-support.net");
      	
          //page interactions
      	//print the page title
      	 System.out.println(driver.getTitle());
         
      	 //close the browser
      	 driver.quit();
      
}
}
