package google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dynamic_WebTables {
	
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
		driver.get("http://demo.guru99.com/test/web-table-element.php");
    }
	
	@Test
	public void Google() throws Exception 
	{
		List<WebElement> Column= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int column_size= Column.size();
		System.out.println("Total number of Columns=" + column_size);
		
		List<WebElement> row= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		int row_size= row.size();
	
		System.out.println("Total number of Rows=" + row_size);
		
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		//*[@id="leftcontainer"]/table/tbody/tr[9]/td[1]/a
		
		
		//*[@id="leftcontainer"]/table/tbody/tr[26]/td[1]/a
		
		String beforeXpath="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
		String afterXpath="]/td[1]/a";
		
		
		for (int i = 1; i <= row_size; i++) {
			String Actual_Xpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(Actual_Xpath));
			System.out.println(element.getText());
			if(element.getText().equals("IDFC Bank")) {
				System.out.println("List is ========> "+ element.getText()+"is found"+ "at position==>"+i);
				break;
			}
			//*[@id="leftcontainer"]/table/tbody/tr[9]/td[4]
			//tbody[@id="leftcontainer"]/table/tbody/tr
		}
		System.out.println("***************************************");
		
		
		String afterXpathcurrentprice = "]/td[4]";

		for (int i = 1; i <= row_size; i++) {
			String Actual_Xpath = beforeXpath + i + afterXpathcurrentprice;
			WebElement element = driver.findElement(By.xpath(Actual_Xpath));
			System.out.println(element.getText());
		}
		
        System.out.println("***************************************");
		
		String afterXpathcharge = "]/td[5]"; 

		for (int i = 1; i <= row_size; i++) {
			String Actual_Xpath = beforeXpath + i + afterXpathcharge;
			WebElement element = driver.findElement(By.xpath(Actual_Xpath));
			System.out.println(element.getText());
		}
	}
}
