package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MasterFinance {
	WebDriver driver;
	
	@Given("User has navigate to Login Url")
	public void user_has_navigate_to_login_url() throws InterruptedException {
		driver=Browser.getDriver();
		driver.get("http://192.168.2.19:3000");
		Thread.sleep(2000);
	}
	
	@When("User enters valid Mobile num of Master Finance")
	public void user_enters_valid_mobile_num_of_master_finance() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow font-medium']")).sendKeys("9985412605");
		Thread.sleep(1000);
	}

	@When("User enter Password of Master Finance")
	public void user_enter_password_of_master_finance() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("@");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("u");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("m");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("i");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("t");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("h");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("4");
		Thread.sleep(1000);
	}
	
	@When("User click on Proceed button of entered details")
	public void user_click_on_proceed_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
	}

	@When("User Enter the MFA Code of Master Finance")
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
	
	@Then("Validate the Master Finance login page")
	public void validate_the_master_Finance_login_page() throws InterruptedException {
		Thread.sleep(2000);
		String a1=driver.findElement(By.xpath("//div[text()='Sumith']")).getText();
		Assert.assertEquals("Sumith", a1);
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Master Finance']")).getText();
		Assert.assertEquals("Master Finance", a);
		Thread.sleep(1000);
	}
	
	@Then("Click on Feature tab in Master Finance")
	public void click_on_features_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Features']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Features tab in Master Finance")
	public void validate_the_features_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Features']")).getText();
		Assert.assertEquals("Features", a1);
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
	
	@Then("Click on any Features in Master Finance")
	public void click_on_any_feature() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Split License']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Features is clickable or not")
	public void validate_the_feature_is_clickable_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n"
				+ "/\n"
				+ "Features", a1);
		Thread.sleep(1000);
	}
	
	@Then("Click on Plans tab in Master Finance")
	public void click_on_Plans_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Plans']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Plans tab in Master Finance")
	public void validate_the_Plans_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Plans']")).getText();
		Assert.assertEquals("Plans", a1);
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

	@Then("Click on any Plans in Master Finance")
	public void click_on_any_Plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Myntra Enterprise']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Plans in Master Finance is clickable or not")
	public void validate_the_Plan_is_clickable_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n"
				+ "/\n"
				+ "Plans", a1);
		Assert.fail();
		Thread.sleep(1000);
	}
	
	@Then("Click on Setup tab in Master Finance")
	public void click_on_Setup_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Setup']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Setup tab in Master Finance")
	public void validate_the_Setup_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Setup']")).getText();
		Assert.assertEquals("Setup", a1);
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

	@Then("Click on any Setup in Master Finance")
	public void click_on_any_Setup() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Vikas']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Setup in Master Finance is clickable or not")
	public void validate_the_Setup_is_clickable_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n"
				+ "/\n"
				+ "Setup", a1);
		Thread.sleep(1000);
	}
	
	@Then("Click on Partner tab in Master Finance")
	public void click_on_Partner_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Partners']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Partner tab in Master Finance")
	public void validate_the_Partner_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Partners']")).getText();
		Assert.assertEquals("Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Click on any Partner in Master Finance")
	public void click_on_any_Partner() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='IPHONE']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Partner in Master Finance is clickable or not")
	public void validate_the_Partner_is_clickable_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='ui:grow ui:p-4 bg-[#FAFAFA] scrollbar-thin h-screen overflow-y-auto w-[calc(100%-290px)]']")).getAttribute("class");
		Assert.assertEquals("ui:grow ui:p-4 bg-[#FAFAFA] scrollbar-thin h-screen overflow-y-auto w-[calc(100%-290px)]", a1);
		Assert.fail();
		Thread.sleep(1000);
	}
	
	@Then("Click on Bulk License tab in Master Finance")
	public void click_on_bulk_license_tab_in_master_finance() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Bulk Licenses']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Bulk License tab in Master Finance")
	public void validate_the_bulk_license_tab_in_master_finance() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Bulk Licenses']")).getText();
		Assert.assertEquals("Bulk Licenses", a1);
		Thread.sleep(1000);
	}

	@Then("Click on pending License in Master Finance")
	public void click_on_pending_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='IPHONE'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the pending License in Master Finance is clickable or not")
	public void validate_the_pending_license_page() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n"
				+ "/\n"
				+ "Bulk Licenses\n"
				+ "/\n"
				+ "View License", a1);
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='ui:bg-[#F2FAFF] ui:px-5 bg-[#F2FAFF]']")).getText();
		Assert.assertEquals("Open Request\n"
				+ "License History\n"
				+ "Logs\n"
				+ "Info" , a);
		Thread.sleep(1000);
	}
	
	@Then("Validate the Approve and Reject button")
	public void validate_the_approve_and_reject_button() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='mb-1 flex gap-1 items-center']")).getText();
		Assert.assertEquals("Billing Approval Pending from\n"
				+ "Master Finance", a1);
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("(//div[@class='flex items-center gap-2'])[2]")).getText();
		Assert.assertEquals("Approve\n"
				+ "Reject" , a);
		Thread.sleep(1000);
	}
	
	@Then("Click on Approve button for Pending License")
	public void click_on_Approve_button_for_pending_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approve']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Click on Reject button for Pending License")
	public void click_on_reject_button_for_pending_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reject']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Enter the reason for rejection")
	public void enter_the_reason_for_rejection() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//textarea[@class='ui:textarea ui:focus:textarea-primary ui:focus:border-none ui:w-full ui:rounded-lg ui:h-[76px] ui:resize-none'])[1]")).sendKeys("test");
		Thread.sleep(1000);
	}
	
	@Then("Enter the reason for Approval")
	public void enter_the_reason_for_Approval() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//textarea[@class='ui:textarea ui:focus:textarea-primary ui:focus:border-none ui:w-full ui:rounded-lg ui:h-[76px] ui:resize-none'])[1]")).sendKeys("test");
		Thread.sleep(1000);
	}
	
	@Then("Click on next button in reason")
	public void click_on_next_button_in_reason() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Enter the MFA code for rejecting the License")
	public void enter_the_mfa_code_for_rejecting_the_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 5']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 6']")).sendKeys("1");
		Thread.sleep(1000);
	}
	
	@Then("Enter the MFA code for approving the License")
	public void enter_the_mfa_code_for_approving_the_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 5']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 6']")).sendKeys("1");
		Thread.sleep(1000);
	}
	
	@Then("Click on Submit button for MFA code")
	public void click_on_submit_button_for_mfa_code() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Validate the toast msg of Rejected License")
	public void validate_the_toast_msg_of_rejected_license() throws InterruptedException {
		String a1=driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
	    Assert.assertEquals("Request Rejected!", a1);
	    Thread.sleep(1000);
	}
	
	@Then("Validate the toast msg of Approved License")
	public void validate_the_toast_msg_of_Approved_license() throws InterruptedException {
		String a1=driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
	    Assert.assertEquals("Request Approved!", a1);
	    Thread.sleep(1000);
	}
	
	@Then("Validate the Rejected license")
	public void validate_the_rejected_license() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='No Open Requests']")).getText();
		Assert.assertEquals("No Open Requests", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the Approved license")
	public void validate_the_Approved_license() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Billing Approval Approved By']")).getText();
		Assert.assertEquals("Billing Approval Approved By", a1);
		Thread.sleep(1000);
	}
	
	@Then("Click on On-Demand License tab in Master Finance")
	public void click_on_on_demand_license_tab_in_master_Finance() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='On-Demand Licenses']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the On-Demand License tab in Master Finance")
	public void validate_the_on_demand_license_tab_in_master_Finance() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='On-Demand Licenses']")).getText();
		Assert.assertEquals(a1, "On-Demand Licenses");
		Thread.sleep(1000);
	}

	@Then("Click on pending or Approved On-Demand License in Master Finance")
	public void click_on_pending_or_approved_on_demand_license() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='T Verse'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the pending or Approved On-Demand License page in Master Finance")
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
	
	@Then("Click on Notification in Master Finance")
	public void click_on_Notification_in_master_Finance() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Notifications']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Notification page in Master Finance")
	public void validate_the_Notification_page_in_master_Finance() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//h1[text()='Notifications']")).getText();
		Assert.assertEquals(a1, "Notifications");
		Thread.sleep(1000);
	}
}
