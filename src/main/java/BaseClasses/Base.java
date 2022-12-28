package BaseClasses;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver getDriver() {
	WebDriverManager.chromedriver().setup();	
	WebDriver driver= new ChromeDriver();
	driver.get("https://groww.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;
	}
	

}
