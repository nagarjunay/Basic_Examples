package google;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;    
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdown 
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
		Select dropdown = new Select(driver.findElement(By.id("day")));
		dropdown.selectByIndex(6);
		// Selecting month in month drop down
		Select dropdown1 = new Select(driver.findElement(By.id("month")));
		dropdown1.selectByIndex(5);
		// Selecting year option from year drop down
		Select dropdown3=new Select(driver.findElement(By.id("year")));
		dropdown3.selectByIndex(8);
		Select sel=new Select(driver.findElement(By.xpath(".//*[@id='Adults']")));
		sel.selectByIndex(1);
		Select sel1=new Select(driver.findElement(By.xpath(".//*[@id='Childrens']")));
		sel1.selectByIndex(2);

	     
    }
	
	@AfterMethod
	public void Closebrowser() 
	{
		driver.close();
	}
	

}
