package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.BrowserFactory;

public class AlertPopup {

	@Test
	public void popupTest() throws InterruptedException {
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demo.guru99.com/test/delete_customer.php");	
		
		driver.findElement(By.name("cusid")).sendKeys("2");
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().accept();
		
	
	
	
	//if you want to write a value in the pop up box
	
	driver.switchTo().alert().sendKeys("222");
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
