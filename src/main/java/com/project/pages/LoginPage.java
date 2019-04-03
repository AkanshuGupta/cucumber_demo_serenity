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

public class LoginPage extends com.project.pages.PageObject {

	@FindBy(className="primary-link")
	WebElementFacade loginLink;
	public void clickLoginLink() throws InterruptedException {
//		waitForPageLoaded();
//		loginLink.click();
		getDriver().get("https://www.eventbrite.com/signin/");
	}
	
	@FindBy(id="signin-email")
	WebElement email;
	public void enterEmail(String val) throws InterruptedException {
		waitForPageLoaded();
		waitForTextToAppear("Let's get started");
		email.sendKeys(val);
	}
	
	@FindBy(id="password")
	WebElement password;
	public void enterPassword(String val) throws InterruptedException {
		waitForPageLoaded();
		password.sendKeys(val);
	}
	
	@FindBy(className="eds-btn--submit")
	WebElementFacade getStarted;
	public void clickGetStarted() throws InterruptedException {
		waitForPageLoaded();
		waitForTextToAppear("Get Started");
		Thread.sleep(1999);
		getDriver().findElement(By.className("eds-btn--submit")).click();
	}
	
	public void clickLogIn() {
		getDriver().findElement(By.className("eds-btn--submit")).click();
	}
	
	public int getLoginAvtarLen() throws InterruptedException {
		waitForPageLoaded();
		return getDriver().findElements(By.className("user-avatar-icon")).size();
	}

}
