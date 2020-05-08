package com.w2a.pages;

import com.w2a.base.Page;

public class LoginPage extends Page{


	public ZohoAppPage signIn(String username, String password) {
		type("email_CSS", username);
		click("nextBtn_CSS");
		typeForExplicitWait("password_CSS", password);
		click("nextBtn_CSS");
		
		return new ZohoAppPage();
	}

}
