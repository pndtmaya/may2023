package mapping;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Search
{
	@When("user click on branches")
	public void user_click_on_branches() 
	{
		Object[] input6=new Object[1];
		input6[0]="(//*[@height='24'])[2]";
		SeleniumOperations.clickOnElement(input6);		
	}
	@When("user select {string} as country")
	public void user_select_as_country(String country)
	{
		Object [] input7=new Object[2];
		input7[0]="//*[@name='lst_countryS']";
		input7[1]=country;
		SeleniumOperations.selectValue(input7);
	}
	@When("user select {string} as state")
	public void user_select_as_state(String state) 
	{
		Object [] input8=new Object[2];
		input8[0]="//*[@name='lst_stateS']";
		input8[1]=state;
		SeleniumOperations.selectValue(input8);
	}

	@When("user select {string} as city")
	public void user_select_as_city(String city) 
	{
		Object [] input9=new Object[2];
		input9[0]="//*[@name='lst_cityS']";
		input9[1]=city;
		SeleniumOperations.selectValue(input9);
		
	   
	}

	@When("user click on search button")
	public void user_click_on_search_button() 
	{
		Object[] input10=new Object[1];
		input10[0]="//*[@id='btn_search']";
		SeleniumOperations.clickOnElement(input10);
	}

	@Then("application shows list of branches of mumbai city")
	public void application_shows_list_of_branches_of_mumbai_city() 
	{
		Object[] valid2=new Object[2];
		valid2[0]="(//*[text()='MUMBAI'])[1]";
	
		valid2[1]="MUMBAI";
		SeleniumOperations.Validation1(valid2);
	}



}
