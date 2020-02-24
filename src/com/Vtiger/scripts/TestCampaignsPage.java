package com.Vtiger.scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.Vtiger.generic.BaseTest;
import com.Vtiger.generic.WebDriverUtils;
import com.Vtiger.pages.CampaignsPage;

public class TestCampaignsPage extends BaseTest {
	
	@Test
	public void CampaignsPage() throws IOException
	{
		 CampaignsPage cp = new CampaignsPage();
		 WebDriverUtils.moveMouseOnElement(driver.findElement(By.linkText("More")), driver);
		 cp.clickOnCampaigns();
		 cp.clickOnAddNewCampaignBtn();
		 cp.addCampaign(WebDriverUtils.getCommonDatafromProperties("campaignName"));
		 cp.clickOnAddProduct();
		 	 
		 WebDriverUtils.switchToChildWindow(driver);
		 cp.clickSelectList("Product Name");
		 cp.searchMemeber(WebDriverUtils.getCommonDatafromProperties("product"));
		 cp.selectProduct(); 
		 WebDriverUtils.switchToParentWindow(driver);
		 WebDriverUtils.acceptAlert(driver);
		 cp.clickOnSaveBtn();
		 
	}

}
