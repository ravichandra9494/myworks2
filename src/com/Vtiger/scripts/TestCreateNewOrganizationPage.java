package com.Vtiger.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Vtiger.generic.BaseTest;
import com.Vtiger.generic.WebDriverUtils;
import com.Vtiger.pages.CreateNewOrganizationPage;

public class TestCreateNewOrganizationPage extends BaseTest{

	@Test
	public void createNewOrganization() throws IOException
	{
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage();
		cop.clickOnOrganizationsModule();
		cop.clickOnCreateOrganizationBtn();
		
		String orgName = WebDriverUtils.getCommonDatafromProperties("org_Name");
		cop.createNewOrganization(orgName);
		
		cop.clickOnSaveBtn();
	}
}
