package com.Vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	
	@FindBy(linkText="Organizations")
	private WebElement orgBTN;
	
	@FindBy(xpath ="//img[@title='Create Organization...']")
	private WebElement createOrg;

	@FindBy(name="accountname")
	private WebElement orgName;
 
	@FindBy(xpath = "//input[@value = '  Save  ']")
	private WebElement saveBtn;
	
	public void createNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnOrganizationsModule()
	{
		orgBTN.click();
	}
	
	public void clickOnCreateOrganizationBtn()
	{
		createOrg.click();
	}
	
	public void createNewOrganization(String name)
	{
		orgName.sendKeys(name);
	}
	
	public void clickOnSaveBtn()
	{
		saveBtn.click();
	}
	
	}
	
	



