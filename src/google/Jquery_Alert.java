package google;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Jquery_Alert {
	
	public static void main(String[] arg) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pro.nissanconnect.in");
		Assert.assertEquals("NissanConnect", driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div[3]/div/div[1]/h3/a")).click();
		driver.findElement(By.id("username")).sendKeys("nissanadmin");
		driver.findElement(By.id("password")).sendKeys("Nissan@12345");
		driver.findElement(By.xpath("//i[@class='icon-user-login-icon']")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div/div[3]/ul/li/a")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div/div[3]/ul/li/ul/li[4]/a/i")).click();
		Thread.sleep(3000);
		//modal-content
		WebElement alert = driver.findElement(By.id("signoutpopupsubmit"));
		  alert.click();
		//cancel //*[@id="btnsignoutmessage"]/div/div/div/div[3]/button[2]

		/*  WebElement popup = driver.findElement(By.id("popup_container"));
		  WebElement message = popup.findElement(By.id("popup_message"));
		 Assert.assertEquals("This is a custom alert box", message.getText());
		  popup.findElement(By.id("popup_ok")).click();

		  try {
		    driver.findElement(By.id("popup_container"));
		    fail("Should have been removed from the DOM!");
		  } catch (NoSuchElementException expected) {
		  }*/
	}

}
