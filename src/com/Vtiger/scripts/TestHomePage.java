package com.Vtiger.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Vtiger.generic.BaseTest;
import com.Vtiger.generic.WebDriverUtils;
import com.Vtiger.pages.HomePage;

public class TestHomePage extends BaseTest
{
	@Test
	public void validLoginPage() throws IOException, InterruptedException
	{
		BaseTest.OpenApplication();
		HomePage hp = new HomePage(driver);
		System.out.println(hp);
		Thread.sleep(2000);
		//BaseTest.OpenApplication();
		String un1= WebDriverUtils.getCommonDatafromProperties("username");
		String pd1 = WebDriverUtils.getCommonDatafromProperties("password");
		System.out.println(un1);
		System.out.println(pd1);
		hp.setUserName(un1);
		hp.setPassWord(pd1);
		hp.clickOnLoginBtn();
		
	}

}
