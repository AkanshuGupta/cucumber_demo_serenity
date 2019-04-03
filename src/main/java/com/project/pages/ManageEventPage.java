package com.project.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ManageEventPage extends PageObject {

	public void clickFirstManageBtn() throws InterruptedException {
		waitForTextToAppear("Meetaway Template");
//		int len = getDriver().findElements(By.className("item-text")).size();
		getDriver().findElements(By.className("item-text")).get(0).click();
	}
	
	public void clickCopy() throws InterruptedException {
		waitForPageLoaded();
		getDriver().findElements(By.className("link-list__item")).get(0).click();
	}
	
	@FindBy(id="newname")
	WebElementFacade eventName;
	public void setEventName(String val) throws InterruptedException {
		waitForPageLoaded();
		waitForTextToAppear("Copy this event");
		eventName.clear();
		eventName.sendKeys(val);
	}
	
	public void clickCopyEvent() throws InterruptedException {
		waitForTextToAppear("New Event Name:");
		int len = getDriver().findElements(By.className("btn")).size() - 1;
//		getDriver().findElements(By.className("btn")).get(len).click();
		evaluateJavascript("document.getElementsByClassName('btn')["+len+"].click()");
	}
	
	
	@FindBy(id="id_group-details-name")
	WebElementFacade eventValue;
	public String getEventName() throws InterruptedException {
		waitForPageLoaded();
		waitForTextToAppear("Event Details");
		return eventValue.getAttribute("value");
	}
	
	public void clickManagetab() throws InterruptedException {
		waitForPageLoaded();
		getDriver().findElement(By.id("tab_manage")).click();
		waitForPageLoaded();
	}
	
}
