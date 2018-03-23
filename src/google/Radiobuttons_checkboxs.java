package google;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Radiobuttons_checkboxs 
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
	public void Radiobuutons() throws InterruptedException
	{      
        //Identifying Male radio button using its ID as an locator
        WebElement maleRadioBtn = driver.findElement(By.id("gender-male"));

        //Checking if the Male Radio button is displayed on the Webpage and printing the status
        boolean radioBtnIsDisplayed = maleRadioBtn.isDisplayed();
        System.out.println("Is Male radio button displayed: "+radioBtnIsDisplayed);
        
        //Checking if the Male Radio button is enabled on the webpage and printing the status
        boolean radioBtnIsEnabled = maleRadioBtn.isEnabled();
        System.out.println("Is Male radio button enabled: "+radioBtnIsEnabled);

        //Checking the default radio button selection status
        boolean radioBtnIsSelected = maleRadioBtn.isSelected();
        System.out.println("Default Radio button selection Status: "+radioBtnIsSelected); 

        //Selecting male radio button
        maleRadioBtn.click();
        
      //rechecking the male radio button selection status and printing it..
        boolean radioBtnNewSelectionStatus = maleRadioBtn.isSelected();
        System.out.println("Male radio Selection status after perform click() event: "+radioBtnNewSelectionStatus);                
	}

        @Test
    	public void Checkboxs() throws InterruptedException
    	{   
        	 
            //Identifying Terms and Condition checkbox using its ID as an locator
            WebElement tcCheckbox = driver.findElement(By.id("accept-privacy-policy"));

            //Checking if the Terms and Condition checkbox is displayed on the Webpage and printing its status
            boolean tcCheckIsDisplayed = tcCheckbox.isDisplayed();
            System.out.println("Is Terms and condition checkbox displayed: "+tcCheckIsDisplayed);

            //Checking if the Terms and Condition checkbox is enabled on the webpage and printing its status
            boolean tcCheckboxIsEnabled = tcCheckbox.isEnabled();
            System.out.println("Is Terms and condition checkbox enabled: "+tcCheckboxIsEnabled);
           
            //Checking the default selection status of Terms and Condition checkbox
            boolean tcCheckboxIsSelected = tcCheckbox.isSelected();
            System.out.println("Default Terms and Condition checkbox status: "+tcCheckboxIsSelected);
           
            //Selecting the Terms and conditions checkbox
            tcCheckbox.click();
            
            //rechecking the Terms and Condition checkbox status and priting its status
            boolean tcCheckboxNewStatus = tcCheckbox.isSelected();
            System.out.println("Terms and Condition checkbox status after perform click() event: "+tcCheckboxNewStatus);
    	}
    
	
	@AfterMethod
	public void Closebrowser() 
	{
		driver.close();
	}
	
	
	
}
