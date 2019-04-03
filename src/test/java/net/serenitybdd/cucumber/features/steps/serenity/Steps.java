package net.serenitybdd.cucumber.features.steps.serenity;



import org.junit.Assert;

import com.project.common.TestDataSetup;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;
import com.project.pages.ManageEventPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;

public class Steps {
	LoginPage loginPage;
	HomePage homePage;
	ManageEventPage manageEventPage;
	
	@Step
	public void user_is_on_login_page() throws Throwable {
	    loginPage.open();
	    loginPage.clickLoginLink();
	}

	@Step
	public void user_enter_username_and_and_password_as_and_click_Login_button(String arg1, String arg2) throws Throwable {
		loginPage.enterEmail(arg1);
		loginPage.clickGetStarted();
		loginPage.enterPassword(arg2);
		loginPage.clickLogIn();
	}

	@Step
	public void home_page_is_displayed() throws Throwable {
	    Assert.assertEquals(1, loginPage.getLoginAvtarLen());
	}
	
	@Step
	public void user_is_navgate_to_manage_events_page() throws Throwable {
		homePage.openManageEventPage();
	}
	
	@Step
	public void user_clicks_on_Draft_tab() throws Throwable {
		TestDataSetup.setTotalEvents(homePage.getTotalDraft());
	    homePage.clickDraftTab();
	}
	
	@Step
	public void user_clicks_on_first_Manage_button() throws Throwable {
		manageEventPage.clickFirstManageBtn();
	}
	
	@Step
	public void user_copy_event_times(int times) throws Throwable {
	    for(int i= 0 ; i < times; i++) {
	    	manageEventPage.clickCopy();
		    manageEventPage.setEventName("Meetaway Template");
		    manageEventPage.clickCopyEvent();
		    Assert.assertEquals("Meetaway Template", manageEventPage.getEventName());
		    manageEventPage.clickManagetab();
	    }
	}
	
	@Step
	public void verify_event_is_copied_times(int arg1) throws Throwable {
		int total = TestDataSetup.getTotalEvents() + arg1;
	    Assert.assertEquals(total, homePage.getTotalDraft());
	}
}
