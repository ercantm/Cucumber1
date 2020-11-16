package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObject.HomePage;

public class Hooks {
	WebDriver driver;
	HomePage hp;
@Before("@SmokeTest")
	public void BeforeDefinition() throws IOException {
	//	driver=Base.getdiver();
//driver.get("http://www.gmibank.com/");	
	}

	@After("@SmokeTest")
	public void AfterDefinition() {
	//driver.close();	
}
}