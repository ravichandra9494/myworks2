package com.Vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage {

	@FindBy(linkText="Products")
	private WebElement productsLink;
	
	@FindBy(xpath="//img[@title = 'Create Product...' ]")
	private WebElement createNewProductIcon;
	
	@FindBy(name="productname")
	private WebElement pName;
	
	@FindBy(xpath = "//input[@value = '  Save  ']")
	private WebElement saveBtn;
	
	public void createNewProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void products()
	{
		productsLink.click();
	}

	public void createNewProduct()
	{
		createNewProductIcon.click();
	}
	
	public void addProduct(String pname)
	{
		pName.sendKeys(pname);
	}
	
	public void clickOnSaveBtn()
	{
		saveBtn.click();
	}
	
}

