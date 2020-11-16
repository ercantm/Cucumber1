package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.HomePage;
import pageObject.Signpage;

@RunWith(Cucumber.class)
public class StepDefinition {
	WebDriver driver;
//	HomePage hp;
//	Signpage sp;
 
	@Given("user is on landing page")
	public void user_is_on_landing_page() throws IOException {
		driver=Base.getdiver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//HomePage hp= new HomePage(driver);
	    // Write code here that turns the phrase above into concrete actions
	driver.get("http://www.gmibank.com");
	}

	@When("^user click  icon and sign in buttom$")
	public void user_click_icon_and_sign_in_buttom() throws Throwable {
	   //hp= new HomePage(driver);
		//hp.Siginclick().click();
		driver.findElement(By.cssSelector("a[class='d-flex align-items-center dropdown-toggle nav-link']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
	}

	@Then("^Home pahe is populated$")
	public void home_pahe_is_populated() throws Throwable {
		if(driver.findElements(By.xpath("//li[@id='account-menu']//div[@role='menu']//a[1]")).size()>0) {
			System.out.println("true");
		}
				
	}

	@And("^user login into aplication with username and password using$")
	public void user_login_into_aplication_with_username_and_password_using() throws Throwable {
		//sp=new Signpage(driver);
		
		//sp.Signin().sendKeys("Admin3");
		driver.findElement(By.cssSelector("#username")).sendKeys("Admin3");
		//sp.passWord().sendKeys("TechAdmin3");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TechAdmin3");
		driver.findElement(By.cssSelector("button.btn.btn-primary:nth-child(2) > span")).click();
		
	}

	@And("^Signout buttom is displayed$")
	public void signout_buttom_is_displayed() throws Throwable {
	System.out.println("sign out bottom is displayed : " );
	
	driver.findElement(By.xpath(" //li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")).click();
	Assert.assertTrue(driver.findElements(By.xpath("//span[normalize-space()='Sign out']")).size()>0);
	driver.findElement(By.xpath("//span[contains(text(),'Sign out')]")).click();
	driver.close();
	}
	
	
	  @Given("^user naviage  MGI Bank homa page botton$")
	  
	    public void user_naviage_mgi_bank_homa_page_botton() throws Throwable {
		  driver=Base.getdiver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  driver.get("http://www.gmibank.com");  
	    }

	    @When("^Home p user clicks sign in button$")
	    public void home_p_user_clicks_sign_in_button() throws Throwable {
	    	
			driver.findElement(By.cssSelector("button.btn.btn-primary:nth-child(2) > span")).click();
	    }

	    @Then("^user info successfully display$")
	    public void user_info_successfully_display() throws Throwable {
	    	Assert.assertTrue( driver.findElement(By.cssSelector("a[class='dropdown-item active'] span")).isEnabled());
	    	System.out.println("user info displayed");
	    	driver.close();
	    }

	    
	    @And("^user enter the valid username and password$")
	    public void user_enter_the_valid_username_and_password() throws Throwable {
	    	//sp=new Signpage(driver);
			
			//sp.Signin().sendKeys("Admin3");
			driver.findElement(By.cssSelector("#username")).sendKeys("Admin3");
			//sp.passWord().sendKeys("TechAdmin3");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TechAdmin3");
			
	    }
	    @When("^user clicks cancel button$")
	    public void user_clicks_cancel_button() throws Throwable {
	       driver.findElement(By.xpath(" //span[normalize-space()='Cancel']")).click();
	    }

	    @Then("^user info will not  display$")
	    public void user_info_will_not_display() throws Throwable {
	    	driver.findElement(By.xpath(" //li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")).click();
	    	Assert.assertTrue(driver.findElements(By.xpath("//span[normalize-space()='Sign out']")).size()<0); 
	   System.out.println("cancel button is working ");
	    
	    }

	}
	
	
	
	
	
	
	

