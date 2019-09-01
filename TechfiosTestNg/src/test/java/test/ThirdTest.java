package test;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import org.testng.annotations.Test;


import page.LoginPage;
import util.BrowserFactory;

public class ThirdTest {

	public  WebDriver driver;
		


	@Test
		
		public void getScreenshot()throws InterruptedException, IOException   {
try {
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");	
			
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);	
			
			login.Login("techfios@gmail.com", "abc123");
			
			//HomePage home = PageFactory.initElements(driver, HomePage.class);
			
		//	home.VerifyPageLogin();
			
} catch (Exception e) {
	e.printStackTrace();
	
File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenshotFile, new File("/Users/anudahal/Desktop/claimscreeShot.png"));
	

}
	
	
	
	
	
	
	
	}
	
		}
	
	
	
			
	
	

