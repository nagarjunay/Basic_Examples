package google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicGoogleSearch {
	WebDriver driver;
	@BeforeTest
	public void setup() throws Exception 
	{
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
	public void Google() 
	{
		//sbqs_c
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("ind");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("Total of suggestions in google search box===>" + list.size());
		for(int i=0; i<=list.size(); i++) 
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("indian railway")) 
			{
				list.get(i).click();
				break;
			}
		}
		
		/*List<WebElement> list = driver.findElements(By.xpath("//ul//li[@class='sbct']//div[@class='sbl1']"));
		int size = list.size();
		System.out.println(size);
		for(int i=0; i<size; i++)
		{
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.contains(s))
			{
				
			} */		
	}
}
