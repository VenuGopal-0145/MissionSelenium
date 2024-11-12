package com.AutomationForm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_page {
	public WebDriver driver;
	public WebElement yes,impressive,optional,selected_button;
	public void radioButton() {
		driver= new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.manage().window().maximize();
		
		yes=driver.findElement(By.xpath("//input[@value='igottwo']"));
		impressive=driver.findElement(By.xpath("//input[@value='igotthree']"));
		optional=driver.findElement(By.xpath("//input[@value='option3']"));
		selected_button=driver.findElement(By.xpath("//div[@id='check']"));
		
	}

}
