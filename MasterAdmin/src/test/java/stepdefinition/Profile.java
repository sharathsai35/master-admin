package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Profile {
	WebDriver driver;

	public Profile(WebDriver driver) {
		this.driver = driver;
	}

	@Given("user has navigate to login page")
	public void user_has_navigate_to_login_page() throws InterruptedException {
		driver = Browser.getDriver();
		driver.get("http://192.168.2.19:3000");
		Thread.sleep(2000);
	}

	@And("User click on view profile button")
	public void User_click_on_view_profile_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='View Profile']")).click();
		Thread.sleep(3000);
	}

	@And("User click on add profile button")
	public void User_click_on_add_profile_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='text-primary'])[1]")).click();
		Thread.sleep(3000);
	}

	@And("Upload the image")
	public void upload_the_image() throws Throwable {
		Thread.sleep(1000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/210 * 140.jpg");
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
		Thread.sleep(1000);
	}

	@And("Change the image")
	public void change_the_image() throws Throwable {
		Thread.sleep(1000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/210 * 140.jpg");
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
		Thread.sleep(1000);
	}

	@And("Delete Profile")
	public void Delete_Profile() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
	}

	@Then("User observed profile page")
	public void User_observed_profile_page() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Profile']")).isDisplayed());
		Thread.sleep(3000);
	}

	@Then("User clicked on change button")
	public void User_clicked_on_change_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Change'])[1]")).click();
		Thread.sleep(3000);
	}

	@Then("User clicked on delete button")
	public void User_clicked_on_delete_button() throws Throwable {
		System.out.println("Click on delete to get the image delete");
		Thread.sleep(3000);
	}

	@Then("User clicked on Setup Authenticator App")
	public void User_clicked_on_Setup_Authenticator_App() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Setup Authenticator App']")).click();
		Thread.sleep(3000);
	}

	@Then("User should get displayed with Authenticator App Setup")
	public void User_should_get_displayed_with_Authenticator_App_Setup() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Authenticator App Setup']")).isDisplayed());
		Thread.sleep(3000);
	}

	@Then("User clicked on back button")
	public void User_clicked_on_back_button_in_password() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[16]")).click();
		Thread.sleep(3000);
	}

	@Then("User clicked on back button in profile page")
	public void User_clicked_on_back_button_in_profile_page() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[16]")).click();
		Thread.sleep(3000);
	}

	@Then("User should get displayed with profile page")
	public void User_should_get_displayed_with_profile_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Profile']")).isDisplayed());
		Thread.sleep(3000);
	}

	@Then("User clicked on change password")
	public void User_clicked_on_change_password() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Change Password']")).click();
		Thread.sleep(3000);
	}

	@Then("User should display with change password page")
	public void User_should_display_with_change_password_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Change Password']")).isDisplayed());
		Thread.sleep(3000);
	}

	@And("User started entering current password")
	public void User_started_entering_current_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ui:grow'])[1]")).sendKeys("Tvisha@12");
		Thread.sleep(1000);
	}

	@Then("User started entering new password")
	public void User_started_entering_new_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ui:grow'])[2]")).sendKeys("Tvisha@12");
		Thread.sleep(1000);
	}

	@Then("User started entering confirm password")
	public void User_started_entering_confirm_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ui:grow'])[3]")).sendKeys("Tvisha@12");
		Thread.sleep(1000);
	}

	@Then("User clicked on submit")
	public void User_clicked_on_submit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}

	@And("User clicked on Reset button")
	public void User_clicked_on_Reset_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(1000);
	}
}
