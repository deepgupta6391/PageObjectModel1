package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{
	
	
	public void goToChat() {
		driver.findElement(By.cssSelector("._logo-chat._logo-x96.zod-app-logo")).click();
	}
	
	public CRMHomePage goToCRM() {
		clickAfterWait("crmLink_CSS");		
		return new CRMHomePage();
	}
	
	public void goToPeople() {
		driver.findElement(By.cssSelector("._logo-people._logo-x96.zod-app-logo")).click();
	}

}
