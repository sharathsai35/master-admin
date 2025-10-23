package stepdefinition;

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

public class Setup {
	WebDriver driver;

	public Setup(WebDriver driver) {
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

	@When("user enter password")
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

	@When("user click on proceed button")
	public void user_click_on_proceed_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
	}

	@When("user Enter the MFA code")
	public void user_enter_the_mfa_code() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("123456");
		Thread.sleep(1000);
	}

	@When("user click proceed button for MFA code")
	public void user_click_proceed_button_for_mfa_code() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
	}

	@Then("user click on Setup page")
	public void user_click_on_setup_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Setup']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the Setup page")
	public void validate_the_setup_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Setup']")).getText();
		Assert.assertEquals("Setup", a);
		Thread.sleep(1000);
	}

	@Then("Click on Add internal User button")
	public void click_on_add_internal_user_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add new Internal User']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the Add internal User button")
	public void validate_the_add_internal_user_button() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Add Internal User']")).getText();
		Assert.assertEquals("Add Internal User", a);
		Thread.sleep(1000);
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg without entering any data")
	public void validate_the_error_msg_without_entering_any_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Enter name")
	public void enter_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Admin Name']")).sendKeys("Teja");
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering only name")
	public void validate_the_error_msg_with_entering_only_name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Enter invalid name")
	public void enter_invalid_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Admin Name']")).sendKeys("123");
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering invalid name")
	public void validate_the_error_msg_with_entering_invalid_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Admin Name']")).getAttribute("value");
		Assert.assertEquals("123", a);
		Assert.fail();
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Enter email")
	public void enter_email() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Admin Email Address']")).sendKeys("vamshi6@gmail.com");
		Thread.sleep(1000);
	}

	@Then("Enter another email")
	public void enter_another_email() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Admin Email Address']")).sendKeys("teja_6@gmail.com");
		Thread.sleep(1000);
	}

	@Then("Enter duplicate email")
	public void enter_duplicate_email() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Admin Email Address']")).sendKeys("teja@gmail.com");
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering only email")
	public void validate_the_error_msg_with_entering_only_email() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Enter invalid email")
	public void enter_invalid_email() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Admin Email Address']")).sendKeys("teja@gmail");
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering invalid email")
	public void validate_the_error_msg_with_entering_invalid_email() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Invalid Email address!']")).getText();
		Assert.assertEquals("Invalid Email address!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Enter duplicate mobile num")
	public void enter_duplicate_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("9586852312");
		Thread.sleep(1000);
	}

	@Then("Enter mobile num")
	public void enter_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("9586852322");
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering only mobile num")
	public void validate_the_error_msg_with_entering_only_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Enter invalid mobile num")
	public void enter_invalid_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("987456");
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with entering invalid mobile num")
	public void validate_the_error_msg_with_entering_invalid_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Invalid Mobile number!']")).getText();
		Assert.assertEquals("Invalid Mobile number!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Role is required!']")).getText();
		Assert.assertEquals("Role is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Click on Role & Select Role")
	public void click_on_role_select_role() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Master Moderator']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the error msg with selecting Role")
	public void validate_the_error_msg_with_selecting_role() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Name is required!']")).getText();
		Assert.assertEquals("Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a2);
		Thread.sleep(1000);
	}

	@Then("Click on Reset button")
	public void click_on_reset_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the entered data is cleared or not")
	public void validate_the_role_is_cleared_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Admin Name']")).getAttribute("value");
		Assert.assertEquals("Teja", a);
		Assert.fail();
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Admin Email Address']")).getAttribute("value");
		Assert.assertEquals("teja@gmail.com", a1);
		Assert.fail();
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@class='ui:grow']")).getAttribute("value");
		Assert.assertEquals("9586852312", a2);
		Assert.fail();
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Super Moderator']")).getText();
		Assert.assertEquals("Super Moderator", a3);
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg by entering all the user details")
	public void validate_the_toast_msg_by_entering_all_the_user_details() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("New user added!", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg by entering duplicate email id")
	public void validate_the_toast_msg_by_entering_duplicate_email_id() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Email address already exists", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg by entering duplicate mobile num")
	public void validate_the_toast_msg_by_entering_duplicate_mobile_num() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Mobile number already exists!", a1);
		Thread.sleep(1000);
	}

	@And("Click on Search & Enter valid username")
	public void click_on_search_enter_valid_username() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Thread.sleep(1000);
		e.sendKeys("teja");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Validate the searched username")
	public void validate_the_searched_username() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Teja\n" + "teja_2@gmail.com\n" + "+91 9586852313\n" + "17-09-2025\n" + "Srikanth\n"
				+ "Super Moderator", a1);
		Thread.sleep(1000);
	}

	@And("Click on Search & Enter invalid username")
	public void click_on_search_enter_invalid_username() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Thread.sleep(1000);
		e.sendKeys("test");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Validate the searched invalid username")
	public void validate_the_searched_invalid_username() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@Then("click on clear button")
	public void click_on_clear_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='clear']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the searched field is cleared or not")
	public void validate_the_searched_field_is_cleared_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("value");
		Assert.assertEquals("", a1);
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
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n"
				+ "Role\n" + "Action", a1);
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
		String a = driver.findElement(By.xpath("//div[text()='Sep 10 - Sep 17']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n"
				+ "Role\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@And("again click on last week dropdown")
	public void again_click_on_last_week_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sep 10 - Sep 17']")).click();
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
		String a = driver.findElement(By.xpath("//div[text()='Sep 10 - Sep 17']")).getText();
		Assert.assertEquals("Sep 10 - Sep 17", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n"
				+ "Role\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@And("again click on last 7 days dropdown")
	public void again_click_on_last_days_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sep 10 - Sep 17']")).click();
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
		String a = driver.findElement(By.xpath("//div[text()='Sep 01 - Sep 30']")).getText();
		Assert.assertEquals("Sep 01 - Sep 30", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n"
				+ "Role\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@And("again click on This month dropdown")
	public void again_click_on_This_month_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Sep 01 - Sep 30']")).click();
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
		driver.findElement(By.xpath("//div[text()='Sep 01 - Sep 30']")).click();
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
		String a = driver.findElement(By.xpath("//div[text()='Aug 18 - Sep 17']")).getText();
		Assert.assertEquals("Aug 18 - Sep 17", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n"
				+ "Role\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@Then("validate Last 30 days created data")
	public void validate_last_days_created_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Aug 18 - Sep 17']")).getText();
		Assert.assertEquals("Aug 18 - Sep 17", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
	}

	@And("again click on Last 30 days dropdown")
	public void again_click_on_Last_days_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Aug 18 - Sep 17']")).click();
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
		driver.findElement(By.xpath("//div[text()='Sep 15']")).click();
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
		String a = driver.findElement(By.xpath("//div[text()='Sep 01 - Sep 15']")).getText();
		Assert.assertEquals("Sep 01 - Sep 15", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n"
				+ "Role\n" + "Action", a1);
		Thread.sleep(1000);
	}

	@Then("validate selected dates data")
	public void validate_selected_dates_data() throws InterruptedException {
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//div[text()='Sep 01 - Sep 15']")).getText();
		Assert.assertEquals("Sep 01 - Sep 15", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@Then("click on filter by date dropdown for custom range")
	public void click_on_filter_by_date_dropdown_for_custom_range() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sep 01 - Sep 15']")).click();
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

	@When("user click on column filter icon")
	public void user_click_on_column_filter_icon() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui:relative'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("validate the column filter icon")
	public void validate_the_column_filter_icon() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@class='ui:pt-5 ui:flex ui:flex-col ui:gap-3 ui:text-sm']"))
				.getText();
		Assert.assertEquals(
				"S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n" + "Role", a);
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
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n"
				+ "Role\n" + "Action", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Name")
	public void user_click_on_eye_icon_of_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50 ')])[2]"))
				.click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Name")
	public void validate_the_eye_icon_for_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver
				.findElement(
						By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-not-allowed ui:opacity-50 ')])[2]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-not-allowed ui:opacity-50 ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Name")
	public void validate_the_table_for_Name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n"
				+ "Role\n" + "Action", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Email")
	public void user_click_on_eye_icon_of_email() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer ')])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Email")
	public void validate_the_eye_icon_for_email() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer '])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Email")
	public void validate_the_table_for_Email() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals(
				"S No\n" + "Name\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n" + "Role\n" + "Action", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Phone Num")
	public void user_click_on_eye_icon_of_phone_num() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer ')])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Phone Num")
	public void validate_the_eye_icon_for_phone_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer ')])[2]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Phone Num")
	public void validate_the_table_for_Phone_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Added Date\n" + "Who Added\n" + "Role\n" + "Action", a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Added Date")
	public void user_click_on_eye_icon_of_added_date() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer ')])[3]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Added Date")
	public void validate_the_eye_icon_for_added_date() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer ')])[3]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Added Date")
	public void validate_the_table_for_Added_Date() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Who Added\n" + "Role\n" + "Action",
				a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Who Added")
	public void user_click_on_eye_icon_of_who_added() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer ')])[4]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Who Added")
	public void validate_the_eye_icon_for_who_added() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer ')])[4]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Who Added")
	public void validate_the_table_for_Who_Added() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Role\n" + "Action",
				a);
		Thread.sleep(1000);
	}

	@Then("User click on eye icon of Role")
	public void user_click_on_eye_icon_of_role() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer ')])[5]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the eye icon for Role")
	public void validate_the_eye_icon_for_role() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'ui:cursor-pointer ')])[5]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Role")
	public void validate_the_table_for_role() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals(
				"S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n" + "Action", a);
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

	@Then("Validate the table for Phone Num after set default")
	public void validate_the_table_for_partner_moniker_after_set_default() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Name\n" + "Email\n" + "Phone Number\n" + "Added Date\n" + "Who Added\n"
				+ "Role\n" + "Action", a);
		Thread.sleep(1000);
	}

	@Then("Click on Edit button for user")
	public void click_on_edit_button_for_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Click on back button for user")
	public void click_on_back_button_for_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[16]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the edit User page")
	public void validate_the_edit_user_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//h1[text()='Edit Internal User']")).getText();
		Assert.assertEquals("Edit Internal User", a);
		Thread.sleep(1000);
	}

	@Then("Edit the name")
	public void edit_the_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Admin Name']")).sendKeys("Sai");
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of edited User")
	public void validate_the_toast_msg_of_edited_user() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Updated!", a1);
		Thread.sleep(1000);
	}

	@Then("validate the edited date is cleared or not")
	public void validate_the_edited_date_is_cleared_or_not() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Admin Name']")).getAttribute("value");
		Assert.assertEquals("TejaSaiSai", a);
		Assert.fail();
		Thread.sleep(1000);
	}

	@Then("Click on Reset Password button")
	public void click_on_reset_password_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Reset Password']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the popup msg")
	public void validate_the_popup_msg() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Do you want to reset password?']")).getText();
		Assert.assertEquals("Do you want to reset password?", a);
		Thread.sleep(1000);
	}

	@Then("Click on close button in Popup msg")
	public void click_on_close_button_in_popup_msg() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@stroke,'currentColor')])[21]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the closed popup page")
	public void validate_the_closed_popup_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@class='ui:modal-box']")).getAttribute("class");
		Assert.assertEquals("ui:modal-box", a);
		Thread.sleep(1000);
	}

	@Then("Click on No button in Popup msg")
	public void click_on_no_button_in_popup_msg() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='No']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Reset button in Popup msg")
	public void click_on_reset_button_in_popup_msg() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Reset'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg of Reset password")
	public void validate_the_toast_msg_of_reset_password() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("Password has been reset!", a1);
		Thread.sleep(1000);
	}

	@Then("Click on delete button for user")
	public void click_on_delete_button_for_user() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer'])[3]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the popup page of delete")
	public void validate_the_popup_page_of_delete() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Do you want to delete the Admin?']")).getText();
		Assert.assertEquals("Do you want to delete the Admin?", a);
		Thread.sleep(1000);
	}

	@Then("Click on close button in delete popup")
	public void click_on_close_button_in_delete_popup() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][contains(@stroke,'currentColor')])[39]")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the delete closed popup page")
	public void validate_the_delete_popup_page() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@class='ui:modal-box']")).getAttribute("class");
		Assert.assertEquals("ui:modal-box", a);
		Thread.sleep(1000);
	}

	@Then("Click on no button in delete popup")
	public void click_on_no_button_in_delete_popup() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='No']")).click();
		Thread.sleep(1000);
	}

	@Then("Click on Yes button in delete popup")
	public void click_on_yes_button_in_delete_popup() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the toast msg after deleted user")
	public void validate_the_toast_msg_after_deleted_user() throws InterruptedException {
		String a1 = driver.findElement(By.xpath("(//div[@role='status'])[1]")).getText();
		Assert.assertEquals("User Deleted!", a1);
		Thread.sleep(1000);
	}
}
