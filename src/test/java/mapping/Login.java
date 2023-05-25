package mapping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Login 
{

	@Given("user open {string} browser with exe as {string}")
	public void user_open_browser_with_exe_as(String bname, String exe) 
	{
		Object[] input1=new Object[2];
		input1[0]=bname;
		input1[1]=exe;				
		SeleniumOperations.browserLaunch(input1 );
		
	}
	@Given("user enter url as {string}")
	public void user_enter_url_as(String url)
	{
		Object[] input2=new Object[1];
		input2[0]=url;
		SeleniumOperations.openApplication(input2);
	}

	@When("^user enter (.*) as username$")
	public void user_enter_as_username(String uname) 
	{
		Object[] input3=new Object[2];
		input3[0]="//*[@name='txtuId']";
		input3[1]=uname;
		SeleniumOperations.enterTextOnUI(input3);
	}

	@When("^user enter (.*) as password$")
	public void user_enter_as_password(String pwd)
	{
		Object[] input4=new Object[2];
		input4[0]="//*[@name='txtPword']";
		input4[1]=pwd;
		SeleniumOperations.enterTextOnUI(input4);
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
		Object[] input5=new Object[1];
		input5[0]="//*[@name='login']";
		SeleniumOperations.clickOnElement(input5);
	   
	}

	@Then("application shows Admin page to user")
	public void application_shows_admin_page_to_user() 
	{
		
		
		Object[] valid1=new Object[2];
		valid1[0]="//*[text()='Admin']";
		valid1[1]="Admin";
		SeleniumOperations.Validation1(valid1);
		
	}

	



	
}
