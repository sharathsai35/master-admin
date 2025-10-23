package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Partner {
	WebDriver driver;

	public Partner(WebDriver driver) {
		this.driver = driver;
	}

	@Given("user has navigate to login page")
	public void user_has_navigate_to_login_page() throws InterruptedException {
		driver = Browser.getDriver();
		driver.get("http://192.168.2.19:3000");
		Thread.sleep(2000);
	}

	@When("user enters valid mobile num")
	public void user_enters_valid_mobile_num() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow font-medium']")).sendKeys("9347243214");
		Thread.sleep(1000);
	}

	@And("user enter password")
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

	@And("user click on proceed button")
	public void user_click_on_proceed_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
	}

	@And("user Enter the MFA code")
	public void user_Enter_the_MFA_code() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("123456");
		Thread.sleep(1000);
	}

	@And("user click proceed button for MFA code")
	public void user_click_proceed_button_for_MFA_code() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
	}

	@And("user click on Partner page")
	public void user_click_on_Partner_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Partners']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the partner page")
	public void validate_the_partner_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Partners']")).getText();
		Assert.assertEquals("Partners", a);
		Thread.sleep(1000);
	}

	@And("user click on search and enter the data with enter button")
	public void user_click_on_search_and_enter_the_data_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("bio");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the data")
	public void User_validate_the_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Bio']")).getText();
		Assert.assertEquals("Bio", a);
		Thread.sleep(1000);
	}

	@Then("User validate the searched data")
	public void user_validate_the_searched_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='IQ labs']")).getText();
		Assert.assertEquals("IQ labs", a);
		Thread.sleep(1000);
	}

	@And("user click on search and enter the company name with enter button")
	public void user_click_on_search_and_enter_the_company_name_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("bio");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the company name")
	public void User_validate_the_company_name() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Bio']")).getText();
		Assert.assertEquals("Bio", a);
		Thread.sleep(1000);
	}

	@And("user click on search and enter the Partner Name with enter button")
	public void user_click_on_search_and_enter_the_Partner_Name_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("sharath");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the Partner Name")
	public void User_validate_the_Partner_Name() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='sharath']")).getText();
		Assert.assertEquals("sharath", a);
		Thread.sleep(1000);
	}

	@And("user click on search and enter the Partner Moniker with enter button")
	public void user_click_on_search_and_enter_the_Partner_Moniker_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("SVER");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the Partner Moniker")
	public void User_validate_the_Partner_Moniker() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='SVER']")).getText();
		Assert.assertEquals("SVER", a);
		Thread.sleep(1000);
	}

	@And("user click on search and enter the Email with enter button")
	public void user_click_on_search_and_enter_the_Email_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("sharath@testing.com");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the Email")
	public void User_validate_the_Email() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='sharath@testing.com']")).getText();
		Assert.assertEquals("sharath@testing.com", a);
		Thread.sleep(1000);
	}

	@And("user click on search and enter the Mobile num with enter button")
	public void user_click_on_search_and_enter_the_Mobile_num_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("9639631234");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the Mobile num")
	public void User_validate_the_Mobile_num() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@And("user click on search and enter name of Who Added with enter button")
	public void user_click_on_search_and_enter_name_of_Who_Added_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("Sumith");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the name of Who Added")
	public void User_validate_the_name_of_Who_Added() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@And("user click on search and enter Added Date with enter button")
	public void user_click_on_search_and_enter_Added_Date_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("16-06-2025");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the Added Date")
	public void User_validate_the_Added_Date() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@And("user click on search and enter invalid data with enter button")
	public void user_click_on_search_and_enter_invalid_data_with_enter_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("dadsfads");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("validate the entered data")
	public void validate_the_entered_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@And("clear the entered data")
	public void clear_the_entered_data() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.clear();
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("validate the search field of Partner")
	public void validate_the_search_field_of_partner() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a);
		Thread.sleep(1000);
	}

	@And("click on esc button in keyboard")
	public void click_on_esc_button_in_keyboard() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
	}

	@And("user click on filter by Date dropdown")
	public void user_click_on_filter_by_date_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Filter by date']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the filter by date")
	public void validate_the_filter_by_date() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Today']")).getText();
		Assert.assertEquals("Today", a);
		String a1 = driver.findElement(By.xpath("//div[text()='Yesterday']")).getText();
		Assert.assertEquals("Yesterday", a1);
		String a2 = driver.findElement(By.xpath("//div[text()='Last week']")).getText();
		Assert.assertEquals("Last week", a2);
		String a3 = driver.findElement(By.xpath("//div[text()='Last 7 days']")).getText();
		Assert.assertEquals("Last 7 days", a3);
		String a4 = driver.findElement(By.xpath("//div[text()='This month']")).getText();
		Assert.assertEquals("This month", a4);
		String a5 = driver.findElement(By.xpath("//div[text()='Last 30 days']")).getText();
		Assert.assertEquals("Last 30 days", a5);
		String a6 = driver.findElement(By.xpath("//div[text()='Custom range']")).getText();
		Assert.assertEquals("Custom range", a6);
		Thread.sleep(1000);
	}

	@And("user click on today and click on done button")
	public void user_click_on_today_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Today']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the today created data")
	public void validate_the_today_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Today']")).getText();
		Assert.assertEquals("Today", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@And("again click on Today dropdown")
	public void again_click_on_Today_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Today']")).click();
		Thread.sleep(1000);
	}

	@Then("And user click on today in dropdown list")
	public void and_user_click_on_today_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Today']")).click();
		Thread.sleep(1000);
	}

	@Then("validate to select the another dates")
	public void validate_to_select_the_another_dates() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//button[@class='rdrDay rdrDayDisabled']"));
		e.click();
		String a = e.getAttribute("class");
		Assert.assertEquals("rdrDay rdrDayDisabled", a);
		Thread.sleep(1000);
	}

	@Then("validate to select the another date")
	public void validate_to_select_the_another_date() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//button[@class='rdrDay rdrDayWeekend rdrDayEndOfWeek']"));
		e.click();
		String a = e.getAttribute("class");
		Assert.assertEquals("rdrDay rdrDayWeekend rdrDayEndOfWeek rdrDayHovered", a);
		Thread.sleep(1000);
	}

	@Then("user validate the active tab")
	public void user_validate_the_active_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//div[text()='Custom range']"));
		String a = e.getText();
		Assert.assertEquals("Custom range", a);
		Thread.sleep(1000);
	}

	@And("user click on Reset button")
	public void user_click_on_reset_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("click on clear button")
	public void click_on_clear_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='clear']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the selected date is cleared or not")
	public void validate_the_selected_date_is_cleared_or_not() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a);
		Thread.sleep(1000);
	}

	@And("user click on yesterday and click on done button")
	public void user_click_on_yesterday_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Yesterday']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the yesterday created data")
	public void validate_the_yesterday_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Yesterday']")).getText();
		Assert.assertEquals("Yesterday", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@And("again click on yesterday dropdown")
	public void again_click_on_yesterday_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Yesterday']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on yesterday in dropdown list")
	public void user_click_on_yesterday_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Yesterday']")).click();
		Thread.sleep(1000);
	}

	@And("user click on last week and click on done button")
	public void user_click_on_last_week_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last week']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the last week created data")
	public void validate_the_last_week_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Jul 11 - Jul 18']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@And("again click on last week dropdown")
	public void again_click_on_last_week_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jul 11 - Jul 18']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on last week in dropdown list")
	public void user_click_on_last_week_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last week']")).click();
		Thread.sleep(1000);
	}

	@And("user click on last 7 days and click on done button")
	public void user_click_on_last_days_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last 7 days']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the last 7 days created data")
	public void validate_the_last_days_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Jul 11 - Jul 18']")).getText();
		Assert.assertEquals("Jul 11 - Jul 18", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a1);
		Thread.sleep(1000);
	}

	@And("again click on last 7 days dropdown")
	public void again_click_on_last_days_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jul 11 - Jul 18']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on last 7 days in dropdown list")
	public void user_click_on_last_days_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last 7 days']")).click();
		Thread.sleep(1000);
	}

	@And("user click on This month and click on done button")
	public void user_click_on_This_month_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='This month']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the This month created data")
	public void validate_the_This_month_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Jul 01 - Jul 31']")).getText();
		Assert.assertEquals("Jul 01 - Jul 31", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a1);
		Thread.sleep(1000);
	}

	@And("again click on This month dropdown")
	public void again_click_on_This_month_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Jul 01 - Jul 31']")).click();
		Thread.sleep(1000);
	}

	@And("Reset the filter by date")
	public void reset_the_filter_by_date() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on This month in dropdown list")
	public void user_click_on_this_month_in_dropdown_list() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Jul 01 - Jul 31']")).click();
		Thread.sleep(1000);
	}

	@And("user click on This month")
	public void user_click_on_This_month() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='This month']")).click();
		Thread.sleep(1000);
	}

	@And("user click on Last 30 days and click on done button")
	public void user_click_on_Last_days_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last 30 days']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the Last 30 days created data")
	public void validate_the_Last_days_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Jun 18 - Jul 18']")).getText();
		Assert.assertEquals("Jun 18 - Jul 18", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a1);
		Thread.sleep(1000);
	}

	@Then("validate Last 30 days created data")
	public void validate_last_days_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Jun 18 - Jul 18']")).getText();
		Assert.assertEquals("Jun 18 - Jul 18", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added\n" + "City", a1);
		Thread.sleep(1000);
	}

	@And("again click on Last 30 days dropdown")
	public void again_click_on_Last_days_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jun 18 - Jul 18']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on Last 30 days in dropdown list")
	public void user_click_on_Last_days_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last 30 days']")).click();
		Thread.sleep(1000);
	}

	@And("user click on custom range and select the single date")
	public void user_click_on_custom_range_and_select_the_single_date() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Custom range']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='15']")).click();
		Thread.sleep(1000);
	}

	@And("user click on done button")
	public void user_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the selected date data")
	public void validate_the_selected_date_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@And("click on filter by date dropdown")
	public void click_on_filter_by_date_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jul 15']")).click();
		Thread.sleep(1000);
	}

	@And("user click on custom range and select the date range")
	public void user_click_on_custom_range_and_select_the_date_range() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Custom range']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='15']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the selected dates data")
	public void validate_the_selected_dates_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Jul 01 - Jul 15']")).getText();
		Assert.assertEquals("Jul 01 - Jul 15", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a1);
		Thread.sleep(1000);
	}

	@Then("validate selected dates data")
	public void validate_selected_dates_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Jul 01 - Jul 15']")).getText();
		Assert.assertEquals("Jul 01 - Jul 15", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@Then("click on filter by date dropdown for custom range")
	public void click_on_filter_by_date_dropdown_for_custom_range() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jul 01 - Jul 15']")).click();
		Thread.sleep(1000);
	}

	@And("user click on custom range and select the date range from last to starting position")
	public void user_click_on_custom_range_and_select_the_date_range_from_last_to_starting_position()
			throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Custom range']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='15']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click();
		Thread.sleep(1000);
	}

	@And("user click on filter by active partner dropdown")
	public void user_click_on_filter_by_active_partner_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Active Partners']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the filter by active partner dropdown list")
	public void validate_the_filter_by_active_partner_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@And("select the Deactivated Partner")
	public void select_the_deactivated_partner() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the deactivated partner list")
	public void validate_the_deactivated_partner_list() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	// Column Filter

	@When("user click on column filter icon")
	public void user_click_on_column_filter_icon() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui:relative'])[3]")).click();
		Thread.sleep(1000);
	}

	@Then("validate the column filter icon")
	public void validate_the_column_filter_icon() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@class='ui:pt-5 ui:flex ui:flex-col ui:gap-3 ui:text-sm']"))
				.getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added\n" + "Country\n" + "City", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of S NO")
	public void user_click_on_eye_icon_of_s_no() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50')])[1]"))
				.click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for S No")
	public void validate_the_eye_icon_for_S_No() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver
				.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50')])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-not-allowed ui:opacity-50 ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for S No")
	public void validate_the_table_for_S_No() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Partner company")
	public void user_click_on_eye_icon_of_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50')])[2]"))
				.click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Partner company")
	public void validate_the_eye_icon_for_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver
				.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50')])[2]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-not-allowed ui:opacity-50 ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Partner company")
	public void validate_the_table_for_Partner_company() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Partner Name")
	public void user_click_on_eye_icon_of_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50')])[3]"))
				.click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Partner Name")
	public void validate_the_eye_icon_for_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver
				.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50')])[3]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-not-allowed ui:opacity-50 ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Partner Name")
	public void validate_the_table_for_Partner_Name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Partner Moniker")
	public void user_click_on_eye_icon_of_partner_moniker() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Partner Moniker")
	public void validate_the_eye_icon_for_partner_moniker() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Partner Moniker")
	public void validate_the_table_for_Partner_Moniker() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Email\n" + "Phone Number\n"
				+ "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Email")
	public void user_click_on_eye_icon_of_email() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the table for Email")
	public void validate_the_table_for_Email() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Phone Number\n"
				+ "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Phone num")
	public void user_click_on_eye_icon_of_phone_num() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[3]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Phone num")
	public void validate_the_eye_icon_for_phone_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[3]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Phone num")
	public void validate_the_table_for_Phone_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Added Date")
	public void user_click_on_eye_icon_of_added_date() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[4]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Added Date")
	public void validate_the_eye_icon_for_added_date() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[4]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Added Date")
	public void validate_the_table_for_Added_Date() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Who Added")
	public void user_click_on_eye_icon_of_who_added() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[5]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Who Added")
	public void validate_the_eye_icon_for_who_added() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[5]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Who Added")
	public void validate_the_table_for_Who_Added() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Country")
	public void user_click_on_eye_icon_of_country() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[6]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Country")
	public void validate_the_eye_icon_for_country() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[6]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Country")
	public void validate_the_table_for_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added\n" + "Country", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of City")
	public void user_click_on_eye_icon_of_city() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[7]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for City")
	public void validate_the_eye_icon_for_city() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[7]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for City")
	public void validate_the_table_for_City() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added\n" + "City", a);
		Thread.sleep(1000);
	}

	@Then("User click on search in column filter")
	public void user_click_on_search_in_column_filter() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Find an item']")).click();
		Thread.sleep(1000);
	}

	@Then("User Enter the Valid search")
	public void user_enter_the_valid_search() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Find an item']")).sendKeys("Email");
		Thread.sleep(1000);
	}

	@Then("Validate the searched data in column filter")
	public void validate_the_searched_data_in_column_filter() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Email']")).getText();
		Assert.assertEquals("Email", a);
		Thread.sleep(1000);
	}

	@Then("User Enter the invalid search")
	public void user_enter_the_invalid_search() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Find an item']")).sendKeys("test");
		Thread.sleep(1000);
	}

	@Then("Validate the searched invalid data in column filter")
	public void validate_the_searched_invalid_data_in_column_filter() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("Clear the data")
	public void clear_the_data() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Find an item']"));
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
	}

	@Then("Validate the cleared search")
	public void validate_the_cleared_search() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Find an item']")).getAttribute("placeholder");
		Assert.assertEquals("Find an item", a);
		Thread.sleep(1000);
	}

	@Then("Click on set default button")
	public void click_on_set_default_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='set defaults']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on eye icon for Email")
	public void click_on_eye_icon_for_email() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer '])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Email")
	public void validate_the_eye_icon_for_email() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer '])[1]")).getText();
		Assert.assertEquals("", a);
		Thread.sleep(1000);
	}

	@Then("Validate the disable eye icon for Email")
	public void validate_the_disable_eye_icon_for_email() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//div)[103]")).getText();
		Assert.assertEquals("", a);
		Thread.sleep(1000);
	}

	@Then("Again click on column filter")
	public void again_click_on_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui:relative'])[3]")).click();
		Thread.sleep(1000);
	}

	@And("click on any button")
	public void click_on_any_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flex items-center gap-2']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the column filter search")
	public void validate_the_column_filter_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@value='Email']")).getAttribute("value");
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Partner Moniker after set default")
	public void validate_the_table_for_partner_moniker_after_set_default() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@When("Click on sort by option for Partner company")
	public void click_on_sort_by_option_for_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the sort by option is clicked or not")
	public void validate_the_sort_by_option_is_clicked_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a);
		Thread.sleep(1000);
	}

	@Then("Changed alphabetic order from Z to A for Partner Company")
	public void changed_alphabetic_order_from_z_to_a_for_Partner_Company() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> companies = driver.findElements(By.xpath("//table//tr/td[2]"));
		String[] companyArray = companies.stream().map(WebElement::getText).toArray(String[]::new);
		String expected = "Partner Company\n" + "ZTPC\n" + "Vi\n" + "Tvisha 03\n" + "Tvisha 02\n" + "Tvisha\n"
				+ "Troop Messenger\n" + "Troop M\n" + "Troop M\n" + "Test Partner\n" + "Test 02";
		String actual = String.join("\n", companyArray);
		Assert.assertEquals(actual, expected);
		Thread.sleep(1000);
		for (String company : companyArray) {
			System.out.println(company);
		}
	}

	@When("Again click on sort by option for Partner Company")
	public void again_click_on_sort_by_option_for_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Changed alphabetic order from A to Z for Partner Company")
	public void changed_alphabetic_order_from_a_to_z_for_Partner_Company() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> companies = driver.findElements(By.xpath("//table//tr/td[2]"));
		String[] companyArray = companies.stream().map(WebElement::getText).toArray(String[]::new);
		String[] expectedArray = { "Partner Company", "A Verse", "Airtel", "Bio", "Bitcoin Inc", "Indian Oil",
				"Info Solutions", "Info Solutions", "IQ labs", "Jio", "K Verse" };
		Assert.assertArrayEquals(expectedArray, companyArray);
		Thread.sleep(1000);
		for (String company : companyArray) {
			System.out.println(company);
		}
	}

	@Then("Validate the table after clearing the sort by option for Partner Company")
	public void validate_the_table_after_clearing_the_sort_by_option_for_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> companies = driver.findElements(By.xpath("//table//tr/td[2]"));
		String[] companyArray = companies.stream().map(WebElement::getText).toArray(String[]::new);
		String[] expectedArray = { "Partner Company", "Info Solutions", "Myntra", "Info Solutions", "K Verse", "Bio",
				"S Verse", "IQ labs", "A Verse", "Vi", "Jio" };

		Assert.assertArrayEquals(expectedArray, companyArray);
		Thread.sleep(1000);
		for (String company : companyArray) {
			System.out.println(company);
		}
	}

	@When("Click on sort by option for Partner Name")
	public void click_on_sort_by_option_for_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Changed alphabetic order from Z to A for Partner Name")
	public void changed_alphabetic_order_from_z_to_a_for_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> companies = driver.findElements(By.xpath("//table//tr/td[3]"));
		String[] companyArray = companies.stream().map(WebElement::getText).toArray(String[]::new);
		String[] expectedArray = { "Partner Name", "Test", "sharath", "sharath", "Sai Teja", "Sai Teja", "rajesh",
				"Madhan", "Akshay Mangrulkar", "Akshay Mangrulkar", "Akshay Mangrulkar" };

		Assert.assertArrayEquals(expectedArray, companyArray);
		Thread.sleep(1000);
		for (String company : companyArray) {
			System.out.println(company);
		}
	}

	@When("Again click on sort by option for Partner Name")
	public void again_click_on_sort_by_option_for_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Changed alphabetic order from A to Z for Partner Name")
	public void changed_alphabetic_order_from_a_to_z_for_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> companies = driver.findElements(By.xpath("//table//tr/td[3]"));
		String[] companyArray = companies.stream().map(WebElement::getText).toArray(String[]::new);
		String[] expectedArray = { "Partner Name", "Akki", "Akki Mangrulkar", "Akshay", "Akshay", "Akshay", "Akshay",
				"Akshay", "Akshay", "Akshay", "Akshay" };

		Assert.assertArrayEquals(expectedArray, companyArray);
		Thread.sleep(1000);
		for (String company : companyArray) {
			System.out.println(company);
		}
	}

	@Then("Validate the table after clearing the sort by option for Partner Name")
	public void validate_the_table_after_clearing_the_sort_by_option_for_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> companies = driver.findElements(By.xpath("//table//tr/td[3]"));
		String[] companyArray = companies.stream().map(WebElement::getText).toArray(String[]::new);
		String[] expectedArray = { "Partner Name", "Sai Teja", "Madhan", "Sai Teja", "Akshay", "sharath", "Akshay",
				"sharath", "Akshay", "rajesh", "Akshay Mangrulkar" };

		Assert.assertArrayEquals(expectedArray, companyArray);
		Thread.sleep(1000);
		for (String company : companyArray) {
			System.out.println(company);
		}
	}

	@Then("Click on search & Enter the text")
	public void click_on_search_enter_the_text() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("test");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	// Pagination

	@When("Click on next button in Partner")
	public void click_on_next_button_in_partner() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the next page in Partner")
	public void validate_the_next_page_in_partner() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Troop M\n" + "Akshay Mangrulkar\n" + "TRMN\n" + "akshay@tr4ew.com\n"
				+ "+91 9999887745\n" + "12-03-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@When("Click on Previous button")
	public void click_on_previous_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Previous'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Previous button is disabled or not")
	public void validate_the_previous_button_is_disabled_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//button[normalize-space()='Previous'])[1]")).getAttribute("disabled");
		Assert.assertEquals("true", a);
		Thread.sleep(1000);
	}

	@Then("Validate the Previous page in Partner")
	public void validate_the_previous_page_in_partner() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Info Solutions\n" + "Sai Teja\n" + "SKIS\n" + "saikrishna@gmail.com\n"
				+ "+91 9996677555\n" + "14-07-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
	}

	@When("Click on 2nd num in pagination")
	public void click_on_2nd_num_in_pagination() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='button'][normalize-space()='2'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the 2nd page in Partner")
	public void validate_the_2nd_page_in_partner() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Troop M\n" + "Akshay Mangrulkar\n" + "TRMN\n" + "akshay@tr4ew.com\n"
				+ "+91 9999887745\n" + "12-03-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@When("Click on 3rd num in pagination")
	public void click_on_3rd_num_in_pagination() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@role,'button')][normalize-space()='3'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the 3rd page in Partner")
	public void validate_the_3rd_page_in_partner() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("21\n" + "Test 001\n" + "Akshay\n" + "TEON\n" + "akshay@test01.com\n" + "+91 9031029717\n"
				+ "11-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Click on 1st num in pagination")
	public void click_on_1st_num_in_pagination() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@role,'button')][normalize-space()='1'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the 1st page in Partner")
	public void validate_the_1st_page_in_partner() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Info Solutions\n" + "Sai Teja\n" + "SKIS\n" + "saikrishna@gmail.com\n"
				+ "+91 9996677555\n" + "14-07-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
	}

	@When("Click on last page in pagination")
	public void click_on_last_page_in_pagination() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@role,'button')][normalize-space()='4'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the next button is clickable or not")
	public void validate_the_next_button_is_clickable_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//button[text()='Next']")).getAttribute("disabled");
		Assert.assertEquals("true", a);
		Thread.sleep(1000);
	}

	@Then("Validate alphabetic order from Z to A for Partner Company with pagination")
	public void validate_alphabetic_order_from_z_to_a_for_partner_company_with_pagination()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 006\n" + "Akshay\n" + "YTRE\n" + "akshay@ytre.com\n" + "+91 9030085456\n"
				+ "11-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the next page in Partner with Z to A for Partner Company")
	public void validate_the_next_page_in_partner_with_z_to_a_for_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 006\n" + "Akshay\n" + "YTRE\n" + "akshay@ytre.com\n" + "+91 9030085456\n"
				+ "11-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & last pagination & search")
	public void validate_the_combination_of_sort_by_option_z_to_a_last_pagination_search() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate alphabetic order from Z to A for Partner Company with last pagination")
	public void validate_alphabetic_order_from_z_to_a_for_partner_company_with_last_pagination()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("21\n" + "Partner 001\n" + "Akshay\n" + "PART\n" + "akshay@partner.com\n"
				+ "+91 8545961485\n" + "27-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & last pagination & filter by date")
	public void validate_the_combination_of_sort_by_option_z_to_a_last_pagination_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		// String
		// a2=driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer
		// ui:text-primary'])[1]")).getAttribute("class");
		// Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate alphabetic order from A to Z for Partner Company with pagination")
	public void validate_alphabetic_order_from_a_to_z_for_partner_company_with_pagination()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Myntra\n" + "Madhan\n" + "MYN\n" + "myntra@gmail.com\n" + "+91 9845612387\n"
				+ "11-07-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & last pagination & search")
	public void validate_the_combination_of_sort_by_option_a_to_z_last_pagination_search() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate alphabetic order from A to Z for Partner Company with last pagination")
	public void validate_alphabetic_order_from_a_to_z_for_partner_company_with_last_pagination()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("21\n" + "Test 004\n" + "Akshay\n" + "REWQ\n" + "akshay@rewq.com\n" + "+91 9030014852\n"
				+ "11-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & last pagination & filter by date")
	public void validate_the_combination_of_sort_by_option_a_to_z_last_pagination_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		// String
		// a2=driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer
		// ui:text-primary'])[1]")).getAttribute("class");
		// Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate alphabetic order from Z to A for Partner Name with pagination")
	public void validate_alphabetic_order_from_z_to_a_for_partner_name_with_pagination() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Troop M\n" + "Akshay Mangrulkar\n" + "TROM\n" + "akshay@troopm.com\n"
				+ "+91 9030029753\n" + "12-03-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & last pagination & search")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_last_pagination_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate alphabetic order from Z to A for Partner Name with last pagination")
	public void validate_alphabetic_order_from_z_to_a_for_partner_name_with_last_pagination()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("21\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "akshay@averse.com\n" + "+91 7418529637\n"
				+ "02-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & last pagination & filter by date")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_last_pagination_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		// String
		// a2=driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer
		// ui:text-primary'])[1]")).getAttribute("class");
		// Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate alphabetic order from A to Z for Partner Name with pagination")
	public void validate_alphabetic_order_from_a_to_z_for_partner_name_with_pagination() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 005\n" + "Akshay\n" + "TREW\n" + "akshay@trew.com\n" + "+91 9030025963\n"
				+ "11-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & last pagination & search")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_last_pagination_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate alphabetic order from A to Z for Partner Name with last pagination")
	public void validate_alphabetic_order_from_a_to_z_for_partner_name_with_last_pagination()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("21\n" + "Airtel\n" + "Akshay\n" + "AIRT\n" + "akshay@airtel.com\n" + "+91 9030085125\n"
				+ "29-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & last pagination & filter by date")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_last_pagination_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		// String
		// a2=driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer
		// ui:text-primary'])[1]")).getAttribute("class");
		// Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	// Add New Partner
	@When("Click on Add New Partner button")
	public void click_on_add_new_partner_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add New Partner']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Add New Partner Page")
	public void validate_the_add_new_partner_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Add Partner']")).getText();
		Assert.assertEquals("Add Partner", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n" + "/\n" + "Partners\n" + "/\n" + "Add", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Add for Partial Link")
	public void click_on_add_for_partial_link() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Add']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Add Page")
	public void validate_the_add_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Add Partner']")).getText();
		Assert.assertEquals("Add Partner", a);
		Thread.sleep(1000);
	}

	@Then("Click on Partners for Partial Link")
	public void click_on_Partners_for_partial_link() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Partners']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Partners Page")
	public void validate_the_Partners_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Partners']")).getText();
		Assert.assertEquals("Partners", a);
		Thread.sleep(1000);
	}

	@Then("Click on Home for Partial Link")
	public void click_on_Home_for_partial_link() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Home']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Home Page")
	public void validate_the_Home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n" + "/\n" + "Features", a);
		Thread.sleep(1000);
	}

	@Then("Click on back button in Add New Partner page")
	public void click_on_back_button_in_add_new_partner_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[15]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the back button with Partners page")
	public void validate_the_back_button_with_Partners_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Partners']")).getText();
		Assert.assertEquals("Partners", a);
		Thread.sleep(1000);
	}

	@Then("Click on save button in Add New Partner page")
	public void click_on_save_button_in_add_new_partner_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Save & Next']")).click();
	}

	@Then("Click on save button in Profile page")
	public void click_on_save_button_in_Profile_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Save & Next']")).click();
	}

	@Then("Validate the save button without entering any data")
	public void validate_the_save_button_without_entering_any_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.fail(a2);
		Thread.sleep(1000);
	}

	@Then("Click on Partner Name")
	public void click_on_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//div[text()='Naresh IT Solutions']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the clicked Partner Company")
	public void validate_the_clicked_partner_company() throws InterruptedException {
		String a = driver.findElement(By.xpath("//h1[text()='Naresh IT Solutions']")).getText();
		Assert.assertEquals("Naresh IT Solutions", a);
		Thread.sleep(1000);
	}

	@Then("Click on Partner Name & Enter Partner Name")
	public void click_on_partner_name_enter_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Partner Name']"));
		e.click();
		e.sendKeys("Zap 7");
		Thread.sleep(1000);
	}

	@Then("Click on the Partner Name & Enter Partner Name")
	public void click_on__the_partner_name_enter_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Partner Name']"));
		e.click();
		e.sendKeys("IT hub");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Partner Name")
	public void validate_the_save_button_by_entering_only_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Partner Name & Enter Partner Name with single character")
	public void click_on_partner_name_enter_partner_name_with_single_character() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Partner Name']"));
		e.click();
		e.sendKeys("I");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Partner Name with single character")
	public void Validate_the_save_button_by_entering_only_Partner_Name_with_single_character()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in Add New Partner page")
	public void click_on_reset_button_in_add_new_partner_page() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name")
	public void validate_the_entered_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Partner Name & Enter Partner Name with 50 character")
	public void click_on_partner_name_enter_partner_name_with_character() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Partner Name']"));
		e.click();
		e.sendKeys(
				"test test test test test test test test test test test test test test test test test test test test ");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Partner Name with 50 character")
	public void validate_the_save_button_by_entering_only_partner_name_with_character() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Contact Name & Enter Contact Name")
	public void click_on_contact_name_enter_contact_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Contact Name']"));
		e.click();
		e.sendKeys("Vamshi");
		Thread.sleep(1000);
	}

	@Then("Click on Contact Name & Enter Contact Name with numeric")
	public void click_on_contact_name_enter_contact_name_with_numeric() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Contact Name']"));
		e.click();
		e.sendKeys("Sai Teja12");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Contact Name with numeric")
	public void validate_the_save_button_by_entering_only_contact_name_with_numeric() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Invalid Contact Name!']")).getText();
		Assert.fail(a1);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Contact Name")
	public void validate_the_save_button_by_entering_only_contact_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Contact Name & Enter Contact Name with single character")
	public void click_on_contact_name_enter_contact_name_with_single_character() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Contact Name']"));
		e.click();
		e.sendKeys("I");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Contact Name with single character")
	public void Validate_the_save_button_by_entering_only_contact_Name_with_single_character()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getText();
		Assert.fail(a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Contact Name & Enter Contact Name with 50 character")
	public void click_on_contact_name_enter_contact_name_with_character() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Contact Name']"));
		e.click();
		e.sendKeys("test test test test test test test test test test test test ");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Contact Name with 50 character")
	public void validate_the_save_button_by_entering_only_contact_name_with_character() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Invalid Contact Name!']")).getText();
		Assert.assertEquals("Invalid Contact Name!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name")
	public void validate_the_entered_contact_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Partner Moniker & Enter Partner Moniker")
	public void click_on_partner_moniker_enter_partner_moniker() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']"));
		e.click();
		e.sendKeys("ZTNG");
		Thread.sleep(1000);
	}

	@Then("Click on Partner Moniker & Enter the Partner Moniker")
	public void click_on_partner_moniker_enter_the_partner_moniker() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']"));
		e.click();
		e.sendKeys("ITHB");
		Thread.sleep(1000);
	}

	@Then("Click on Partner Moniker & Enter another Partner Moniker")
	public void click_on_partner_moniker_enter_another_partner_moniker() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']"));
		e.click();
		e.sendKeys("NITS");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Partner Moniker")
	public void validate_the_save_button_by_entering_only_partner_moniker() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Partner Moniker & Enter Partner Moniker with single character")
	public void click_on_Partner_Moniker_enter_Partner_Moniker_with_single_character() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']"));
		e.click();
		e.sendKeys("I");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Partner Moniker with single character")
	public void Validate_the_save_button_by_entering_only_Partner_Moniker_with_single_character()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker")
	public void validate_the_entered_partner_moniker() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Click on country code & Select the +91 country code")
	public void click_on_country_code_select_the_country_code() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='+91']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Mobile Num & Enter Mobile Num")
	public void click_on_mobile_num_enter_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		e.click();
		e.sendKeys("8794561134");
		Thread.sleep(1000);
	}

	@Then("Click on Mobile Num & Enter the Mobile Num")
	public void click_on_mobile_num_enter_the_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		e.click();
		e.sendKeys("9996677778");
		Thread.sleep(1000);
	}

	@Then("Click on Mobile Num & Enter another Mobile Num")
	public void click_on_mobile_num_enter_another_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		e.click();
		e.sendKeys("9996677551");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Mobile Num")
	public void validate_the_save_button_by_entering_only_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Mobile Num & Enter invalid Mobile Num")
	public void click_on_mobile_num_enter_invalid_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		e.click();
		e.sendKeys("99966775");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only invalid Mobile Num")
	public void validate_the_save_button_by_entering_only_invalid_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Invalid Mobile number!']")).getText();
		Assert.assertEquals("Invalid Mobile number!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num")
	public void validate_the_entered_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the country code")
	public void validate_the_country_code() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//option[text()='+1']")).getText();
		Assert.assertEquals("+1", a);
		Thread.sleep(1000);
	}

	@Then("Validate the Tick mark")
	public void validate_the_tick_mark() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[19]")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Click on Email ID & Enter Email ID")
	public void click_on_email_id_enter_email_id() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		e.click();
		e.sendKeys("vamse3@gmail.com");
		Thread.sleep(1000);
	}

	@Then("Click on Email ID & Enter previous Email ID")
	public void click_on_email_id_enter_previous_email_id() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		e.click();
		e.sendKeys("saiteja@gmail.com");
		Thread.sleep(1000);
	}

	@Then("Click on Email ID & Enter the Email ID")
	public void click_on_email_id_enter_the_email_id() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		e.click();
		e.sendKeys("tillu@gmail.com");
		Thread.sleep(1000);
	}

	@Then("Click on Email ID & Enter another Email ID")
	public void click_on_email_id_enter_another_email_id() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		e.click();
		e.sendKeys("Maddy@gmail.com");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Email ID")
	public void validate_the_save_button_by_entering_only_email_id() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Email ID & Enter invalid Email ID")
	public void click_on_email_id_enter_invalid_email_id() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		e.click();
		e.sendKeys("saiteja.com");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only invalid Email ID")
	public void validate_the_save_button_by_entering_only_invalid_email_id() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Invalid Email address!']")).getText();
		Assert.assertEquals("Invalid Email address!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Email ID")
	public void validate_the_entered_email_id() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Address & Enter Address")
	public void click_on_address_enter_address() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//textarea)[1]"));
		e.click();
		e.sendKeys("hyderabad");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Address")
	public void validate_the_save_button_by_entering_only_address() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Address")
	public void validate_the_entered_address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Country & Select Country")
	public void click_on_country_select_country() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[1]"));
		e.click();
		driver.findElement(By.xpath("//div[text()='Afghanistan']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting only Country")
	public void validate_the_save_button_by_selecting_only_country() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Country & Click on search & Enter country name")
	public void click_on_country_click_on_search_enter_country_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[1]"));
		e.click();
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e1.click();
		e1.sendKeys("india");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='India']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the searched Country name")
	public void validate_the_searched_country_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='India']")).getText();
		Assert.assertEquals("India", a);
		Thread.sleep(1000);
	}

	@Then("Click on searched country name")
	public void Click_on__searched_country_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='India']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Country & Click on search & Enter invalid country name")
	public void click_on_country_click_on_search_enter_invalid_country_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[1]"));
		e.click();
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e1.click();
		e1.sendKeys("fasdf");
		Thread.sleep(1000);
	}

	@Then("Validate the invalid searched Country name")
	public void validate_the_invalid_searched_country_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("Validate the selected Country")
	public void validate_the_selected_country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the City name without selecting the Country")
	public void validate_the_city_name_without_selecting_the_country() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records!']")).getText();
		Assert.assertEquals("No Records!", a);
		Thread.sleep(1000);
	}

	@Then("Click on City & Select City")
	public void click_on_city_select_city() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[2]"));
		e.click();
		driver.findElement(By.xpath("//div[text()='‘Alāqahdārī Dīshū']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on City & Enter City")
	public void click_on_city_enter_city() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[2]"));
		e.click();
		driver.findElement(By.xpath("//div[text()='‘Alāqahdārī Dīshū']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on City")
	public void click_on_city() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[2]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting only City")
	public void validate_the_save_button_by_selecting_only_city() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Click on City & Click on search & Enter city name")
	public void click_on_city_click_on_search_enter_city_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[2]"));
		e.click();
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e1.click();
		e1.sendKeys("hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the searched City name")
	public void validate_the_searched_city_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Hyderabad']")).getText();
		Assert.assertEquals("Hyderabad", a);
		Thread.sleep(1000);
	}

	@Then("Click on City & Click on search & Enter invalid city name")
	public void click_on_city_click_on_search_enter_invalid_city_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[2]"));
		e.click();
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e1.click();
		e1.sendKeys("fasdf");
		Thread.sleep(1000);
	}

	@Then("Validate the invalid searched City name")
	public void validate_the_invalid_searched_city_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("Validate the selected City")
	public void validate_the_selected_city() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Bank details & Enter Bank details")
	public void click_on_bank_details_enter_bank_details() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//textarea)[2]"));
		e.click();
		e.sendKeys("000405007899, LIC MF BANKING & PSU DEBT FUND, SCHEME SPECIFIC , ICIC0000004");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only Bank details")
	public void validate_the_save_button_by_entering_only_bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Bank details")
	public void validate_the_entered_bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Click on PAN num & Enter PAN num")
	public void click_on_pan_num_enter_pan_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='PAN']"));
		e.click();
		e.sendKeys("AAACH2702H");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only PAN num")
	public void validate_the_save_button_by_entering_only_pan_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered PAN num")
	public void validate_the_entered_pan_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Click on VAT num & Enter VAT num")
	public void click_on_vat_num_enter_vat_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='VAT']"));
		e.click();
		e.sendKeys("987546123");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only VAT num")
	public void validate_the_save_button_by_entering_only_vat_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered VAT num")
	public void validate_the_entered_vat_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Click on GST num & Enter GST num")
	public void click_on_gst_num_enter_gst_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='GST']"));
		e.click();
		e.sendKeys("24AAACH2702H5Z2");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering only GST num")
	public void validate_the_save_button_by_entering_only_gst_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered GST num")
	public void validate_the_entered_gst_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@Then("Click on country code & Select the +1 another country code")
	public void click_on_country_code_select_the_another_country_code() throws InterruptedException {
		Thread.sleep(1000);
	}

	@Then("Click on Mobile Num & Enter Mobile Num of +1 country code")
	public void click_on_mobile_num_enter_mobile_num_of_country_code() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		e.click();
		e.sendKeys("4081233456");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Click on PAN num & Enter invalid PAN num")
	public void click_on_pan_num_enter_invalid_pan_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='PAN']"));
		e.click();
		e.sendKeys("AAACH2");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering invalid PAN num")
	public void validate_the_save_button_by_entering_invalid_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='Invalid PAN!']")).getText();
		Assert.assertEquals("Invalid PAN!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on VAT num & Enter invalid VAT num")
	public void click_on_vat_num_enter_invalid_vat_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='VAT']"));
		e.click();
		e.sendKeys("IE1234");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering invalid VAT num")
	public void validate_the_save_button_by_entering_invalid_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='Invalid VAT!']")).getText();
		Assert.assertEquals("Invalid VAT!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on GST num & Enter invalid GST num")
	public void click_on_gst_num_enter_invalid_gst_num() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='GST']"));
		e.click();
		e.sendKeys("24AAACH2702");
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering invalid GST num")
	public void validate_the_save_button_by_entering_invalid_gst_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='Invalid GST!']")).getText();
		Assert.assertEquals("Invalid GST!", a6);
		Thread.sleep(1000);
	}

	@Then("Click on Address & Enter more than 100 characters in Address")
	public void click_on_address_enter_more_than_characters_in_address() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//textarea)[1]"));
		e.click();
		e.sendKeys(
				"test test test test test test test test test test test test test test test test test test test test test test test test test test");
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of Address")
	public void validate_the_toast_msg_of_address() throws InterruptedException {
		Thread.sleep(100);
		String a = driver.findElement(By.xpath("//div[text()='Maximum 100 characters are allowed for Address']"))
				.getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Click on Bank details & Enter more than 100 characters in Bank details")
	public void click_on_bank_details_enter_more_than_characters_in_bank_details() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//textarea)[2]"));
		e.click();
		e.sendKeys(
				"test test test test test test test test test test test test test test test test test test test test test test test test test test");
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of Bank details")
	public void validate_the_toast_msg_of_bank_details() throws InterruptedException {
		Thread.sleep(100);
		String a = driver.findElement(By.xpath("//div[text()='Maximum 100 characters are allowed for Bank Details']"))
				.getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Click on Country & Select Germany Country")
	public void click_on_country_select_germany_country() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[1]"));
		e.click();
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e1.click();
		e1.sendKeys("Germany");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Germany']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on City & Select Germany City")
	public void click_on_city_select_germany_city() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[2]"));
		e.click();
		driver.findElement(By.xpath("//div[text()='Abenberg']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of Profile")
	public void validate_the_toast_msg_of_profile() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Saved!", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of Profile page")
	public void validate_the_toast_msg_of_profile_page() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.fail(a1);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of previous Partner Moniker")
	public void validate_the_toast_msg_of_previous_Partner_Moniker() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Duplicate Moniker", a);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of previous Mobile Num")
	public void validate_the_toast_msg_of_previous_Mobile_Num() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Mobile number already exists!", a);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of previous Email ID")
	public void validate_the_toast_msg_of_previous_Email_ID() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Email address already exists", a);
		Thread.sleep(1000);
	}

	@Then("Validate the contacts tab")
	public void validate_the_contacts_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//button[text()='Contacts']")).getText();
		Assert.assertEquals("Contacts", a);
		Thread.sleep(1000);
	}

	@Then("Click on any Partner Company")
	public void click_on_any_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Myntra']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Partner Company")
	public void click_on_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Info Solutions'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Click the Partner Company")
	public void click_the_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Bio']")).click();
		Thread.sleep(1000);
	}

	@Then("Click another Partner Company")
	public void click_another_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='IQ labs']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate another one Partner Company Page")
	public void validate_another_one_partner_company_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//h1[text()='Bio']")).getText();
		Assert.assertEquals("Bio", a);
		Thread.sleep(1000);
	}

	@Then("Validate the Partner Company Page")
	public void validate_the_partner_company_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//h1[text()='Myntra']")).getText();
		Assert.assertEquals("Myntra", a);
		Thread.sleep(1000);
	}

	@Then("Validate Partner Company Page")
	public void validate_partner_company_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//h1[text()='Info Solutions']")).getText();
		Assert.assertEquals("Info Solutions", a);
		Thread.sleep(1000);
	}

	@Then("Validate the another Partner Company Page")
	public void validate_the_another_partner_company_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//h1[text()='IQ labs']")).getText();
		Assert.assertEquals("IQ labs", a);
		Thread.sleep(1000);
	}

	@Then("Click on profile tab")
	public void click_on_profile_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Profile']")).click();
		Thread.sleep(1000);
	}

	@Then("Again click on contacts tab")
	public void again_click_on_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Contacts']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page before entered data")
	public void validate_the_contacts_page_before_entered_data() throws InterruptedException {
		String a3 = driver.findElement(By.xpath("//div[text()='Name']")).getText();
		Assert.fail(a3);
		Thread.sleep(1000);
	}

	@Then("Click on contacts tab")
	public void click_on_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Contacts']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the contacts tab Page")
	public void validate_the_contact_tab_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Point of Contacts']")).getText();
		Assert.assertEquals("Point of Contacts", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact 01']")).getText();
		Assert.assertEquals("Contact 01", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Role']")).getText();
		Assert.assertEquals("Role", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Name']")).getText();
		Assert.assertEquals("Name", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//span[text()='Mobile Number']")).getText();
		Assert.assertEquals("Mobile Number", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Email ID']")).getText();
		Assert.assertEquals("Email ID", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='Country']")).getText();
		Assert.assertEquals("Country", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("//div[text()='City']")).getText();
		Assert.assertEquals("City", a7);
		Thread.sleep(1000);
	}

	@Then("Select the Role dropdown in contacts tab")
	public void select_the_role_dropdown_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		Thread.sleep(1000);
	}

	@Then("Select the Role in dropdown")
	public void select_the_role_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Co-ordinator']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Save & Next button in contacts tab")
	public void click_on_save_next_button_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Save & Next']")).click();
	}

	@Then("Validate the contacts page with only Role")
	public void validate_the_contacts_page_with_only_role() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter any valid Role name")
	public void click_on_search_enter_any_valid_role_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("co-ordinator");
		Thread.sleep(1000);
	}

	@Then("Validate the searched Role name in contacts page")
	public void validate_the_searched_role_name_in_contacts_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Co-ordinator']")).getText();
		Assert.assertEquals("co-ordinator", a);
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter any invalid Role name")
	public void click_on_search_enter_any_invalid_role_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("rdasad");
		Thread.sleep(1000);
	}

	@Then("Validate the searched invalid Role name in contacts page")
	public void validate_the_searched_invalid_role_name_in_contacts_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page without entering anything")
	public void validate_the_contacts_page_without_entering_anything() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a5);
		Thread.sleep(1000);
	}

	@Then("Enter the name with numeric in contacts tab")
	public void enter_the_name_with_numeric_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).sendKeys("sharath456");
		Thread.sleep(1000);
	}

	@Then("Enter the name with single character in contacts tab")
	public void enter_the_name_with_single_character_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).sendKeys("s");
		Thread.sleep(1000);
	}

	@Then("Enter the name with more than 50 character in contacts tab")
	public void enter_the_name_with_more_than_character_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Contact Name']"))
				.sendKeys("test test test test test test test test test test test test test test");
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with only Name with single character")
	public void validate_the_contacts_page_with_only_name_single_character() throws InterruptedException {
		String a = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with only Name with more than 50 character")
	public void validate_the_contacts_page_with_only_name_with_more_than_character() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Invalid Name!']")).getText();
		Assert.assertEquals("Invalid Name!", a);
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with only Name with numeric")
	public void validate_the_contacts_page_with_only_name_with_numeric() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Invalid Name!']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with only Name")
	public void validate_the_contacts_page_with_only_name() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a5);
		Thread.sleep(1000);
	}

	@Then("Enter the name in contacts tab")
	public void enter_the_name_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).sendKeys("sharath");
		Thread.sleep(1000);
	}

	@Then("Enter the Email ID in contacts tab")
	public void enter_the_email_id_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("sharath2@zap.com");
		Thread.sleep(1000);
	}

	@Then("Enter invalid Email ID in contacts tab")
	public void enter_invalid_email_id_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("sharatha@df");
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with invalid Email ID")
	public void validate_the_contacts_page_with_invalid_email_id() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Invalid Email address!']")).getText();
		Assert.assertEquals("Invalid Email address!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with only Email ID")
	public void validate_the_contacts_page_with_only_email_id() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a5);
		Thread.sleep(1000);
	}

	@Then("Click on country code & Select the +91 country code in contacts page")
	public void click_on_country_code_select_the_country_code_in_contacts_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='+91']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on country code & Select the another +1 country code in contacts page")
	public void click_on_country_code_select_the_another_country_code_in_contacts_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='+1']")).click();
		Thread.sleep(1000);
	}

	@Then("Enter the Mobile Num in contacts tab")
	public void enter_the_mobile_num_in_contacts_tab() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("1");
		Thread.sleep(1000);
	}

	@Then("Enter another Mobile Num in contacts tab")
	public void enter_another_mobile_num_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("4081233456");
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with only Mobile Num")
	public void validate_the_contacts_page_with_only_mobile_num() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a5);
		Thread.sleep(1000);
	}

	@Then("Enter invalid Mobile Num in contacts tab")
	public void enter_invalid_mobile_num_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9874678");
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with invalid Mobile Num")
	public void validate_the_contacts_page_with_invalid_mobile_num() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Invalid Mobile number!']")).getText();
		Assert.assertEquals("Invalid Mobile number!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a5);
		Thread.sleep(1000);
	}

	@Then("Select the dropdown of Country & Click on Country in contacts page")
	public void select_the_dropdown_of_country_click_on_country_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Afghanistan']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with only Country")
	public void validate_the_contacts_page_with_only_country() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Afghanistan']")).getText();
		Assert.assertEquals("Afghanistan", a);
		Thread.sleep(1000);
	}

	@Then("Select the dropdown of Country")
	public void select_the_dropdown_of_country() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter valid country name in contacts tab")
	public void click_on_search_enter_valid_country_name_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("india");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='India']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the country name in contacts page")
	public void validate_the_country_name_in_contacts_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='India']")).getText();
		Assert.assertEquals("India", a);
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter invalid country name in contacts tab")
	public void click_on_search_enter_invalid_country_name_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("test");
		Thread.sleep(1000);
	}

	@Then("Validate the invalid country name in contacts page")
	public void validate_the_invalid_country_name_in_contacts_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("Select the dropdown of City & Click on City in contacts page")
	public void select_thedropdown_of_city_click_on_city_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Andkhoy']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with only City")
	public void validate_the_contacts_page_with_only_city() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Andkhoy']")).getText();
		Assert.assertEquals("Andkhoy", a);
		Thread.sleep(1000);
	}

	@Then("Select the dropdown of City")
	public void select_the_dropdown_of_city() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[3]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with only City without selecting country")
	public void validate_the_contacts_page_with_only_city_without_selecting_country() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='No Records!']")).getText();
		Assert.assertEquals("No Records!", a);
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter valid city name in contacts tab")
	public void click_on_search_enter_valid_city_name_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the city name in contacts page")
	public void validate_the_city_name_in_contact_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Darzāb']")).getText();
		Assert.assertEquals("Darzāb", a);
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter invalid city name in contacts tab")
	public void click_on_search_enter_invalid_city_name_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("test");
		Thread.sleep(1000);
	}

	@Then("Validate the invalid city name in contacts page")
	public void validate_the_invalid_city_name_in_contacts_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in contacts tab")
	public void click_on_reset_button_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in Profile page")
	public void click_on_reset_button_in_profile_page() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the City name")
	public void validate_the_city_name() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).getText();
		Assert.assertEquals("", a);
		Thread.sleep(1000);
	}

	@Then("Validate the contacts page with Reset button")
	public void validate_the_contacts_page_with_reset_button() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Select']")).getText();
		Assert.assertEquals("Select", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Select']")).getText();
		Assert.assertEquals("Select", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Select']")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
	}

	@Then("Click on add more button in contacts tab")
	public void click_on_add_more_button_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Add more']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the add more contacts list Page")
	public void validate_the_add_more_contacts_list_page() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Contact 02']")).getText();
		Assert.assertEquals("Contact 02", a1);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Contact 01']")).getText();
		Assert.assertEquals("Contact 01", a);
		Thread.sleep(1000);
	}

	@Then("Validate the contacts list Page with Reset")
	public void validate_the_contacts_list_page_with_reset() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Contact 01']")).getText();
		Assert.assertEquals("Contact 01", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Close button in contacts tab")
	public void click_on_close_button_in_contacts_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[22]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the close button in contacts tab without entering data")
	public void validate_the_close_button_in_contacts_page_without_entering_data() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div)[183]")).getText();
		Assert.assertEquals("Are you sure?\n" + "Do you want to delete this contact?\n" + "No\n" + "Yes", a1);
		Assert.fail(a1);
		Thread.sleep(1000);
	}

	@Then("Validate the close button in contacts tab")
	public void validate_the_close_button_in_contacts_page() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div)[183]")).getText();
		Assert.assertEquals("Are you sure?\n" + "Do you want to delete this contact?\n" + "No\n" + "Yes", a1);
		Thread.sleep(1000);
	}

	@Then("Click on close button in popup page")
	public void click_on_close_button_in_popup_page() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[26]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the contacts list Page with close button in popup")
	public void validate_the_contacts_list_page_with_close_button_in_popup() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Contact 02']")).getText();
		Assert.assertEquals("Contact 02", a1);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Contact 01']")).getText();
		Assert.assertEquals("Contact 01", a);
		Thread.sleep(1000);
	}

	@Then("Click on No button in popup page")
	public void click_on_no_button_in_popup_page() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='No'])[2]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the contacts list Page with No button")
	public void validate_the_contacts_list_page_with_no_button() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Contact 02']")).getText();
		Assert.assertEquals("Contact 02", a1);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Contact 01']")).getText();
		Assert.assertEquals("Contact 01", a);
		Thread.sleep(1000);
	}

	@Then("Click on Yes button in popup page")
	public void click_on_yes_button_in_popup_page() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Yes'])[2]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the contacts list Page with Yes button")
	public void validate_the_contacts_list_page_with_Yes_button() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Contact 01']")).getText();
		Assert.assertEquals("Contact 01", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Role dropdown in second contact")
	public void click_on_role_dropdown_in_second_contact() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='combobox'])[4]")).click();
		Thread.sleep(1000);
	}

	@Then("Select the Role in dropdown in second contact")
	public void select_the_role_in_dropdown_in_second_contact() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Co-ordinator']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the contacts list Page by selecting role without saving the page")
	public void validate_the_contacts_list_page_by_selecting_role() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg in contacts tab")
	public void validate_the_toast_msg_in_contacts_tab() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Saved!", a1);
		Thread.sleep(1000);
	}

	@Then("Click on doc tab")
	public void click_on_document_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Documents']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the doc tab")
	public void validate_the_doc_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//button[text()='Documents']")).getText();
		Assert.assertEquals("Documents", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//div[@class='ui:flex ui:items-center ui:gap-3'])[5]")).getText();
		Assert.assertEquals("Select files or drag and drop here\n" + "JPG, PNG or PDF, file size no more than 10MB",
				a1);
		Thread.sleep(1000);
	}

	@Then("Click on Upload button")
	public void click_on_upload_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='UPLOAD FILES']")).click();
		Thread.sleep(1000);
	}

	@Then("Select the image & Click on that image")
	public void select_the_image_click_on_that_image() throws InterruptedException, AWTException {
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/123443234europe.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
	}

	@Then("Validate the uploaded image")
	public void validate_the_uploaded_image() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@class='text-xs']")).getText();
		Assert.assertEquals("Uploading...", a);
		Thread.sleep(5000);
		String a1 = driver.findElement(By.xpath("//div[@class='text-xs']")).getText();
		Assert.assertEquals("123443234europe.png", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the previous uploaded image")
	public void validate_the_previous_uploaded_image() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//div[@class='ui:py-4 p-8'])[1]")).getText();
		Assert.assertEquals("Select files or drag and drop here\n" + "JPG, PNG or PDF, file size no more than 10MB\n"
				+ "UPLOAD FILES\n" + "Reset\n" + "Save & Next", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Select the image of jpg & Click on that image")
	public void select_the_image_of_jpg_click_on_that_image() throws InterruptedException, AWTException {
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection(
				"/home/tvisha/Downloads/Screenshot_20250707_144414_TroopMessenger.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	@Then("Validate the uploaded image of jpg")
	public void validate_the_uploaded_image_of_jpg() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[@class='text-xs']")).getText();
		Assert.assertEquals("Uploading...", a);
		Thread.sleep(5000);
		String a1 = driver.findElement(By.xpath("//div[@class='text-xs']")).getText();
		Assert.assertEquals("Screenshot_20250707_144414_TroopMessenger.jpg", a1);
		Thread.sleep(1000);
	}

	@Then("Select the file of pdf & Click on that file")
	public void select_the_file_of_pdf_click_on_that_file() throws InterruptedException, AWTException {
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/PDF_document1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	@Then("Validate the uploaded file of pdf")
	public void validate_the_uploaded_file_of_pdf() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@class='text-xs']")).getText();
		Assert.assertEquals("Uploading...", a);
		Thread.sleep(5000);
		String a1 = driver.findElement(By.xpath("//div[@class='text-xs']")).getText();
		Assert.assertEquals("PDF_document1.pdf", a1);
		Thread.sleep(1000);
	}

	@Then("Select the image more than 10MB & Click on that image")
	public void select_the_image_more_than_10mb_click_on_that_image() throws InterruptedException, AWTException {
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/1733734090489_iVtsW.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	@Then("Validate the uploaded image of 10MB")
	public void validate_the_uploaded_image_of_10mb() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//p[text()='File(s) not allowed: 1733734090489_iVtsW.png']")).getText();
		Assert.assertEquals("File(s) not allowed: 1733734090489_iVtsW.png", a);
		Thread.sleep(5000);
	}

	@Then("Select the file of xlsx & Click on that file")
	public void select_the_file_of_xlsx_click_on_that_file() throws InterruptedException, AWTException {
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/_data_TM_sample_7 (2).xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	@Then("Select the file of doc & Click on that file")
	public void select_the_file_of_doc_click_on_that_file() throws InterruptedException, AWTException {
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/1-MB-DOC.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	@Then("Validate the uploaded file of doc")
	public void validate_the_uploaded_file_of_doc() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//p[text()='File(s) not allowed: 1-MB-DOC.doc']")).getText();
		Assert.assertEquals("File(s) not allowed: 1-MB-DOC.doc", a);
		Thread.sleep(1000);
	}

	@Then("Validate the uploaded file of xlsx")
	public void validate_the_uploaded_file_of_xlsx() throws InterruptedException {
		Thread.sleep(1000);
		Thread.sleep(5000);
		String a1 = driver.findElement(By.xpath("//div[@class='text-xs']")).getText();
		Assert.assertEquals("Screenshot_20250707_144414_TroopMessenger.jpg", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Save & Next button in doc page")
	public void click_on_save_next_button_in_doc_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Save & Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg without entering title in doc page")
	public void validate_the_toast_msg_without_entering_title_in_doc_page() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@class='go2072408551'])[1]")).getText();
		Assert.assertEquals("Title is required.", a1);
		Thread.sleep(1000);
	}

	@And("Click on Reset button in doc page")
	public void click_on_reset_button_in_doc_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@And("Enter the title in doc page")
	public void enter_the_title_in_doc_page() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Title']"));
		e.click();
		e.sendKeys("jpg");
		Thread.sleep(1000);
	}

	@And("Enter title in doc page")
	public void enter_title_in_doc_page() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Title']"));
		e.click();
		e.sendKeys("png");
		Thread.sleep(1000);
	}

	@Then("Validate the doc page with Reset button")
	public void validate_the_doc_page_with_reset_button() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[@class='w-[700px] max-w-full']")).getText();
		Assert.assertEquals("Select files or drag and drop here\n" + "JPG, PNG or PDF, file size no more than 10MB\n"
				+ "UPLOAD FILES\n" + "Reset\n" + "Save & Next", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the doc page with save button")
	public void validate_the_doc_page_with_save_button() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Saved!", a1);
		Thread.sleep(1000);
	}

	@And("Click on Close button in doc page")
	public void click_on_close_button_in_doc_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[18]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the doc page with Close button")
	public void validate_the_doc_page_with_Close_button() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[@class='w-[700px] max-w-full']")).getText();
		Assert.assertEquals("Select files or drag and drop here\n" + "JPG, PNG or PDF, file size no more than 10MB\n"
				+ "UPLOAD FILES\n" + "Reset\n" + "Save & Next", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Plan tab")
	public void click_on_Plan_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Plan']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on added partner")
	public void click_on_added_partner() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='zap8']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Plan tab")
	public void validate_the_Plan_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//button[text()='Plan']")).getText();
		Assert.assertEquals("Plan", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[@class='ui:py-4 p-8']")).getText();
		Assert.assertEquals("Editions\n" + "Packages\n" + "Individual add-ons\n" + "Select Editions\n" + "1. Plan\n"
				+ "Select\n" + "+\n" + "Add more\n" + "Reset\n" + "Next", a1);
		Thread.sleep(1000);
	}

	@Then("Validate already added Plan tab")
	public void validate_already_added_Plan_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//button[text()='Plan']")).getText();
		Assert.assertEquals("Plan", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[@class='ui:py-4 p-8']")).getText();
		Assert.assertEquals("Editions\n" + "Packages\n" + "Individual add-ons\n" + "Select Editions\n" + "1. Plan\n"
				+ "Bio Premium\n" + "+\n" + "Add more\n" + "Reset\n" + "Next", a1);
		Thread.sleep(1000);
	}

	@Then("Click on select in Plan tab")
	public void click_on_select_in_Plan_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		Thread.sleep(1000);
	}

	@Then("Select the Plan in dropdown list")
	public void select_the_Plan_in_dropdown_list() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Myntra Enterprise']")).click();
		Thread.sleep(1000);
	}

	@Then("Select Plan in dropdown list")
	public void select_Plan_in_dropdown_list() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("Info");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Info_Tech_Solutions']")).click();
		Thread.sleep(1000);
	}

	@Then("Select Plan in dropdown")
	public void select_Plan_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("hub");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='IT-Hub-Enterprise']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected Plan")
	public void validate_the_selected_Plan() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[@title='Myntra Enterprise']")).getText();
		Assert.assertEquals("Myntra Enterprise", a);
		Thread.sleep(1000);
	}

	@Then("Validate selected Plan")
	public void validate_selected_Plan() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Info_Tech_Solutions']")).getText();
		Assert.assertEquals("Info_Tech_Solutions", a);
		Thread.sleep(1000);
	}

	@Then("Validate selected Plan in package")
	public void validate_selected_Plan_in_package() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='IT-Hub-Enterprise']")).getText();
		Assert.assertEquals("IT-Hub-Enterprise", a);
		Thread.sleep(1000);
	}

	@Then("Select the Plan in dropdown")
	public void select_the_Plan_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='VI-Premium']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected Plan in dropdown")
	public void validate_the_selected_Plan_in_dropdown() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[@title='VI-Premium']")).getText();
		Assert.assertEquals("VI-Premium", a);
		Thread.sleep(1000);
	}

	@Then("Select the already used Plan in dropdown list")
	public void select_the_already_used_Plan_in_dropdown_list() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='A-Verse-Enterprise']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the already used selected Plan")
	public void validate_the_already_used_selected_Plan() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[@title='Select']")).getText();
		Assert.assertEquals("Select", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[@id='select-option-1']")).getAttribute("aria-selected");
		Assert.assertEquals("false", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Search & Search the Valid Plan")
	public void click_on_search_search_the_valid_plan() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("myntra");
		Thread.sleep(1000);
	}

	@Then("Validate the searched Plan")
	public void validate_the_searched_Plan() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Myntra Enterprise']")).getText();
		Assert.assertEquals("Myntra Enterprise", a);
		Thread.sleep(1000);
	}

	@Then("Click on Search & Search the inValid Plan")
	public void click_on_search_search_the_invalid_plan() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("asdda");
		Thread.sleep(1000);
	}

	@Then("Validate the invalid searched Plan")
	public void validate_the_invalid_searched_Plan() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("Click on add more button in Plan tab")
	public void click_on_add_more_button_in_plan_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Add more']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the add more in Plan tab")
	public void validate_the_add_more_in_plan_tab() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@class='flex justify-between items-center'])[2]")).getText();
		Assert.assertEquals("1. Plan", a1);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//div[@class='flex justify-between items-center'])[3]")).getText();
		Assert.assertEquals("2. Plan", a);
		Thread.sleep(1000);
	}

	@Then("Click on close button for plan")
	public void click_on_close_button_for_plan() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//div)[101]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the closed in Plan tab")
	public void validate_the_closed_in_plan_tab() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@class='flex justify-between items-center'])[2]")).getText();
		Assert.assertEquals("1. Plan", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the popup page in Plan tab")
	public void validate_the_popup_page_in_plan_tab() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@class='ui:modal-box'])[1]")).getText();
		Assert.assertEquals("Are you sure?\n" + "Do you want to delete this Edition?\n" + "No\n" + "Yes", a1);
		Thread.sleep(1000);
	}

	@Then("Click on close button in popup page for Plan")
	public void click_on_close_button_in_popup_page_for_plan() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[21]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the Plans page")
	public void validate_the_plans_page() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@class='flex justify-between items-center'])[2]")).getText();
		Assert.assertEquals("1. Plan", a1);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//div[@class='flex justify-between items-center'])[3]")).getText();
		Assert.assertEquals("2. Plan", a);
		Thread.sleep(1000);
	}

	@Then("Click on No button in popup page for Plan")
	public void click_on_no_button_in_popup_page_for_plan() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='No']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on Yes button in popup page for Plan")
	public void click_on_yes_button_in_popup_page_for_plan() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Yes']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the Yes button in Plan tab")
	public void validate_the_Yes_button_in_plan_tab() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@class='flex justify-between items-center'])[2]")).getText();
		Assert.assertEquals("1. Plan", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in Plan tab")
	public void click_on_reset_button_in_plan_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the Reset in Plan tab")
	public void validate_the_Reset_in_plan_tab() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[@class='w-[700px] max-w-full']")).getText();
		Assert.assertEquals("Editions\n" + "Packages\n" + "Individual add-ons\n" + "Select Editions\n" + "+\n"
				+ "Add more\n" + "Reset\n" + "Next", a1);
		Assert.fail(a1);
		Thread.sleep(1000);
	}

	@Then("Click on next button in plan")
	public void click_on_next_button_in_plan() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Next']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg for Plan")
	public void validate_the_toast_msg_for_plan() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Edition is required!']")).getText();
		Assert.assertEquals("Edition is required!", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the Package plan page")
	public void validate_the_package_plan_page() throws InterruptedException {
		String a1 = driver
				.findElement(
						By.xpath("(//div[@class='border border-gray-300 rounded-[10px] p-[10px] bg-[#F5F5F5]'])[1]"))
				.getText();
		Assert.assertEquals("Select Package:\n" + "Select\n" + "+\n" + "Add more", a1);
		Thread.sleep(1000);
	}

	@Then("Click on add more button in package tab")
	public void click_on_add_more_button_in_package_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Add more']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the package tab by clicking on add more button")
	public void validate_the_package_tab_by_clicking_on_add_more_button() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Select Package:']")).getText();
		Assert.assertEquals("Select Package:", a1);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Select Package:']")).getText();
		Assert.assertEquals("Select Package:", a);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in package tab")
	public void click_on_reset_button_in_package_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the package tab by clicking on add more button with Reset button")
	public void validate_the_package_tab_by_clicking_on_add_more_button_with_reset_button()
			throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Select Package:']")).getText();
		Assert.assertEquals("Select Package:", a1);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Select Package:']")).getText();
		Assert.assertEquals("Select Package:", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Click on Close button in package tab")
	public void click_on_close_button_in_package_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[22]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the package tab by clicking on add more button with Close button")
	public void validate_the_package_tab_by_clicking_on_add_more_button_with_close_button()
			throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/h2[1]")).getText();
		Assert.assertEquals(
				"Application error: a client-side exception has occurred while loading 192.168.2.19 (see the browser console for more information).",
				a1);
		Assert.fail(a1);
		Thread.sleep(1000);
//	    String a=driver.findElement(By.xpath("//div[text()='Select Package:']")).getText();
//	    Assert.assertEquals("Select Package:", a);
		Thread.sleep(1000);
	}

	@Then("Click on select dropdown in package")
	public void click_on_select_dropdown_in_package() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on package in dropdown")
	public void click_on_package_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Myntra Product']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on package in Plan tab")
	public void click_package_in_plan_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='IT-Hub_Integration']")).click();
		Thread.sleep(1000);
	}

	@Then("Click package in dropdown")
	public void click_package_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Info_Tech_Integration']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the dropdown with empty packages")
	public void validate_the_dropdown_with_empty_packages() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='No Records!']")).getText();
		Assert.assertEquals("No Records!", a);
		Thread.sleep(1000);
	}

	@Then("Click on another Partner Company")
	public void click_on_another_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Myntra']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate another Partner Company Page")
	public void validate_another_partner_company_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//h1[text()='Myntra']")).getText();
		Assert.assertEquals("Myntra", a);
		Thread.sleep(1000);
	}

	@Then("Validate the dropdown with packages")
	public void validate_the_dropdown_with_packages() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Myntra Product']")).getText();
		Assert.assertEquals("Myntra Product", a);
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter valid search in packages tab")
	public void click_on_search_enter_Valid_search_in_packages_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("myntra");
		Thread.sleep(1000);
	}

	@Then("Validate the searched package name")
	public void validate_the_searched_package_name() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Myntra Product']")).getText();
		Assert.assertEquals("Myntra Product", a);
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter invalid search in packages tab")
	public void click_on_search_enter_invalid_search_in_packages_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("asdda");
		Thread.sleep(1000);
	}

	@Then("Validate the invalid searched package name")
	public void validate_the_invalid_searched_package_name() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("Click on next button in package")
	public void click_on_next_button_in_package() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the individual add-ons page")
	public void validate_the_individual_add_ons_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Select Add-Ons:']")).getText();
		Assert.assertEquals("Select Add-Ons:", a);
		Thread.sleep(1000);
	}

	@Then("Again Validate the individual add-ons page")
	public void again_validate_the_individual_add_ons_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Select Add-Ons:']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Click on package name in dropdown")
	public void click_on_package_name_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Bio Integration']")).click();
		Thread.sleep(1000);
	}

	@Then("Again Click on plan tab")
	public void again_click_on_plan_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Plan']")).click();
		Thread.sleep(1000);
	}

	@Then("Select the checkboxes in individual add-ons")
	public void select_the_checkbox_in_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='102']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected checkbox in individual add-ons")
	public void validate_the_selected_checkbox_in_individual_add_ons() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='End-to-End Encryption']")).getText();
		Assert.assertEquals("End-to-End Encryption", a);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in individual add-ons")
	public void click_on_reset_button_in_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the individual add-ons after reset")
	public void validate_the_individual_addons_after_reset() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='End-to-End Encryption']")).getText();
		Assert.assertEquals("End-to-End Encryption", a);
		Thread.sleep(1000);
	}

	@Then("Deselect the Selected checkbox individual add-ons")
	public void deselect_the_selected_checkbox_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='102']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the individual add-ons after deselected")
	public void validate_the_individual_addons_after_deselected() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='End-to-End Encryption']")).getText();
		Assert.assertEquals("End-to-End Encryption", a);
		Thread.sleep(1000);
	}

	@Then("Click on Save & Next button in individual add-ons")
	public void click_on_save_next_button_in_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Save & Next'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate pricing tab")
	public void validate_pricing_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//button[text()='Pricing']")).getText();
		Assert.assertEquals("Pricing", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Select Currency:']")).getText();
		Assert.assertEquals("Select Currency:", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Pricing tab")
	public void click_on_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Pricing']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Pricing tab")
	public void validate_the_pricing_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//button[text()='Profile']")).getText();
		Assert.assertEquals("Profile", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath(
				"//button[@class='ui:py-2 ui:text-sm ui:font-medium ui:transition-colors ui:duration-300 ui:text-[#243A49] ui:cursor-not-allowed']"))
				.getAttribute("class");
		Assert.assertEquals(
				"ui:py-2 ui:text-sm ui:font-medium ui:transition-colors ui:duration-300 ui:text-[#243A49] ui:cursor-not-allowed",
				a1);
		Thread.sleep(1000);
	}

	@Then("Click on select dropdown in Pricing tab")
	public void click_on_select_dropdown_in_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on rupees dropdown in Pricing tab")
	public void click_on_rupees_dropdown_in_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='₹ Indian Rupee']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the dropdown list in pricing tab")
	public void validate_the_dropdown_list_in_pricing_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath(
				"(//div[@class='ui:absolute ui:top-[34px] ui:z-[9999] ui:border ui:border-[#E0DCDC] ui:shadow-md ui:rounded-lg ui:w-[250px] ui:px-5 ui:py-6 ui:bg-white'])[1]"))
				.getText();
		Assert.assertEquals(
				"All\n" + "₹ Indian Rupee\n" + "$ United States Dollar\n" + "€ Euro\n" + "Reset\n" + "Apply", a);
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter valid search in pricing tab")
	public void click_on_search_enter_valid_search_in_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Find an item']"));
		e.click();
		e.sendKeys("indian");
		Thread.sleep(1000);
	}

	@Then("Validate the searched pricing")
	public void validate_the_searched_pricing() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='₹ Indian Rupee']")).getText();
		Assert.assertEquals("₹ Indian Rupee", a);
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter invalid search in pricing tab")
	public void click_on_search_enter_invalid_search_in_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Find an item']"));
		e.click();
		e.sendKeys("dfas");
		Thread.sleep(1000);
	}

	@Then("Validate invalid searched pricing")
	public void validate_invalid_searched_pricing() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("Click on outside in pricing tab")
	public void click_on_outside_in_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(
				By.xpath("(//div[@class='ui:fixed ui:top-0 ui:left-0 ui:w-full ui:h-full ui:z-[9999]'])[1]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Again click on dropdown of currency")
	public void again_click_on_dropdown_of_currency() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the dropdown list of currency in pricing tab")
	public void validate_the_dropdown_list_of_currency_in_pricing_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//input[@placeholder='Find an item']")).getAttribute("value");
		Assert.assertEquals("indian", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Click on apply button in pricing tab")
	public void click_on_apply_button_in_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Apply']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the dropdown list with search in pricing tab")
	public void validate_the_dropdown_list_with_search_in_pricing_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//input[@placeholder='Find an item']")).getAttribute("value");
		Assert.assertEquals("indian", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in pricing tab")
	public void click_on_reset_button_in_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the dropdown list with reset in pricing tab")
	public void validate_the_dropdown_list_with_reset_in_pricing_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//input[@placeholder='Find an item']")).getAttribute("value");
		Assert.assertEquals("", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath(
				"(//div[@class='ui:absolute ui:top-[34px] ui:z-[9999] ui:border ui:border-[#E0DCDC] ui:shadow-md ui:rounded-lg ui:w-[250px] ui:px-5 ui:py-6 ui:bg-white'])[1]"))
				.getText();
		Assert.assertEquals(
				"All\n" + "₹ Indian Rupee\n" + "$ United States Dollar\n" + "€ Euro\n" + "Reset\n" + "Apply", a1);
	}

	@Then("Click on All checkbox in currency")
	public void click_on_all_checkbox_in_currency() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@id='allCheckbox']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the currency page of selected All")
	public void validate_the_currency_page_of_selected_all() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@class='flex flex-wrap items-center gap-3'])[1]")).getText();
		Assert.assertEquals("₹\n" + "INR\n" + "$\n" + "USD\n" + "€\n" + "EUR", a);
		Thread.sleep(1000);
		String a1 = driver
				.findElement(By.xpath(
						"(//div[@class='bg-white rounded-[10px] border border-[#0000004D] shadow-sm pt-4 pb-3'])[1]"))
				.getText();
		Assert.assertEquals("Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n"
				+ "per user unit cost\n" + "$\n" + "USD\n" + "-\n" + "per user unit cost\n" + "€\n" + "EUR\n" + "-\n"
				+ "per user unit cost", a1);
		Thread.sleep(1000);
	}

	@Then("Click on rupees checkbox in currency")
	public void click_on_rupees_checkbox_in_currency() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//div[text()='₹ Indian Rupee']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on dollar checkbox in currency")
	public void click_on_dollar_checkbox_in_currency() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//div[text()='$ United States Dollar']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on euro checkbox in currency")
	public void click_on_euro_checkbox_in_currency() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//div[text()='€ Euro']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the currency page of selected rupees")
	public void validate_the_currency_page_of_selected_rupees() throws InterruptedException {
		String a = driver.findElement(By.xpath(
				"(//div[@class='flex justify-between gap-2 items-center bg-[#FCEFDA] rounded-md px-[5px] text-[13px]'])[1]"))
				.getText();
		Assert.assertEquals("₹\n" + "INR", a);
		Thread.sleep(1000);
		String a1 = driver
				.findElement(By.xpath(
						"(//div[@class='bg-white rounded-[10px] border border-[#0000004D] shadow-sm pt-4 pb-3'])[1]"))
				.getText();
		Assert.assertEquals("Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n"
				+ "per user unit cost", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the currency page of selected rupees with Edition Id")
	public void validate_the_currency_page_of_selected_rupees_with_edition_id() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@class='flex justify-between items-center text-[#222222]'])[1]"))
				.getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Again Click on All checkbox in currency")
	public void again_click_on_all_checkbox_in_currency() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@id='allCheckbox']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Deselect Click on All checkbox in currency")
	public void deselect_click_on_all_checkbox_in_currency() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@id='allCheckbox']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the currency page of deselected All")
	public void validate_the_currency_page_of_deselected_all() throws InterruptedException {
		String a = driver.findElement(By.xpath("//input[@id='allCheckbox']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Click on close button for INR")
	public void click_on_close_button_for_inr() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[18]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the pricing details")
	public void validate_the_pricing_details() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@class='flex items-center gap-3'])[1]")).getText();
		Assert.assertEquals(
				"Select Currency:\n" + "$ United States Dollar, +1\n" + "Selected\n" + "$\n" + "USD\n" + "€\n" + "EUR",
				a);
		Thread.sleep(1000);
		String a1 = driver
				.findElement(By.xpath(
						"(//div[@class='bg-white rounded-[10px] border border-[#0000004D] shadow-sm pt-4 pb-3'])[1]"))
				.getText();
		Assert.assertEquals("Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n" + "$\n" + "USD\n" + "-\n"
				+ "per user unit cost\n" + "€\n" + "EUR\n" + "-\n" + "per user unit cost", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button for pricing")
	public void click_on_reset_button_for_pricing() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on Next button for pricing")
	public void click_on_next_button_for_pricing() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Next']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate toast msg in pricing tab")
	public void validate_toast_msg_in_pricing_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Price is required.']")).getText();
		Assert.assertEquals("Price is required.", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Price is required.']")).getText();
		Assert.assertEquals("Price is required.", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Price is required.']")).getText();
		Assert.assertEquals("Price is required.", a2);
		Thread.sleep(1000);
	}

	@Then("Enter the cost of rupees")
	public void enter_the_cost_of_rupees() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		e.click();
		e.clear();
		e.sendKeys("149");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of dollar")
	public void enter_the_cost_of_dollar() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.click();
		e.sendKeys("3");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of euro")
	public void enter_the_cost_of_euro() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		e.click();
		e.sendKeys("5");
		Thread.sleep(1000);
	}

	@Then("Validate the without package name in pricing")
	public void validate_the_without_package_name_in_pricing() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div)[85]")).getText();
		Assert.assertEquals("Select Currency:\n" + "₹ Indian Rupee\n" + "Selected\n" + "₹\n" + "INR\n" + "Editions\n"
				+ "Packages\n" + "Individual add-ons\n" + "Reset\n" + "Next", a);
		Thread.sleep(1000);
	}

	@Then("Validate the with package name in pricing")
	public void validate_the_with_package_name_in_pricing() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div)[85]")).getText();
		Assert.assertEquals("Select Currency:\n" + "₹ Indian Rupee\n" + "Selected\n" + "₹\n" + "INR\n" + "Editions\n"
				+ "Packages\n" + "Individual add-ons\n" + "1. Bio Integration\n" + "(Duration: 3-Years)\n"
				+ "Package ID: SKIS-P-BIO-70\n" + "Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n"
				+ "₹\n" + "INR\n" + "-\n" + "per user unit cost\n" + "Reset\n" + "Next", a);
		Thread.sleep(1000);
	}

	@Then("Validate package name in pricing")
	public void validate_package_name_in_pricing() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div)[85]")).getText();
		Assert.assertEquals("Select Currency:\n" + "₹ Indian Rupee\n" + "Selected\n" + "₹\n" + "INR\n" + "Editions\n"
				+ "Packages\n" + "Individual add-ons\n" + "1. Package name\n" + "(Duration: 3-Years)\n"
				+ "Package ID: SS-P-PAC-59\n" + "Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n"
				+ "₹\n" + "INR\n" + "-\n" + "per user unit cost\n" + "Reset\n" + "Next", a);
		Thread.sleep(1000);
	}

	@Then("Validate the package name in pricing")
	public void validate_the_package_name_in_pricing() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div)[85]")).getText();
		Assert.assertEquals("Select Currency:\n" + "₹ Indian Rupee\n" + "Selected\n" + "₹\n" + "INR\n" + "Editions\n"
				+ "Packages\n" + "Individual add-ons\n" + "1. abcd\n" + "(Duration: Annually)\n"
				+ "Package ID: SHA-P-ABC-48\n" + "Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n"
				+ "₹\n" + "INR\n" + "-\n" + "per user unit cost\n" + "Reset\n" + "Next", a);
		Thread.sleep(1000);
	}

	@Then("Validate the with package name for pricing in all costs")
	public void validate_the_with_package_name_in_pricing_in_all_costs() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div)[85]")).getText();
		Assert.assertEquals("Select Currency:\n" + "All\n" + "Selected\n" + "₹\n" + "INR\n" + "$\n" + "USD\n" + "€\n"
				+ "EUR\n" + "Editions\n" + "Packages\n" + "Individual add-ons\n" + "1. Bio Integration\n"
				+ "(Duration: 3-Years)\n" + "Package ID: SKIS-P-BIO-70\n" + "Pricing Type\n" + "Flat Rate\n"
				+ "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n" + "per user unit cost\n" + "$\n" + "USD\n"
				+ "-\n" + "per user unit cost\n" + "€\n" + "EUR\n" + "-\n" + "per user unit cost\n" + "Reset\n"
				+ "Next", a);
		Thread.sleep(1000);
	}

	@Then("Validate package name for pricing in all costs")
	public void validate_package_name_in_pricing_in_all_costs() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div)[85]")).getText();
		Assert.assertEquals("Select Currency:\n" + "All\n" + "Selected\n" + "₹\n" + "INR\n" + "$\n" + "USD\n" + "€\n"
				+ "EUR\n" + "Editions\n" + "Packages\n" + "Individual add-ons\n" + "1. Package name\n"
				+ "(Duration: 3-Years)\n" + "Package ID: SS-P-PAC-59\n" + "Pricing Type\n" + "Flat Rate\n"
				+ "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n" + "per user unit cost\n" + "$\n" + "USD\n"
				+ "-\n" + "per user unit cost\n" + "€\n" + "EUR\n" + "-\n" + "per user unit cost\n" + "Reset\n"
				+ "Next", a);
		Thread.sleep(1000);
	}

	@Then("Validate the package name for pricing in all costs")
	public void validate_the_package_name_in_pricing_in_all_costs() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div)[85]")).getText();
		Assert.assertEquals("Select Currency:\n" + "All\n" + "Selected\n" + "₹\n" + "INR\n" + "$\n" + "USD\n" + "€\n"
				+ "EUR\n" + "Editions\n" + "Packages\n" + "Individual add-ons\n" + "1. abcd\n"
				+ "(Duration: Annually)\n" + "Package ID: SHA-P-ABC-48\n" + "Pricing Type\n" + "Flat Rate\n"
				+ "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n" + "per user unit cost\n" + "$\n" + "USD\n"
				+ "-\n" + "per user unit cost\n" + "€\n" + "EUR\n" + "-\n" + "per user unit cost\n" + "Reset\n"
				+ "Next", a);
		Thread.sleep(1000);
	}

	@Then("Click on variable rate radio button in pricing")
	public void click_on_variable_rate_radio_button_in_pricing() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Variable Rate']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the variable rate tabs in pricing")
	public void validate_the_variable_rate_tabs_in_pricing() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@class='px-3 pt-1'])[1]")).getText();
		Assert.assertEquals("License Bracket\n" + "-\n" + "(₹)\n" + "INR\n" + "Per User Unit Cost\n" + "₹\n" + "($)\n"
				+ "USD\n" + "Per User Unit Cost\n" + "$\n" + "(€)\n" + "EUR\n" + "Per User Unit Cost\n" + "€\n" + "+",
				a);
		Thread.sleep(1000);
	}

	@Then("Validate the variable rate tabs in pricing with rupees")
	public void validate_the_variable_rate_tabs_in_pricing_with_rupees() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@class='px-3 pt-1'])[1]")).getText();
		Assert.assertEquals("License Bracket\n" + "-\n" + "(₹)\n" + "INR\n" + "Per User Unit Cost\n" + "₹\n" + "+", a);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of pricing for variable rate")
	public void validate_the_toast_msg_of_pricing_for_variable_rate() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Required.']")).getText();
		Assert.assertEquals("Required.", a);
		Thread.sleep(1000);
	}

	@Then("Enter the user count in edition")
	public void enter_the_user_count_in_edition() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[1]"));
		e.click();
		e.sendKeys("1");
		Thread.sleep(1000);
	}

	@Then("Enter the users count in edition")
	public void enter_the_users_count_in_edition() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[1]"));
		e.click();
		e.sendKeys("1");
		WebElement e1 = driver.findElement(By.xpath("(//input[@placeholder='enter'])[2]"));
		e1.click();
		e1.sendKeys("10");
		Thread.sleep(1000);
	}

	@Then("Enter the invalid users count in edition")
	public void enter_the_invalid_users_count_in_edition() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[1]"));
		e.click();
		e.sendKeys("10");
		WebElement e1 = driver.findElement(By.xpath("(//input[@placeholder='enter'])[2]"));
		e1.click();
		e1.sendKeys("100");
		Thread.sleep(1000);
	}

	@Then("Enter the user count 0 in edition")
	public void enter_the_user_count__in_edition() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[1]"));
		e.click();
		e.sendKeys("0");
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of user 10 to 100")
	public void validate_the_toast_msg_of_user() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div)[85]")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate the user count of 0 in edition")
	public void validate_the_user_count_of_in_edition() throws InterruptedException {
		String a = driver.findElement(By.xpath("//input[@placeholder='enter']")).getText();
		Assert.assertEquals("", a);
		Thread.sleep(1000);
	}

	@Then("Validate the error msg of pricing for variable rate")
	public void validate_the_error_msg_of_pricing_for_variable_rate() throws InterruptedException {
		Thread.sleep(1000);
	}

	@Then("Enter the cost in indian rupees")
	public void enter_the_cost_in_indian_rupees() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[3]"));
		e.click();
		e.sendKeys("150");
		Thread.sleep(1000);
	}

	@Then("Enter the cost in dollar")
	public void enter_the_cost_in_dollar() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[4]"));
		e.click();
		e.sendKeys("3");
		Thread.sleep(1000);
	}

	@Then("Enter the cost in euro")
	public void enter_the_cost_in_euro() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[5]"));
		e.click();
		e.sendKeys("5");
		Thread.sleep(1000);
	}

	@Then("Click on add button in variable rate for edition")
	public void click_on_add_button_in_variable_rate_for_edition() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//div[text()='+']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the newly added users count & cost in edition")
	public void validate_the_newly_added_users_count_cost_in_edition() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center'])[4]")).getText();
		Assert.assertEquals("-\n" + "+", a);
		Thread.sleep(1000);
	}

	@Then("Click on minus button in variable rate for edition")
	public void click_on_minus_button_in_variable_rate_for_edition() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//div[text()='-']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the minus button in edition")
	public void validate_the_minus_button_in_edition() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center'])[4]")).getText();
		Assert.assertEquals("-\n" + "+", a);
		Thread.sleep(1000);
	}

	@Then("Enter the users count in edition of added line")
	public void enter_the_users_count_in_edition_of_added_line() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[3]"));
		e.click();
		e.sendKeys("10");
		WebElement e1 = driver.findElement(By.xpath("(//input[@placeholder='enter'])[4]"));
		e1.click();
		e1.sendKeys("100");
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of user count by adding same")
	public void validate_the_toast_msg_of_user_count_by_adding_same() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[text()='Invalid.']")).getText();
		Assert.assertEquals("Invalid.", a);
		Thread.sleep(1000);
	}

	@Then("Validate the pricing page after added")
	public void validate_the_pricing_page_after_added() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[@class='px-3 pt-1']")).getText();
		Assert.assertEquals(
				"₹\n" + "INR\n" + "-\n" + "per user unit cost\n" + "$\n" + "USD\n" + "-\n" + "per user unit cost", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Click on All dropdown in Pricing tab")
	public void click_on_all_dropdown_in_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//div[text()='All']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the pricing page after removed")
	public void validate_the_pricing_page_after_removed() throws InterruptedException {
		String a = driver.findElement(By.xpath("//div[@class='px-3 pt-1']")).getText();
		Assert.assertEquals(
				"₹\n" + "INR\n" + "-\n" + "per user unit cost\n" + "€\n" + "EUR\n" + "-\n" + "per user unit cost", a);
		Thread.sleep(1000);
	}

	@Then("Enter the cost of rupees in package")
	public void enter_the_cost_of_rupees_in_package() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		e.click();
		e.clear();
		e.sendKeys("19");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of dollar in package")
	public void enter_the_cost_of_dollar_in_package() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.click();
		e.sendKeys("1.5");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of euro in package")
	public void enter_the_cost_of_euro_in_package() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		e.click();
		e.sendKeys("2");
		Thread.sleep(1000);
	}

	@Then("Click on next button in package tab")
	public void click_on_next_button_in_package_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Next']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on Reset button of pricing in package tab")
	public void click_on_reset_button_of_pricing_in_package_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the pricing page in package with Reset")
	public void validate_the_pricing_page_in_package_with_reset() throws InterruptedException {
		String a = driver
				.findElement(By.xpath(
						"(//div[@class='bg-white rounded-[10px] border border-[#0000004D] shadow-sm pt-4 pb-3'])[1]"))
				.getText();
		Assert.assertEquals("Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n"
				+ "per user unit cost", a);
		Thread.sleep(1000);
	}

	@Then("Validate the pricing page in package with Reset with All costs")
	public void validate_the_pricing_page_in_package_with_reset_with_all_costs() throws InterruptedException {
		String a = driver
				.findElement(By.xpath(
						"(//div[@class='bg-white rounded-[10px] border border-[#0000004D] shadow-sm pt-4 pb-3'])[1]"))
				.getText();
		Assert.assertEquals("Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n"
				+ "per user unit cost\n" + "$\n" + "USD\n" + "-\n" + "per user unit cost\n" + "€\n" + "EUR\n" + "-\n"
				+ "per user unit cost", a);
		Thread.sleep(1000);
	}

	@Then("Validate the pricing page of individual add-ons")
	public void validate_the_pricing_page_of_individual_addons() throws InterruptedException {
		String a = driver
				.findElement(By.xpath(
						"(//div[@class='bg-white rounded-[10px] border border-[#0000004D] shadow-sm pt-4 pb-3'])[1]"))
				.getText();
		Assert.assertEquals("Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n"
				+ "per user unit cost", a);
		Thread.sleep(1000);
	}

	@Then("Validate the pricing page of individual add-ons with all costs")
	public void validate_the_pricing_page_of_individual_addons_with_all_costs() throws InterruptedException {
		String a = driver
				.findElement(By.xpath(
						"(//div[@class='bg-white rounded-[10px] border border-[#0000004D] shadow-sm pt-4 pb-3'])[1]"))
				.getText();
		Assert.assertEquals("Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n"
				+ "per user unit cost\n" + "$\n" + "USD\n" + "-\n" + "per user unit cost\n" + "€\n" + "EUR\n" + "-\n"
				+ "per user unit cost", a);
		Thread.sleep(1000);
	}

	@Then("Click on radio button of variable rate in package")
	public void click_on_radio_button_of_variable_rate_in_package() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Variable Rate']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Enter the users count of package in variable rate")
	public void enter_the_users_count_of_package_in_variable_rate() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[1]"));
		e.click();
		e.sendKeys("1");
		Thread.sleep(1000);
		WebElement e1 = driver.findElement(By.xpath("(//input[@placeholder='enter'])[2]"));
		e1.click();
		e1.sendKeys("10");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of rupees in package in variable rate")
	public void enter_the_cost_of_rupees_in_package_in_variable_rate() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[3]"));
		e.click();
		e.clear();
		e.sendKeys("19");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of dollar in package in variable rate")
	public void enter_the_cost_of_dollar_in_package_in_variable_rate() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[4]"));
		e.click();
		e.sendKeys("0.5");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of euro in package in variable rate")
	public void enter_the_cost_of_euro_in_package_in_variable_rate() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[5]"));
		e.click();
		e.sendKeys("1");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of rupees in Individual Add-ons")
	public void enter_the_cost_of_rupees_in_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		e.click();
		e.clear();
		e.sendKeys("29");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of dollar in Individual Add-ons")
	public void enter_the_cost_of_dollar_in_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.click();
		e.sendKeys("1.4");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of euro in Individual Add-ons")
	public void enter_the_cost_of_euro_in_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		e.click();
		e.sendKeys("1.9");
		Thread.sleep(1000);
	}

	@Then("Click on next button in Individual Add-ons")
	public void click_on_next_button_in_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Next']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in Individual Add-ons in pricing tab")
	public void click_on_reset_button_in_individual_addons_in_pricing_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the pricing page in Individual Add-ons with Reset")
	public void validate_the_pricing_page_in_individual_addons_with_reset() throws InterruptedException {
		String a = driver
				.findElement(By.xpath(
						"(//div[@class='bg-white rounded-[10px] border border-[#0000004D] shadow-sm pt-4 pb-3'])[1]"))
				.getText();
		Assert.assertEquals("Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n"
				+ "per user unit cost", a);
		Thread.sleep(1000);
	}

	@Then("Validate the pricing page in Individual Add-ons with Reset of All costs")
	public void validate_the_pricing_page_in_individual_addons_with_reset_of_all_costs() throws InterruptedException {
		String a = driver
				.findElement(By.xpath(
						"(//div[@class='bg-white rounded-[10px] border border-[#0000004D] shadow-sm pt-4 pb-3'])[1]"))
				.getText();
		Assert.assertEquals("Pricing Type\n" + "Flat Rate\n" + "Variable Rate\n" + "Pricing\n" + "₹\n" + "INR\n" + "-\n"
				+ "per user unit cost\n" + "$\n" + "USD\n" + "-\n" + "per user unit cost\n" + "€\n" + "EUR\n" + "-\n"
				+ "per user unit cost", a);
		Thread.sleep(1000);
	}

	@Then("Click on variable rate in Individual add-ons")
	public void click_on_variable_rate_in_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Variable Rate']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Enter the users count in Individual add-ons")
	public void enter_the_users_count_in_individual_addons() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[1]"));
		e.click();
		e.clear();
		e.sendKeys("1");
		Thread.sleep(1000);
		WebElement e1 = driver.findElement(By.xpath("(//input[@placeholder='enter'])[2]"));
		e1.click();
		e.clear();
		e1.sendKeys("10");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of rupees of add-ons in variable rate")
	public void enter_the_cost_of_rupees_of_addons_in_variable_rate() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[3]"));
		e.click();
		e.clear();
		e.sendKeys("29");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of dollar of add-ons in variable rate")
	public void enter_the_cost_of_dollar_of_addons_in_variable_rate() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[4]"));
		e.click();
		e.sendKeys("1.4");
		Thread.sleep(1000);
	}

	@Then("Enter the cost of euro of add-ons in variable rate")
	public void enter_the_cost_of_euro_of_addons_in_variable_rate() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='enter'])[5]"));
		e.click();
		e.sendKeys("1.9");
		Thread.sleep(1000);
	}

	@Then("Validate the stores page")
	public void validate_the_stores_page() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@class='ui:py-4 p-8'])[1]")).getText();
		Assert.assertEquals("SSP\n" + "Brand Title\n" + "Logo\n" + "Upload Icon\n"
				+ "PNG | File size no more than 5KB\n" + "UPLOAD\n" + "Upload Favicon\n"
				+ "ICO | File size no more than 50KB\n" + "UPLOAD\n" + "Upload Textual Logo\n"
				+ "PNG | File size no more than 5KB\n" + "UPLOAD\n" + "Reset\n" + "Submit", a);
		Thread.sleep(1000);
	}

	@Then("Click on Stores tab")
	public void click_on_stores_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Stores']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on Save button in Stores")
	public void click_on_save_button_in_stores() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Save']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on white label setup button in stores for SaaS")
	public void click_on_white_Label_Setup_button_in_stores_for_saas() throws InterruptedException {
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.xpath("(//button[text()='White Label Setup'])[1]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on white label setup button in stores for SSP")
	public void click_on_white_Label_Setup_button_in_stores_for_SSP() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//button[text()='White Label Setup'])[2]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on white label setup button in stores for Grit")
	public void click_on_white_Label_Setup_button_in_stores_for_grit() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//button[text()='White Label Setup'])[3 ]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in Stores")
	public void click_on_reset_button_in_stores() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Reset']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg for empty data in stores tab")
	public void validate_the_error_msg_for_empty_data_in_stores_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("(//div[@class='ui:py-4 p-8'])[1]")).getText();
		Assert.assertEquals("SSP\n" + "Brand Title\n" + "Required!\n" + "Logo\n" + "Upload Icon\n"
				+ "PNG | File size no more than 5KB\n" + "UPLOAD\n" + "Required!\n" + "Upload Favicon\n"
				+ "ICO | File size no more than 50KB\n" + "UPLOAD\n" + "Required!\n" + "Upload Textual Logo\n"
				+ "PNG | File size no more than 5KB\n" + "UPLOAD\n" + "Required!\n" + "Reset\n" + "Submit", a);
		Thread.sleep(1000);
	}

	@Then("Enter the Brand title in Stores tab")
	public void enter_the_brand_title_in_stores_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Troop Messenger']"));
		e.click();
		e.sendKeys("Troop");
		Thread.sleep(1000);
	}

	@Then("Enter the play store link in Stores tab")
	public void enter_the_play_store_link_in_stores_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='link'])[2]"));
		e.clear();
		e.sendKeys("https://play.google.com/store/apps/details?id=com.tvisha.troopmessenger&hl=es_419");
		Thread.sleep(1000);
	}

	@Then("Enter the app store link in Stores tab")
	public void enter_the_app_store_link_in_stores_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@placeholder='link'])[1]"));
		e.clear();
		e.sendKeys("https://apps.apple.com/in/app/troop-messenger-team-chat/id1251532330");
		Thread.sleep(1000);
	}

	@Then("Click on edit button for SaaS")
	public void click_on_edit_button_for_saas() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Edit'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Click on edit button for SSP")
	public void click_on_edit_button_for_ssp() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Edit'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Click on edit button for Grit")
	public void click_on_edit_button_for_grit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Edit'])[3]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg after entered Brand title in stores tab")
	public void validate_the_error_msg_after_entered_brand_title_in_stores_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//input[@placeholder='Troop Messenger']")).getAttribute("value");
		Assert.assertEquals("Troop", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Required!']")).getText();
		Assert.assertEquals("Required!", a1);
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg after entered Brand title with submit")
	public void validate_the_error_msg_after_entered_brand_title_with_submit() throws InterruptedException {
		String a = driver.findElement(By.xpath("//input[@placeholder='Troop Messenger']")).getAttribute("value");
		Assert.assertEquals("Troop", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Required!']")).getText();
		Assert.assertEquals("Required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//div[text()='Required!'])[2]")).getText();
		Assert.assertEquals("Required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("(//div[text()='Required!'])[3]")).getText();
		Assert.assertEquals("Required!", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Brand title in stores tab")
	public void validate_the_entered_brand_title_in_stores_tab() throws InterruptedException {
		String a = driver.findElement(By.xpath("//input[@placeholder='Troop Messenger']")).getAttribute("value");
		Assert.assertEquals("Troop", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Attach the attachment in first logo")
	public void attach_the_attachment_in_first_logo() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//button[text()='+ add']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/tvisha.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	@Then("Attach the attachment in icon")
	public void attach_the_attachment_in_icon() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//button[text()='+ add']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/tvisha_logo_1.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	@Then("Validate the toast msg after added in stores")
	public void validate_the_toast_msg_after_added_in_stores() throws InterruptedException {
		String a = driver.findElement(By.xpath("//p[text()='File(s) not allowed: favicon.ico']")).getText();
		Assert.assertEquals("File(s) not allowed: favicon.ico", a);
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of Pricing")
	public void validate_the_toast_msg_of_pricing() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Saved!", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Deactivate button")
	public void click_on_deactivate_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//div[text()='Deactivate this company']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the Deactivate popup page")
	public void validate_the_deactivate_popup_page() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[contains(@class,'ui:modal-box')])[1]")).getText();
		Assert.assertEquals(
				"Partner: Naresh IT Solutions\n" + "Do you want to deactivate this partner?\n" + "No\n" + "Deactivate",
				a1);
		Thread.sleep(1000);
	}

	@Then("Click on close button in popup page for deactivate company")
	public void click_on_close_button_in_popup_page_for_deactivate_company() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[20]"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Validate the closed popup page & company")
	public void validate_the_closed_popup_page_company() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("//div[text()='Naresh IT Solutions']")).getText();
		Assert.assertEquals("Naresh IT Solutions", a1);
		Thread.sleep(1000);
	}

	@Then("Click on No button in popup page for deactivate company")
	public void click_on_no_button_in_popup_page_for_deactivate_company() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='No']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on Yes button in popup page for deactivate company")
	public void click_on_yes_button_in_popup_page_for_deactivate_company() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='Deactivate']"));
		e.click();
		Thread.sleep(1000);
	}
}
