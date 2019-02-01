package com.demo.Testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.base.TestBase;
import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setup() {
		initialization1();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitle() {
		String title = loginpage.validateLogingPage();
		Assert.assertEquals(title, "Login-TechFios Test Application-Billing");
	}

	@Test(priority = 2)
	public void Logoimmage() {
		boolean logo = loginpage.logo();
		Assert.assertTrue(logo);
	}

	@Test(priority = 3)
	public void logingtest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
}
