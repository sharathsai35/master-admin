package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PartnerExtra {
	WebDriver driver;

	@Then("user click on search and enter the valid data with enter button")
	public void user_click_on_search_and_enter_the_valid_data_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("labs");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@When("User validate the search data")
	public void user_validate_the_search_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='labs']")).getText();
		Assert.assertEquals("labs", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Deactivated partner & search data")
	public void user_validate_the_combination_of_deactivated_partner_search_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Qnu Labs']")).getText();
		Assert.assertEquals("Qnu Labs", a);
		Thread.sleep(1000);
	}

	@When("user click on search and enter company name with enter button")
	public void user_click_on_search_and_enter_company_name_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("labs");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Deactivated partner & search company name")
	public void user_validate_the_combination_of_deactivated_partner_search_company_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Qnu Labs']")).getText();
		Assert.assertEquals("Qnu Labs", a);
		Thread.sleep(1000);
	}

	@When("user click on search and enter Partner Name with enter button")
	public void user_click_on_search_and_enter_Partner_Name_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("sharath");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Deactivated partner & search Partner Name")
	public void user_validate_the_combination_of_deactivated_partner_search_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='sharath']")).getText();
		Assert.assertEquals("sharath", a);
		Thread.sleep(1000);
	}

	@When("user click on search and enter Partner Moniker with enter button")
	public void user_click_on_search_and_enter_Partner_Moniker_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("SSRP");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Deactivated partner & search Partner Moniker")
	public void user_validate_the_combination_of_deactivated_partner_search_partner_moniker()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='SSRP']")).getText();
		Assert.assertEquals("SSRP", a);
		Thread.sleep(1000);
	}

	@When("user click on search and enter Email with enter button")
	public void user_click_on_search_and_enter_Email_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("sharath@test.com");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Deactivated partner & search Email")
	public void user_validate_the_combination_of_deactivated_partner_search_email() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='sharath@test.com']")).getText();
		Assert.assertEquals("sharath@test.com", a);
		Thread.sleep(1000);
	}

	@When("user click on search and enter Mobile num with enter button")
	public void user_click_on_search_and_enter_Mobile_num_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("9347243214");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Deactivated partner & search Mobile num")
	public void user_validate_the_combination_of_deactivated_partner_search_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@When("user click on search and enter the name of Who Added with enter button")
	public void user_click_on_search_and_enter_the_name_of_Who_Added_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("sharath test");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Deactivated partner & search name of Who Added")
	public void user_validate_the_combination_of_deactivated_partner_search_name_of_who_added()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@When("user click on search and enter the Added Date with enter button")
	public void user_click_on_search_and_enter_the_Added_Date_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("30-05-2025");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Deactivated partner & search Added Date")
	public void user_validate_the_combination_of_deactivated_partner_search_added_date() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("user click on search and enter the invalid data with enter button")
	public void user_click_on_search_and_enter_the_invalid_data_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("dadsfads");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("User validate the invalid search data")
	public void user_validate_the_invalid_search_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Deactivated partner & search invalid data")
	public void user_validate_the_combination_of_deactivated_partner_search_invalid_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("validate the selected date is cleared or not & validate the deactivated partner filter")
	public void validate_the_selected_date_is_cleared_or_not_validate_the_deactivated_partner_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("validate the selected date is cleared or not & validate the deactivated partner filter button")
	public void validate_the_selected_date_is_cleared_or_not_validate_the_deactivated_partner_filter_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("validate the selected date is cleared or not & validate the deactivated partner filter & search data")
	public void validate_the_selected_date_is_cleared_or_not_validate_the_deactivated_partner_filter_search_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a2);
		Thread.sleep(1000);
	}

	@Then("validate the last 7 days with created data")
	public void validate_the_last_days_with_created_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Jun 18 - Jun 25']")).getText();
		Assert.assertEquals("Jun 18 - Jun 25", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@Then("validate the This month with created data")
	public void validate_the_This_month_with_created_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@Then("validate the Last 30 days with created data")
	public void validate_the_Last_days_with_created_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='May 26 - Jun 25']")).getText();
		Assert.assertEquals("May 26 - Jun 25", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a1);
		Thread.sleep(1000);
	}

	@Then("User click on deactivated partner dropdown")
	public void User_click_on_deactivated_partner_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).click();
		Thread.sleep(1000);
	}

	@Then("Change to Active Partner")
	public void change_to_active_partner() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Active Partners']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the Active Partner")
	public void validate_the_active_partner() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Active partner & search company name")
	public void user_validate_the_combination_of_active_partner_search_company_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Bio']")).getText();
		Assert.assertEquals("Bio", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Active partner & search Partner Name")
	public void user_validate_the_combination_of_active_partner_search_Partner_Name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='sharath']")).getText();
		Assert.assertEquals("sharath", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Active partner & search Partner Moniker")
	public void user_validate_the_combination_of_active_partner_search_Partner_Moniker() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='SVER']")).getText();
		Assert.assertEquals("SVER", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Active partner & search Email")
	public void user_validate_the_combination_of_active_partner_search_Email() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='sharath@testing.com']")).getText();
		Assert.assertEquals("sharath@testing.com", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Active partner & search Mobile num")
	public void user_validate_the_combination_of_active_partner_search_Mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Active partner & search name of Who Added")
	public void user_validate_the_combination_of_active_partner_search_name_of_Who_Added() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Active partner & search Added Date")
	public void user_validate_the_combination_of_active_partner_search_Added_Date() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of search & Active partner")
	public void user_validate_the_combination_of_search_active_partner() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='IQ labs']")).getText();
		Assert.assertEquals("IQ labs", a);
		Thread.sleep(1000);
	}

	@Then("User validate the combination of Active partner & search invalid data")
	public void user_validate_the_combination_of_active_partner_search_invalid_data() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("validate the search field of Partner & validate the Active partner filter")
	public void validate_the_search_field_of_partner_validate_the_active_partner_filter() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a1);
		Thread.sleep(1000);
	}

	@Then("validate the search field of Partner & validate the Active partner filter button")
	public void validate_the_search_field_of_partner_validate_the_active_partner_filter_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a1);
		Thread.sleep(1000);
	}

	@Then("validate the selected date is cleared or not & validate the Active partner filter")
	public void validate_the_selected_date_is_cleared_or_not_validate_the_active_partner_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("validate the selected date is cleared or not & validate the Active partner filter & search data")
	public void validate_the_selected_date_is_cleared_or_not_validate_the_active_partner_filter_search_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Email after set default")
	public void validate_the_table_for_Email_after_set_default() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Phone num after set default")
	public void validate_the_table_for_Phone_num_after_set_default() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Added Date after set default")
	public void validate_the_table_for_Added_Date_after_set_default() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Who Added after set default")
	public void validate_the_table_for_Who_Added_after_set_default() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Country after set default")
	public void validate_the_table_for_Country_after_set_default() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for City after set default")
	public void validate_the_table_for_City_after_set_default() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Email\n"
				+ "Phone Number\n" + "Added Date\n" + "Who Added", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & search input")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_search_input()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Vi\n" + "rajesh\n" + "SSPR\n" + "rajesh@test.com\n" + "+91 6386258811\n"
				+ "30-05-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & filter by date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "S Verse\n" + "Akshay\n" + "SVER\n" + "akshay@sverse.com\n" + "+91 6665554441\n"
				+ "10-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n" + "+91 8888888888\n"
				+ "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Qnu Labs\n" + "Akshay\n" + "QNU\n" + "akshay@anulabs.com\n" + "+91 9898989898\n"
				+ "23-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
	}

	@Then("Validate the table for Email & Who Added")
	public void validate_the_table_for_email_who_added() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:text-black ui:font-semibold']")).getText();
		Assert.assertEquals("S No\n" + "Partner Company\n" + "Partner Name\n" + "Partner Moniker\n" + "Phone Number\n"
				+ "Added Date", a);
		Thread.sleep(1000);
	}

	@Then("Clear the data in search")
	public void clear_the_data_in_search() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & search input & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_search_input_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & search input & Esc button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_search_input_esc_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n" + "+91 8888888888\n"
				+ "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & search input & clear data")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_search_input_clear_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n" + "+91 8888888888\n"
				+ "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & search")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Vi\n" + "rajesh\n" + "SSPR\n" + "+91 6386258811\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_Filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "S Verse\n" + "Akshay\n" + "SVER\n" + "+91 6665554441\n" + "10-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & filter by date & Reset button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_filter_by_date_reset_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n" + "+91 8888888888\n"
				+ "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & filter by date & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_filter_by_date_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_active_partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & Deactivated Partner	& clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_deactivated_partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Qnu Labs\n" + "Akshay\n" + "QNU\n" + "+91 9898989898\n" + "23-01-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & search & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_search_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "+91 9632587410\n" + "09-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & search & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_search_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Vi\n" + "rajesh\n" + "SSPR\n" + "+91 6386258811\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & search & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_search_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & Active Partner & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_active_partner_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "S Verse\n" + "Akshay\n" + "SVER\n" + "+91 6665554441\n" + "10-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & Deactivated Partner & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_deactivated_partner_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='May 27 - Jun 26']")).getText();
		Assert.assertEquals("May 27 - Jun 26", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & Active Partner & Filter by Date & search")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_active_partner_filter_by_date_sarch()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "+91 9632587410\n" + "09-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company Z to A & column filter & Deactivated Partner & Filter by Date & search")
	public void validate_the_combination_of_sort_by_options_for_partner_company_z_to_a_column_filter_deactivated_partner_filter_by_date_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='May 27 - Jun 26']")).getText();
		Assert.assertEquals("May 27 - Jun 26", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & search input")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_search_input()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "sharath1@test.com\n" + "+91 9874561230\n"
				+ "11-06-2025\n" + "Sumith", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & filter by date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "akshay@averse.com\n" + "+91 7418529637\n"
				+ "02-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "akshay@averse.com\n" + "+91 7418529637\n"
				+ "02-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "sharath@test.com\n" + "+91 9347243214\n"
				+ "30-05-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "+91 7418529637\n" + "02-06-2025", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & search input & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_search_input_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & search input & Esc button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_search_input_esc_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "akshay@averse.com\n" + "+91 7418529637\n"
				+ "02-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & search input & clear data")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_search_input_clear_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "akshay@averse.com\n" + "+91 7418529637\n"
				+ "02-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & search")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_Filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "+91 7418529637\n" + "02-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & filter by date & Reset button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_filter_by_date_reset_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "akshay@averse.com\n" + "+91 7418529637\n"
				+ "02-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & filter by date & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_filter_by_date_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_active_partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_deactivated_partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "+91 7418529637\n" + "02-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & search & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_search_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & search & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_search_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & search & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_search_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & Active Partner & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_active_partner_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "+91 7418529637\n" + "02-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & Deactivated Partner & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_deactivated_partner_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='May 27 - Jun 26']")).getText();
		Assert.assertEquals("May 27 - Jun 26", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & Active Partner & Filter by Date & search")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_active_partner_filter_by_date_sarch()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Company A to Z & column filter & Deactivated Partner & Filter by Date & search")
	public void validate_the_combination_of_sort_by_options_for_partner_company_a_to_z_column_filter_deactivated_partner_filter_by_date_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='May 27 - Jun 26']")).getText();
		Assert.assertEquals("May 27 - Jun 26", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & search input")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_search_input()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "akshay@as.com\n" + "+91 9030029712\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & filter by date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "sharath1@test.com\n" + "+91 9874561230\n"
				+ "11-06-2025\n" + "Sumith", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "akshay@as.com\n" + "+91 9030029712\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "sharath@test.com\n" + "+91 9347243214\n"
				+ "30-05-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "+91 9030029712\n" + "24-01-2025", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & search input & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_search_input_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & search input & Esc button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_search_input_esc_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "akshay@as.com\n" + "+91 9030029712\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & search input & clear data")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_search_input_clear_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "akshay@as.com\n" + "+91 9030029712\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & search")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "+91 9030029712\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_Filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & filter by date & Reset button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_filter_by_date_reset_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "akshay@as.com\n" + "+91 9030029712\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & filter by date & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_filter_by_date_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_active_partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_deactivated_partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "+91 9030029712\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & search & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_search_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & search & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_search_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "+91 9030029712\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & search & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_search_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & Active Partner & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_active_partner_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & Deactivated Partner & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_deactivated_partner_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='May 27 - Jun 26']")).getText();
		Assert.assertEquals("May 27 - Jun 26", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & Active Partner & Filter by Date & search")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_active_partner_filter_by_date_sarch()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name Z to A & column filter & Deactivated Partner & Filter by Date & search")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_z_to_a_column_filter_deactivated_partner_filter_by_date_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='May 27 - Jun 26']")).getText();
		Assert.assertEquals("May 27 - Jun 26", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & search input")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_search_input()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "akki@test.com\n" + "+91 9030025851\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & filter by date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "akki@test.com\n" + "+91 9030025851\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Qnu Labs\n" + "Akshay\n" + "QNU\n" + "akshay@anulabs.com\n" + "+91 9898989898\n"
				+ "23-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "+91 9030025851\n" + "24-01-2025", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & search input & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_search_input_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & search input & Esc button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_search_input_esc_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "akki@test.com\n" + "+91 9030025851\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & search input & clear data")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_search_input_clear_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "akki@test.com\n" + "+91 9030025851\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & search")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "+91 9030025851\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_Filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & filter by date & Reset button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_filter_by_date_reset_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "+91 9030025851\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & filter by date & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_filter_by_date_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Filter by date']")).getText();
		Assert.assertEquals("Filter by date", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_active_partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_deactivated_partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "+91 9030025851\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Qnu Labs\n" + "Akshay\n" + "QNU\n" + "+91 9898989898\n" + "23-01-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & search & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_search_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & search & Active Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_search_active_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "+91 9030025851\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & search & Deactivated Partner")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_search_deactivated_partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & Active Partner & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_active_partner_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & Deactivated Partner & Filter by Date")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_deactivated_partner_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='May 27 - Jun 26']")).getText();
		Assert.assertEquals("May 27 - Jun 26", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & Active Partner & Filter by Date & search")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_active_partner_filter_by_date_sarch()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Bio\n" + "sharath\n" + "SS\n" + "+91 9874561230\n" + "11-06-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Jun 01 - Jun 30']")).getText();
		Assert.assertEquals("Jun 01 - Jun 30", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by options for Partner Name A to Z & column filter & Deactivated Partner & Filter by Date & search")
	public void validate_the_combination_of_sort_by_options_for_partner_Name_a_to_z_column_filter_deactivated_partner_filter_by_date_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "labs\n" + "sharath\n" + "SSRP\n" + "+91 9347243214\n" + "30-05-2025", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Deactivated Partners']")).getText();
		Assert.assertEquals("Deactivated Partners", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='May 27 - Jun 26']")).getText();
		Assert.assertEquals("May 27 - Jun 26", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@value='test']")).getAttribute("value");
		Assert.assertEquals("test", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "sharath@testing.com\n" + "+91 9632587410\n"
				+ "09-06-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & last pagination & search invalid")
	public void validate_the_combination_of_sort_by_option_z_to_a_last_pagination_search_invalid()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & last pagination & search & clear the data")
	public void validate_the_combination_of_sort_by_option_z_to_a_last_pagination_search_clear_the_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n" + "+91 8888888888\n"
				+ "14-02-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & last pagination & search & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_last_pagination_search_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & Esc button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_Esc_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n" + "+91 8888888888\n"
				+ "14-02-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & filter by date with Reset")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_filter_by_date_with_reset()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n" + "+91 8888888888\n"
				+ "14-02-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & filter by date with clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_filter_by_date_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & Active Partner")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 006\n" + "Akshay\n" + "YTRE\n" + "akshay@ytre.com\n" + "+91 9030085456\n"
				+ "11-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & Active Partner with clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_Active_Partner_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n"
				+ "+91 8888888888\n" + "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & Deactivated Partner with clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_Deactivated_Partner_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & column filter")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 006\n" + "Akshay\n" + "YTRE\n" + "+91 9030085456\n" + "11-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & column filter with set default")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_column_filter_with_set_default()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 006\n" + "Akshay\n" + "YTRE\n" + "akshay@ytre.com\n" + "+91 9030085456\n"
				+ "11-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & column filter with clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_column_filter_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & column filter")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & Active Partner")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "sharath@testing.com\n" + "+91 9632587410\n"
				+ "09-06-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & Active Partner & column filter")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_Active_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "+91 9632587410\n" + "09-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & Active Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_Active_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_Active_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n"
				+ "+91 8888888888\n" + "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & Deactivated Partner & column filter")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_Deactivated_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & Deactivated Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_Deactivated_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_Deactivated_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & column filter")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "+91 9632587410\n" + "09-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "+91 9632587410\n" + "09-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & Active Partner")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_Active_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & Active Partner & column filter")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_Active_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & Active Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_Active_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_Deactivated_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & Deactivated Partner & column filter")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_Deactivated_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option Z to A & pagination & search & filter by date & Deactivated Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_z_to_a_pagination_search_filter_by_date_Deactivated_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the next page in Partner with A to Z for Partner Company")
	public void validate_the_next_page_in_partner_with_a_to_z_for_partner_company() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Partner XYZ\n" + "Akshay\n" + "XYZ\n" + "akshay@xyz.com\n" + "+91 9030029741\n"
				+ "29-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "akki@test.com\n" + "+91 9030025851\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & last pagination & search invalid")
	public void validate_the_combination_of_sort_by_option_a_to_z_last_pagination_search_invalid()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & last pagination & search & clear the data")
	public void validate_the_combination_of_sort_by_option_a_to_z_last_pagination_search_clear_the_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "akshay@averse.com\n" + "+91 7418529637\n"
				+ "02-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & last pagination & search & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_last_pagination_search_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & Esc button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_Esc_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "akshay@averse.com\n" + "+91 7418529637\n"
				+ "02-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & filter by date with Reset")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_filter_by_date_with_reset()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "A Verse\n" + "Akshay\n" + "AVER\n" + "akshay@averse.com\n" + "+91 7418529637\n"
				+ "02-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & filter by date with clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_filter_by_date_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & Active Partner")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Partner XYZ\n" + "Akshay\n" + "XYZ\n" + "akshay@xyz.com\n" + "+91 9030029741\n"
				+ "29-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & Active Partner with clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_Active_Partner_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n"
				+ "+91 8888888888\n" + "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & Deactivated Partner with clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_Deactivated_Partner_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & column filter")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Partner XYZ\n" + "Akshay\n" + "XYZ\n" + "+91 9030029741\n" + "29-01-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & column filter with set default")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_column_filter_with_set_default()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Partner XYZ\n" + "Akshay\n" + "XYZ\n" + "akshay@xyz.com\n" + "+91 9030029741\n"
				+ "29-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & column filter with clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_column_filter_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & column filter")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & Active Partner")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "akki@test.com\n" + "+91 9030025851\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & Active Partner & column filter")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_Active_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "+91 9030025851\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & Active Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_Active_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_Active_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n"
				+ "+91 8888888888\n" + "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & Deactivated Partner & column filter")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_Deactivated_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & Deactivated Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_Deactivated_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_Deactivated_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & column filter")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "+91 9030025851\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "+91 9030025851\n" + "24-01-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & Active Partner")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_Active_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & Active Partner & column filter")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_Active_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & Active Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_Active_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_Deactivated_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & Deactivated Partner & column filter")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_Deactivated_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option A to Z & pagination & search & filter by date & Deactivated Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_a_to_z_pagination_search_filter_by_date_Deactivated_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the next page in Partner with Z to A for Partner Name")
	public void validate_the_next_page_in_partner_with_z_to_a_for_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Airtel\n" + "Akshay\n" + "AIRT\n" + "akshay@airtel.com\n" + "+91 9030085125\n"
				+ "29-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 004\n" + "Akshay\n" + "REWQ\n" + "akshay@rewq.com\n" + "+91 9030014852\n"
				+ "11-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & last pagination & search invalid")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_last_pagination_search_invalid()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & last pagination & search & clear the data")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_last_pagination_search_clear_the_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "akshay@as.com\n" + "+91 9030029712\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & last pagination & search & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_last_pagination_search_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & Esc button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_Esc_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "akshay@as.com\n" + "+91 9030029712\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & filter by date with Reset")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_filter_by_date_with_reset()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test\n" + "Test\n" + "AS\n" + "akshay@as.com\n" + "+91 9030029712\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & filter by date with clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_filter_by_date_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & Active Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Airtel\n" + "Akshay\n" + "AIRT\n" + "akshay@airtel.com\n" + "+91 9030085125\n"
				+ "29-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & Active Partner with clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_Active_Partner_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n"
				+ "+91 8888888888\n" + "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & Deactivated Partner with clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_Deactivated_Partner_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Airtel\n" + "Akshay\n" + "AIRT\n" + "+91 9030085125\n" + "29-01-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & column filter with set default")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_column_filter_with_set_default()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Airtel\n" + "Akshay\n" + "AIRT\n" + "akshay@airtel.com\n" + "+91 9030085125\n"
				+ "29-01-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & column filter with clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_column_filter_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & Active Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 004\n" + "Akshay\n" + "REWQ\n" + "akshay@rewq.com\n" + "+91 9030014852\n"
				+ "11-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & Active Partner & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_Active_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 004\n" + "Akshay\n" + "REWQ\n" + "+91 9030014852\n" + "11-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & Active Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_Active_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_Active_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n"
				+ "+91 8888888888\n" + "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & Deactivated Partner & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_Deactivated_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & Deactivated Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_Deactivated_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_Deactivated_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 004\n" + "Akshay\n" + "REWQ\n" + "+91 9030014852\n" + "11-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Test 004\n" + "Akshay\n" + "REWQ\n" + "+91 9030014852\n" + "11-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & Active Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_Active_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & Active Partner & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_Active_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & Active Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_Active_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_Deactivated_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & Deactivated Partner & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_Deactivated_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name Z to A & pagination & search & filter by date & Deactivated Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_z_to_a_pagination_search_filter_by_date_Deactivated_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the next page in Partner with A to Z for Partner Name")
	public void validate_the_next_page_in_partner_with_a_to_z_for_partner_name() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Bitcoin Inc\n" + "Akshay\n" + "BITC\n" + "akshay@bitcoin.com\n"
				+ "+91 7777777744\n" + "18-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "sharath@testing.com\n" + "+91 9632587410\n"
				+ "09-06-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & last pagination & search invalid")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_last_pagination_search_invalid()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & last pagination & search & clear the data")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_last_pagination_search_clear_the_data()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "akki@test.com\n" + "+91 9030025851\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & last pagination & search & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_last_pagination_search_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & Esc button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_Esc_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "akki@test.com\n" + "+91 9030025851\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & filter by date with Reset")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_filter_by_date_with_reset()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "Test Partner\n" + "Akki\n" + "TEST\n" + "akki@test.com\n" + "+91 9030025851\n"
				+ "24-01-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & filter by date with clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_filter_by_date_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & Active Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Bitcoin Inc\n" + "Akshay\n" + "BITC\n" + "akshay@bitcoin.com\n"
				+ "+91 7777777744\n" + "18-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & Active Partner with clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_Active_Partner_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n"
				+ "+91 8888888888\n" + "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & Deactivated Partner with clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_Deactivated_Partner_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Bitcoin Inc\n" + "Akshay\n" + "BITC\n" + "+91 7777777744\n" + "18-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & column filter with set default")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_column_filter_with_set_default()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "Bitcoin Inc\n" + "Akshay\n" + "BITC\n" + "akshay@bitcoin.com\n"
				+ "+91 7777777744\n" + "18-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & column filter with clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_column_filter_with_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & Active Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "sharath@testing.com\n" + "+91 9632587410\n"
				+ "09-06-2025\n" + "Sharath test", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & Active Partner & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_Active_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "+91 9632587410\n" + "09-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & Active Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_Active_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "+91 8888888888\n" + "14-02-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_Active_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "ZTPC\n" + "Akki Mangrulkar\n" + "ZTPC\n" + "akshay@ztpc.com\n"
				+ "+91 8888888888\n" + "14-02-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & Deactivated Partner & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_Deactivated_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & Deactivated Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_Deactivated_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_Deactivated_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "+91 9632587410\n" + "09-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("11\n" + "IQ labs\n" + "sharath\n" + "SHA\n" + "+91 9632587410\n" + "09-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & Active Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_Active_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & Active Partner & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_Active_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & Active Partner & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_Active_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & Active Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_Active_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & Deactivated Partner")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_Deactivated_Partner()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & Deactivated Partner & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_Deactivated_Partner_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "akshay@kverse.com\n" + "+91 9639631234\n"
				+ "16-06-2025\n" + "Akshay Mangrulkar", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & Deactivated Partner & column filter")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_Deactivated_Partner_column_filter()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.fail(a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-primary'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-primary", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the combination of sort by option for Partner Name A to Z & pagination & search & filter by date & Deactivated Partner & column filter & clear button")
	public void validate_the_combination_of_sort_by_option_for_Partner_Name_a_to_z_pagination_search_filter_by_date_Deactivated_Partner_column_filter_clear_button()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//tr[@class='ui:hover']")).getText();
		Assert.assertEquals("1\n" + "K Verse\n" + "Akshay\n" + "KVER\n" + "+91 9639631234\n" + "16-06-2025", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("(//*[name()='svg'][@class='ui:cursor-pointer ui:text-[#999999]'])[1]"))
				.getAttribute("class");
		Assert.assertEquals("ui:cursor-pointer ui:text-[#999999]", a2);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Active Partners']")).getText();
		Assert.assertEquals("Active Partners", a1);
		Thread.sleep(1000);
	}
}
