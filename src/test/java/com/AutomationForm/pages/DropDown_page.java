package com.AutomationForm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_page {
	public WebElement dropDown;
	public WebDriver driver;
	public String url="https://testautomationpractice.blogspot.com/",url1="https://training.rcvacademy.com/test-automation-practice-page";
	public void dropDown() {
		driver=new ChromeDriver();
		//driver.navigate().to(url);
		driver.navigate().to(url1);
		driver.manage().window().maximize();
		
//		Select dropSelect=new Select(driver.findElement(By.id("country")));
//		dropSelect.selectByVisibleText("India");
		
		Select select=new Select(driver.findElement(By.xpath("//select[@name='dropdown']")));
		select.selectByVisibleText("Meta");
	}

}
