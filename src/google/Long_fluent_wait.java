package google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Long_fluent_wait 
{
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
	public void Wait_until_api_response() throws InterruptedException
	{      
	    /*To wait untill the api response*/
	    FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
        // It should poll webelement after every three second
        wait1.pollingEvery(3, TimeUnit.SECONDS);
        // Max time for wait- If conditions are not met within this time frame then it will fail the script
        wait1.withTimeout(70, TimeUnit.SECONDS);
        // we are creating Function here which accept webdriver and output as WebElement-
        WebElement element = wait1.until(new Function<WebDriver, WebElement>() {
        // apply method- which accept webdriver as input
        @Override             
        public WebElement apply(WebDriver arg0) 
         {
        // find the element
        WebElement ele = arg0.findElement(By.xpath("//*[@id=\"message\"]"));
        //Will capture the inner Text and will compare will WebDriver
        //If condition is true then it will return the element and wait will be over
        if (ele.getAttribute("innerHTML").equalsIgnoreCase("注文は受け入られました")) 
             {
                System.out.println("Please Wait.... Allocation Taxi" + ele.getText());
                return ele;
             }
         //If condition is not true then it will return null and it will keep checking until condition is not true
            else 
            {
                       System.out.println("Please Wait.... Allocation Taxi" + ele.getText());

                  return null;
            }
             }

        });
        //If element is found then it will display the status
        System.out.println("The order has been accepted >>>>> " + element.getText());
    }
	
	@AfterMethod
	public void Closebrowser() 
	{
		driver.close();
	}
	

}
