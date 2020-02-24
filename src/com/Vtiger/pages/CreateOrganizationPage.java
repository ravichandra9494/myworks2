package com.Vtiger.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.generic.WebDriverUtils;

public class CreateOrganizationPage {
	
	@FindBy(linkText="Organizations")
	private WebElement orgBTN;
	
	@FindBy(xpath ="//img[@title='Create Organization...']")
	private WebElement createOrg;

	@FindBy(name="accountname")
	private WebElement orgName;
 
	@FindBy(id="phone")
	private WebElement phoneNum;
	
	@FindBy(id="email1")
	private WebElement emailId;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement selectMember;
	
	@FindBy(id="search_txt")
	private WebElement searchFor;
	
	@FindBy(name="search_field")
	private WebElement selectDropdownList;
	
	@FindBy(xpath="(//table[@class='small'])[3]/tbody/tr[2]/td[1]/a")
	private WebElement clickOnMemeber;
	
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
	
	public void setPhoneNum(String ph_Num)
	{
		phoneNum.sendKeys(ph_Num);
	}
	
	public void setEmailId(String id)
	{
		emailId.sendKeys(id);
	}
	
	public void clickOnAddMember()
	{
		selectMember.click();
	}
	
	public void searchMemeber(String mem)
	{
		searchFor.sendKeys(mem,Keys.ENTER);
	}
	
	public void clickSelectList(String name)
	{
		
		WebDriverUtils.select(selectDropdownList,name );
	}
	
	public void selectMemeber()
	{
		clickOnMemeber.click();
	}
	public void clickOnSaveBtn()
	{
		saveBtn.click();
	}
	

}
