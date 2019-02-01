package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.TestBase;

public class ProductNServices extends TestBase {

	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[6]/a/span[1]")
	WebElement Productnservices;
	@FindBy(xpath = "//*[@href='http://techfios.com/test/billing/?ng=ps/p-new/']")
	WebElement NewProduct;

	@FindBy(id = "name")
	WebElement Name;
	@FindBy(id = "sales_price")
	WebElement SalesPrice;
	@FindBy(id = "item_number")
	WebElement ItemNumber;
	@FindBy(id = "description")
	WebElement Description;
	@FindBy(id = "submit")
	WebElement submitBut;

	public ProductNServices() {

		PageFactory.initElements(driver, this);
	}

	public String validateLoginPage() {
		return driver.getTitle();
	}

	public HomePage newservice(String name, String salesprice, String itemnumber, String description) {
		Productnservices.click();
		NewProduct.click();
		Name.sendKeys(name);
		SalesPrice.sendKeys(salesprice);
		ItemNumber.sendKeys(itemnumber);
		Description.sendKeys(description);
		submitBut.click();

		return new HomePage();

	}

}
