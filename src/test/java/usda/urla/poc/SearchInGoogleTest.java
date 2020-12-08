package usda.urla.poc;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchInGoogleTest {
  @Test
  public void f() throws MalformedURLException {
	  
	  // System Property for Chrome Driver   
      //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");  
      // Instantiate a ChromeDriver class.     
      WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.chrome());  
        
         // Launch Website  
      driver.navigate().to("http://www.google.com/");  
      try{
    	  Thread.sleep(5000);
    	  }
    	  catch(InterruptedException ie){
    	  }
       //Maximize the browser  
        driver.manage().window().maximize();  
        
        driver.quit();
  }
}
