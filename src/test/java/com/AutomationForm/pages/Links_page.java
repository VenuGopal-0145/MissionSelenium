package com.AutomationForm.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_page {
	public WebElement Home_new,Home_Pwp,Get_code,Api_201,Api_204,Api_301,Api_400,Api_401,Api_403,Api_404;
	public String url="https://www.tutorialspoint.com/selenium/practice/links.php";
	
	public void linkPage() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		Home_new=driver.findElement(By.linkText("Home"));
		Home_Pwp=driver.findElement(By.partialLinkText("PWP"));
		Api_201=driver.findElement(By.id("created"));
		Api_204=driver.findElement(By.id("no-content"));
		Api_301=driver.findElement(By.id("moved"));
		Api_400=driver.findElement(By.id("bad-request"));
		Api_401=driver.findElement(By.id("unauthorized"));
		Api_403=driver.findElement(By.id("forbidden"));
		Api_404=driver.findElement(By.id("not-found"));
		List<WebElement> eList=new ArrayList<WebElement>();
		eList.add(Api_201);
		eList.add(Api_204);
		eList.add(Api_301);
		eList.add(Api_400);
		eList.add(Api_401);
		eList.add(Api_403);
		eList.add(Api_404);
		
		 List<WebElement> elements=driver.findElements(By.xpath("//div[@class='col-md-8 col-lg-8 col-xl-8']/div"));
		 for(WebElement eset:eList )
		 {
			 for(WebElement get: elements) {
				 eset.click();
				 String valString=get.getText();
				 if(valString!="")
					 System.out.println(valString);
				 else 
					 continue;
				Thread.sleep(4000);
			 }
		 }
		
	}

}
