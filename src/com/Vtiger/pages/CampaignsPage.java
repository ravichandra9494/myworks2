package com.Vtiger.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.generic.WebDriverUtils;

public class CampaignsPage {
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignsLink;
	
	@FindBy(xpath ="//img[@title='Create Campaign...']")
	private WebElement AddnewCampaign;
	
	@FindBy(name="campaignname")
	private WebElement cName;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement groupRadioBtn;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement userRadioBtn;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement selectProduct;
	
	@FindBy(id="search_txt")
	private WebElement searchFor;
	
	@FindBy(name="search_field")
	private WebElement selectDropdownList;
	
	@FindBy(xpath="(//table[@class='small'])[3]/tbody/tr[2]/td[1]/a")
	private WebElement clickOnProduct;
	
	@FindBy(xpath = "//input[@value = '  Save  ']")
	private WebElement saveBtn;
	
	public void campaignsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCampaigns()
	{
		campaignsLink.click();
	}
	
	public void clickOnAddNewCampaignBtn()
	{
		AddnewCampaign.click();
	}
	
	public void addCampaign(String cN)
	{
		cName.sendKeys(cN);;
	}
	
	public void clickOnGroupRadioBtn()
	{
		groupRadioBtn.click();
	}
	public void clickOnRadioBtn()
	{
		groupRadioBtn.click();
	}
	
	public void clickOnAddProduct() 
	{
		selectProduct.click();
	}
	
	public void searchMemeber(String mem)
	{
		searchFor.sendKeys(mem,Keys.ENTER);
	}
	
	public void clickSelectList(String name)
	{
		WebDriverUtils.select(selectDropdownList, name);
	}
	
	public void selectProduct()
	{
		clickOnProduct.click();
	}
	
	public void clickOnSaveBtn()
	{
		saveBtn.click();
	}
}
