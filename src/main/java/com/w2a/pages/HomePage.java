package com.w2a.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.w2a.base.Page;

public class HomePage extends Page{
	
	
	public void goToSupport() {
		
		driver.findElement(By.cssSelector(".zh-support")).click();
		
	}
	
	public void goToSales() {
		
		driver.findElement(By.cssSelector(".zh-contact")).click();
		
	}
	
	public LoginPage goToLogin() {
		
		click("loginlink_CSS");
		
		return new LoginPage();
	}
	
	public void goToFreeSignUp() {
		
		driver.findElement(By.cssSelector(".zh-signup")).click();		
		
	}
	
	public void goToLearnMore() {
		
		driver.findElement(By.cssSelector("a.learn-more:nth-child(2)")).click();
	}
	
	public void validateFooterLinks() {
		
		List<WebElement> links=driver.findElements(By.cssSelector(".product-links.five-column >div>ul>li"));
		
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
	}

}
