package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContact;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

import util.Xls_Reader;

public class AddContactTest {

Xls_Reader reader = new Xls_Reader("/Users/anudahal/PageObject/TechfiosTestNg/Data/testngdata.xlsx");
	
	String email=reader.getCellData("Sheet1", "Email", 2);
	
	String password = reader.getCellData("Sheet1", "Password", 2);
	
	String name = reader.getCellData("Sheet1", "Name", 2);
	
	String company = reader.getCellData("Sheet1", "Company", 2);
	
	String Email = reader.getCellData("Sheet1", "EmailContact", 2);
	
	String phone = reader.getCellData("Sheet1", "Phone", 2);
	
	String Address = reader.getCellData("Sheet1", "address", 2);
	
	String City = reader.getCellData("Sheet1", "city", 2);
	
	String State = reader.getCellData("Sheet1", "state", 2);
	
	String Zip  = reader.getCellData("Sheet1", "zipcode", 2);
	
	String Country = reader.getCellData("Sheet1", "country", 2);
	
	@Test
	
	public void AddContact() {

	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");	
		
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);	
		
		login.Login(email, password);
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		home.VerifyPageLogin();
		
	
		home.NavigatingtoAddContact();
		
		AddContact  contact = PageFactory.initElements(driver, AddContact.class);
		
		contact.FillinguptheAddressForm(name, company, Email, phone, Address, City, State, Zip, Country);
		
		driver.close();
		
		driver.quit();
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}