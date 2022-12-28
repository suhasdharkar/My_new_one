package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.Util;

public class Homepage extends Util{
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/user/balance/inr']")
	private WebElement valut;
	
	@FindBy(xpath="//input[@id='wrs445Amount']")
	private WebElement enterAmount;
	
	@FindBy(xpath="//span[text()='DEPOSIT MONEY']")
	private WebElement depositeMoney;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickOnValut() {
		explicitWait(driver, valut, 10);
		valut.click();
	}
	public void enterAmount() {
		enterAmount.clear();
		enterAmount.sendKeys("100");
	}
	
	public void depositeMoney() {
		depositeMoney.click();
	}
}
