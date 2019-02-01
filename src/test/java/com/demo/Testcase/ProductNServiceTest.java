package com.demo.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.base.TestBase;
import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;
import com.demo.pages.ProductNServices;
import com.demo.util.Testutil;

public class ProductNServiceTest extends TestBase {

	HomePage homepage;
	LoginPage loginpage;
	ProductNServices productnservices;

	String sheetName = "NewServicesInfo";

	public ProductNServiceTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization1();
		loginpage = new LoginPage();
		productnservices = new ProductNServices();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@DataProvider
	public Object[][] tt() {
		Object[][] data = Testutil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "tt")
	public void CreateNewService() {
		productnservices.newservice("bob", "200", "2001", "This is my first service");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
