package google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Parentwin_childwin {
	
	
	WebDriver driver;
	// private String searchTerm = "Selenium";

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver= new RemoteWebDriver(new
		// URL("http://localhost:4444/wd/hub"),DesiredCapabilities.chrome());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void Parentwin() {
	String Parent_Window = driver.getWindowHandle();    

	 for (String Child_Window : driver.getWindowHandles())  
	 {  
	 driver.switchTo().window(Child_Window);  
	 //Perform operation on child window 
	 driver.close();
	 } 

	 //Switching back to Parent Window  
	 driver.switchTo().window(Parent_Window); 
	}
}
