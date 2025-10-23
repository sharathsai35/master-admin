package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class AddPartner {
	WebDriver driver;

	@Then("Validate the save button by entering Partner Name & Contact Name")
	public void validate_the_save_button_by_entering_partner_name_contact_name() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & Contact Name")
	public void validate_the_entered_Partner_Name_Contact_Name() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & Partner Moniker")
	public void validate_the_save_button_by_entering_partner_name_Partner_Moniker() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & Partner Moniker")
	public void validate_the_entered_Partner_Name_Partner_Moniker() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & Mobile Num")
	public void validate_the_save_button_by_entering_partner_name_mobile_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & Mobile Num")
	public void validate_the_entered_Partner_Name_Mobile_Num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & Email ID")
	public void validate_the_save_button_by_entering_partner_name_Email_ID() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & Email ID")
	public void validate_the_entered_Partner_Name_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & Address")
	public void validate_the_save_button_by_entering_partner_name_Address() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & Address")
	public void validate_the_entered_Partner_Name_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & Country")
	public void validate_the_save_button_by_entering_partner_name_Country() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & Country")
	public void validate_the_entered_Partner_Name_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & City")
	public void validate_the_save_button_by_entering_partner_name_City() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & City")
	public void validate_the_entered_Partner_Name_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & Bank details")
	public void validate_the_save_button_by_entering_partner_name_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & Bank details")
	public void validate_the_entered_Partner_Name_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & PAN num")
	public void validate_the_save_button_by_entering_partner_name_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & PAN num")
	public void validate_the_entered_Partner_Name_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & VAT num")
	public void validate_the_save_button_by_entering_partner_name_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & VAT num")
	public void validate_the_entered_Partner_Name_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name & GST num")
	public void validate_the_save_button_by_entering_partner_name_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name & GST num")
	public void validate_the_entered_Partner_Name_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & Partner Moniker")
	public void validate_the_save_button_by_entering_Contact_name_Partner_Moniker() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & Partner Moniker")
	public void validate_the_entered_Contact_Name_Partner_Moniker() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & Mobile Num")
	public void validate_the_save_button_by_entering_Contact_name_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & Mobile Num")
	public void validate_the_entered_Contact_Name_Mobile_Num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & Email ID")
	public void validate_the_save_button_by_entering_Contact_name_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & Email ID")
	public void validate_the_entered_Contact_Name_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & Address")
	public void validate_the_save_button_by_entering_Contact_name_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & Address")
	public void validate_the_entered_Contact_Name_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & Country")
	public void validate_the_save_button_by_entering_Contact_name_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & Country")
	public void validate_the_entered_Contact_Name_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & City")
	public void validate_the_save_button_by_entering_Contact_name_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & City")
	public void validate_the_entered_Contact_Name_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & Bank details")
	public void validate_the_save_button_by_entering_Contact_name_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & Bank details")
	public void validate_the_entered_Contact_Name_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & PAN num")
	public void validate_the_save_button_by_entering_Contact_name_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & PAN num")
	public void validate_the_entered_Contact_Name_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & VAT num")
	public void validate_the_save_button_by_entering_Contact_name_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & VAT num")
	public void validate_the_entered_Contact_Name_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name & GST num")
	public void validate_the_save_button_by_entering_Contact_name_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a1);
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

	@Then("Validate the entered Contact Name & GST num")
	public void validate_the_entered_Contact_Name_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker & Mobile Num")
	public void validate_the_save_button_by_entering_Partner_Moniker_mobile_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Moniker & Mobile Num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker & Email ID")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker & Email ID")
	public void validate_the_entered_Partner_Moniker_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker & Address")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker & Address")
	public void validate_the_entered_Partner_Moniker_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker & Country")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker & Country")
	public void validate_the_entered_Partner_Moniker_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Moniker & City")
	public void validate_the_entered_Partner_Moniker_City() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker & Bank details")
	public void validate_the_entered_Partner_Moniker_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker & PAN num")
	public void validate_the_entered_Partner_Moniker_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker & VAT num")
	public void validate_the_entered_Partner_Moniker_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker & GST num")
	public void validate_the_entered_Partner_Moniker_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num & Email ID")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num & Email ID")
	public void validate_the_entered_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num & Address")
	public void validate_the_save_button_by_entering_Mobile_Num_Address() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num & Address")
	public void validate_the_entered_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num & Country")
	public void validate_the_save_button_by_entering_Mobile_Num_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num & Country")
	public void validate_the_entered_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num & City")
	public void validate_the_save_button_by_entering_Mobile_Num_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Mobile Num & City")
	public void validate_the_entered_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num & Bank details")
	public void validate_the_save_button_by_entering_Mobile_Num_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num & Bank details")
	public void validate_the_entered_Mobile_Num_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num & PAN num")
	public void validate_the_entered_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num & VAT num")
	public void validate_the_entered_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num & GST num")
	public void validate_the_entered_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID & Address")
	public void validate_the_save_button_by_entering_Email_ID_Address() throws InterruptedException {
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

	@Then("Validate the entered Email ID & Address")
	public void validate_the_entered_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID & Country")
	public void validate_the_save_button_by_entering_Email_ID_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Email ID & Country")
	public void validate_the_entered_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID & City")
	public void validate_the_save_button_by_entering_Email_ID_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Email ID & City")
	public void validate_the_entered_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID & Bank details")
	public void validate_the_save_button_by_entering_Email_ID_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Email ID & Bank details")
	public void validate_the_entered_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID & PAN num")
	public void validate_the_entered_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID & VAT num")
	public void validate_the_entered_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID & GST num")
	public void validate_the_save_button_by_entering_Email_ID_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID & GST num")
	public void validate_the_entered_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address & Country")
	public void validate_the_save_button_by_entering_Address_Country() throws InterruptedException {
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

	@Then("Validate the entered Address & Country")
	public void validate_the_entered_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address & City")
	public void validate_the_save_button_by_entering_Address_City() throws InterruptedException {
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

	@Then("Validate the entered Address & City")
	public void validate_the_entered_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address & Bank details")
	public void validate_the_save_button_by_entering_Address_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Address & Bank details")
	public void validate_the_entered_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address & PAN num")
	public void validate_the_save_button_by_entering_Address_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Address & PAN num")
	public void validate_the_entered_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address & VAT num")
	public void validate_the_save_button_by_entering_Address_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Address & VAT num")
	public void validate_the_entered_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address & GST num")
	public void validate_the_save_button_by_entering_Address_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Address & GST num")
	public void validate_the_entered_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting Country & City")
	public void validate_the_save_button_by_selecting_Country_City() throws InterruptedException {
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

	@Then("Validate the selected Country & City")
	public void validate_the_selected_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting Country & entering Bank details")
	public void validate_the_save_button_by_selecting_Country_entering_Bank_details() throws InterruptedException {
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

	@Then("Validate the selected Country & entered Bank details")
	public void validate_the_selected_Country_entered_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting Country & entering PAN num")
	public void validate_the_save_button_by_selecting_Country_entering_PAN_num() throws InterruptedException {
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

	@Then("Validate the selected Country & entered PAN num")
	public void validate_the_selected_Country_entered_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting Country & entering VAT num")
	public void validate_the_save_button_by_selecting_Country_entering_VAT_num() throws InterruptedException {
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

	@Then("Validate the selected Country & entered VAT num")
	public void validate_the_selected_Country_entered_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting Country & entering GST num")
	public void validate_the_save_button_by_selecting_Country_entering_GST_num() throws InterruptedException {
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

	@Then("Validate the selected Country & entered GST num")
	public void validate_the_selected_Country_entered_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting City & entering Bank details")
	public void validate_the_save_button_by_selecting_City_entering_Bank_details() throws InterruptedException {
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

	@Then("Validate the selected City & entered Bank details")
	public void validate_the_selected_City_entered_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting City & entering PAN num")
	public void validate_the_save_button_by_selecting_City_entering_PAN_num() throws InterruptedException {
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

	@Then("Validate the selected City & entered PAN num")
	public void validate_the_selected_City_entered_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting City & entering VAT num")
	public void validate_the_save_button_by_selecting_City_entering_VAT_num() throws InterruptedException {
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

	@Then("Validate the selected City & entered VAT num")
	public void validate_the_selected_City_entered_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by selecting City & entering GST num")
	public void validate_the_save_button_by_selecting_City_entering_GST_num() throws InterruptedException {
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

	@Then("Validate the selected City & entered GST num")
	public void validate_the_selected_City_entered_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Bank details & PAN num")
	public void validate_the_save_button_by_entering_Bank_details_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Bank details & PAN num")
	public void validate_the_entered_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Bank details & VAT num")
	public void validate_the_save_button_by_entering_Bank_details_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Bank details & VAT num")
	public void validate_the_entered_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Bank details & GST num")
	public void validate_the_save_button_by_entering_Bank_details_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Bank details & GST num")
	public void validate_the_entered_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering PAN num & VAT num")
	public void validate_the_save_button_by_entering_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered PAN num & VAT num")
	public void validate_the_entered_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering PAN num & GST num")
	public void validate_the_save_button_by_entering_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered PAN num & GST num")
	public void validate_the_entered_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering VAT num & GST num")
	public void validate_the_save_button_by_entering_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered VAT num & GST num")
	public void validate_the_entered_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & Partner Moniker")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & Partner Moniker")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & Mobile Num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & Mobile Num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & Email ID")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & Email ID")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & Address")
	public void validate_the_entered_Partner_Name_Contact_Name_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & City")
	public void validate_the_entered_Partner_Name_Contact_Name_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker & Mobile Num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Mobile_Num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker & Mobile Num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Mobile_Num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker & Email ID")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Email_ID()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker & Email ID")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Address()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker & Address")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Country()
			throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker & Country")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker & City")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Name, Partner Moniker & City")
	public void validate_the_entered_Partner_Name_Partner_Moniker_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker & Bank details")
	public void validate_the_entered_Partner_Name_Partner_Moniker_bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker & PAN num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker & VAT num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker & GST num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num & Email ID")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num & Email ID")
	public void validate_the_entered_Partner_Name_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Address() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Mobile Num & Address")
	public void validate_the_entered_Partner_Name_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num & Country")
	public void validate_the_entered_Partner_Name_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num & City")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Name, Mobile Num & City")
	public void validate_the_entered_Partner_Name_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Mobile Num & Bank details")
	public void validate_the_entered_Partner_Name_Mobile_Num_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Mobile Num & PAN num")
	public void validate_the_entered_Partner_Name_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Mobile Num & VAT num")
	public void validate_the_entered_Partner_Name_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Mobile Num & GST num")
	public void validate_the_entered_Partner_Name_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Address() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Email ID & Address")
	public void validate_the_entered_Partner_Name_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID & Country")
	public void validate_the_entered_Partner_Name_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID & City")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Name, Email ID & City")
	public void validate_the_entered_Partner_Name_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Email ID & Bank details")
	public void validate_the_entered_Partner_Name_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Email ID & PAN num")
	public void validate_the_entered_Partner_Name_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Email ID & VAT num")
	public void validate_the_entered_Partner_Name_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Email ID & GST num")
	public void validate_the_entered_Partner_Name_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Country() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Address & Country")
	public void validate_the_entered_Partner_Name_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address & City")
	public void validate_the_save_button_by_entering_Partner_Name_Address_City() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Address & City")
	public void validate_the_entered_Partner_Name_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Address & Bank details")
	public void validate_the_entered_Partner_Name_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Address & PAN num")
	public void validate_the_entered_Partner_Name_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Address & VAT num")
	public void validate_the_entered_Partner_Name_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Address & GST num")
	public void validate_the_entered_Partner_Name_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Country_City() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Country & City")
	public void validate_the_entered_Partner_Name_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Country_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Country & Bank details")
	public void validate_the_entered_Partner_Name_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Country & PAN num")
	public void validate_the_entered_Partner_Name_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Country & VAT num")
	public void validate_the_entered_Partner_Name_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Country & GST num")
	public void validate_the_entered_Partner_Name_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_City_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, City & Bank details")
	public void validate_the_entered_Partner_Name_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_City_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, City & PAN num")
	public void validate_the_entered_Partner_Name_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_City_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, City & VAT num")
	public void validate_the_entered_Partner_Name_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_City_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, City & GST num")
	public void validate_the_entered_Partner_Name_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Bank_details_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Bank_details_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Bank_details_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, PAN num & GST num")
	public void validate_the_entered_Partner_Name_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Name, VAT num & GST num")
	public void validate_the_entered_Partner_Name_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Partner Moniker & Mobile Num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Mobile_Num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Partner Moniker & Mobile Num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Mobile_Num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Partner Moniker & Email ID")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Email_ID()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Partner Moniker & Email ID")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Partner Moniker & Address")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Address()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Partner Moniker & Address")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Partner Moniker & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Country()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Partner Moniker & Country")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Partner Moniker & City")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_City() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Partner Moniker & City")
	public void validate_the_entered_Contact_Name_Partner_Moniker_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Partner Moniker & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Bank_details()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Partner Moniker & Bank details")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Partner Moniker & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_PAN_num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Partner Moniker & PAN num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Partner Moniker & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_VAT_num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Partner Moniker & VAT num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Partner Moniker & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_GST_num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Partner Moniker & GST num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Mobile Num & Email ID")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Mobile Num & Email ID")
	public void validate_the_entered_Contact_Name_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Mobile Num & Address")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Mobile Num & Address")
	public void validate_the_entered_Contact_Name_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Mobile Num & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Mobile Num & Country")
	public void validate_the_entered_Contact_Name_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Mobile Num & City")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Mobile Num & City")
	public void validate_the_entered_Contact_Name_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Mobile Num & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Bank_details()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Mobile Num & Bank details")
	public void validate_the_entered_Contact_Name_Mobile_Num_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Mobile Num & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Mobile Num & PAN num")
	public void validate_the_entered_Contact_Name_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Mobile Num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Mobile Num & VAT num")
	public void validate_the_entered_Contact_Name_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Mobile Num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
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

	@Then("Validate the entered Contact Name, Mobile Num & GST num")
	public void validate_the_entered_Contact_Name_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Email ID & Address")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Address() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Email ID & Address")
	public void validate_the_entered_Contact_Name_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);

	}

	@Then("Validate the save button by entering Contact Name, Email ID & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Email ID & Country")
	public void validate_the_entered_Contact_Name_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Email ID & City")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Contact Name, Email ID & City")
	public void validate_the_entered_Contact_Name_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Bank_details() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Email ID & Bank details")
	public void validate_the_entered_Contact_Name_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_PAN_num() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Email ID & PAN num")
	public void validate_the_entered_Contact_Name_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_VAT_num() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Email ID & VAT num")
	public void validate_the_entered_Contact_Name_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Email ID & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_GST_num() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Email ID & GST num")
	public void validate_the_entered_Contact_Name_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Address & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Address & Country")
	public void validate_the_entered_Contact_Name_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Address & City")
	public void validate_the_save_button_by_entering_Contact_Name_Address_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Contact Name, Address & City")
	public void validate_the_entered_Contact_Name_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Address & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, Address & Bank details")
	public void validate_the_entered_Contact_Name_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Address & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, Address & PAN num")
	public void validate_the_entered_Contact_Name_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Address & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, Address & VAT num")
	public void validate_the_entered_Contact_Name_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Address & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, Address & GST num")
	public void validate_the_entered_Contact_Name_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Country & City")
	public void validate_the_save_button_by_entering_Contact_Name_Country_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Contact Name, Country & City")
	public void validate_the_entered_Contact_Name_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Country & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Country_Bank_details() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Country & Bank details")
	public void validate_the_entered_Contact_Name_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Country & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_PAN_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Country & PAN num")
	public void validate_the_entered_Contact_Name_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Country & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_VAT_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Country & VAT num")
	public void validate_the_entered_Contact_Name_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Country & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_GST_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Contact Name, Country & GST num")
	public void validate_the_entered_Contact_Name_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, City & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_City_Bank_details() throws InterruptedException {
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
	}

	@Then("Validate the entered Contact Name, City & Bank details")
	public void validate_the_entered_Contact_Name_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, City & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_City_PAN_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Contact Name, City & PAN num")
	public void validate_the_entered_Contact_Name_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, City & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_City_VAT_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Contact Name, City & VAT num")
	public void validate_the_entered_Contact_Name_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, City & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_City_GST_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Contact Name, City & GST num")
	public void validate_the_entered_Contact_Name_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Bank_details_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, Bank details & PAN num")
	public void validate_the_entered_Contact_Name_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Bank_details_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, Bank details & VAT num")
	public void validate_the_entered_Contact_Name_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, Bank details & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Bank_details_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, Bank details & GST num")
	public void validate_the_entered_Contact_Name_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, PAN num & VAT num")
	public void validate_the_entered_Contact_Name_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, PAN num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, PAN num & GST num")
	public void validate_the_entered_Contact_Name_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Contact Name, VAT num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Contact Name, VAT num & GST num")
	public void validate_the_entered_Contact_Name_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Mobile Num & Email ID")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Mobile Num & Email ID")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Mobile Num & Address")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Moniker, Mobile Num & Address")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Mobile Num & Country")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Mobile Num & Country")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Mobile Num & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Mobile Num & City")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Mobile Num & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Bank_details()
			throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Moniker, Mobile Num & Bank details")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Mobile Num & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Moniker, Mobile Num & PAN num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Mobile Num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Moniker, Mobile Num & VAT num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Mobile Num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Moniker, Mobile Num & GST num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Email ID & Address")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Address() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Email ID & Address")
	public void validate_the_entered_Partner_Moniker_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Email ID & Country")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Email ID & Country")
	public void validate_the_entered_Partner_Moniker_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Email ID & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Moniker, Email ID & City")
	public void validate_the_entered_Partner_Moniker_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Bank_details()
			throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Email ID & Bank details")
	public void validate_the_entered_Partner_Moniker_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_PAN_num() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Email ID & PAN num")
	public void validate_the_entered_Partner_Moniker_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_VAT_num() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Email ID & VAT num")
	public void validate_the_entered_Partner_Moniker_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Email ID & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_GST_num() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Email ID & GST num")
	public void validate_the_entered_Partner_Moniker_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Address & Country")
	public void validate_the_entered_Partner_Moniker_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Address & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Moniker, Address & City")
	public void validate_the_entered_Partner_Moniker_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, Address & Bank details")
	public void validate_the_entered_Partner_Moniker_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, Address & PAN num")
	public void validate_the_entered_Partner_Moniker_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, Address & VAT num")
	public void validate_the_entered_Partner_Moniker_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, Address & GST num")
	public void validate_the_entered_Partner_Moniker_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Country & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Moniker, Country & City")
	public void validate_the_entered_Partner_Moniker_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_Bank_details()
			throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Country & Bank details")
	public void validate_the_entered_Partner_Moniker_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_PAN_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Country & PAN num")
	public void validate_the_entered_Partner_Moniker_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_VAT_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Country & VAT num")
	public void validate_the_entered_Partner_Moniker_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_GST_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Moniker, Country & GST num")
	public void validate_the_entered_Partner_Moniker_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_Bank_details() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Moniker, City & Bank details")
	public void validate_the_entered_Partner_Moniker_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_PAN_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Moniker, City & PAN num")
	public void validate_the_entered_Partner_Moniker_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_VAT_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Moniker, City & VAT num")
	public void validate_the_entered_Partner_Moniker_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_GST_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Moniker, City & GST num")
	public void validate_the_entered_Partner_Moniker_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Bank_details_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, Bank details & PAN num")
	public void validate_the_entered_Partner_Moniker_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Bank_details_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, Bank details & VAT num")
	public void validate_the_entered_Partner_Moniker_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Bank_details_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, Bank details & GST num")
	public void validate_the_entered_Partner_Moniker_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, PAN num & VAT num")
	public void validate_the_entered_Partner_Moniker_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, PAN num & GST num")
	public void validate_the_entered_Partner_Moniker_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Moniker, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Partner Moniker, VAT num & GST num")
	public void validate_the_entered_Partner_Moniker_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile num, Email ID & Address")
	public void validate_the_save_button_by_entering_Mobile_num_Email_ID_Address() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile num, Email ID & Address")
	public void validate_the_entered_Mobile_num_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Email ID & Country")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Email ID & Country")
	public void validate_the_entered_Mobile_Num_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Email ID & City")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Mobile Num, Email ID & City")
	public void validate_the_entered_Mobile_Num_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Email ID & Bank details")
	public void validate_the_entered_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Email ID & PAN num")
	public void validate_the_entered_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Email ID & VAT num")
	public void validate_the_entered_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Email ID & GST num")
	public void validate_the_save_button_by_entering_Mobile_num_Email_ID_GST_num() throws InterruptedException {
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
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Email ID & GST num")
	public void validate_the_entered_Mobile_num_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Address & Country")
	public void validate_the_save_button_by_entering_Mobile_num_Address_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Address & Country")
	public void validate_the_entered_Mobile_num_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Address & City")
	public void validate_the_save_button_by_entering_Mobile_num_Address_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Mobile Num, Address & City")
	public void validate_the_entered_Mobile_num_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Address & Bank details")
	public void validate_the_save_button_by_entering_Mobile_num_Address_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num, Address & Bank details")
	public void validate_the_entered_Mobile_num_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Address & PAN num")
	public void validate_the_save_button_by_entering_Mobile_num_Address_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num, Address & PAN num")
	public void validate_the_entered_Mobile_num_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Address & VAT num")
	public void validate_the_save_button_by_entering_Mobile_num_Address_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num, Address & VAT num")
	public void validate_the_entered_Mobile_num_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Address & GST num")
	public void validate_the_save_button_by_entering_Mobile_num_Address_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num, Address & GST num")
	public void validate_the_entered_Mobile_num_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Country & City")
	public void validate_the_save_button_by_entering_Mobile_num_Country_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Mobile Num, Country & City")
	public void validate_the_entered_Mobile_num_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Country & Bank details")
	public void validate_the_save_button_by_entering_Mobile_num_Country_Bank_details() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Country & Bank details")
	public void validate_the_entered_Mobile_num_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Country & PAN num")
	public void validate_the_save_button_by_entering_Mobile_num_Country_PAN_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Country & PAN num")
	public void validate_the_entered_Mobile_num_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Country & VAT num")
	public void validate_the_save_button_by_entering_Mobile_num_Country_VAT_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Country & VAT num")
	public void validate_the_entered_Mobile_num_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Country & GST num")
	public void validate_the_save_button_by_entering_Mobile_num_Country_GST_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Mobile Num, Country & GST num")
	public void validate_the_entered_Mobile_num_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, City & Bank details")
	public void validate_the_save_button_by_entering_Mobile_num_City_Bank_details() throws InterruptedException {
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
	}

	@Then("Validate the entered Mobile Num, City & Bank details")
	public void validate_the_entered_Mobile_num_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, City & PAN num")
	public void validate_the_save_button_by_entering_Mobile_num_City_PAN_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Mobile Num, City & PAN num")
	public void validate_the_entered_Mobile_num_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, City & VAT num")
	public void validate_the_save_button_by_entering_Mobile_num_City_VAT_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Mobile Num, City & VAT num")
	public void validate_the_entered_Mobile_num_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, City & GST num")
	public void validate_the_save_button_by_entering_Mobile_num_City_GST_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Mobile Num, City & GST num")
	public void validate_the_entered_Mobile_num_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Mobile_num_Bank_details_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num, Bank details & PAN num")
	public void validate_the_entered_Mobile_num_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Mobile_num_Bank_details_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num, Bank details & VAT num")
	public void validate_the_entered_Mobile_num_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, Bank details & GST num")
	public void validate_the_save_button_by_entering_Mobile_num_Bank_details_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num, Bank details & GST num")
	public void validate_the_entered_Mobile_num_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Mobile_num_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num, PAN num & VAT num")
	public void validate_the_entered_Mobile_num_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile Num, PAN num & GST num")
	public void validate_the_save_button_by_entering_Mobile_num_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile Num, PAN num & GST num")
	public void validate_the_entered_Mobile_num_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Mobile num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Mobile_num_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Mobile num, VAT num & GST num")
	public void validate_the_entered_Mobile_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Address & Country")
	public void validate_the_save_button_by_entering_Email_ID_Address_Country() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Email ID, Address & Country")
	public void validate_the_entered_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Address & City")
	public void validate_the_save_button_by_entering_Email_ID_Address_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Email ID, Address & City")
	public void validate_the_entered_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Address & Bank details")
	public void validate_the_save_button_by_entering_Email_ID_Address_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Email ID, Address & Bank details")
	public void validate_the_entered_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Address & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_Address_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID, Address & PAN num")
	public void validate_the_entered_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Address & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Address_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID, Address & VAT num")
	public void validate_the_entered_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Address & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Address_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID, Address & GST num")
	public void validate_the_entered_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Country & City")
	public void validate_the_save_button_by_entering_Email_ID_Country_City() throws InterruptedException {
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
	}

	@Then("Validate the entered Email ID, Country & City")
	public void validate_the_entered_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Country & Bank details")
	public void validate_the_save_button_by_entering_Email_ID_Country_Bank_details() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Email ID, Country & Bank details")
	public void validate_the_entered_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Country & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_Country_PAN_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Email ID, Country & PAN num")
	public void validate_the_entered_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Country & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Country_VAT_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Email ID, Country & VAT num")
	public void validate_the_entered_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Country & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Country_GST_num() throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Email ID, Country & GST num")
	public void validate_the_entered_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, City & Bank details")
	public void validate_the_save_button_by_entering_Email_ID_City_Bank_details() throws InterruptedException {
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
	}

	@Then("Validate the entered Email ID, City & Bank details")
	public void validate_the_entered_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, City & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_City_PAN_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Email ID, City & PAN num")
	public void validate_the_entered_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, City & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_City_VAT_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Email ID, City & VAT num")
	public void validate_the_entered_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, City & GST num")
	public void validate_the_save_button_by_entering_Email_ID_City_GST_num() throws InterruptedException {
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
	}

	@Then("Validate the entered Email ID, City & GST num")
	public void validate_the_entered_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_Bank_details_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID, Bank details & PAN num")
	public void validate_the_entered_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Bank_details_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID, Bank details & VAT num")
	public void validate_the_entered_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, Bank details & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Bank_details_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID, Bank details & GST num")
	public void validate_the_entered_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID, PAN num & VAT num")
	public void validate_the_entered_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, PAN num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID, PAN num & GST num")
	public void validate_the_entered_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Email ID, VAT num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Email ID, VAT num & GST num")
	public void validate_the_entered_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, Country & City")
	public void validate_the_save_button_by_entering_Address_Country_City() throws InterruptedException {
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

	@Then("Validate the entered Address, Country & City")
	public void validate_the_entered_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, Country & Bank details")
	public void validate_the_save_button_by_entering_Address_Country_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Address, Country & Bank details")
	public void validate_the_entered_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, Country & PAN num")
	public void validate_the_save_button_by_entering_Address_Country_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Address, Country & PAN num")
	public void validate_the_entered_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, Country & VAT num")
	public void validate_the_save_button_by_entering_Address_Country_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Address, Country & VAT num")
	public void validate_the_entered_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, Country & GST num")
	public void validate_the_save_button_by_entering_Address_Country_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Address, Country & GST num")
	public void validate_the_entered_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, City & Bank details")
	public void validate_the_save_button_by_entering_Address_City_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Address, City & Bank details")
	public void validate_the_entered_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, City & PAN num")
	public void validate_the_save_button_by_entering_Address_City_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Address, City & PAN num")
	public void validate_the_entered_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, City & VAT num")
	public void validate_the_save_button_by_entering_Address_City_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Address, City & VAT num")
	public void validate_the_entered_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, City & GST num")
	public void validate_the_save_button_by_entering_Address_City_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Address, City & GST num")
	public void validate_the_entered_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Address_Bank_details_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Address, Bank details & PAN num")
	public void validate_the_entered_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Address_Bank_details_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Address, Bank details & VAT num")
	public void validate_the_entered_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, Bank details & GST num")
	public void validate_the_save_button_by_entering_Address_Bank_details_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Address, Bank details & GST num")
	public void validate_the_entered_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Address_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Address, PAN num & VAT num")
	public void validate_the_entered_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, PAN num & GST num")
	public void validate_the_save_button_by_entering_Address_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Address, PAN num & GST num")
	public void validate_the_entered_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Address, VAT num & GST num")
	public void validate_the_save_button_by_entering_Address_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Address, VAT num & GST num")
	public void validate_the_entered_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, City & Bank details")
	public void validate_the_save_button_by_entering_Country_City_Bank_details() throws InterruptedException {
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

	@Then("Validate the entered Country, City & Bank details")
	public void validate_the_entered_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, City & PAN num")
	public void validate_the_save_button_by_entering_Country_City_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Country, City & PAN num")
	public void validate_the_entered_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, City & VAT num")
	public void validate_the_save_button_by_entering_Country_City_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Country, City & VAT num")
	public void validate_the_entered_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, City & GST num")
	public void validate_the_save_button_by_entering_Country_City_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Country, City & GST num")
	public void validate_the_entered_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Country_Bank_details_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered Country, Bank details & PAN num")
	public void validate_the_entered_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Country_Bank_details_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Country, Bank details & VAT num")
	public void validate_the_entered_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, Bank details & GST num")
	public void validate_the_save_button_by_entering_Country_Bank_details_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Country, Bank details & GST num")
	public void validate_the_entered_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Country_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Country, PAN num & VAT num")
	public void validate_the_entered_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, PAN num & GST num")
	public void validate_the_save_button_by_entering_Country_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Country, PAN num & GST num")
	public void validate_the_entered_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Country, VAT num & GST num")
	public void validate_the_save_button_by_entering_Country_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Country, VAT num & GST num")
	public void validate_the_entered_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering City, Bank details & PAN num")
	public void validate_the_save_button_by_entering_City_Bank_details_PAN_num() throws InterruptedException {
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

	@Then("Validate the entered City, Bank details & PAN num")
	public void validate_the_entered_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering City, Bank details & VAT num")
	public void validate_the_save_button_by_entering_City_Bank_details_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered City, Bank details & VAT num")
	public void validate_the_entered_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering City, Bank details & GST num")
	public void validate_the_save_button_by_entering_City_Bank_details_GST_num() throws InterruptedException {
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

	@Then("Validate the entered City, Bank details & GST num")
	public void validate_the_entered_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering City, PAN num & VAT num")
	public void validate_the_save_button_by_entering_City_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered City, PAN num & VAT num")
	public void validate_the_entered_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering City, PAN num & GST num")
	public void validate_the_save_button_by_entering_City_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered City, PAN num & GST num")
	public void validate_the_entered_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering City, VAT num & GST num")
	public void validate_the_save_button_by_entering_City_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered City, VAT num & GST num")
	public void validate_the_entered_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Bank_details_PAN_num_VAT_num() throws InterruptedException {
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

	@Then("Validate the entered Bank details, PAN num & VAT num")
	public void validate_the_entered_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_Bank_details_PAN_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Bank details, PAN num & GST num")
	public void validate_the_entered_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_Bank_details_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered Bank details, VAT num & GST num")
	public void validate_the_entered_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_PAN_num_VAT_num_GST_num() throws InterruptedException {
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

	@Then("Validate the entered PAN num, VAT num & GST num")
	public void validate_the_entered_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker & Mobile Num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker & Mobile Num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker & Email ID")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Email_ID()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker & Email ID")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Address()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker & Address")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Country()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_City()
			throws InterruptedException {
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Bank_details()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num & Email ID")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Email_ID()
			throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Contact Name, Mobile Num & Email ID")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Address()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Mobile Num & Address")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Country()
			throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Contact Name, Mobile Num & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_City()
			throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Contact Name, Mobile Num & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Mobile Num & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Mobile Num & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Mobile Num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Mobile Num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Address()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Email ID & Address")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Country()
			throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Contact Name, Email ID & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_City()
			throws InterruptedException {
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Contact Name, Email ID & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Email ID & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Email ID & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Email ID & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Email ID & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Country()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Address & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Address & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_City()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Address & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Address & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Address & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Address & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Address & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_City()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Country & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Country & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Country & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Country & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Country & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, City & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, City & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, City & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, City & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Bank_details_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Bank_details_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Bank_details_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_PAN_num_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_PAN_num_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Contact Name, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_VAT_num_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Contact Name, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2 = driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	// Partner Name, Partner Moniker, Mobile num & Email ID
	@Then("Validate the save button by entering Partner Name, Partner Moniker, Mobile Num & Email ID")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Mobile_Num_Email_ID()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Mobile Num & Email ID")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Mobile Num & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Mobile_Num_Address()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Mobile Num & Address")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Mobile Num & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Mobile_Num_Country()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Mobile Num & Country")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Mobile Num & City")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Mobile_Num_City()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Mobile Num & City")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Mobile Num & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Mobile_Num_Bank_details()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Mobile Num & Bank details")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Mobile_Num_Bank_details()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Mobile Num & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Mobile_Num_PAN_num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Mobile Num & PAN num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Mobile Num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Mobile_Num_VAT_num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Mobile Num & VAT num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Mobile Num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Mobile_Num_GST_num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Mobile Num & GST num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Email ID & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Email_ID_Address()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Email ID & Address")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Email ID & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Email_ID_Country()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Email ID & Country")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Email ID & City")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Email_ID_City()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Email ID & City")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Email_ID_Bank_details()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Email ID & Bank details")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Email_ID_PAN_num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Email ID & PAN num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Email_ID_VAT_num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Email ID & VAT num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Email ID & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Email_ID_GST_num()
			throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
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

	@Then("Validate the entered Partner Name, Partner Moniker, Email ID & GST num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5 = driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Address_Country()
			throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Address & Country")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Address & City")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Address_City()
			throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Address & City")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Address_Bank_details()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, Address & Bank details")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Address_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, Address & PAN num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Address_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, Address & VAT num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Address_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, Address & GST num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6 = driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Country_City()
			throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Country & City")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Country_Bank_details()
			throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Country & Bank details")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Country_PAN_num()
			throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Country & PAN num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Country_VAT_num()
			throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Country & VAT num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Country_GST_num()
			throws InterruptedException {
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
		String a6 = driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Partner Moniker, Country & GST num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_City_Bank_details()
			throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Name, Partner Moniker, City & Bank details")
	public void validate_the_entered_Partner_Name_Partner_Moniker_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_City_PAN_num()
			throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Name, Partner Moniker, City & PAN num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_City_VAT_num()
			throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Name, Partner Moniker, City & VAT num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_City_GST_num()
			throws InterruptedException {
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
	}

	@Then("Validate the entered Partner Name, Partner Moniker, City & GST num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8 = driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Bank_details_PAN_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Bank_details_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_Bank_details_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9 = driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_PAN_num_VAT_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_PAN_num_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10 = driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Partner Moniker, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Partner_Moniker_VAT_num_GST_num()
			throws InterruptedException {
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

	@Then("Validate the entered Partner Name, Partner Moniker, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Partner_Moniker_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3 = driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11 = driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12 = driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
}
