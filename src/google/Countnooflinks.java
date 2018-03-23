package google;
import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Countnooflinks {
	WebDriver driver;
	
	
	@BeforeMethod
	public void Startup_Openbrowser()
	{
        /*Initiate driver*/
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		driver= new ChromeDriver();
		//driver= new FirefoxDriver();
		driver.get("https://www.google.co.in");
		//driver.get("http://rakurakuforpc-env.us-west-1.elasticbeanstalk.com/");
		driver.manage().window().maximize();
     }
	
	@Test
	public void Count_no_of_links() throws InterruptedException
	{      
		 /*To find number of hyper link in web page and Count */
		 List<WebElement> tagName=driver.findElements(By.tagName("a"));
		 int linkListCount = tagName.size();
	     System.out.println("Total Number of link count on webpage = "  + linkListCount);
		 for(WebElement ele:tagName)
		    {
		        String urls = ele.getAttribute("href");
		        System.out.println(urls);
		    }
		
		 /*To find number of hyper link size and display text*/ 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 int linkListCount1 = links.size();
		 System.out.println("Total Number of link count on webpage = "  + linkListCount1); 
		 System.out.println(links.size());
		 for (int i = 1; i<=links.size(); i=i+1)
			{ 
				System.out.println(links.get(i).getText());
	        }     
     }
	
	
	@AfterMethod
	public void Closebrowser() 
	{
		driver.close();
	}
}