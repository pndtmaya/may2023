package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tempt 
{
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Support Folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://primusbank.qedgetech.com/");
		//Login
		driver.findElement(By.xpath("//*[@name='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPword']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		driver.findElement(By.xpath("//*[@src='images/Branches_but.jpg']")).click();
		
				
		//search branch
		Select country=new Select(driver.findElement(By.xpath("//*[@name='lst_countryS']")));
		country.selectByValue("INDIA");
		
		Select state=new Select(driver.findElement(By.xpath("//*[@name='lst_stateS']")));
		state.selectByValue("MAHARASTRA");
		
		Select city=new Select(driver.findElement(By.xpath("//*[@name='lst_cityS']")));
		city.selectByValue("MUMBAI");
		
		driver.findElement(By.xpath("//*[@id='btn_search']")).click();
		
		
	}

}
