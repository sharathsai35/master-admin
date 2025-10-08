package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MasterUser {
	WebDriver driver;
	
	@Given("User has navigate to Login page")
	public void user_has_navigate_to_login_page() throws InterruptedException {
		driver=Browser.getDriver();
		driver.get("http://192.168.2.19:3000");
		Thread.sleep(2000);
	}

	@When("User enters valid Mobile num")
	public void user_enters_valid_mobile_num() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow font-medium']")).sendKeys("9898989878");
		Thread.sleep(1000);
	}

	@When("User enter Password")
	public void user_enter_password() throws InterruptedException {
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

	@When("User click on Proceed button")
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

	@When("User click Proceed button for MFA code")
	public void user_click_proceed_button_for_mfa_code() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Master User login page")
	public void validate_the_master_user_login_page() throws InterruptedException {
		Thread.sleep(2000);
		String a1=driver.findElement(By.xpath("//div[text()='Vikas']")).getText();
		Assert.assertEquals(a1, "Vikas");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Master User']")).getText();
		Assert.assertEquals(a, "Master User");
		Thread.sleep(1000);
	}
	
	@Then("Click on Features tab")
	public void click_on_features_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Features']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Features tab")
	public void validate_the_features_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Features']")).getText();
		Assert.assertEquals(a1, "Features");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n"
				+ "Feature\n"
				+ "Category\n"
				+ "Platform\n"
				+ "Added Date\n"
				+ "Added By", a);
		Thread.sleep(1000);
	}

	@Then("Click on any Feature")
	public void click_on_any_feature() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Split License']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Feature is clickable or not")
	public void validate_the_feature_is_clickable_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals(a1, "Home\n"
				+ "/\n"
				+ "Features");
		Thread.sleep(1000);
	}
	
	@Then("Click on Plans tab in Master User")
	public void click_on_Plans_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Plans']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Plans tab in Master User")
	public void validate_the_Plans_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Plans']")).getText();
		Assert.assertEquals(a1, "Plans");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n"
				+ "Edition/Package\n"
				+ "Reference Name\n"
				+ "Edition/Package ID\n"
				+ "Duration/tenure\n"
				+ "Assigned To", a);
		Thread.sleep(1000);
	}

	@Then("Click on any Plan")
	public void click_on_any_Plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Myntra Enterprise']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Plan is clickable or not")
	public void validate_the_Plan_is_clickable_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals(a1, "Home\n"
				+ "/\n"
				+ "Plans");
		Assert.fail();
		Thread.sleep(1000);
	}
	
	@Then("Click on Setup tab")
	public void click_on_Setup_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Setup']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Setup tab")
	public void validate_the_Setup_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Setup']")).getText();
		Assert.assertEquals(a1, "Setup");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n"
				+ "Name\n"
				+ "Email\n"
				+ "Phone Number\n"
				+ "Added Date\n"
				+ "Who Added\n"
				+ "Role", a);
		Thread.sleep(1000);
	}

	@Then("Click on any Setup")
	public void click_on_any_Setup() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Vikas']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Setup is clickable or not")
	public void validate_the_Setup_is_clickable_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals(a1, "Home\n"
				+ "/\n"
				+ "Setup");
		Thread.sleep(1000);
	}
	
	@Then("Validate the Partner is displaying or not")
	public void validate_the_partner_is_displaying_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='ui:flex ui:flex-col ui:gap-1 ui:pl-3 text-sm']")).getText();
		Assert.assertEquals(a1, "Dashboard\n"
				+ "Features\n"
				+ "Plans\n"
				+ "Bulk Licenses\n"
				+ "On-Demand Licenses\n"
				+ "Setup");
		Thread.sleep(1000);
	}

	@Then("Click on Bulk License tab in Master User")
	public void click_on_bulk_license_tab_in_master_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Bulk Licenses']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Bulk License tab in Master User")
	public void validate_the_bulk_license_tab_in_master_user() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Bulk Licenses']")).getText();
		Assert.assertEquals(a1, "Bulk Licenses");
		Thread.sleep(1000);
	}

	@Then("Click on pending or Approved License")
	public void click_on_pending_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='IPHONE'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the pending or Approved License page")
	public void validate_the_pending_license_page() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals(a1, "Home\n"
				+ "/\n"
				+ "Bulk Licenses\n"
				+ "/\n"
				+ "View License");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='ui:bg-[#F2FAFF] ui:px-5 bg-[#F2FAFF]']")).getText();
		Assert.assertEquals(a, "Open Request\n"
				+ "License History\n"
				+ "Logs\n"
				+ "Info");
		Thread.sleep(1000);
	}
	
	@Then("Click on On-Demand License tab in Master User")
	public void click_on_on_demand_license_tab_in_master_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='On-Demand Licenses']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the On-Demand License tab in Master User")
	public void validate_the_on_demand_license_tab_in_master_user() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='On-Demand Licenses']")).getText();
		Assert.assertEquals(a1, "On-Demand Licenses");
		Thread.sleep(1000);
	}

	@Then("Click on pending or Approved On-Demand License")
	public void click_on_pending_or_approved_on_demand_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='T Verse'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the pending or Approved On-Demand License page")
	public void validate_the_pending_or_approved_on_demand_license_page() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals(a1, "Home\n"
				+ "/\n"
				+ "On-Demand Licenses\n"
				+ "/\n"
				+ "View License");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='ui:bg-[#F2FAFF] ui:px-5 bg-[#F2FAFF]']")).getText();
		Assert.assertEquals(a, "Open Request\n"
				+ "License History\n"
				+ "Logs\n"
				+ "Info");
		Thread.sleep(1000);
	}
	
	@Then("Click on Notification in Master User")
	public void click_on_Notification_in_master_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Notifications']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Notification page in Master User")
	public void validate_the_Notification_page_in_master_user() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Notifications']")).getText();
		Assert.assertEquals(a1, "Notifications");
		Thread.sleep(1000);
	}
}
