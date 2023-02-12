package stepDefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.AddcustomerPage;
import PageObject.LoginPage;
import PageObject.SearchCustomerPage;


public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public AddcustomerPage addCust;
	public SearchCustomerPage searchCust;
	
	//Created for generating random string for Unique email
		public static String randomestring(){
			String generatedString1 = RandomStringUtils.randomAlphabetic(5);
			return (generatedString1);
		}
		
	
	
}
