package com.comcast.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class irctcpage {

	WebDriver driver;

	public irctcpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-5 col-xs-11 train-heading']/strong[contains(text(),' YPR BSP SPL (08292)')]")
	private WebElement train;

	public WebElement getTrain() {
		return train;
	}

}