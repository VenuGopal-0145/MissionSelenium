package com.AutomationForm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TextBox_Page {
	public WebDriver driver;
	WebElement fullName,email,currentAddress,password,submit;
	public void textBox() throws InterruptedException {
		driver= new EdgeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		driver.manage().window().maximize();
 		fullName=driver.findElement(By.id("fullname"));
 		fullName.sendKeys("Venu");
 		System.out.println(fullName.getAttribute("value"));
 		email=driver.findElement(By.name("email"));
 		email.sendKeys("venu@gmail.com");
 		System.out.println(email.getAttribute("value"));
 		currentAddress=driver.findElement(By.id("address"));
 		currentAddress.sendKeys("Plot NO: 321, Gandipet, RR District");
 		System.out.println(currentAddress.getAttribute("value"));
 		password=driver.findElement(By.id("password"));
 		password.sendKeys("venugopal");
 		submit=driver.findElement(By.xpath("//*[@id=\"TextForm\"]/div[5]/input"));
 		Thread.sleep(5000);
 		submit.click();
 		Thread.sleep(3000);
 		driver.close();
	}

}
