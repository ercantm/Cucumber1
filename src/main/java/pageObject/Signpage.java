package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class Signpage extends Base {
	public static WebDriver driver;

	public Signpage(WebDriver driver) {
		this.driver=driver;
		
	}

	By username = By.cssSelector("#username");
	By password= By.xpath("//input[@id='password']");
	By signin = By.cssSelector("button.btn.btn-primary:nth-child(2) > span");
	

	public WebElement userName() {

		return driver.findElement(username);

	}
	public WebElement passWord() {

		return driver.findElement(password);

	}
	public WebElement Signin() {

		return driver.findElement(signin);

	}
}
