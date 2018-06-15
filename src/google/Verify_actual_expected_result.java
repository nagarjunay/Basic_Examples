package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verify_actual_expected_result 
{
	private WebDriver driver;
	
	@BeforeMethod
	public void Startup_Openbrowser()
	{
        /*Initiate driver*/
		System.setProperty("webdriver.chrome.driver", "D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\E drive\\Selenium\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		//driver= new FirefoxDriver();
		driver.get("http://192.168.167.32/rakurakutaxi/");
		//driver.get("http://rakurakuforpc-env.us-west-1.elasticbeanstalk.com/");
		driver.manage().window().maximize();
     }
	
	@Test(priority=5)
	public void Verify_actual_exp_result() throws InterruptedException
	{      
		/*To verify actual result and Expected result  */
		 String actual_error= driver.findElement(By.xpath("//*[@id=\"errorMessage\"]/h3")).getText();
	     String expected_error="パスワードの検証に失敗しました";
	     Assert.assertEquals(actual_error, expected_error);
	     System.out.println("Password verification failed");	
		
    }
	
	@AfterMethod
	public void Closebrowser() 
	{
		driver.close();
	}
	
	

}
