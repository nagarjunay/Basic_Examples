package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iFrame {
	
private WebDriver driver;
	
	@BeforeMethod
	public void Startup_Openbrowser()
	{
        /*Initiate driver*/
		System.setProperty("webdriver.chrome.driver", "D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\E drive\\Selenium\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		driver= new ChromeDriver();
		//driver= new FirefoxDriver();
		driver.get("http://192.168.167.32/rakurakutaxi/");
		//driver.get("http://rakurakuforpc-env.us-west-1.elasticbeanstalk.com/");
		driver.manage().window().maximize();
     }
	
	@Test
	public void iframe() throws InterruptedException
	{ 
	
	/*We can even identify total number of iframes by using below snippet.*/
	int size = driver.findElements(By.tagName("iframe")).size();
	}
}
