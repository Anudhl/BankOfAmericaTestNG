package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddContact;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

public class SecondTest {
	
WebDriver driver;	


@BeforeTest
	
	public void setup() {

	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");	
		
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);	
		
		login.Login("techfiosdemo@gmail.com", "abc123");
		
		
		
}	
		
@Test		
		@Parameters({ "email" , "password",   "name",  "company",  "Emailcontact",  "phone", "address",  "city", "state", "zip", "country" })
			
public void AddContactTestNg(String email, String password, String name, String company, String Emailcontact, String phone, String address, String city, String state, String zip, String country) {
		
		
		
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		home.VerifyPageLogin();
		
       home.NavigatingtoAddContact();
		
		AddContact  contact = PageFactory.initElements(driver, AddContact.class);
		
		contact.FillinguptheAddressForm(name, company, Emailcontact, phone, address, city, state, zip, country);
		
}

@AfterTest
public void cleanup() {

	driver.close();
	
	driver.quit();
	
}
	
	



}
