package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountsPage;

public class LoginTest extends Page{

	public static void main(String[] args){
			
		//This is rough package
		HomePage home=new HomePage();
		
		LoginPage lp=home.goToLogin();
		ZohoAppPage zp=lp.signIn("deep.gupta.6391@gmail.com","Lovely@123");
		zp.goToCRM();
		AccountsPage account =Page.menu.goToAccounts();
		CreateAccountsPage cap=account.goToCreateAccounts();
		cap.createAccount("Deeps");
	}

}
