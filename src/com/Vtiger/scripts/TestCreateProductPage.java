package com.Vtiger.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Vtiger.generic.BaseTest;
import com.Vtiger.generic.WebDriverUtils;
import com.Vtiger.pages.CreateNewProductPage;

public class TestCreateProductPage extends BaseTest {
	
	@Test
	public void TestProductsPage() throws IOException
	{
		CreateNewProductPage cnp = new CreateNewProductPage();
		cnp.products();
		cnp.createNewProduct();
		cnp.addProduct(WebDriverUtils.getCommonDatafromProperties("product"));
		cnp.clickOnSaveBtn();
	}

}
