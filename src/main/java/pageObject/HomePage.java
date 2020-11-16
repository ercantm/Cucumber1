package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class HomePage extends Base {
	public static WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
  
	By icon = By.cssSelector("input[type*='checkbox']");
	By signin= By.xpath("//span[normalize-space()='Sign in']");
	By signout= By.cssSelector("//span[normalize-space()='Sign out']");
	
	public WebElement ClickIcon() {
	
      return driver.findElement(icon);

	}
	public WebElement Siginclick() {

		return driver.findElement(signin);

	}
	public WebElement  SignOut() {

		return driver.findElement(signout);

	}
	public void close() {
		driver.quit();
		
	}
}
