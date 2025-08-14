package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class Notifications {
	WebDriver driver;

	@Given("user has navigates to login page")
	public void user_has_navigates_to_login_page() throws InterruptedException {
		driver=Browser.getDriver();
		driver.get("http://192.168.2.19:3000");
		Thread.sleep(2000);
	}
	
	@When("user enter valid mobile num")
	public void user_enter_valid_mobile_num() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui-grow font-medium']")).sendKeys("9347243214");
		Thread.sleep(1000);
	}
	
	@And("user enters password")
	public void user_enters_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("T");
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("v");
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("i");
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("h");
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("a");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("@");
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("2");
		Thread.sleep(1000);
	}
	
	@And("user click on proceed button with the details")
	public void user_click_on_proceed_button_with_the_details() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
	}
	
	@And("user Enters the MFA code")
	public void user_Enters_the_MFA_code() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui-grow']")).sendKeys("123456");
		Thread.sleep(1000);
	}
	
	@And("user click proceed button for MFA code with the details")
	public void user_click_proceed_button_for_MFA_code_with_the_details() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
	}
	
	@And("user click on Notification page")
	public void user_click_on_Notification_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Notifications']")).click();
		Thread.sleep(1000);
	}
	
	@Then("validate the Notification page")
	public void validate_the_Notification_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//h1[text()='Notifications']")).getText();
		Assert.assertEquals("Notifications", a);
		Thread.sleep(1000);
	}
	
	@And("Click on Notification in heading partial link")
	public void click_on_Notification_in_heading_partial_link() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Notifications']")).click();
		Thread.sleep(1000);
	}
	
	@And("Click on Home in heading partial link")
	public void click_on_home_in_heading_partial_link() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Home']")).click();
		Thread.sleep(1000);
	}
	
	@Then("validate the Features page")
	public void validate_the_features_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//h1[text()='Features']")).getText();
		Assert.assertEquals("Features", a);
		Thread.sleep(1000);
	}
	
	@And("Click on All radio button in Notifications")
	public void Click_on_All_radio_button_in_notifications() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='All']")).click();
		Thread.sleep(1000);
	}
	
	@Then("validate the All licenses added by Super Admin & Master Admin")
	public void validate_the_All_licenses_added_by_super_admin_master_admin() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='space-y-2']")).getAttribute("class");
		Assert.assertEquals("space-y-2", a);
		Thread.sleep(1000);
	}
	
	@Then("Validate the licenses with title, name & date")
	public void validate_the_licenses_with_title_name_date() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='flex flex-col gap-1']")).getText();
		Assert.assertEquals("New Bulk License Top-up user Request from\n"
				+ "Sharath test (Master Admin)\n"
				+ "|\n"
				+ "21/07/2025\n"
				+ "10:14 AM", a);
		Thread.sleep(1000);
	}
	
	@And("Click on Super Admin radio button in Notifications")
	public void Click_on_super_admin_radio_button_in_notifications() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Super Admin']")).click();
		Thread.sleep(1000);
	}
	
	@Then("validate the Super Admin licenses tab")
	public void validate_the_super_admin_licenses_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='space-y-2']")).getAttribute("class");
		Assert.assertEquals("space-y-2", a);
		Thread.sleep(1000);
	}
	
	@And("Click on Master Admin radio button in Notifications")
	public void Click_on_Master_admin_radio_button_in_notifications() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Master Admin']")).click();
		Thread.sleep(1000);
	}
	
	@Then("validate the Master Admin licenses tab")
	public void validate_the_Master_admin_licenses_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='space-y-2']")).getAttribute("class");
		Assert.assertEquals("space-y-2", a);
		Thread.sleep(1000);
	}
	
	@And("Click on any Licenses in All Notification")
	public void Click_on_any_licenses_in_all_notifications() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flex flex-col gap-1']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Validate the highlighted tab")
	public void validate_the_highlighted_tab() throws InterruptedException {
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n"
				+ "/\n"
				+ "Bulk Licenses\n"
				+ "/\n"
				+ "View License", a1);
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Notifications']")).getText();
		Assert.assertEquals("Notifications", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}
	
	@And("Click on any Licenses in Super Admin Notification")
	public void Click_on_any_licenses_in_super_admin_notifications() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flex flex-col gap-1']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Validate the clicked Licenses in Super Admin & highlighted tab")
	public void validate_the_clicked_licenses_in_super_admin_highlighted_tab() throws InterruptedException {
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n"
				+ "/\n"
				+ "Bulk Licenses\n"
				+ "/\n"
				+ "View License", a1);
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Notifications']")).getText();
		Assert.assertEquals("Notifications", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}
	
	@And("Click on any Licenses in Master Admin Notification")
	public void Click_on_any_licenses_in_Master_admin_notifications() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flex flex-col gap-1']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Validate the clicked Licenses in Master Admin & highlighted tab")
	public void validate_the_clicked_licenses_in_Master_admin_highlighted_tab() throws InterruptedException {
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n"
				+ "/\n"
				+ "Bulk Licenses\n"
				+ "/\n"
				+ "View License", a1);
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Notifications']")).getText();
		Assert.assertEquals("Notifications", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}
	
	@And("Click on added or edited Partner company in All Notification")
	public void Click_on_added_or_edited_partner_company_in_all_notifications() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Naresh IT Solutions Partner has been added by']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Validate the highlighted tab & Partner Company")
	public void validate_the_highlighted_tab_partner_company() throws InterruptedException {
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n"
				+ "/\n"
				+ "Partners\n"
				+ "/\n"
				+ "Edit", a1);
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Notifications']")).getText();
		Assert.assertEquals("Notifications", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}
	
	@And("Click on On Demand Licenses in Super Admin Notification")
	public void Click_on_on_demand_licenses_in_super_admin_notifications() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='New On-Demand License Request from']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Validate the highlighted tab & On Demand Licenses")
	public void validate_the_highlighted_tab_on_demand_licenses() throws InterruptedException {
		String a1=driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n"
				+ "/\n"
				+ "On-Demand Licenses\n"
				+ "/\n"
				+ "View License", a1);
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Notifications']")).getText();
		Assert.assertEquals("Notifications", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}
}
