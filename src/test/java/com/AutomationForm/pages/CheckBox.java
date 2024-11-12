package com.AutomationForm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public WebDriver driver;
	WebElement main_1,main_2,main_1_exp,main_2_exp,sub_11,sub_12,sub_21,sub_22;
	
	public void checkBox() {
		driver= new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.manage().window().maximize();
		
		main_1_exp=driver.findElement(By.xpath("//li[@id='bs_1']//span"));
		main_2_exp=driver.findElement(By.xpath("//li[@id='bs_2']//span"));
		main_1=driver.findElement(By.id("c_bs_1"));
		main_2=driver.findElement(By.id("c_bs_2"));
		sub_11=driver.findElement(By.id("c_bf_1"));
		sub_12=driver.findElement(By.id("c_bf_2"));
		sub_21=driver.findElement(By.id("c_bf_3"));
		sub_22=driver.findElement(By.id("c_bf_4"));
		
	
		
		if(sub_11.isEnabled()!=false) {
			main_1_exp.click();
			sub_11.click();
			sub_12.click();
			}
		if(sub_21.isEnabled()!=false)
			main_2_exp.click();
			sub_21.click();
			sub_22.click();
		
	}
		
	}


