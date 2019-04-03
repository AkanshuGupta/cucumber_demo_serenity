package com.project.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.eventbrite.com")

public class HomePage extends com.project.pages.PageObject {

	@FindBy(className="primary-link")
	WebElementFacade loginLink;
	public void openManageEventPage() throws InterruptedException {
//		waitForPageLoaded();
//		loginLink.click();
		getDriver().get("https://www.eventbrite.com/myevents/");
	}
	
	public int getTotalDraft() throws InterruptedException {
		waitForPageLoaded();
		waitForTextToAppear("Manage Events");
		String temp = getDriver().findElement(By.className("js-draft-events-toggle")).findElement(By.tagName("em")).getText();
		System.out.println("TOTAL : " + temp);
		return Integer.parseInt(temp);
	}
	
	public void clickDraftTab() throws InterruptedException {
		getDriver().findElement(By.className("js-draft-events-toggle")).click();
	}

}
