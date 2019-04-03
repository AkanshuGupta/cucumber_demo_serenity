package net.serenitybdd.cucumber.features;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.features.steps.serenity.Steps;

public class StepDefination {
	

	
	@net.thucydides.core.annotations.Steps
	Steps steps;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		steps.user_is_on_login_page();
	}

	@Given("^user enter username and \"([^\"]*)\" and password as \"([^\"]*)\" and click Login button$")
	public void user_enter_username_and_and_password_as_and_click_Login_button(String arg1, String arg2) throws Throwable {
		steps.user_enter_username_and_and_password_as_and_click_Login_button(arg1, arg2);
	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		steps.home_page_is_displayed();
	}
	
	@When("^user is navgate to manage events page$")
	public void user_is_navgate_to_manage_events_page() throws Throwable {
		steps.user_is_navgate_to_manage_events_page();
	}
	
	@When("^user clicks on Draft tab$")
	public void user_clicks_on_Draft_tab() throws Throwable {
		steps.user_clicks_on_Draft_tab();
	}

	@When("^user clicks on first Manage button$")
	public void user_clicks_on_first_Manage_button() throws Throwable {
		steps.user_clicks_on_first_Manage_button();
	}
	
	@When("^user copy event (\\d+) times$")
	public void user_copy_event_times(int arg1) throws Throwable {
		steps.user_copy_event_times(arg1);
	}
	
	@Then("^verify event is copied (\\d+) times$")
	public void verify_event_is_copied_times(int arg1) throws Throwable {
		steps.verify_event_is_copied_times(arg1);
	}


}
