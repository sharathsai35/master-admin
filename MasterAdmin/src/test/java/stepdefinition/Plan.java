package stepdefinition;

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

public class Plan {
	WebDriver driver;

	public Plan(WebDriver driver) {
		this.driver = driver;
	}

	@Given("user has navigate to login")
	public void user_has_navigate_to_login_page() throws InterruptedException {
		driver = Browser.getDriver();
		driver.get("http://192.168.2.19:3000");
		Thread.sleep(2000);
	}

	@When("user enter valid mobile number")
	public void user_enters_valid_mobile_number() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow font-medium']")).sendKeys("9347243214");
		Thread.sleep(1000);
	}

	@And("user enter the password")
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

	@And("user click on the proceed button")
	public void user_click_on_proceed_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
	}

	@And("user enter the MFA code")
	public void user_Enter_the_MFA_code() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("123456");
		Thread.sleep(1000);
	}

	@And("user click on proceed button for MFA code")
	public void user_click_proceed_button_for_MFA_code() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
	}

	@When("Click on Plans tab")
	public void click_on_plans_tab() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Plans']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Plans tab")
	public void validate_the_plans_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Plans']")).getText();
		Assert.assertEquals(a, "Plans");
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter edition name")
	public void click_on_search_enter_edition_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("iphone");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Validate the searched edition name")
	public void validate_the_searched_edition_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='E']")).getText();
		Assert.assertEquals(a1, "E");
		String a = driver.findElement(By.xpath("//div[text()='Iphone Premium Grit']")).getText();
		Assert.assertEquals(a, "Iphone Premium Grit");
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter package name")
	public void click_on_search_enter_package_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("iphone");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Validate the searched package")
	public void validate_the_searched_package() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='P']")).getText();
		Assert.assertEquals(a1, "P");
		String a = driver.findElement(By.xpath("//div[text()='IPhone Integration Enterprise']")).getText();
		Assert.assertEquals(a, "IPhone Integration Enterprise");
		Thread.sleep(1000);
	}

	@Then("Click on search & Enter invalid data")
	public void click_on_search_enter_invalid_data() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("ios");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Validate the searched invalid data")
	public void validate_the_searched_invalid_data() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals(a1, "No Records Found");
		Thread.sleep(1000);
	}

	@Then("Click on esc button in keyboard")
	public void click_on_esc_button_in_keyboard() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
	}

	@Then("Validate the search in Plans tab")
	public void validate_the_search_in_plans_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("value");
		Assert.assertEquals(a1, "");
		Thread.sleep(1000);
	}

	@Then("Click on clear button in Plans")
	public void click_on_clear_button_in_plans() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//button[text()='clear']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Click on backspace in keyboard & click on enter button")
	public void click_on_backspace_in_keyboard_click_on_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Click on backspace in keyboard & without clicking on enter button")
	public void click_on_backspace_in_keyboard_without_clicking_on_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
	}

	@Then("Validate the search & list in Plans tab")
	public void validate_the_search_list_in_plans_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("value");
		Assert.assertEquals(a1, "");
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals(a, "No Records Found");
		Thread.sleep(1000);
	}

	@Then("Click on Reference name")
	public void click_on_Reference_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Reference Name']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Reference name dropdown")
	public void validate_the_reference_name_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Find an item']")).getText();
		Assert.assertEquals(a, "");
		Thread.sleep(1000);
	}

	@Then("Click on search in reference name & Enter name")
	public void click_on_search_in_reference_name_enter_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Find an item']"));
		e.click();
		e.sendKeys("bio");
		Thread.sleep(1000);
	}

	@Then("Validate the entered reference name")
	public void validate_the_entered_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Bio']")).getText();
		Assert.assertEquals(a, "Bio");
		Thread.sleep(1000);
	}

	@Then("Click on search in reference name & Enter invalid name")
	public void click_on_search_in_reference_name_enter_invalid_name() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Find an item']"));
		e.click();
		e.sendKeys("fasdf");
		Thread.sleep(1000);
	}

	@Then("Validate the entered invalid reference name")
	public void validate_the_entered_invalid_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Match Found!']")).getText();
		Assert.assertEquals(a1, "No Match Found!");
		Thread.sleep(1000);
	}

	@Then("Click on apply button in reference name")
	public void click_on_apply_button_in_Reference_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the search in reference name")
	public void validate_the_search_in_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Find an item']")).getAttribute("value");
		Assert.assertEquals(a1, "bio");
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Remove the entered data with backspace")
	public void remove_the_entered_data_with_backspace() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Find an item']"));
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
	}

	@Then("Validate the search in reference name after remove the entered data")
	public void validate_the_search_in_reference_name_after_remove_the_entered_data() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Find an item']")).getAttribute("value");
		Assert.assertEquals(a1, "");
		Thread.sleep(1000);
	}

	@Then("Select the Reference name")
	public void select_the_Reference_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Bio']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected reference name in list")
	public void validate_the_selected_reference_name_in_list() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals(a1, "1\n" + "E\n" + "Bio Enterprise\n" + "Bio\n" + "SS-E-BIO-65\n" + "3-Years\n" + "Bio");
		Thread.sleep(1000);
	}

	@Then("Validate the selected reference name")
	public void validate_the_selected_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Bio']")).getText();
		Assert.assertEquals(a1, "Bio");
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Click on All checkbox in reference name")
	public void click_on_all_checkbox_in_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected All checkbox in reference name")
	public void validate_the_selected_all_checkbox_in_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='All']")).getText();
		Assert.assertEquals(a1, "All");
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in reference name")
	public void click_on_reset_button_in_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the filter by reference name")
	public void validate_the_filter_by_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Reference Name']")).getText();
		Assert.assertEquals(a1, "Reference Name");
		Thread.sleep(1000);
	}

	@Then("Validate the filter by reference name with All checkbox")
	public void validate_the_filter_by_reference_name_with_all_checkbox() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Reference Name']")).getText();
		Assert.assertEquals(a1, "Reference Name");
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Deselect All checkbox in reference name")
	public void deselect_all_checkbox_in_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the deselected all checkbox")
	public void validate_the_deselected_all_checkbox() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='All']")).getText();
		Assert.assertEquals(a1, "All");
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Again click on Reference name")
	public void again_click_on_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div)[79]")).click();
		Thread.sleep(1000);
	}

	@And("user click on filter by Date dropdown in plans")
	public void user_click_on_filter_by_date_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Filter by date']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the filter by date in plans")
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

	@And("user click on today and click on done button in plans")
	public void user_click_on_today_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Today']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the today created data in plans")
	public void validate_the_today_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Today']")).getText();
		Assert.assertEquals("Today", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@And("again click on Today dropdown in plans")
	public void again_click_on_Today_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Today']")).click();
		Thread.sleep(1000);
	}

	@Then("And user click on today in dropdown list in plans")
	public void and_user_click_on_today_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Today']")).click();
		Thread.sleep(1000);
	}

	@Then("validate to select the another dates in plans")
	public void validate_to_select_the_another_dates() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//button[@class='rdrDay rdrDayDisabled']"));
		e.click();
		String a = e.getAttribute("class");
		Assert.assertEquals("rdrDay rdrDayDisabled", a);
		Thread.sleep(1000);
	}

	@Then("validate to select the another date in plans")
	public void validate_to_select_the_another_date() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//button[@class='rdrDay rdrDayWeekend rdrDayEndOfWeek']"));
		e.click();
		String a = e.getAttribute("class");
		Assert.assertEquals("rdrDay rdrDayWeekend rdrDayEndOfWeek rdrDayHovered", a);
		Thread.sleep(1000);
	}

	@Then("user validate the active tab in plans")
	public void user_validate_the_active_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//div[text()='Custom range']"));
		String a = e.getText();
		Assert.assertEquals("Custom range", a);
		Thread.sleep(1000);
	}

	@And("user click on Reset button in plans")
	public void user_click_on_reset_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("click on clear button in plans")
	public void click_on_clear_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='clear']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the selected date is cleared or not in plans")
	public void validate_the_selected_date_is_cleared_or_not() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a);
		Thread.sleep(1000);
	}

	@And("user click on yesterday and click on done button in plans")
	public void user_click_on_yesterday_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Yesterday']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the yesterday created data in plans")
	public void validate_the_yesterday_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Yesterday']")).getText();
		Assert.assertEquals("Yesterday", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@And("again click on yesterday dropdown in plans")
	public void again_click_on_yesterday_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Yesterday']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on yesterday in dropdown list in plans")
	public void user_click_on_yesterday_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Yesterday']")).click();
		Thread.sleep(1000);
	}

	@And("user click on last week and click on done button in plans")
	public void user_click_on_last_week_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last week']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the last week created data in plans")
	public void validate_the_last_week_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Aug 22 - Aug 29']")).getText();
		Assert.assertEquals("Aug 22 - Aug 29", a);
		Assert.fail();
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@And("again click on last week dropdown in plans")
	public void again_click_on_last_week_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Aug 22 - Aug 29']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on last week in dropdown list in plans")
	public void user_click_on_last_week_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last week']")).click();
		Thread.sleep(1000);
	}

	@And("user click on last 7 days and click on done button in plans")
	public void user_click_on_last_days_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last 7 days']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the last 7 days created data in plans")
	public void validate_the_last_days_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Aug 22 - Aug 29']")).getText();
		Assert.assertEquals("Aug 22 - Aug 29", a);
		Assert.fail();
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Reference Name\n" + "Edition/Package ID\n"
				+ "Duration/tenure\n" + "Assigned To\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@And("again click on last 7 days dropdown in plans")
	public void again_click_on_last_days_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Aug 22 - Aug 29']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on last 7 days in dropdown list in plans")
	public void user_click_on_last_days_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last 7 days']")).click();
		Thread.sleep(1000);
	}

	@And("user click on This month and click on done button in plans")
	public void user_click_on_This_month_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='This month']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the This month created data in plans")
	public void validate_the_This_month_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Aug 01 - Aug 31']")).getText();
		Assert.assertEquals("Aug 01 - Aug 31", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Reference Name\n" + "Edition/Package ID\n"
				+ "Duration/tenure\n" + "Assigned To\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@And("again click on This month dropdown in plans")
	public void again_click_on_This_month_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Aug 01 - Aug 31']")).click();
		Thread.sleep(1000);
	}

	@And("Reset the filter by date in plans")
	public void reset_the_filter_by_date() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on This month in dropdown list in plans")
	public void user_click_on_this_month_in_dropdown_list() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Aug 01 - Aug 31']")).click();
		Thread.sleep(1000);
	}

	@And("user click on This month in plans")
	public void user_click_on_This_month() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='This month']")).click();
		Thread.sleep(1000);
	}

	@And("user click on Last 30 days and click on done button in plans")
	public void user_click_on_Last_days_and_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last 30 days']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the Last 30 days created data in plans")
	public void validate_the_Last_days_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Jul 30 - Aug 29']")).getText();
		Assert.assertEquals("Jul 30 - Aug 29", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Reference Name\n" + "Edition/Package ID\n"
				+ "Duration/tenure\n" + "Assigned To\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@And("again click on Last 30 days dropdown in plans")
	public void again_click_on_Last_days_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jul 30 - Aug 29']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on Last 30 days in dropdown list in plans")
	public void user_click_on_Last_days_in_dropdown_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Last 30 days']")).click();
		Thread.sleep(1000);
	}

	@And("user click on custom range and select the single date in plans")
	public void user_click_on_custom_range_and_select_the_single_date() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Custom range']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='15']")).click();
		Thread.sleep(1000);
	}

	@And("user click on done button in plans")
	public void user_click_on_done_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the selected date data in plans")
	public void validate_the_selected_date_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@And("click on filter by date dropdown in plans")
	public void click_on_filter_by_date_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Aug 15']")).click();
		Thread.sleep(1000);
	}

	@And("user click on custom range and select the date range in plans")
	public void user_click_on_custom_range_and_select_the_date_range() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Custom range']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='15']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the selected dates data in plans")
	public void validate_the_selected_dates_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Aug 01 - Aug 15']")).getText();
		Assert.assertEquals("Aug 01 - Aug 15", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Reference Name\n" + "Edition/Package ID\n"
				+ "Duration/tenure\n" + "Assigned To\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@Then("validate selected dates data in plans")
	public void validate_selected_dates_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Aug 01 - Aug 15']")).getText();
		Assert.assertEquals("Aug 01 - Aug 15", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@Then("click on filter by date dropdown for custom range in plans")
	public void click_on_filter_by_date_dropdown_for_custom_range() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Aug 01 - Aug 15']")).click();
		Thread.sleep(1000);
	}

	@And("user click on custom range and select the date range from last to starting position in plans")
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

	@Then("user click on column filter")
	public void user_click_on_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui:relative'])[3]")).click();
		Thread.sleep(1000);
	}

	@Then("validate the column filter")
	public void validate_the_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Reference Name\n" + "Edition/Package ID\n"
				+ "Duration/tenure\n" + "Assigned To\n" + "Action", a);
		Thread.sleep(1000);
	}

	@Then("user click on column filter of s.no")
	public void user_click_on_column_filter_of_sno() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50 ')])[1]"))
				.click();
		Thread.sleep(1000);
	}

	@Then("Validate the S.no in column filter")
	public void validate_the_sno_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver
				.findElement(
						By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50 ')])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-not-allowed ui:opacity-50 ", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='S No']")).getText();
		Assert.assertEquals("S No", a1);
		Thread.sleep(1000);
	}

	@Then("user click on column filter of Edition or Package")
	public void user_click_on_column_filter_of_Edition_Package() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui:flex ui:justify-between ui:items-center'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Edition or Package in column filter")
	public void validate_the_Edition_Package_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver
				.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50')])[2]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-not-allowed ui:opacity-50 ", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Edition/Package']")).getText();
		Assert.assertEquals("Edition/Package", a1);
		Thread.sleep(1000);
	}

	@Then("user click on column filter of Reference Name")
	public void user_click_on_column_filter_of_Reference_Name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Reference Name in column filter")
	public void validate_the_Reference_name_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Reference Name']")).getText();
		Assert.assertEquals("Reference Name", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Edition/Package ID\n" + "Duration/tenure\n"
				+ "Assigned To\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@Then("user click on column filter of Edition or Package ID")
	public void user_click_on_column_filter_of_Edition_Package_ID() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Edition or Package ID in column filter")
	public void validate_the_Edition_Package_ID_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Edition/Package ID']")).getText();
		Assert.assertEquals("Edition/Package ID", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals(
				"S No\n" + "Edition/Package\n" + "Reference Name\n" + "Duration/tenure\n" + "Assigned To\n" + "Action",
				a1);
		Thread.sleep(1000);
	}

	@Then("user click on column filter of Duration or tenure")
	public void user_click_on_column_filter_of_Duration_tenure() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[3]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Duration or tenure in column filter")
	public void validate_the_Duration_tenure_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Duration/tenure']")).getText();
		Assert.assertEquals("Duration/tenure", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Reference Name\n" + "Edition/Package ID\n"
				+ "Assigned To\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@Then("user click on column filter of Assigned To")
	public void user_click_on_column_filter_of_Assigned_To() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[4]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Assigned To in column filter")
	public void validate_the_Assigned_To_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Assigned To']")).getText();
		Assert.assertEquals("Assigned To", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Reference Name\n" + "Edition/Package ID\n"
				+ "Duration/tenure\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@Then("user click on column filter of Model")
	public void user_click_on_column_filter_of_Model() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer')])[5]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Model in column filter")
	public void validate_the_Model_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Model']")).getText();
		Assert.assertEquals("Model", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Reference Name\n" + "Edition/Package ID\n"
				+ "Duration/tenure\n" + "Assigned To\n" + "Model\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@Then("user click on column filter of set default")
	public void user_click_on_column_filter_of_set_default() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='set defaults'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the set default in column filter")
	public void validate_the_set_default_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("(//button[normalize-space()='set defaults'])[1]")).getText();
		Assert.assertEquals("set defaults", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Edition/Package\n" + "Reference Name\n" + "Edition/Package ID\n"
				+ "Duration/tenure\n" + "Assigned To\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@Then("user click on column filter search & Enter valid data")
	public void user_click_on_column_filter_search_enter_valid_data() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Find an item']"));
		e.click();
		e.sendKeys("assigned");
		Thread.sleep(1000);
	}

	@Then("Validate the searched valid data in column filter")
	public void validate_the_searched_valid_data_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[@class='ui:pt-5 ui:flex ui:flex-col ui:gap-3 ui:text-sm']"))
				.getText();
		Assert.assertEquals("Assigned To", a);
		Thread.sleep(1000);
	}

	@Then("user click on column filter search & Enter invalid data")
	public void user_click_on_column_filter_search_enter_invalid_data() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Find an item']"));
		e.click();
		e.sendKeys("dasf");
		Thread.sleep(1000);
	}

	@Then("Validate the searched invalid data for column filter")
	public void validate_the_searched_invalid_data_for_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[@class='ui:pt-5 ui:flex ui:flex-col ui:gap-3 ui:text-sm']"))
				.getText();
		Assert.assertEquals("No Match Found!", a);
		Thread.sleep(1000);
	}

	@Then("again click on column filter")
	public void again_click_on_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flex items-center gap-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ui:relative'])[3]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the search in column filter")
	public void validate_the_search_in_column_filter() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Find an item']")).getAttribute("value");
		Assert.assertEquals("dasf", a);
		Thread.sleep(1000);
	}

	@Then("user click sort by option Z to A in Edition or Package")
	public void user_click_sort_by_option_z_to_a_in_edition_or_package() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the sorted option Z to A for Edition or Package")
	public void validate_the_sorted_option_z_to_a_for_edition_or_package() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> companies = driver.findElements(By.xpath("//table//tr/td[2]"));
		String[] companyArray = companies.stream().map(WebElement::getText).toArray(String[]::new);
		for (String plan : companyArray) {
			System.out.println(plan);
		}
		String[] expectedArray = { "Edition/Package", "E\n" + "ZTPC Superior", "P\n" + "ZTPC NGO",
				"P\n" + "ZTPC Defense", "E\n" + "VI Enterprises", "E\n" + "VI-Premium", "E\n" + "TVerse Enterprise",
				"E\n" + "Troop M Enterprise", "E\n" + "Troop M Enterprise", "E\n" + "TM Superior SaaS",
				"E\n" + "TM Premium SaaS" };

		Assert.assertArrayEquals(expectedArray, companyArray);
		Thread.sleep(1000);
	}

	@Then("user click sort by option A to Z in Edition or Package")
	public void user_click_sort_by_option_a_to_z_in_edition_or_package() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the sorted option A to Z for Edition or Package")
	public void validate_the_sorted_option_a_to_z_for_edition_or_package() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> plans = driver.findElements(By.xpath("//table//tr/td[2]"));
		String[] planArray = plans.stream().map(WebElement::getText).toArray(String[]::new);
		for (String plan : planArray) {
			System.out.println(plan);
		}
		String[] expectedArray = { "Edition/Package", "E\n" + "2", "P\n" + "A-Verse-Defence",
				"E\n" + "A-Verse-Enterprise", "P\n" + "A-Verse-Integration", "E\n" + "A-Verse-Premium", "P\n" + "abcd",
				"E\n" + "Airtel Enterprise", "E\n" + "Android", "E\n" + "Bio Enterprise", "P\n" + "Bio Enterprise" };
		Assert.assertArrayEquals(expectedArray, planArray);
		Thread.sleep(1000);

	}

	@Then("Validate the Plan page")
	public void validate_the_plans_page() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> plans = driver.findElements(By.xpath("//table//tr/td[2]"));
		String[] planArray = plans.stream().map(WebElement::getText).toArray(String[]::new);
		for (String plan : planArray) {
			System.out.println(plan);
		}
		String[] expectedArray = { "Edition/Package", "E\n" + "Myntra Enterprise", "E\n" + "TVerse Enterprise",
				"P\n" + "Bio Integration Premium", "P\n" + "Bio Enterprise", "P\n" + "IPhone Integration Enterprise",
				"P\n" + "Iphone Intergration Premium", "E\n" + "Iphone Premium Grit", "E\n" + "Android",
				"P\n" + "I_Phone", "E\n" + "I_phone" };
		Assert.assertArrayEquals(expectedArray, planArray);
		Thread.sleep(1000);

	}

	@Then("user click sort by option Z to A in Reference Name")
	public void user_click_sort_by_option_z_to_a_in_reference_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the sorted option Z to A for Reference Name")
	public void validate_the_sorted_option_z_to_a_for_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> plans = driver.findElements(By.xpath("//table//tr/td[3]"));
		String[] planArray = plans.stream().map(WebElement::getText).toArray(String[]::new);
		for (String plan : planArray) {
			System.out.println(plan);
		}
		String[] expectedArray = { "Reference Name", "ztpc-superior", "ztpc-ngo", "ztpc-defense", "VI", "tverse-enter",
				"TROOP-M-ENT", "TMSS", "TMPS", "tmngo", "tmlite" };
		Assert.assertArrayEquals(expectedArray, planArray);
		Thread.sleep(1000);

	}

	@Then("user click sort by option A to Z in Reference Name")
	public void user_click_sort_by_option_a_to_z_in_reference_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the sorted option A to Z for Reference Name")
	public void validate_the_sorted_option_a_to_z_for_reference_name() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> plans = driver.findElements(By.xpath("//table//tr/td[3]"));
		String[] planArray = plans.stream().map(WebElement::getText).toArray(String[]::new);
		for (String plan : planArray) {
			System.out.println(plan);
		}
		String[] expectedArray = { "Reference Name", "001", "2", "a-verse-def", "a-verse-ent", "a-verse-inte",
				"a-verse-premium", "abc", "abcd", "airtelE", "Bio" };
		Assert.assertArrayEquals(expectedArray, planArray);
		Thread.sleep(1000);

	}

	@When("Click on next button in Plans page")
	public void click_on_next_button_in_plans_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the next page in Plans")
	public void validate_the_next_page_in_plans() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> plans = driver.findElements(By.xpath("//table//tr/td[1]"));
		String[] planArray = plans.stream().map(WebElement::getText).toArray(String[]::new);
		String[] expectedArray = { "S No", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		Assert.assertArrayEquals(expectedArray, planArray);
		Thread.sleep(1000);
		for (String plan : planArray) {
			System.out.println(plan);
		}
	}

	@Then("Validate the previous button is disabled or not")
	public void validate_the_previous_button_is_disabled_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//button[normalize-space()='Previous'])[1]")).getAttribute("disabled");
		Assert.assertEquals("true", a);
		Thread.sleep(1000);
	}

	@When("Click on previous button")
	public void click_on_previous_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Previous'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the previous page in Plans")
	public void validate_the_previous_page_in_plans() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> plans = driver.findElements(By.xpath("//table//tr/td[1]"));
		String[] planArray = plans.stream().map(WebElement::getText).toArray(String[]::new);
		String[] expectedArray = { "S No", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		Assert.assertArrayEquals(expectedArray, planArray);
		Thread.sleep(1000);
		for (String plan : planArray) {
			System.out.println(plan);
		}
	}

	@When("Click on 3rd num in pagination in Plans")
	public void click_on_3rd_num_in_pagination_in_Plans() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='button'][normalize-space()='3'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the 3rd page in Plans")
	public void validate_the_3rd_page_in_plans() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> plans = driver.findElements(By.xpath("//table//tr/td[1]"));
		String[] planArray = plans.stream().map(WebElement::getText).toArray(String[]::new);
		String[] expectedArray = { "S No", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
		Assert.assertArrayEquals(expectedArray, planArray);
		Thread.sleep(1000);
		for (String plan : planArray) {
			System.out.println(plan);
		}
	}

	@When("Click on 1st num in pagination in Plans")
	public void click_on_1st_num_in_pagination_in_Plans() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='button'][normalize-space()='1'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the 1st page in Plans")
	public void validate_the_1st_page_in_plans() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> plans = driver.findElements(By.xpath("//table//tr/td[1]"));
		String[] planArray = plans.stream().map(WebElement::getText).toArray(String[]::new);
		String[] expectedArray = { "S No", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		Assert.assertArrayEquals(expectedArray, planArray);
		Thread.sleep(1000);
		for (String plan : planArray) {
			System.out.println(plan);
		}
	}

	@When("Click on last page in pagination in Plans")
	public void click_on_last_page_in_pagination_in_plans() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@role,'button')][normalize-space()='9'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the next button is clickable or not in Plans")
	public void validate_the_next_button_is_clickable_or_not_in_plans() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//button[text()='Next']")).getAttribute("disabled");
		Assert.assertEquals("true", a);
		Thread.sleep(1000);
	}

	@Then("Clear the data in column filter")
	public void clear_the_data_in_column_filter() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Find an item']"));
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
	}

	@Then("Click on Add New Plan button")
	public void click_on_add_new_plan_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add New Plan']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the Add New Plan page")
	public void validate_the_add_new_plan_page() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Add New Plan", a);
		Thread.sleep(1000);
	}

	@Then("Click on next button in add new plan page")
	public void click_on_next_button_in_add_new_plan_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg in edition radio button")
	public void validate_the_error_msg_in_edition_radio_button() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Edition Name is required!']")).getText();
		Assert.assertEquals("Edition Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Reference Name is required!']")).getText();
		Assert.assertEquals("Reference Name is required!", a1);
		Thread.sleep(1000);
	}

	@Then("Enter the edition Name in new plan")
	public void enter_the_edition_name_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		e.click();
		e.sendKeys("Myntra Sup");
		Thread.sleep(1000);
	}

	@Then("Enter duplicate edition Name in new plan")
	public void enter_duplicate_edition_name_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		e.click();
		e.sendKeys("Myntra Enterprise");
		Thread.sleep(1000);
	}

	@Then("Enter the edition Name with 1 character in new plan")
	public void enter_the_edition_name_with_character_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		e.click();
		e.sendKeys("M");
		Thread.sleep(1000);
	}

	@Then("Enter the edition Name with more than 30 characters in new plan")
	public void enter_the_edition_name_with_more_than_characters_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		e.click();
		e.sendKeys("Myntra Enterprise Myntra Enterprise Myntra Enterprise Myntra Enterprise");
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg in new plan")
	public void validate_the_toast_msg_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		String a1 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Add New Plan", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering edition name")
	public void validate_the_error_msg_with_entering_edition_name() throws InterruptedException {
		Thread.sleep(2000);
		String a1 = driver.findElement(By.xpath("//div[text()='Reference Name is required!']")).getText();
		Assert.assertEquals("Reference Name is required!", a1);
		Thread.sleep(1000);
	}

	@Then("Enter the Reference Name in new plan")
	public void enter_the_reference_name_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.click();
		e.sendKeys("myntra_sup");
		Thread.sleep(1000);
	}

	@Then("Enter duplicate Reference Name in new plan")
	public void enter_duplicate_reference_name_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.click();
		e.sendKeys("myntra_enterprise");
		Thread.sleep(1000);
	}

	@Then("Enter the Reference Name with 1 character in new plan")
	public void enter_the_reference_name_with_character_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.click();
		e.sendKeys("m");
		Thread.sleep(1000);
	}

	@Then("Enter the Reference Name with more than 50 characters in new plan")
	public void enter_the_reference_name_with_more_than_characters_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.click();
		e.sendKeys("myntra_enterprise_myntra_enterprise_myntra_enterprise_myntra_enterprise");
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering Reference name")
	public void validate_the_error_msg_with_entering_Reference_name() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Edition Name is required!']")).getText();
		Assert.assertEquals("Edition Name is required!", a);
		Thread.sleep(1000);
	}

	@Then("Select the radio button in Duration or Tenure")
	public void select_the_radiobutton_in_duration_tenure() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Annually']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Select the radio button in Model")
	public void select_the_radiobutton_in_model() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='GRIT']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Enter Notes in new plan")
	public void enter_notes_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:resize-none ui:focus:textarea-primary ui:focus:border-none w-full h-[120px]']"));
		e.click();
		e.sendKeys("testing");
		Thread.sleep(1000);
	}

	@Then("Enter Notes with more than 500 characters in new plan")
	public void enter_notes_with_more_than_characters_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:resize-none ui:focus:textarea-primary ui:focus:border-none w-full h-[120px]']"));
		e.click();
		e.sendKeys(
				"Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan Enter Notes with more than 500 characters in new plan");
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in add new plan page")
	public void click_on_reset_button_in_add_new_plan_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Reset page in new plan")
	public void validate_the_reset_page_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		Assert.assertEquals("", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//input[@type='text'])[2]")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:resize-none ui:focus:textarea-primary ui:focus:border-none w-full h-[120px]']"))
				.getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the next page in new plan")
	public void validate_the_next_page_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Add New Plan", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[@class='ui:bg-[#F2FAFF] ui:px-5']")).getText();
		Assert.assertEquals("Features\n" + "Add-On Features\n" + "Add-On Modules", a1);
		Thread.sleep(1000);
	}

	@Then("Click on next button in plan features page")
	public void click_on_next_button_in_plan_features_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg without selecting any plan feature")
	public void validate_the_error_msg_without_selecting_any_plan_feature() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='At least 5 Features are required!']")).getText();
		Assert.assertEquals("At least 5 Features are required!", a);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in plan features page")
	public void click_on_reset_button_in_plan_features_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Select the checkbox in features tab")
	public void select_the_checkbox_in_features_tab() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected checkboxes in plan feature")
	public void validate_the_selected_checkboxes_in_plan_feature() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[@class='flex gap-1 items-center mb-5']")).getText();
		Assert.assertEquals("Features\n" + "[20]", a);
		Thread.sleep(1000);
	}

	@Then("Validate the selected checkboxes in plan feature after Reset")
	public void validate_the_selected_checkboxes_in_plan_feature_after_Reset() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[@class='flex gap-1 items-center mb-5']")).getText();
		Assert.assertEquals("Features\n" + "[0]", a);
		Thread.sleep(1000);
	}

	@Then("Select all checkbox in features tab")
	public void select_all_checkbox_in_features_tab() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[5]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[6]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[7]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[8]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[11]")).click();
		Thread.sleep(1000);
	}

	@Then("Select all checkbox in Add-on features tab")
	public void select_all_checkbox_in_add_on_features_tab() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add-On Features']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Select all checkbox in Add-on modules tab")
	public void select_all_checkbox_in_add_on_modules_tab() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add-On Modules']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[5]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected checkboxes of all tabs in plan feature")
	public void validate_the_selected_checkboxes_of_all_tabs_in_plan_feature() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[1]")).getText();
		Assert.assertEquals("Features\n" + "[110]", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[2]")).getText();
		Assert.assertEquals("Add-On Features\n" + "[5]", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[3]")).getText();
		Assert.assertEquals("Add-On Modules\n" + "[12]", a2);
		Thread.sleep(1000);
	}

	@Then("Click on close button to remove the selected features one by one")
	public void click_on_close_button_to_remove_the_selected_features_one_by_one() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[29]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the count of the features after removing")
	public void validate_the_count_of_the_features_after_removing() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[1]")).getText();
		Assert.assertEquals("Features\n" + "[19]", a);
		Thread.sleep(1000);
	}

	@Then("Click on search & enter valid data")
	public void click_on_search_enter_valid_data() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("admin");
		Thread.sleep(1000);
	}

	@Then("Validate the entered search in plan features")
	public void validate_the_entered_search_in_plan_features() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[@class='ui:border-b ui:border-gray-200']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
	}

	@Then("Validate the feature controls page")
	public void validate_the_feature_controls_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Features Controls']")).getText();
		Assert.assertEquals("Features Controls", a);
		Thread.sleep(1000);
	}

	@Then("Deselect the all checkboxes in feature control")
	public void deselect_the_all_checkboxes_in_feature_control() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Logo Branding']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on next button in feature controls")
	public void click_on_next_button_in_feature_controls() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in feature controls")
	public void click_on_reset_button_in_feature_controls() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg in the feature controls")
	public void validate_the_error_msg_in_the_feature_controls() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Platforms']")).getText();
		Assert.assertEquals("Platforms", a);
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Validate the platform page in Plans")
	public void validate_the_platform_page_in_plans() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Platforms']")).getText();
		Assert.assertEquals("Platforms", a);
		Thread.sleep(1000);
	}

	@Then("Click on Submit button in Platform")
	public void click_on_Submit_button_in_platform() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg in Platform page")
	public void validate_the_error_msg_in_platform_page() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='At least one platform is required!']")).getText();
		Assert.assertEquals("At least one platform is required!", a);
		Thread.sleep(1000);
	}

	@Then("Select the platforms in plans")
	public void select_the_platforms_in_plans() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='iOS']")).click();
		driver.findElement(By.xpath("//div[text()='Android']")).click();
		driver.findElement(By.xpath("//div[text()='Desktop']")).click();
		driver.findElement(By.xpath("//div[text()='Web']")).click();
		Thread.sleep(500);
	}

	@Then("Click on reset button in Platform")
	public void click_on_reset_button_in_platform() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of added New Plan")
	public void validate_the_toast_msg_of_added_new_plan() throws InterruptedException {
		// (//div[@role='status'])[1]
		Thread.sleep(500);
		String a = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Plan updated!", a);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of added duplicate Plan")
	public void validate_the_toast_msg_of_added_duplicate_plan() throws InterruptedException {
		// (//div[@role='status'])[1]
		Thread.sleep(500);
		String a = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Duplicate Reference Name", a);
		Thread.sleep(1000);
	}

	@Then("Click on radio button of package")
	public void click_on_radio_button_of_package() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Package']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg in package radio button")
	public void validate_the_error_msg_in_package_radio_button() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Package Name is required!']")).getText();
		Assert.assertEquals("Package Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Reference Name is required!']")).getText();
		Assert.assertEquals("Reference Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Edition is required!']")).getText();
		Assert.assertEquals("Edition is required!", a2);
		Thread.sleep(1000);
	}

	@Then("Enter the package Name in new plan")
	public void enter_the_package_name_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		e.click();
		e.sendKeys("Myntra Product");
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering package name")
	public void validate_the_error_msg_with_entering_package_name() throws InterruptedException {
		Thread.sleep(2000);
		String a1 = driver.findElement(By.xpath("//div[text()='Reference Name is required!']")).getText();
		Assert.assertEquals("Reference Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Edition is required!']")).getText();
		Assert.assertEquals("Edition is required!", a2);
		Thread.sleep(1000);
	}

	@Then("Enter the Reference Name in new plan in package radiobutton")
	public void enter_the_reference_name_in_new_plan_in_package_radiobutton() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.click();
		e.sendKeys("myntra_pro");
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering Reference name in package radio button")
	public void validate_the_error_msg_with_entering_Reference_name_in_package_radiobutton()
			throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Package Name is required!']")).getText();
		Assert.assertEquals("Package Name is required!", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Edition is required!']")).getText();
		Assert.assertEquals("Edition is required!", a2);
		Thread.sleep(1000);
	}

	@Then("Select the edition in new plan")
	public void select_the_edition_in_new_plan() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//div[text()='Select']"));
		e.click();
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e1.sendKeys("myntra");
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with selecting edition")
	public void validate_the_error_msg_with_selecting_edition() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Package Name is required!']")).getText();
		Assert.assertEquals("Package Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Reference Name is required!']")).getText();
		Assert.assertEquals("Reference Name is required!", a1);
		Thread.sleep(1000);
	}

	@Then("Click on edit icon for selected Plan")
	public void click_on_edit_icon_for_selected_plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Myntra Sup']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on edit icon for Package Plan")
	public void click_on_edit_icon_for_package_plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Myntra Product']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected edit Plan")
	public void validate_the_selected_edit_plan() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[@class='flex gap-2 text-xs']")).getText();
		Assert.assertEquals("Home\n" + "/\n" + "Plans\n" + "/\n" + "Edit", a2);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Sup)", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[@class='flex items-baseline gap-1 text-sm px-4']")).getText();
		Assert.assertEquals("Plan Info\n" + "Logs", a1);
		Thread.sleep(1000);
	}

	@Then("Click on radiobutton of package in edit plan")
	public void click_on_radiobutton_of_package_in_edit_plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//span[@class='ui:label-text ui:text-sm ui:text-[#333333] ui:cursor-not-allowed']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the clickable package or not in edited plan")
	public void validate_the_clickable_package_or_not_in_edited_plan() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a1 = driver
				.findElement(
						By.xpath("//span[@class='ui:label-text ui:text-sm ui:text-[#333333] ui:cursor-not-allowed']"))
				.getAttribute("class");
		Assert.assertEquals("ui:label-text ui:text-sm ui:text-[#333333] ui:cursor-not-allowed", a1);
		Thread.sleep(1000);
	}

	@Then("Click on edition name and edit")
	public void click_on_edition_name_and_edit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Myntra Enterprise']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the clickable edition name or not")
	public void validate_the_clickable_edition_name_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='Myntra Enterprise']")).getAttribute("disabled");
		Assert.assertEquals("true", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Reference name and edit")
	public void click_on_reference_name_and_edit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='myntra_enterprise']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the clickable Reference name or not")
	public void validate_the_clickable_reference_name_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='myntra_enterprise']")).getAttribute("disabled");
		Assert.assertEquals("true", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Plan ID and edit")
	public void click_on_plan_id_and_edit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='E-MYN-99']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the clickable Plan ID or not")
	public void validate_the_clickable_plan_id_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='E-MYN-99']")).getAttribute("disabled");
		Assert.assertEquals("true", a1);
		Thread.sleep(1000);
	}

	@Then("Select the Duration or Tenure and edit")
	public void select_the_duration_or_tenure_and_edit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='3-Years']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the clickable Duration or Tenure or not")
	public void validate_the_clickable_duration_or_tenure_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//span[text()='3-Years']")).getText();
		Assert.assertEquals("3-Years", a1);
		Thread.sleep(1000);
	}

	@Then("Select the Model and edit")
	public void select_the_model_and_edit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='SaaS']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the clickable Model or not")
	public void validate_the_clickable_model_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//span[text()='SaaS']")).getText();
		Assert.assertEquals("SaaS", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Assign to and edit")
	public void click_on_assign_to_and_edit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the clickable Assign to or not")
	public void validate_the_clickable_assign_to_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[@role='combobox']")).getAttribute("aria-disabled");
		Assert.assertEquals("true", a1);
		Thread.sleep(1000);
	}

	@Then("Click on Notes and edit")
	public void click_on_notes_and_edit() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:resize-none ui:focus:textarea-primary ui:focus:border-none w-full h-[120px]']"));
		e.click();
		e.sendKeys("test");
		Thread.sleep(1000);
	}

	@Then("Validate the editable Notes or not")
	public void validate_the_editable_notes_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:resize-none ui:focus:textarea-primary ui:focus:border-none w-full h-[120px]']"))
				.getText();
		Assert.assertEquals("testingtest", a1);
		Thread.sleep(1000);
	}

	@Then("Click on next button in edit Plan")
	public void click_on_next_button_in_edit_plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the edited plan in plan feature")
	public void validate_the_edited_plan_in_plan_feature() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[@class='ui:bg-[#F2FAFF] ui:px-5']")).getText();
		Assert.assertEquals("Features\n" + "Add-On Features\n" + "Add-On Modules", a4);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in edit Plan")
	public void click_on_reset_button_in_edit_plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the data in the edit Plan")
	public void validate_the_data_in_the_edit_plan() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Plan Details']")).getText();
		Assert.assertEquals("Plan Details", a1);
		Thread.sleep(1000);
	}

	@Then("Edit the features in the Plan")
	public void edit_the_features_in_the_plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='header-checkbox'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the count of edited Plan feature")
	public void validate_the_count_of_edited_plan_feature() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[@class='ui:bg-[#F2FAFF] ui:px-5']")).getText();
		Assert.assertEquals("Features\n" + "Add-On Features\n" + "Add-On Modules", a4);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[1]")).getText();
		Assert.assertEquals("Features\n" + "[90]", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[2]")).getText();
		Assert.assertEquals("Add-On Features\n" + "[5]", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[3]")).getText();
		Assert.assertEquals("Add-On Modules\n" + "[12]", a2);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in Plan feature")
	public void click_on_reset_button_in_plan_feature() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the count of edited Plan feature with Reset")
	public void validate_the_count_of_edited_plan_feature_with_reset() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[@class='ui:bg-[#F2FAFF] ui:px-5']")).getText();
		Assert.assertEquals("Features\n" + "Add-On Features\n" + "Add-On Modules", a4);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[1]")).getText();
		Assert.assertEquals("Features\n" + "[110]", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[2]")).getText();
		Assert.assertEquals("Add-On Features\n" + "[5]", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[3]")).getText();
		Assert.assertEquals("Add-On Modules\n" + "[12]", a2);
		Thread.sleep(1000);
	}

	@Then("Click on next button in Plan feature")
	public void click_on_next_button_in_plan_feature() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the edited feature controls")
	public void validate_the_edited_feature_controls() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Features Controls']")).getText();
		Assert.assertEquals("Features Controls", a4);
		Thread.sleep(1000);
	}

	@Then("Edit the controls in the Plans")
	public void edit_the_controls_in_the_plans() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='feature-controls-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='feature-controls-checkbox'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in edited feature controls")
	public void click_on_reset_button_in_edited_feature_controls() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the feature controls tab")
	public void validate_the_feature_controls_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Features Controls']")).getText();
		Assert.assertEquals("Features Controls", a4);
		Thread.sleep(1000);
	}

	@Then("Click on next button in edited feature controls")
	public void click_on_next_button_in_edited_feature_controls() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Platform page of edited controls")
	public void validate_the_platform_page_of_edited_controls() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Platforms']")).getText();
		Assert.assertEquals("Platforms", a4);
		Thread.sleep(1000);
	}

	@Then("Edit the Platform in Plans")
	public void edit_the_platform_in_plans() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='platform-checkbox'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in edited Platform")
	public void click_on_reset_button_in_edited_platform() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the edited Platform")
	public void validate_the_edited_platform() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Edit Plan (Myntra Enterprise)", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Platforms']")).getText();
		Assert.assertEquals("Platforms", a4);
		Thread.sleep(1000);
	}

	@Then("Click on Submit button in edited Platform")
	public void click_on_Submit_button_in_edited_platform() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of edited Plan")
	public void validate_the_toast_msg_of_edited_plan() throws InterruptedException {
		// (//div[@role='status'])[1]
		Thread.sleep(500);
		String a = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Plan added!", a);
		Thread.sleep(1000);
	}

	@Then("Click on edit icon in plan details")
	public void click_on_edit_icon_in_plan_details() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Edit Plan']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the MFA code of Plan details")
	public void validate_the_MFA_code_of_plan_details() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Enter MFA Code']")).getText();
		Assert.assertEquals("Enter MFA Code", a);
		Thread.sleep(1000);
	}

	@Then("Enter the MFA code of edit plan details & submit the details")
	public void enter_the_mfa_code_of_edit_plan_details_submit_the_details() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[3]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[4]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[5]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[6]")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	@Then("Validate the plan details which is edited or not")
	public void validate_the_plan_details_which_is_edited_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@value='Myntra Enterprise']")).getAttribute("value");
		Assert.assertEquals("Myntra Enterprise", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='myntra_enterprise']")).getAttribute("value");
		Assert.assertEquals("myntra_enterprise", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='E-MYN-99']")).getAttribute("disabled");
		Assert.assertEquals("true", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[@role='combobox']")).getAttribute("aria-disabled");
		Assert.assertEquals("true", a3);
		Thread.sleep(1000);
	}

	@Then("Enter the MFA code of edit plan details with 4 digits & submit the details")
	public void enter_the_mfa_code_of_edit_plan_details_with_digits_submit_the_details() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[3]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[4]")).sendKeys("1");
		Thread.sleep(1000);
	}

	@Then("Validate the submit button in MFA code of plan details")
	public void validate_the_submit_button_in_MFA_code_of_plan_details() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//button[text()='Submit']")).getAttribute("disabled");
		Assert.assertEquals("true", a);
		Thread.sleep(1000);
	}

	@Then("Enter the MFA code of edit plan details & enter button in keypad")
	public void enter_the_mfa_code_of_edit_plan_details_enter_button_in_keypad() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[3]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[4]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[5]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[6]")).sendKeys("1");
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[6]"));
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Validate the MFA code with enter button")
	public void validate_the_MFA_code_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@value='Myntra Enterprise']")).getAttribute("value");
		Assert.assertEquals("Myntra Enterprise", a);
		Assert.fail();
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='myntra_enterprise']")).getAttribute("value");
		Assert.assertEquals("myntra_enterprise", a1);
		Assert.fail();
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='E-MYN-99']")).getAttribute("disabled");
		Assert.assertEquals("true", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[@role='combobox']")).getAttribute("aria-disabled");
		Assert.assertEquals("true", a3);
		Thread.sleep(1000);
	}

	@Then("Enter the MFA code of edit plan details")
	public void enter_the_mfa_code_of_edit_plan_details() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[3]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[4]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[5]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[6]")).sendKeys("1");
		Thread.sleep(1000);
	}

	@Then("Click on esc button in MFA code")
	public void click_on_esc_button_in_mfa_code() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@class='ui:focus:outline-primary'])[6]"));
		e.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
	}

	@Then("Validate the plan details which is edited or not without entering MFA code")
	public void validate_the_plan_details_which_is_edited_or_not_without_entering_mfa_code()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@value='Myntra Enterprise']")).getAttribute("value");
		Assert.assertEquals("Myntra Enterprise", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='myntra_enterprise']")).getAttribute("value");
		Assert.assertEquals("myntra_enterprise", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='E-MYN-99']")).getAttribute("disabled");
		Assert.assertEquals("true", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[@role='combobox']")).getAttribute("aria-disabled");
		Assert.assertEquals("true", a3);
		Thread.sleep(1000);
	}

	@Then("Click on Logs tab")
	public void click_on_logs_tab() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Logs']")).click();
		Thread.sleep(2000);
	}

	@Then("Validate the Logs page in Plan details")
	public void validate_the_logs_page_in_plan_details() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Logs']")).getText();
		Assert.assertEquals("Logs", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//div[@class='flex flex-col gap-0'])[1]")).getText();
		Assert.assertEquals("Created by:\n" + "Sharath\n" + "|\n" + "18/08/2025 at 07:00pm", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//div[@class='text-[#606B85] text-[13px]'])[2]")).getText();
		Assert.assertEquals("Edited by:", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("(//div[@class='flex items-center gap-2'])[4]")).getText();
		Assert.assertEquals("Sharath\n" + "|\n" + "20/08/2025 at 06:58pm", a3);
		Thread.sleep(1000);
	}

	@Then("Click on Filter by date in logs tab")
	public void click_on_filter_by_date_in_logs_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Date']")).click();
		Thread.sleep(1000);
	}

	@Then("Select This month date & Click on done")
	public void select_this_month_date_click_on_done() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='This month']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Clear button in logs tab")
	public void click_on_clear_button_in_logs_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Clear Filters']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Filter by date in Logs tab")
	public void validate_the_filter_by_date_in_logs_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Date']")).getText();
		Assert.assertEquals("Date", a);
		Thread.sleep(1000);
	}

	@Then("Click on Filter by User in logs tab")
	public void click_on_filter_by_user_in_logs_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='User']")).click();
		Thread.sleep(1000);
	}

	@Then("Select User & Click on Apply")
	public void select_user_click_on_apply() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Sharath'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(1000);
	}

	@Then("Select All User & Click on Apply")
	public void select_all_user_click_on_apply() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='All']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Filter by User in Logs tab")
	public void validate_the_filter_by_user_in_logs_tab() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='User']")).getText();
		Assert.assertEquals("User", a);
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Select date & Click on done")
	public void select_date_click_on_done() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='17']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the filter by date with empty data in Plan details")
	public void validate_the_filter_by_date_with_empty_data_in_plan_details() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("Select User1 & Click on Apply")
	public void select_user1_click_on_apply() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Rajesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the filter by User with empty data in Plan details")
	public void validate_the_filter_by_user_with_empty_data_in_plan_details() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("Click on Clone button for Plan")
	public void click_on_clone_button_for_plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer'])[6]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Clone Plan")
	public void validate_the_clone_plan() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Clone Plan", a3);
		Thread.sleep(1000);
	}

	@Then("Enter the Edition name in clone")
	public void enter_the_edition_name_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		e.click();
		e.sendKeys("Clone Superior");
		Thread.sleep(1000);
	}

	@Then("Enter the Reference name in clone")
	public void enter_the_reference_name_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.click();
		e.sendKeys("clone_sup");
		Thread.sleep(1000);
	}

	@Then("Select the radiobutton in Duration or Tenure in clone")
	public void select_the_radiobutton_in_duration_or_tenure_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Annually']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Select the radiobutton in Model in clone")
	public void select_the_radiobutton_in_model_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[text()='GRIT']"));
		e.click();
		Thread.sleep(1000);
	}

	@Then("Enter the notes in clone")
	public void enter_the_notes_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:resize-none ui:focus:textarea-primary ui:focus:border-none w-full h-[120px]']"));
		e.click();
		e.sendKeys("testing");
		Thread.sleep(1000);
	}

	@Then("Validate the notes in clone")
	public void validate_the_notes_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath(
				"//textarea[@class='ui:textarea ui:resize-none ui:focus:textarea-primary ui:focus:border-none w-full h-[120px]']"))
				.getText();
		Assert.assertEquals("testingtest", a);
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Click on next button of Plan details in clone")
	public void click_on_next_button_of_plan_details_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected count of Plan feature in clone")
	public void validate_the_selected_count_of_plan_feature_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Clone Plan", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[@class='ui:bg-[#F2FAFF] ui:px-5']")).getText();
		Assert.assertEquals("Features\n" + "Add-On Features\n" + "Add-On Modules", a4);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[1]")).getText();
		Assert.assertEquals("Features\n" + "[110]", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[2]")).getText();
		Assert.assertEquals("Add-On Features\n" + "[5]", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//div[@class='flex gap-1 items-center mb-5'])[3]")).getText();
		Assert.assertEquals("Add-On Modules\n" + "[12]", a2);
		Thread.sleep(1000);
	}

	@Then("Click on next button of Plan feature in clone")
	public void click_on_next_button_of_plan_feature_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected of Feature controls in clone")
	public void validate_the_selected_of_feature_controls_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Clone Plan", a3);
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Features Controls']")).getText();
		Assert.assertEquals("Features Controls", a);
		Thread.sleep(1000);
	}

	@Then("Click on next button of Feature controls in clone")
	public void click_on_next_button_of_feature_controls_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the selected Platform in clone")
	public void validate_the_selected_platform_in_clone() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//h1[@class='font-semibold text-lg']")).getText();
		Assert.assertEquals("Clone Plan", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Platforms']")).getText();
		Assert.assertEquals("Platforms", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of added Clone Plan")
	public void validate_the_toast_msg_of_added_clone_plan() throws InterruptedException {
		// (//div[@role='status'])[1]
		Thread.sleep(500);
		String a = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Plan added!", a);
		Thread.sleep(1000);
	}

	@Then("Click on delete button for Plan")
	public void click_on_delete_button_for_plan() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the popup msg for delete")
	public void validate_the_popup_msg_for_delete() throws InterruptedException {
		Thread.sleep(500);
		String a = driver.findElement(By.xpath("//div[text()='Do you want to delete the plan?']")).getText();
		Assert.assertEquals("Do you want to delete the plan?", a);
		Thread.sleep(1000);
	}

	@Then("Select No button in popup msg")
	public void select_no_button_in_popup_msg() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='No']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the plan is deleted or not")
	public void validate_the_plan_is_deleted_or_not() throws InterruptedException {
		Thread.sleep(500);
		Thread.sleep(1000);
	}

	@Then("Select Yes button in popup msg")
	public void select_yes_button_in_popup_msg() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of deleted plan")
	public void validate_the_toast_msg_of_deleted_plan() throws InterruptedException {
		Thread.sleep(500);
		String a = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Deleted!", a);
		Thread.sleep(1000);
	}
}
