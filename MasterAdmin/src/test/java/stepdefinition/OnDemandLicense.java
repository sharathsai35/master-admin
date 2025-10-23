package stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OnDemandLicense {
	WebDriver driver;

	public OnDemandLicense(WebDriver driver) {
		this.driver = driver;
	}

	@Given("User has navigate to Login Url")
	public void user_has_navigate_to_login_url() throws InterruptedException {
		driver = Browser.getDriver();
		driver.get("http://192.168.2.19:3000");
		Thread.sleep(2000);
	}

	@When("User enters valid Mobile num")
	public void user_enters_valid_mobile_num_of_master_finance() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow font-medium']")).sendKeys("9347243214");
		Thread.sleep(1000);
	}

	@When("User enter Password")
	public void user_enter_password_of_master_finance() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("T");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("v");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("i");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("h");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("a");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("@");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("2");
		Thread.sleep(1000);
	}

	@When("User click on Proceed button of entered details")
	public void user_click_on_proceed_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
	}

	@When("User Enter the MFA Code")
	public void user_enter_the_mfa_code() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("123456");
		Thread.sleep(1000);
	}

	@When("User click Proceed button for MFA code of entered details")
	public void user_click_proceed_button_for_mfa_code() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
	}

	@And("User click on ondemand license")
	public void user_click_on_ondemand_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='On-Demand Licenses']")).click();
		Thread.sleep(1000);
	}

	@And("User click on any Partner name")
	public void user_click_on_any_Partner_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='T Verse']")).click();
		Thread.sleep(1000);
	}

	@And("User change the tabs in License")
	public void user_change_the_tabs_in_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='License History']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Logs']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Open Request']")).click();
		Thread.sleep(2000);
	}

	public void Login_Master_Finance() throws InterruptedException {
		Thread.sleep(2000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow font-medium']")).sendKeys("9985412605");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("@");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("u");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("m");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("i");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("t");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("h");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
	}

	@And("User click on pending license")
	public void user_click_on_pending_License() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Pending']")).click();
		Thread.sleep(1000);
	}

	public void Accept_ondemand_License_By_Master_Finance() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Approve']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:focus:textarea-primary ui:focus:border-none ui:w-full ui:rounded-lg ui:h-[76px] ui:resize-none']"))
				.sendKeys("Approve by Master Finance of ondemand License");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 5']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 6']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}

	public void Logout() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Logout']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
	}

	public void Login_Master_Admin() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow font-medium']")).sendKeys("9347243214");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("T");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("v");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("i");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("h");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("a");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("@");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
	}

	public void Accept_ondemand_License_By_Master_Admin() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Approve']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:focus:textarea-primary ui:focus:border-none ui:w-full ui:rounded-lg ui:h-[76px] ui:resize-none']"))
				.sendKeys("Approve by Master Admin of ondemand License");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 5']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 6']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}
}
