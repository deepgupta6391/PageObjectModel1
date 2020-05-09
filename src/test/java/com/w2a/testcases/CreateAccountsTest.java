package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountsPage;
import com.w2a.utilities.Utilities;

public class CreateAccountsTest {
	
	
	@Test(dataProviderClass = Utilities.class,dataProvider = "dp")
	public void createAccountsTest(Hashtable<String, String> data) {
		//throw new SkipException("testing extent report");
		ZohoAppPage zp=new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account =Page.menu.goToAccounts();
		CreateAccountsPage cap=account.goToCreateAccounts();
		cap.createAccount(data.get("accountname"));

	}
		
	

}
