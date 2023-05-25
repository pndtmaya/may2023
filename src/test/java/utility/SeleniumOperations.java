package utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations
{
	public static WebDriver driver;
	public static void browserLaunch(Object[] inputParameters)
	{
		String bname=(String) inputParameters[0];
		String exe=(String) inputParameters[1];
		if(bname.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", exe);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		
	}
	
	public static void openApplication(Object[] inputParameters)
	{
		String url=(String) inputParameters[0];
		driver.get(url);
		
	}
	public static void enterTextOnUI(Object[] inputParameters)
	{
		String xpath=(String) inputParameters[0];
		String text=(String) inputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		
	}
	public static void clickOnElement(Object[] inputParameters)
	{
		String xpath=(String) inputParameters[0];

		driver.findElement(By.xpath(xpath)).click();
	}
	public static void selectValue(Object[] inputParameters)
	{
		String xpath=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		
		Select sel=new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByValue(value);
		
	}
	public static void Validation1(Object[] inputParameters)
	{
		
		try {
			String xpath=(String) inputParameters[0];
			String givenText=(String) inputParameters[1];
			String captureText=driver.findElement(By.xpath(xpath)).getText();
				
		
			if(captureText.equalsIgnoreCase(givenText))
			{
				System.out.println("test case passed");
			}
			else
			{
				System.out.println("test case failed");
				
			}
		}catch(Exception e)
		{
			System.out.println("test case fail");
		}
		
				
	}
	public static void Validation2(Object[] inputParameters)
	{
		
			Alert a=driver.switchTo().alert();
			String givenText=(String) inputParameters[0];
			String captureText=a.getText();
				
		
			if(captureText.equalsIgnoreCase(givenText))
			{
				System.out.println("test case passed");
			}
			else
			{
				System.out.println("test case failed");
			}
			a.dismiss();
		
				
	}
	
}
