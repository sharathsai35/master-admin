package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class Feature {
	WebDriver driver;

	@Given("User has navigate to login page")
	public void user_has_navigate_to_login_page() throws InterruptedException {
		driver=Browser.getDriver();
		driver.get("http://192.168.2.19:3000");
		Thread.sleep(2000);
	}
	
	@When("User enters valid mobile num")
	public void user_enters_valid_mobile_num() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow font-medium']")).sendKeys("9347243214");
		Thread.sleep(1000);
	}
	
	@And("User enter password")
	public void user_enter_password() throws InterruptedException {
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
	}
	
	@And("User click on proceed button")
	public void user_click_on_proceed_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
	}
	
	@And("User Enter the MFA code")
	public void user_Enter_the_MFA_code() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui:grow']")).sendKeys("123456");
		Thread.sleep(1000);
	}
	
	@And("User click proceed button for MFA code")
	public void user_click_proceed_button_for_MFA_code() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
	}
	
	@And("User click on Features page")
	public void user_click_on_Features_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Features']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Validate the Features page")
	public void validate_the_Features_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//h1[text()='Features']")).getText();
		Assert.assertEquals("Features", a);
		Thread.sleep(1000);
	}
	
	@And("User click on search and enter the Feature name with enter button")
	public void user_click_on_search_and_enter_the_feature_name_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("split");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	@Then("User validate the Feature name")
	public void User_validate_the_feature_name() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[text()='Split License']")).getText();
		Assert.assertEquals("Split License", a);
		Thread.sleep(1000);
	}
	
	@And("User click on search and enter the invalid data with enter button")
	public void user_click_on_search_and_enter_the_invalid_data_with_enter_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys("dfs");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	@Then("User validate the invalid searched data")
	public void user_validate_the_invalid_searched_data() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='No Records Found']")).getText();
		Assert.assertEquals("No Records Found", a);
		Thread.sleep(1000);
	}
	
	@Then("validate the search field of Features")
	public void validate_the_search_field_of_features() throws InterruptedException {
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
		Assert.assertEquals("Search", a);
		Thread.sleep(1000);
	}
	
	@And("Click on Esc button")
	public void click_on_esc_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
	}
	
	@And("Click on backspace for entered data")
	public void click_on_backspace_for_entered_data() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.click();
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		e.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
	}
	
	@And("Click on clear button")
	public void click_on_clear_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//button[text()='clear']"));
		e.click();
		Thread.sleep(1000);
	}

	@And("user click on filter by Platform")
	public void user_click_on_filter_by_platform() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//div[text()='Platform']"));
		e.click();
		Thread.sleep(1000);
	}
	
	@Then("validate the filter by Platform")
	public void validate_the_filter_by_platform() throws InterruptedException {
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("(//div[@class='ui-absolute ui-top-[34px] ui-z-[9999] ui-border ui-border-[#E0DCDC] ui-shadow-md ui-rounded-lg ui-w-[250px] ui-px-5 ui-py-6 ui-bg-white'])[1]")).getText();
		Assert.assertEquals("All\n"
				+ "Android\n"
				+ "iOS\n"
				+ "Desktop\n"
				+ "Web\n"
				+ "Reset\n"
				+ "Apply", a);
		Thread.sleep(1000);
	}
	
	@And("Click on All in platform dropdown")
	public void click_on_all_in_platform_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//div[text()='All']"));
		e.click();
		Thread.sleep(1000);
	}

	@And("Click on Apply button for platform")
	public void click_on_apply_button_for_platform() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//div[text()='Platform']"));
		e.click();
		Thread.sleep(1000);
	}
}
