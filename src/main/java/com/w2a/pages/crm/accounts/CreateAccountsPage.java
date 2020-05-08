package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CreateAccountsPage extends Page{
	
	public void createAccount(String userName) {
		type("accountName_CSS", userName);
	}

}
