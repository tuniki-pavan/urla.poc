package usda.urla.poc;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchInJPTest {
  @Test
  public void f() throws MalformedURLException {
	  
	  // System Property for Chrome Driver   
      //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");  
      // Instantiate a ChromeDriver class.     
      //WebDriver driver=new ChromeDriver();  
		/*
		 * WebDriver driver=new RemoteWebDriver(new
		 * URL("http://localhost:4444/wd/hub"),DesiredCapabilities.chrome());
		 * 
		 * // Launch Website driver.navigate().to("http://www.javatpoint.com/");
		 * 
		 * //Maximize the browser driver.manage().window().maximize();
		 * 
		 * //Scroll down the webpage by 5000 pixels JavascriptExecutor js =
		 * (JavascriptExecutor)driver; js.executeScript("scrollBy(0, 5000)");
		 * 
		 * // Click on the Search button
		 * driver.findElement(By.linkText("Core Java")).click();
		 * 
		 * driver.quit();
		 */

  }
}
