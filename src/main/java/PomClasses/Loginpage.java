package PomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.Util;

public class Loginpage {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Login/Register']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//input[@id='login_email1']")
	private WebElement mailIdField;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//input[@id='login_password1']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//input[@type='number']")
	private List<WebElement> pin;
	
	@FindBy(xpath="//div[text()='Please Enter Groww PIN here']")
	private WebElement growwPinText;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	public void clickOnLoginBtn() {
		loginbtn.click();
	}
	public void enterEmailId() {
		mailIdField.sendKeys("suhasdharkar5@gmail.com");
	}
	public void ClickOnContineuBtn() {
		continueBtn.click();
	}
	public void enterPassword() {
		password.sendKeys("Srd@1119");
	}
	public void ClickOnSubmitBtn() {
		submitBtn.click();
	}
	public void enterPin() {
		Util.explicitWait(driver, growwPinText,60);
		for(int i=1;i<=pin.size();i++) {
			driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1594");
		}
				
	}

}
