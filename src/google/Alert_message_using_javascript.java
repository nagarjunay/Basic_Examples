package google;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Alert_message_using_javascript 
{
	private WebDriver driver;
	
	@BeforeMethod
	public void Startup_Openbrowser()
	{
        /*Initiate driver*/
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		driver= new ChromeDriver();
		//driver= new FirefoxDriver();
		driver.get("http://192.168.167.32/rakurakutaxi/");
		//driver.get("http://rakurakuforpc-env.us-west-1.elasticbeanstalk.com/");
		driver.manage().window().maximize();
     }
	
	@Test
	public void Alertbox() throws InterruptedException
	{      
		 /*Displaying alert message using javascript*/
	     JavascriptExecutor javascript = (JavascriptExecutor) driver;
	     javascript.executeScript("alert('Input maximum 10 characters');");
	     Thread.sleep(2000);
	     /*Accepting alert message*/
	     driver.switchTo().alert().accept();
	     System.out.println("Input maximum 10 characters in name field");
	     
    }
	
	@AfterMethod
	public void Closebrowser() 
	{
		driver.close();
	}
	

}
