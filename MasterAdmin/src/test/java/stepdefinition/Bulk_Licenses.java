package stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Bulk_Licenses {
	WebDriver driver;

	public Bulk_Licenses(WebDriver driver) {
		this.driver = driver;
	}

	public void Login_Master_Finance() throws InterruptedException {
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow font-medium']")).sendKeys("9985412605");
		Thread.sleep(1000);
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

	@Given("user has navigate to login page")
	public void user_has_navigate_to_login_page() throws InterruptedException {
		driver = Browser.getDriver();
		driver.get("http://192.168.2.19:3000");
		Thread.sleep(2000);
	}

	@Then("User clicked on bulk licenses")
	public void User_clicked_on_bulk_licenses() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Bulk Licenses']")).click();
		Thread.sleep(3000);
	}

	@Then("User click on pending licenses")
	public void User_clicked_on_pending_licenses() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Pending']")).click();
		Thread.sleep(3000);
	}

	@Then("User accept the license from master Finance")
	public void User_accept_the_license_from_master_finance() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approve']")).click();
		Thread.sleep(1000);
	}

	@Then("User write the reason why he accepted the license from master Finance")
	public void User_write_the_reason_why_he_accepted_the_license_from_master_finance() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:focus:textarea-primary ui:focus:border-none ui:w-full ui:rounded-lg ui:h-[76px] ui:resize-none']"))
				.sendKeys("Approve by Master Finance");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
	}

	@Then("User enter the MFA code for accepting the license from master Finance")
	public void User_enter_the_mfa_code_for_accepting_the_license_from_master_finance() throws Throwable {
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

	@Then("User accept the license from master Admin")
	public void User_accept_the_license_from_master_admin() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approve']")).click();
		Thread.sleep(1000);
	}

	@Then("User write the reason why he accepted the license from master Admin")
	public void User_write_the_reason_why_he_accepted_the_license_from_master_admin() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:focus:textarea-primary ui:focus:border-none ui:w-full ui:rounded-lg ui:h-[76px] ui:resize-none']"))
				.sendKeys("Approve by Master Admin");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
	}

	@Then("User enter the MFA code for accepting the license from master Admin")
	public void User_enter_the_mfa_code_for_accepting_the_license_from_master_admin() throws Throwable {
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

	@And("User clicked on search")
	public void User_clicked_on_search() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
		Thread.sleep(2000);
	}

	@And("User started entering {string} in search box")
	public void User_started_entering_in_search_box(String SearchName) throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(SearchName);
		Thread.sleep(2000);
	}

	@And("User observe the page")
	public void User_observe_the_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='1']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on filter by status")
	public void User_clicked_on_filter_by_status() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Filter By Status']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe filter by status items")
	public void User_observe_filter_by_status_items() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Apply']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on apply")
	public void User_clicked_on_apply() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
	}

	@Then("User must able to observe the default state again")
	public void User_must_able_to_observe_the_default_state_again() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='1']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User must able to observe default state again and also all filter need to removed and filter by status header need to visible but all filter is getting displayed its an error")
	public void User_must_able_to_observe_default_state_again_and_also_all_filter_need_to_removed_and_filter_by_status_header_need_to_visible_but_all_filter_is_getting_displayed_its_an_error()
			throws Throwable {
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Filter By Status']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on clear1")
	public void User_clicked_on_clear1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='clear']")).click();
		Thread.sleep(2000);
	}

	@And("User selected all check box")
	public void User_selected_all_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("allCheckbox")).click();
		Thread.sleep(2000);
	}

	@And("User selected pending check box")
	public void User_selected_pending_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Pending']")).click();
		Thread.sleep(2000);
	}

	@And("User selected Pending L2 check box")
	public void User_selected_Pending_L2_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Pending (L2)']")).click();
		Thread.sleep(2000);
	}

	@And("User selected Approved check box")
	public void User_selected_Approved_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Approved']")).click();
		Thread.sleep(2000);
	}

	@And("User selected Rejected L1 check box")
	public void User_selected_Rejected_L1_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Rejected (L1)']")).click();
		Thread.sleep(2000);
	}

	@And("User selected Rejected L2 check box")
	public void User_selected_Rejected_L2_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Rejected (L2)']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on Model type")
	public void User_clicked_on_Model_type() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Model Type'][1]")).click();
		Thread.sleep(3000);
	}

	@And("User selected SaaS check box")
	public void User_selected_SaaS_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='SaaS'][1]")).click();
		Thread.sleep(2000);
	}

	@And("User selected API SaaS check box")
	public void User_selected_API_SaaS_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='API SaaS']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on partner contact eye icon")
	public void User_clicked_on_partner_contact_eye_icon() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui-cursor-pointer')])[1]")).click();
		Thread.sleep(2000);
	}

	@Then("observe filter by status items1")
	public void observe_filter_by_status_items1() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Apply']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on calender filter by date1")
	public void User_clicked_on_calender_filter_by_date1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Filter by date']")).click();
		Thread.sleep(2000);
	}

	@And("User selected today1")
	public void User_selected_today1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Today']")).click();
		Thread.sleep(3000);
	}

	@Then("User clicked on done1")
	public void User_clicked_on_done1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on Reset1")
	public void User_clicked_on_Reset1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(2000);
	}

	@And("User selected yesterday1")
	public void User_selected_yesterday1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Yesterday']")).click();
		Thread.sleep(3000);
	}

	@And("User selected last week1")
	public void User_selected_last_week1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Last week']")).click();
		Thread.sleep(3000);
	}

	@And("User selected last 7 days1")
	public void User_selected_last_7_days1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Last 7 days']")).click();
		Thread.sleep(3000);
	}

	@And("User selected This month1")
	public void User_selected_This_month1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='This month']")).click();
		Thread.sleep(3000);
	}

	@And("User selected last 30 days1")
	public void User_selected_last_30_days1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Last 30 days']")).click();
		Thread.sleep(2000);
	}

	@And("User selected Custom range1")
	public void User_selected_Custom_range1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Custom range']")).click();
		Thread.sleep(2000);
	}

	@And("User selected paticular date1")
	public void User_selected_paticular_date1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='17']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicking on headers filter1")
	public void User_clicking_on_headers_filter1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[20]")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on set defaults1")
	public void User_clicked_on_set_defaults1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='set defaults']")).click();
		Thread.sleep(2000);
	}

	@Then("User must able to observe the default state again and also all need to removed and model type need to be displayed its not getting displayed")
	public void User_must_able_to_observe_the_default_state_again_and_also_all_need_to_removed_and_model_type_need_to_be_displayed_its_not_getting_displayed()
			throws Throwable {
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Model Type'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed filter by status all lists")
	public void User_observed_filter_by_status_all_lists() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='All']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed filter by status pending licenses")
	public void User_observed_filter_by_status_pending_licenses() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Pending']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed filter by status pending L2 licenses")
	public void User_observed_filter_by_status_pending_L2_licenses() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Pending (L2)']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed filter by status Approved licenses")
	public void User_observed_filter_by_status_Approved_licenses() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Approved']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed filter by status Rejected L1 licenses")
	public void User_observed_filter_by_status_Rejected_L1_licenses() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Rejected (L1)']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed filter by status Rejected L2 licenses")
	public void User_observed_filter_by_status_Rejected_L2_licenses() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Rejected (L2)']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User should able to displayed as pending L1 but its just displaying pending")
	public void User_should_able_to_displayed_as_pending_L1_but_its_just_displaying_pending() throws Throwable {
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Pending']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed all model types lists")
	public void User_observed_all_model_types_lists() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='All']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed model type SaaS lists")
	public void User_observed_model_type_SaaS_lists() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='SaaS'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed model type API SaaS lists")
	public void User_observed_model_type_API_SaaS_lists() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='API SaaS'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed filters and calender dates")
	public void User_observed_filters_and_calender_dates() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Done']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed selected Today")
	public void User_observed_selected_Today() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Today']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed selected yesterday")
	public void User_observed_selected_yesterday() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Yesterday']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed selected last week")
	public void User_observed_selected_last_week() throws Throwable {
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div/div/div[1]"))
						.isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed selected last 7 days")
	public void User_observed_selected_last_7_days() throws Throwable {
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div/div/div[1]"))
						.isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed selected This month")
	public void User_observed_selected_This_month() throws Throwable {
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div/div/div[1]"))
						.isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed selected last 30 days")
	public void User_observed_selected_last_30_days() throws Throwable {
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div/div/div[1]"))
						.isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed calender dates")
	public void User_observed_calender_dates() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Done']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed selected Custom range")
	public void User_observed_selected_Custom_range() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Custom range']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on next arrow")
	public void User_clicked_on_next_arrow() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[2]//*[name()='svg']"))
				.click();
		Thread.sleep(2000);
	}

	@Then("User again clicked on previous arrow")
	public void User_again_clicked_on_previous_arrow() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M 13.28125')]")).click();
		Thread.sleep(2000);
	}

	@And("User observers the search result as no records found")
	public void User_observers_the_search_result_as_no_records_found() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='No Records Found']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observers the search result")
	public void User_observers_the_search_result() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='1']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on create new bulk licenses")
	public void User_clicked_on_create_new_bulk_licenses() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Create New Bulk License']")).click();
		Thread.sleep(1000);
	}

	@Then("User observed the page of creation")
	public void User_observed_the_page_of_creation() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Submit']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("Click on back button")
	public void Click_on_back_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='path'])[27]")).click();
		Thread.sleep(2000);
	}

	@Then("User observe the title of the page")
	public void User_observe_the_title_of_the_page() throws Throwable {
		String title = driver.getTitle();
		System.out.println("This is the Title " + title);
		Thread.sleep(2000);
	}

	@Then("User observed licenses type header")
	public void User_observed_licenses_type_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='License Type*']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on subscription")
	public void User_clicked_on_subscription() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Subscription']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on trial")
	public void User_clicked_on_trial() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trial']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed trial header")
	public void User_observed_trial_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Trial Period']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on 14days of trial period")
	public void User_clicked_on_14days_of_trial_period() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='14 Days']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed trial date extension accept limit")
	public void User_observed_trial_date_extension_accept_limit() throws Throwable {
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[text()='Trial Date Extension Accept Limit']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on trial date extension accept limit")
	public void User_clicked_on_trial_date_extension_accept_limit() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='3 times']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed add new partner button")
	public void User_observed_add_new_partner_button() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Add new Partner']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on add new partner button")
	public void User_clicked_on_add_new_partner_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add new Partner']")).click();
		Thread.sleep(2000);
	}

	@And("User observed add partner page")
	public void User_observed_add_partner_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Add Partner']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed partner name drop down")
	public void User_observed_partner_name_drop_down() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Partner Name*']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on partner name drop down")
	public void User_clicked_on_partner_name_drop_down() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[1]")).click();
		Thread.sleep(2000);
	}

	@And("User observed partner names in drop down")
	public void User_observed_partner_names_in_drop_down() throws Throwable {
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[3]"))
						.isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed search box")
	public void User_observed_search_box() throws Throwable {
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[3]"))
						.isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked search box")
	public void User_clicked_search_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("zap");
		Thread.sleep(2000);
	}

	@Then("User started entering invalid content {string} into search box")
	public void User_started_entering_invalid_content_into_search_box(String Content) throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Content);
		Thread.sleep(2000);
	}

	@And("Observe the message")
	public void Observe_the_message() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='No Match Found!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User started entering valid content {string} into search box")
	public void User_started_entering_valid_content_into_search_box(String Content1) throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Content1);
		Thread.sleep(2000);
	}

	@And("User selected a partner name")
	public void User_selected_a_partner_name() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Zap 7']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed Model drop down")
	public void User_observed_Model_drop_down() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Model*']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on Model drop down")
	public void User_clicked_on_Model_drop_down() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).click();
		Thread.sleep(2000);
	}

	@And("User observed drop down options")
	public void User_observed_drop_down_options() throws Throwable {
		Assert.assertTrue(driver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[5]/div[1]/div[2]/div/div[3]"))
				.isDisplayed());
		Thread.sleep(2000);
	}

	@And("User selected one drop down option")
	public void User_selected_one_drop_down_option() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='SaaS']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed edition drop down")
	public void User_observed_edition_drop_down() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Edition*']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on edition drop down")
	public void User_clicked_on_edition_drop_down() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[3]")).click();
		Thread.sleep(2000);
	}

	@And("User select the edition name")
	public void User_select_the_edition_name() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Myntra Enterprise']")).click();
		Thread.sleep(1000);
	}

	@Then("User observe the drop down options")
	public void User_observe_the_drop_down_options() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='No Records!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed package drop down")
	public void User_observed_package_drop_down() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Package']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on package drop down")
	public void User_clicked_on_package_drop_down() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(2000);
	}

	@And("User click on apply button in package")
	public void User_clicked_on_apply_button_in_package() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(2000);
	}

	@And("User click on all checkbox in package")
	public void User_clicked_on_all_checkbox_in_package() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='allCheckbox']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed Individual Add on drop down")
	public void User_observed_Individual_Add_on_drop_down() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Individual Add-on']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on Individual Add on drop down")
	public void User_clicked_on_Individual_Add_on_drop_down() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(2000);
	}

	@And("User click on apply button in addons")
	public void User_clicked_on_apply_button_in_addons() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(2000);
	}

	@And("User click on all checkbox in addons")
	public void User_clicked_on_all_checkbox_in_addons() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='allCheckbox']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed No of users")
	public void User_observed_No_of_users() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='No. of users*']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on No of users")
	public void User_clicked_on_No_of_users() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter']")).click();
		Thread.sleep(2000);
	}

	@Then("User started entering alphabetics")
	public void User_started_entering_alphabetics() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter']")).sendKeys("ab");
		Thread.sleep(2000);
	}

	@Then("User started entering numeric")
	public void User_started_entering_numeric() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter']")).sendKeys("20");
		Thread.sleep(2000);
	}

	@Then("User started entering special characters")
	public void User_started_entering_special_characters() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter']")).sendKeys("1@s");
		Thread.sleep(2000);
	}

	@Then("User observed Date Range Start date end date")
	public void User_observed_Date_Range_Start_date_end_date() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[text()='Date Range (Start date - end date)*']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on start date and selected a paticular date")
	public void User_clicked_on_start_date_and_selected_a_paticular_date() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("startDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='24']")).click();
		Thread.sleep(1000);
	}

	@Then("User clicked on end date and selected a paticular date")
	public void User_clicked_on_end_date_and_selected_a_paticular_date() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("endDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='31']")).click();
		Thread.sleep(1000);
	}

	@Then("User clicked on reset1")
	public void User_clicked_on_reset1() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on submit")
	public void User_clicked_on_submit() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
	}

	@And("Observe the page1")
	public void Observe_the_page1() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Subscription']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed partner names in drop down1")
	public void User_observed_partner_names_in_drop_down1() throws Throwable {
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[3]"))
						.isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed search box1")
	public void User_observed_search_box1() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on dropdown of partner name in Subscription")
	public void User_clicked_on_drop_down_of_partner_name_in_subscription() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[1]")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on Model drop down in subscription")
	public void User_clicked_on_Model_drop_down_in_subscription() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).click();
		Thread.sleep(2000);
	}

	@Then("User observed edition drop down in subscription")
	public void User_observed_edition_drop_down_in_subscription() throws Throwable {
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div"))
						.isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on edition drop down in subscription")
	public void User_clicked_on_edition_drop_down_in_subscription() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[3]")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on package drop down1")
	public void User_clicked_on_package_drop_down_in_subscription() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on Individual Add on drop down1")
	public void User_clicked_on_Individual_Add_on_drop_down_in_subscription() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on start date and selected a paticular date1")
	public void User_clicked_on_start_date_and_selected_a_paticular_date1() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Start Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='24']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on end date and selected a paticular date1")
	public void User_clicked_on_end_date_and_selected_a_paticular_date1() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='31']")).click();
		Thread.sleep(2000);
	}

	@And("User observed drop down options1")
	public void User_observed_drop_down_options1() throws Throwable {
		Assert.assertTrue(driver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[1]/div[2]/div/div[3]"))
				.isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User selected one edition name from drop down")
	public void User_selected_one_edition_name_from_drop_down() throws Throwable {
		driver.findElement(By.xpath("//div[text()='Bio Enterprise']")).click();
		Thread.sleep(2000);
	}

	@Then("User selected one package name from drop down")
	public void User_selected_one_package_name_from_drop_down() throws Throwable {
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(2000);
	}

	@Then("User selected one Individual name from drop down")
	public void User_selected_one_Individual_name_from_drop_down() throws Throwable {
		driver.findElement(By.xpath("//div[text()='End-to-End Encryption']")).click();
		Thread.sleep(2000);
	}

	@Then("User should get an error message")
	public void User_should_get_an_error_message() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Partner is required!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on 7days of trial period")
	public void User_clicked_on_7days_of_trial_period() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='7 Days']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on 30days of trial period")
	public void User_clicked_on_30days_of_trial_period() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='30 Days']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on 60days of trial period")
	public void User_clicked_on_60days_of_trial_period() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='60 Days']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on 1time Trial Date Extension Accept Limit")
	public void User_clicked_on_1time_Trial_Date_Extension_Accept_Limit() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='2 times']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='1 time']")).click();
	}

	@Then("User clicked on 2times Trial Date Extension Accept Limit")
	public void User_clicked_on_2times_Trial_Date_Extension_Accept_Limit() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='2 times']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on 4times Trial Date Extension Accept Limit")
	public void User_clicked_on_4times_Trial_Date_Extension_Accept_Limit() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='4 times']")).click();
		Thread.sleep(2000);
	}

	@Then("User should get an error message1")
	public void User_should_get_an_error_message1() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Required!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User should get an error message2")
	public void User_should_get_an_error_message2() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Model is required!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User should get an error message3")
	public void User_should_get_an_error_message3() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='End Date is required!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User selected one Individual name from drop down1")
	public void User_selected_one_Individual_name_from_drop_down1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='End-to-End Encryption']")).click();
		Thread.sleep(2000);
	}

	@Then("User should get an error message4")
	public void User_should_get_an_error_message4() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Number of Users are required!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User click on partner name AtoZ")
	public void User_click_on_partner_name_AtoZ() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[normalize-space()='Partner Name']//*[name()='svg']//*[name()='path' and contains(@d,'M839.6 433')]"))
				.click();
		Thread.sleep(2000);
	}

	@Then("observe the result")
	public void observe_the_result() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath(
				"//div[normalize-space()='Partner Name']//*[name()='svg']//*[name()='path' and contains(@d,'M839.6 433')]"))
				.isDisplayed());
		Thread.sleep(2000);
	}

	@And("User trying to click on S No disable eye icon")
	public void User_trying_to_click_on_S_No_disable_eye_icon() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='S No'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on find an item")
	public void User_clicked_on_find_an_item() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Find an item']")).click();
		Thread.sleep(2000);
	}

	@And("User entered in search {string}")
	public void User_entered_in_search(String valid_text) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Find an item']")).sendKeys(valid_text);
		Thread.sleep(2000);
	}

	@And("User entered invalid search {string}")
	public void User_entered_invalid_search(String invalid_text) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Find an item']")).sendKeys(invalid_text);
		Thread.sleep(2000);
	}

	@Then("User must able to see no match found")
	public void User_must_able_to_see_no_match_found() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='No Match Found!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User selected particular date2")
	public void User_selected_particular_date2() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='24']")).click();
		Thread.sleep(2000);
	}

	@Then("User again clicked on same dropdown which contains all filter by status")
	public void User_again_clicked_on_same_dropdown_which_contains_all_filter_by_status() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(2000);
	}

	@Then("User again clicked on same dropdown which contains approved")
	public void User_again_clicked_on_same_dropdown_which_contains_approved() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Approved'][1]")).click();
		Thread.sleep(2000);
	}

	@Then("User observe filter by status find an item and checkboxes")
	public void User_observe_filter_by_status_find_an_item_and_checkboxes() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Apply']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User should not able to click")
	public void User_should_not_able_to_click() {
		System.out.println("Can't able to click because its in disable status");
	}

	@And("User trying to click on partner name disable eye icon")
	public void User_trying_to_click_on_partner_name_disable_eye_icon() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Partner Name'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User trying to click on edition name disable eye icon")
	public void User_trying_to_click_on_edition_name_disable_eye_icon() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Edition Name'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed partner contact header")
	public void User_observed_partner_contact_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Partner Contact']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed result")
	public void User_observed_result() {
		System.out.println("It got disabled");
	}

	@And("User click outside to observe result")
	public void User_click_outside_to_observe_result() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[6]/div/div[2]")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on partner email id eye icon")
	public void User_clicked_on_partner_email_id_eye_icon() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div)[117]")).click();
		Thread.sleep(2000);
	}

	@Then("User observed partner email id header")
	public void User_observed_partner_email_id_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Partner Email Id']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed Date header")
	public void User_observed_Date_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Date']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on Date eye icon")
	public void User_clicked_on_Date_eye_icon() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[6]/div/div[3]/div[2]/div[6]/div[2]"))
				.click();
		Thread.sleep(2000);
	}

	@Then("User observed no of bulk licenses header")
	public void User_observed_no_of_bulk_licenses_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='No. of Bulk Licenses']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on no of bulk licenses eye icon")
	public void User_clicked_on_no_of_bulk_licenses_eye_icon() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[6]/div/div[3]/div[2]/div[7]/div[2]"))
				.click();
		Thread.sleep(2000);
	}

	@Then("User observed Licenses type header")
	public void User_observed_Licenses_type_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='License Type']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on Licenses type eye icon")
	public void User_clicked_on_Licenses_type_eye_icon() throws Throwable {
		driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[6]/div/div[3]/div[2]/div[8]/div[2]"))
				.click();
		Thread.sleep(2000);
	}

	@Then("User observed model type header")
	public void User_observed_model_type_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Model Type']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on model type eye icon")
	public void User_clicked_on_model_type_eye_icon() throws Throwable {
		driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[6]/div/div[3]/div[2]/div[9]/div[2]"))
				.click();
		Thread.sleep(2000);
	}

	@Then("User observed status header")
	public void User_observed_status_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Status']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on status eye icon")
	public void User_clicked_on_status_eye_icon() throws Throwable {
		driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[6]/div/div[3]/div[2]/div[10]/div[2]"))
				.click();
		Thread.sleep(2000);
	}

	@And("User observed model type all lists")
	public void User_observed_model_type_all_lists() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='All']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User again clicked on same dropdown which contains all in model type")
	public void User_again_clicked_on_same_dropdown_which_contains_all_in_model_type() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe model type items")
	public void User_observe_model_type_items() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Apply']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User observed model type API SaaS")
	public void User_observed_model_type_API_SaaS() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='API SaaS'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User again clicked on same dropdown which contains API SaaS")
	public void User_again_clicked_on_same_dropdown_which_contains_API_SaaS() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='API SaaS'][1]")).click();
		Thread.sleep(2000);
	}

	@Then("User observers the search result as no match found")
	public void User_observers_the_search_result_as_no_match_found() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='No Match Found!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on date eye icon")
	public void User_clicked_on_date_eye_icon() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[6]/div/div[3]/div[2]/div/div[2]"))
				.click();
		Thread.sleep(2000);
	}

	@Then("User again click on headers filter")
	public void User_again_click_on_headers_filter() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[20]")).click();
		Thread.sleep(2000);
	}

	@Then("User observe the header filter page")
	public void User_observe_the_header_filter_page() throws Throwable {
		Thread.sleep(1000);
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Date']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User must able to observe that all is getting removed after 2 times clicking on clear")
	public void User_must_able_to_observe_that_all_is_getting_removed_after_2_times_clicking_on_clear()
			throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Filter By Status']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observe filter by status header")
	public void User_observe_filter_by_status_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Filter By Status']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User again clicked on filter by status")
	public void User_again_clicked_on_filter_by_status() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Filter By Status']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed find an item error search box")
	public void User_observed_find_an_item_error_search_box() throws Throwable {
		Assert.assertTrue(driver
				.findElement(
						By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div[1]/input"))
				.isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed find an item error about drop down options")
	public void User_observed_find_an_item_error_about_drop_down_options() throws Throwable {
		Assert.assertFalse(driver
				.findElement(
						By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div[2]/div"))
				.isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User must able to observe default state again and also all filter need to removed and Model type header need to visible but all filter is getting displayed its an error")
	public void User_must_able_to_observe_default_state_again_and_also_all_filter_need_to_removed_and_Model_type_header_need_to_visible_but_all_filter_is_getting_displayed_its_an_error()
			throws Throwable {
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Model Type'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User must able to observe that all is getting removed after 2 times clicking on clear1")
	public void User_must_able_to_observe_that_all_is_getting_removed_after_2_times_clicking_on_clear1()
			throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Model Type'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observe Model type items")
	public void User_observe_Model_type_items() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Apply']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observe Model type header")
	public void User_observe_Model_type_header() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Model Type'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observers the search result1")
	public void User_observers_the_search_result1() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Jio'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User again clicked on filter by date again")
	public void User_again_clicked_on_filter_by_date_again() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div/div/div[1]"))
				.click();
		Thread.sleep(2000);
	}

	@And("User clicked on 2nd page")
	public void User_clicked_on_2nd_page() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='2']")).click();
		Thread.sleep(2000);
	}

	@Then("User again clicked on previous arrow1")
	public void User_again_clicked_on_previous_arrow1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Previous']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on next arrow1")
	public void User_clicked_on_next_arrow1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
	}

	@And("User click on Bio partner name")
	public void User_click_on_Bio_partner_name() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Bio']")).click();
		Thread.sleep(2000);
	}

	@Then("User observing open request")
	public void User_observing_open_request() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Open Request']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on license history")
	public void User_clicked_on_license_history() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='License History']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe license history page")
	public void User_observe_license_history_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='License created info:']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("Users click on Logs")
	public void Users_click_on_Logs() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Logs']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe logs page")
	public void User_observe_logs_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Filter By : ']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on status1")
	public void User_clicked_on_status1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Status']")).click();
		Thread.sleep(2000);
	}

	@And("User click on status and selected all")
	public void User_click_on_status_and_selected_all() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Status']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on date")
	public void User_clicked_on_date() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Date']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on custom range")
	public void User_clicked_on_custom_range() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Custom range']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on previous arrow")
	public void User_clicked_on_previous_arrow() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M 13.28125')]")).click();
		Thread.sleep(2000);
	}

	@And("User selected dates")
	public void User_selected_dates() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='20']")).click();
		Thread.sleep(1000);
	}

	@Then("User clicked on user")
	public void User_clicked_on_user() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='User']")).click();
		Thread.sleep(2000);
	}

	@And("User selcted all")
	public void User_selcted_all() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div[3]/div[2]/div[1]/label/div"))
				.click();
		Thread.sleep(2000);
	}

	@Then("User observed result1")
	public void User_observed_result1() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Request ID'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User click on status and selected approved")
	public void User_click_on_status_and_selected_approved() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Status']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Approved'][1]")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on status")
	public void User_clicked_on_status() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Status']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on clear2")
	public void User_clicked_on_clear2() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Clear Filters']")).click();
		Thread.sleep(2000);
	}

	@And("User observe filter options all need to be removed but its not getting removed")
	public void User_observe_filter_options_all_need_to_be_removed_but_its_not_getting_removed() throws Throwable {
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='All'][1]")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User again clicked on date")
	public void User_again_clicked_on_date() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[3]/div/div/div[1]"))
				.click();
		Thread.sleep(2000);
	}

	@And("Users click on info")
	public void Users_click_on_info() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Info']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe info page")
	public void User_observe_info_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Current License Info']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("Users click on new request")
	public void Users_click_on_new_request() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='New Request']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe new request page")
	public void User_observe_new_request_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='User-licenses']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on no of users block")
	public void User_clicked_on_no_of_users_block() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='enter user licenses']")).click();
		Thread.sleep(2000);
	}

	@Then("User started entering no of users {string}")
	public void User_started_entering_no_of_users(String No_of_users) throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='enter user licenses']")).sendKeys(No_of_users);
		Thread.sleep(2000);
	}

	@And("User clicked on submit3")
	public void User_clicked_on_submit3() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on reset2")
	public void User_clicked_on_reset2() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on packages")
	public void User_clicked_on_packages() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Packages']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe the packages page")
	public void User_observe_the_packages_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Packages']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on package dropdown")
	public void User_clicked_on_package_dropdown() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe the package page")
	public void User_observe_the_package_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='All']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on add ons")
	public void User_clicked_on_add_ons() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add-ons']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe the add ons page")
	public void User_observe_the_add_ons_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Add-ons']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on add ons dropdown")
	public void User_clicked_on_add_ons_dropdown() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(2000);
	}

	@And("User selected a paticular check box")
	public void User_selected_a_paticular_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='End-to-End Encryption']")).click();
		Thread.sleep(2000);
	}

	@And("User selected searched check box")
	public void User_selected_searched_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='End-to-End Encryption']")).click();
		Thread.sleep(2000);
	}

	@And("User observe filter options all need to be removed but its not getting removed1")
	public void User_observe_filter_options_all_need_to_be_removed_but_its_not_getting_removed1() throws Throwable {
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='All']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User again clicked on same drop down1")
	public void User_again_clicked_on_same_drop_down1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(2000);
	}

	@And("User again clicked on same drop down2")
	public void User_again_clicked_on_same_drop_down2() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(2000);
	}

	@And("User again clicked on same drop down3")
	public void User_again_clicked_on_same_drop_down3() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked renewal")
	public void User_clicked_renewal() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Renewal']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe renewal page")
	public void User_observe_renewal_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Renewal Details']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on 14days check box")
	public void User_clicked_on_14days_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='14 Days']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on 1time date extension")
	public void User_clicked_on_1time_date_extension() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='1 time']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on add ons dropdown1")
	public void User_clicked_on_add_ons_dropdown1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/div/div[2]/div/div[8]/div[2]/div/div/div"))
				.click();
		Thread.sleep(2000);
	}

	@Then("User observe the add ons page1")
	public void User_observe_the_add_ons_page1() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='All']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observe the add ons page2")
	public void User_observe_the_add_ons_page2() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='All']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observe the add ons page3")
	public void User_observe_the_add_ons_page3() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='All']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User clicked on start date and selected a paticular date2")
	public void User_clicked_on_start_date_and_selected_a_paticular_date2() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Start Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='25']")).click();
		Thread.sleep(2000);
	}

	@Then("User clicked on end date and selected a paticular date2")
	public void User_clicked_on_end_date_and_selected_a_paticular_date2() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='28']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked date extension")
	public void User_clicked_date_extension() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Date Extension']")).click();
		Thread.sleep(2000);
	}

	@Then("User observe date extension page")
	public void User_observe_date_extension_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Date Extension']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User observed search result")
	public void User_observed_search_result() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='No Match Found!']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on next button")
	public void User_clicked_on_next_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed the page")
	public void User_observed_the_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Previous']")).isDisplayed());
		Thread.sleep(2000);
	}

	@And("User clicked on 3rd page")
	public void User_clicked_on_3rd_page() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='3']")).click();
		Thread.sleep(2000);
	}

	@And("User clicked on previous button")
	public void User_clicked_on_previous_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Previous']")).click();
		Thread.sleep(2000);
	}

	@Then("User selected a check box")
	public void User_selected_a_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='kiran kumar']")).click();
		Thread.sleep(2000);
	}

	@Then("User again clicked on same drop down")
	public void User_again_clicked_on_same_drop_down() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='kiran kumar']")).click();
		Thread.sleep(2000);
	}

	@Then("User observed the find an item search box")
	public void User_observed_the_find_an_item_search_box() throws Throwable {
		Assert.assertFalse(driver.findElement(By.xpath("//input[@placeholder='Find an item']")).isDisplayed());
		Thread.sleep(2000);
	}

	@Then("User selected a search result check box")
	public void User_selected_a_search_result_check_box() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Sumithhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh']")).click();
		Thread.sleep(2000);
	}

	@Then("User again clicked on same drop down4")
	public void User_again_clicked_on_same_drop_down4() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Sumithhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh']")).click();
		Thread.sleep(2000);
	}

	@Then("User enter mfa code for trail license")
	public void User_enter_mfa_code_for_trail_license() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 5']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 6']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("User enter mfa code for Subscription license")
	public void User_enter_mfa_code_for_subscription_license() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 5']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 6']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		Thread.sleep(1000);
	}
}
