package google;




import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Screenshot 
{
	WebDriver driver;
	@BeforeMethod
	public void Startup_Openbrowser()
	{
        /*Initiate driver*/
		System.setProperty("webdriver.chrome.driver", "D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\E drive\\Selenium\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		driver= new ChromeDriver();
		//driver= new FirefoxDriver();
		driver.get("https://www.google.co.in");
		//driver.get("http://rakurakuforpc-env.us-west-1.elasticbeanstalk.com/");
		driver.manage().window().maximize();
     }
	
	@Test
	public void Screenshots() throws InterruptedException, Exception
	{      
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots/img.png"));
		System.out.println("Screenshot captured");
		
    }
	
	
	@AfterMethod
	public void Closebrowser() 
	{
		driver.close();
	}

}
