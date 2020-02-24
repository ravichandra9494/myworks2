package com.Vtiger.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Vtiger.generic.BaseTest;
import com.Vtiger.generic.WebDriverUtils;
import com.Vtiger.pages.CreateNewOrganizationPage;
import com.Vtiger.pages.CreateOrganizationPage;

public class TestOrganizationPage extends BaseTest {
	
	@Test
	public void CreateOrganization() throws IOException
	{
		CreateOrganizationPage cop = new CreateOrganizationPage();
		cop.clickOnOrganizationsModule();
		cop.clickOnCreateOrganizationBtn();
			
		
		int num = WebDriverUtils.getRandomNum();
		String org_name = "ty_"+num;
		
		cop.createNewOrganization(org_name);
		
		String phone=WebDriverUtils.getCommonDatafromProperties("ph");
		cop.setPhoneNum(phone);
		
		String emailId = WebDriverUtils.getCommonDatafromProperties(org_name+"@gmail.com");
		cop.setEmailId(emailId);
		
		cop.clickOnAddMember();
		
		WebDriverUtils.switchToChildWindow(driver);
		
		cop.clickSelectList("Organization Name");
		cop.searchMemeber(WebDriverUtils.getCommonDatafromProperties(org_name));
		cop.selectMemeber();
		
		WebDriverUtils.acceptAlert(driver);
		WebDriverUtils.switchToParentWindow(driver);
		cop.clickOnSaveBtn();
		
	}

}
