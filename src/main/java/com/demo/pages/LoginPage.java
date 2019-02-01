
package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[@class=\"btn btn-sucess block full-width\"]")
	WebElement loginBtn;

	@FindBy(xpath = "//img[@class=\"logo\"]")
	WebElement TechFiosLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLogingPage() {
		return driver.getTitle();
	}

	public boolean logo() {
		return TechFiosLogo.isDisplayed();
	}

	public HomePage login(String un, String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		return new HomePage();

	}
}