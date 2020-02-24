package com.Vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
 
	@FindBy(name="user_name")
	private WebElement unTB;
 
	@FindBy(name ="user_password")
	private WebElement pwTB;
	
	@FindBy(id ="submitButton")
	private WebElement loginBtn;
	/**
	 * 
	 * @param driver
	 */
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassWord(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
}

