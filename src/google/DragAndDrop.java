package google;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
 
 WebDriver driver;
 
	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.chrome());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
	}

	@Test
	public void dragAndDrop() {
		// Locate element which you wants to drag.
		WebElement dragElementFrom = driver.findElement(By.xpath("//div[@id='dragdiv']"));
		// Locate element where you wants to drop.
		WebElement dropElementTo = driver.findElement(By.xpath("//div[@id='dropdiv']"));

		// Use Actions class and Its members of WebDriver API to perform drag and drop
		// operation.
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(dragElementFrom).moveToElement(dropElementTo).release(dropElementTo)
				.build();
		dragAndDrop.perform();
	}
}
