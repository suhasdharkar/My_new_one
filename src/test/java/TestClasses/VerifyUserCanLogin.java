package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base;
import PomClasses.Homepage;
import PomClasses.Loginpage;


public class VerifyUserCanLogin {
	WebDriver driver;
	
	Loginpage lp;
	Homepage hp;
	@BeforeClass
		public void beforeClass(){
			driver=Base.getDriver();
	}
	@BeforeMethod
	public void beforeMethod() {
		lp= new Loginpage(driver);
		hp= new Homepage(driver);
	}
	@Test(priority=1)
	public void verifyUserCanLogin(){
		lp.clickOnLoginBtn();
		lp.enterEmailId();
		lp.ClickOnContineuBtn();
		lp.enterPassword();
		lp.ClickOnSubmitBtn();
		lp.enterPin();
	}
	@Test(priority=2)
	public void verifyUserCanDepositMoney() {
		
		hp.clickOnValut();
		hp.enterAmount();
		hp.depositeMoney();
	}
	
	@AfterMethod
	public void afterMethod() {
		
	}
	@AfterClass
	public void afterClass(){
		
	}
	

}
