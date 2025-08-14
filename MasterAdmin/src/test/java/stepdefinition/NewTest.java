package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;

public class NewTest {
	WebDriver driver;

	@Then("Validate the save button by entering Partner Name, Mobile Num, Email ID & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Email ID & Address")
	public void validate_the_entered_Partner_Name_Mobile_Num_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Email ID & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Email ID & Country")
	public void validate_the_entered_Partner_Name_Mobile_Num_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Email ID & City")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Email ID & City")
	public void validate_the_entered_Partner_Name_Mobile_Num_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Email ID & Bank details")
	public void validate_the_entered_Partner_Name_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Email ID & PAN num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Email ID & VAT num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Email ID & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Email ID & GST num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Address & Country")
	public void validate_the_entered_Partner_Name_Mobile_Num_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Address & City")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Address & City")
	public void validate_the_entered_Partner_Name_Mobile_Num_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Address & Bank details")
	public void validate_the_entered_Partner_Name_Mobile_Num_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Address & PAN num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Address & VAT num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Address & GST num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Country & City")
	public void validate_the_entered_Partner_Name_Mobile_Num_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Country & Bank details")
	public void validate_the_entered_Partner_Name_Mobile_Num_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Country & PAN num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Country & VAT num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Country & GST num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, City & Bank details")
	public void validate_the_entered_Partner_Name_Mobile_Num_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, City & PAN num")
	public void validate_the_entered_Partner_Name_Mobile_Num_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, City & VAT num")
	public void validate_the_entered_Partner_Name_Mobile_Num_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, City & GST num")
	public void validate_the_entered_Partner_Name_Mobile_Num_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Mobile_Num_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Mobile_Num_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Mobile_Num_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Mobile Num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Mobile_Num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Mobile Num, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Mobile_Num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Address & Country")
	public void validate_the_entered_Partner_Name_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Address & City")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Address & City")
	public void validate_the_entered_Partner_Name_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Address & Bank details")
	public void validate_the_entered_Partner_Name_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Address & PAN num")
	public void validate_the_entered_Partner_Name_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Address & VAT num")
	public void validate_the_entered_Partner_Name_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Address & GST num")
	public void validate_the_entered_Partner_Name_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Country & City")
	public void validate_the_entered_Partner_Name_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Country & Bank details")
	public void validate_the_entered_Partner_Name_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Country & PAN num")
	public void validate_the_entered_Partner_Name_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Country & VAT num")
	public void validate_the_entered_Partner_Name_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Country & GST num")
	public void validate_the_entered_Partner_Name_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, City & Bank details")
	public void validate_the_entered_Partner_Name_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, City & PAN num")
	public void validate_the_entered_Partner_Name_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, City & VAT num")
	public void validate_the_entered_Partner_Name_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, City & GST num")
	public void validate_the_entered_Partner_Name_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Email ID, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Email ID, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, Country & City")
	public void validate_the_entered_Partner_Name_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, Country & Bank details")
	public void validate_the_entered_Partner_Name_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, Country & PAN num")
	public void validate_the_entered_Partner_Name_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, Country & VAT num")
	public void validate_the_entered_Partner_Name_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, Country & GST num")
	public void validate_the_entered_Partner_Name_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, City & Bank details")
	public void validate_the_entered_Partner_Name_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, City & PAN num")
	public void validate_the_entered_Partner_Name_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, City & VAT num")
	public void validate_the_entered_Partner_Name_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, City & GST num")
	public void validate_the_entered_Partner_Name_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Address, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Address, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, City & Bank details")
	public void validate_the_entered_Partner_Name_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, City & PAN num")
	public void validate_the_entered_Partner_Name_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, City & VAT num")
	public void validate_the_entered_Partner_Name_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, City & GST num")
	public void validate_the_entered_Partner_Name_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Country, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Country, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, City, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, City, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, City, Bank details & GST num")
	public void validate_the_entered_Partner_Name_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, City, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, City, PAN num & GST num")
	public void validate_the_entered_Partner_Name_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, City, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, City, VAT num & GST num")
	public void validate_the_entered_Partner_Name_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email Bank details is required!']")).getText();
		Assert.assertEquals("Email Bank details is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Bank details, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email Bank details is required!']")).getText();
		Assert.assertEquals("Email Bank details is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Bank details, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}

	@Then("Validate the save button by entering Partner Name, Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email Bank details is required!']")).getText();
		Assert.assertEquals("Email Bank details is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, Bank details, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email Bank details is required!']")).getText();
		Assert.assertEquals("Email Bank details is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}

	@Then("Validate the entered Partner Name, PAN num, VAT num & GST num")
	public void validate_the_entered_Partner_Name_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Mobile Num & Email ID")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Mobile Num & Email ID")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Mobile Num & Address")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Mobile Num & Address")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Mobile Num & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Mobile Num & Country")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Mobile Num & City")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Mobile Num & City")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Mobile Num & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Mobile_Num_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Mobile Num & Bank details")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Mobile_Num_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Mobile Num & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Mobile Num & PAN num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Mobile Num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Mobile Num & VAT num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Mobile Num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Mobile Num & GST num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Email ID & Address")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Email ID & Address")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Email ID & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
 		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Email ID & Country")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Email ID & City")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Email ID & City")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Email ID & Bank details")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Email ID & PAN num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Email ID & VAT num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Email ID & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Email ID & GST num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Address & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
 		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Address & Country")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Address & City")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Address & City")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Address & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Address & Bank details")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Address & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Address & PAN num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Address & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Address & VAT num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Address & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Address & GST num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Country & City")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Country & City")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Country & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Country & Bank details")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Country & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Country & PAN num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Country & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Country & VAT num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Country & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Country & GST num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, City & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, City & Bank details")
	public void validate_the_entered_Contact_Name_Partner_Moniker_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, City & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, City & PAN num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, City & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, City & VAT num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, City & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, City & GST num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Bank details & PAN num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Bank details & VAT num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, Bank details & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, Bank details & GST num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, PAN num & VAT num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, PAN num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, PAN num & GST num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Partner Moniker, VAT num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Partner_Moniker_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Partner Moniker, VAT num & GST num")
	public void validate_the_entered_Contact_Name_Partner_Moniker_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Email ID & Address")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Email ID & Address")
	public void validate_the_entered_Contact_Name_Mobile_Num_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Email ID & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Email ID & Country")
	public void validate_the_entered_Contact_Name_Mobile_Num_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Email ID & City")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Email ID & City")
	public void validate_the_entered_Contact_Name_Mobile_Num_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Email ID & Bank details")
	public void validate_the_entered_Contact_Name_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Email ID & PAN num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Email ID & VAT num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Email ID & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Email ID & GST num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Address & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Address & Country")
	public void validate_the_entered_Contact_Name_Mobile_Num_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Address & City")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Address & City")
	public void validate_the_entered_Contact_Name_Mobile_Num_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Address & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Address & Bank details")
	public void validate_the_entered_Contact_Name_Mobile_Num_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Address & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Address & PAN num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Address & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Address & VAT num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Address & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Address & GST num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Country & City")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Country & City")
	public void validate_the_entered_Contact_Name_Mobile_Num_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Country & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Country & Bank details")
	public void validate_the_entered_Contact_Name_Mobile_Num_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Country & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Country & PAN num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Country & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Country & VAT num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Country & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Country & GST num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, City & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, City & Bank details")
	public void validate_the_entered_Contact_Name_Mobile_Num_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, City & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, City & PAN num")
	public void validate_the_entered_Contact_Name_Mobile_Num_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, City & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, City & VAT num")
	public void validate_the_entered_Contact_Name_Mobile_Num_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, City & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, City & GST num")
	public void validate_the_entered_Contact_Name_Mobile_Num_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Bank details & PAN num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Bank details & VAT num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, Bank details & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, Bank details & GST num")
	public void validate_the_entered_Contact_Name_Mobile_Num_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, PAN num & VAT num")
	public void validate_the_entered_Contact_Name_Mobile_Num_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, PAN num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, PAN num & GST num")
	public void validate_the_entered_Contact_Name_Mobile_Num_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Mobile Num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Mobile_Num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Mobile Num, VAT num & GST num")
	public void validate_the_entered_Contact_Name_Mobile_Num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Address & Country")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Address & Country")
	public void validate_the_entered_Contact_Name_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Address & City")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Address & City")
	public void validate_the_entered_Contact_Name_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Address & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Address & Bank details")
	public void validate_the_entered_Contact_Name_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Address & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Address & PAN num")
	public void validate_the_entered_Contact_Name_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Address & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Address & VAT num")
	public void validate_the_entered_Contact_Name_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Address & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Address & GST num")
	public void validate_the_entered_Contact_Name_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Country & City")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Country & City")
	public void validate_the_entered_Contact_Name_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Country & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Country & Bank details")
	public void validate_the_entered_Contact_Name_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Country & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Country & PAN num")
	public void validate_the_entered_Contact_Name_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Country & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Country & VAT num")
	public void validate_the_entered_Contact_Name_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Country & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Country & GST num")
	public void validate_the_entered_Contact_Name_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, City & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, City & Bank details")
	public void validate_the_entered_Contact_Name_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, City & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, City & PAN num")
	public void validate_the_entered_Contact_Name_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, City & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, City & VAT num")
	public void validate_the_entered_Contact_Name_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, City & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, City & GST num")
	public void validate_the_entered_Contact_Name_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Bank details & PAN num")
	public void validate_the_entered_Contact_Name_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Bank details & VAT num")
	public void validate_the_entered_Contact_Name_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, Bank details & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, Bank details & GST num")
	public void validate_the_entered_Contact_Name_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, PAN num & VAT num")
	public void validate_the_entered_Contact_Name_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, PAN num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, PAN num & GST num")
	public void validate_the_entered_Contact_Name_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Email ID, VAT num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Email ID, VAT num & GST num")
	public void validate_the_entered_Contact_Name_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, Country & City")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, Country & City")
	public void validate_the_entered_Contact_Name_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, Country & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, Country & Bank details")
	public void validate_the_entered_Contact_Name_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, Country & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, Country & PAN num")
	public void validate_the_entered_Contact_Name_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, Country & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, Country & VAT num")
	public void validate_the_entered_Contact_Name_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, Country & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, Country & GST num")
	public void validate_the_entered_Contact_Name_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, City & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, City & Bank details")
	public void validate_the_entered_Contact_Name_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, City & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, City & PAN num")
	public void validate_the_entered_Contact_Name_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, City & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, City & VAT num")
	public void validate_the_entered_Contact_Name_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, City & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, City & GST num")
	public void validate_the_entered_Contact_Name_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, Bank details & PAN num")
	public void validate_the_entered_Contact_Name_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, Bank details & VAT num")
	public void validate_the_entered_Contact_Name_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, Bank details & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, Bank details & GST num")
	public void validate_the_entered_Contact_Name_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, PAN num & VAT num")
	public void validate_the_entered_Contact_Name_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, PAN num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, PAN num & GST num")
	public void validate_the_entered_Contact_Name_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Address, VAT num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Address, VAT num & GST num")
	public void validate_the_entered_Contact_Name_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, City & Bank details")
	public void validate_the_save_button_by_entering_Contact_Name_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, City & Bank details")
	public void validate_the_entered_Contact_Name_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, City & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, City & PAN num")
	public void validate_the_entered_Contact_Name_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, City & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, City & VAT num")
	public void validate_the_entered_Contact_Name_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, City & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, City & GST num")
	public void validate_the_entered_Contact_Name_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, Bank details & PAN num")
	public void validate_the_entered_Contact_Name_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, Bank details & VAT num")
	public void validate_the_entered_Contact_Name_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, Bank details & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, Bank details & GST num")
	public void validate_the_entered_Contact_Name_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, PAN num & VAT num")
	public void validate_the_entered_Contact_Name_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, PAN num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, PAN num & GST num")
	public void validate_the_entered_Contact_Name_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Country, VAT num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Country, VAT num & GST num")
	public void validate_the_entered_Contact_Name_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, City, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Contact_Name_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, City, Bank details & PAN num")
	public void validate_the_entered_Contact_Name_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, City, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, City, Bank details & VAT num")
	public void validate_the_entered_Contact_Name_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, City, Bank details & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, City, Bank details & GST num")
	public void validate_the_entered_Contact_Name_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, City, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, City, PAN num & VAT num")
	public void validate_the_entered_Contact_Name_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, City, PAN num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, City, PAN num & GST num")
	public void validate_the_entered_Contact_Name_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, City, VAT num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, City, VAT num & GST num")
	public void validate_the_entered_Contact_Name_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Contact_Name_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Bank details, PAN num & VAT num")
	public void validate_the_entered_Contact_Name_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Bank details, PAN num & GST num")
	public void validate_the_entered_Contact_Name_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, Bank details, VAT num & GST num")
	public void validate_the_entered_Contact_Name_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Contact Name, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Contact_Name_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Contact Name, PAN num, VAT num & GST num")
	public void validate_the_entered_Contact_Name_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Email ID & Address")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Email ID & Address")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Email ID & Country")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Email ID & Country")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Email ID & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Email ID & City")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Email ID & Bank details")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Email ID & PAN num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Email ID & VAT num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Email ID & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Email ID & GST num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Address & Country")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Address & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Address & City")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Address & Bank details")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Address & PAN num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Address & VAT num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Address & GST num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Country & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Country & City")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Country & Bank details")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Country & PAN num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Country & VAT num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Country & GST num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, City & Bank details")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, City & PAN num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, City & VAT num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, City & GST num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Bank details & PAN num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Bank details & VAT num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, Bank details & GST num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, PAN num & VAT num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, PAN num & GST num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Mobile Num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Mobile_Num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Mobile Num, VAT num & GST num")
	public void validate_the_entered_Partner_Moniker_Mobile_Num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Address & Country")
	public void validate_the_entered_Partner_Moniker_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Address & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Address & City")
	public void validate_the_entered_Partner_Moniker_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Address & Bank details")
	public void validate_the_entered_Partner_Moniker_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Address & PAN num")
	public void validate_the_entered_Partner_Moniker_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Address & VAT num")
	public void validate_the_entered_Partner_Moniker_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Address & GST num")
	public void validate_the_entered_Partner_Moniker_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Country & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Country & City")
	public void validate_the_entered_Partner_Moniker_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Country & Bank details")
	public void validate_the_entered_Partner_Moniker_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Country & PAN num")
	public void validate_the_entered_Partner_Moniker_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Country & VAT num")
	public void validate_the_entered_Partner_Moniker_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Country & GST num")
	public void validate_the_entered_Partner_Moniker_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, City & Bank details")
	public void validate_the_entered_Partner_Moniker_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, City & PAN num")
	public void validate_the_entered_Partner_Moniker_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, City & VAT num")
	public void validate_the_entered_Partner_Moniker_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, City & GST num")
	public void validate_the_entered_Partner_Moniker_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Bank details & PAN num")
	public void validate_the_entered_Partner_Moniker_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Bank details & VAT num")
	public void validate_the_entered_Partner_Moniker_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, Bank details & GST num")
	public void validate_the_entered_Partner_Moniker_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, PAN num & VAT num")
	public void validate_the_entered_Partner_Moniker_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, PAN num & GST num")
	public void validate_the_entered_Partner_Moniker_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Email ID, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Email ID, VAT num & GST num")
	public void validate_the_entered_Partner_Moniker_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, Country & City")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, Country & City")
	public void validate_the_entered_Partner_Moniker_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, Country & Bank details")
	public void validate_the_entered_Partner_Moniker_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, Country & PAN num")
	public void validate_the_entered_Partner_Moniker_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, Country & VAT num")
	public void validate_the_entered_Partner_Moniker_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, Country & GST num")
	public void validate_the_entered_Partner_Moniker_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, City & Bank details")
	public void validate_the_entered_Partner_Moniker_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, City & PAN num")
	public void validate_the_entered_Partner_Moniker_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, City & VAT num")
	public void validate_the_entered_Partner_Moniker_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, City & GST num")
	public void validate_the_entered_Partner_Moniker_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, Bank details & PAN num")
	public void validate_the_entered_Partner_Moniker_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, Bank details & VAT num")
	public void validate_the_entered_Partner_Moniker_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, Bank details & GST num")
	public void validate_the_entered_Partner_Moniker_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, PAN num & VAT num")
	public void validate_the_entered_Partner_Moniker_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, PAN num & GST num")
	public void validate_the_entered_Partner_Moniker_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Address, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Address, VAT num & GST num")
	public void validate_the_entered_Partner_Moniker_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, City & Bank details")
	public void validate_the_entered_Partner_Moniker_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, City & PAN num")
	public void validate_the_entered_Partner_Moniker_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, City & VAT num")
	public void validate_the_entered_Partner_Moniker_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, City & GST num")
	public void validate_the_entered_Partner_Moniker_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, Bank details & PAN num")
	public void validate_the_entered_Partner_Moniker_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, Bank details & VAT num")
	public void validate_the_entered_Partner_Moniker_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, Bank details & GST num")
	public void validate_the_entered_Partner_Moniker_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, PAN num & VAT num")
	public void validate_the_entered_Partner_Moniker_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, PAN num & GST num")
	public void validate_the_entered_Partner_Moniker_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Country, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Country, VAT num & GST num")
	public void validate_the_entered_Partner_Moniker_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, City, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, City, Bank details & PAN num")
	public void validate_the_entered_Partner_Moniker_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, City, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, City, Bank details & VAT num")
	public void validate_the_entered_Partner_Moniker_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, City, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, City, Bank details & GST num")
	public void validate_the_entered_Partner_Moniker_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, City, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, City, PAN num & VAT num")
	public void validate_the_entered_Partner_Moniker_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, City, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, City, PAN num & GST num")
	public void validate_the_entered_Partner_Moniker_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, City, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, City, VAT num & GST num")
	public void validate_the_entered_Partner_Moniker_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Bank details, PAN num & VAT num")
	public void validate_the_entered_Partner_Moniker_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Bank details, PAN num & GST num")
	public void validate_the_entered_Partner_Moniker_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, Bank details, VAT num & GST num")
	public void validate_the_entered_Partner_Moniker_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Moniker, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Moniker_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Moniker, PAN num, VAT num & GST num")
	public void validate_the_entered_Partner_Moniker_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Address & Country")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Address & Country")
	public void validate_the_entered_Mobile_Num_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Address & City")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Address & City")
	public void validate_the_entered_Mobile_Num_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Address & Bank details")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Address & Bank details")
	public void validate_the_entered_Mobile_Num_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Address & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Address & PAN num")
	public void validate_the_entered_Mobile_Num_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Address & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Address & VAT num")
	public void validate_the_entered_Mobile_Num_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Address & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Address & GST num")
	public void validate_the_entered_Mobile_Num_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Country & City")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Country & City")
	public void validate_the_entered_Mobile_Num_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Country & Bank details")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Country & Bank details")
	public void validate_the_entered_Mobile_Num_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Country & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Country & PAN num")
	public void validate_the_entered_Mobile_Num_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Country & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Country & VAT num")
	public void validate_the_entered_Mobile_Num_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Country & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Country & GST num")
	public void validate_the_entered_Mobile_Num_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, City & Bank details")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, City & Bank details")
	public void validate_the_entered_Mobile_Num_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, City & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, City & PAN num")
	public void validate_the_entered_Mobile_Num_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, City & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, City & VAT num")
	public void validate_the_entered_Mobile_Num_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, City & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, City & GST num")
	public void validate_the_entered_Mobile_Num_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Bank details & PAN num")
	public void validate_the_entered_Mobile_Num_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Bank details & VAT num")
	public void validate_the_entered_Mobile_Num_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, Bank details & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, Bank details & GST num")
	public void validate_the_entered_Mobile_Num_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, PAN num & VAT num")
	public void validate_the_entered_Mobile_Num_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, PAN num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, PAN num & GST num")
	public void validate_the_entered_Mobile_Num_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Email ID, VAT num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Email ID, VAT num & GST num")
	public void validate_the_entered_Mobile_Num_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, Country & City")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, Country & City")
	public void validate_the_entered_Mobile_Num_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, Country & Bank details")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, Country & Bank details")
	public void validate_the_entered_Mobile_Num_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, Country & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, Country & PAN num")
	public void validate_the_entered_Mobile_Num_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, Country & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, Country & VAT num")
	public void validate_the_entered_Mobile_Num_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, Country & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, Country & GST num")
	public void validate_the_entered_Mobile_Num_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, City & Bank details")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, City & Bank details")
	public void validate_the_entered_Mobile_Num_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, City & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, City & PAN num")
	public void validate_the_entered_Mobile_Num_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, City & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, City & VAT num")
	public void validate_the_entered_Mobile_Num_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, City & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, City & GST num")
	public void validate_the_entered_Mobile_Num_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, Bank details & PAN num")
	public void validate_the_entered_Mobile_Num_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, Bank details & VAT num")
	public void validate_the_entered_Mobile_Num_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, Bank details & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, Bank details & GST num")
	public void validate_the_entered_Mobile_Num_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, PAN num & VAT num")
	public void validate_the_entered_Mobile_Num_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, PAN num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, PAN num & GST num")
	public void validate_the_entered_Mobile_Num_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Address, VAT num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Address, VAT num & GST num")
	public void validate_the_entered_Mobile_Num_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, City & Bank details")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, City & Bank details")
	public void validate_the_entered_Mobile_Num_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, City & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, City & PAN num")
	public void validate_the_entered_Mobile_Num_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, City & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, City & VAT num")
	public void validate_the_entered_Mobile_Num_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, City & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, City & GST num")
	public void validate_the_entered_Mobile_Num_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, Bank details & PAN num")
	public void validate_the_entered_Mobile_Num_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, Bank details & VAT num")
	public void validate_the_entered_Mobile_Num_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, Bank details & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, Bank details & GST num")
	public void validate_the_entered_Mobile_Num_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, PAN num & VAT num")
	public void validate_the_entered_Mobile_Num_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, PAN num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, PAN num & GST num")
	public void validate_the_entered_Mobile_Num_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Country, VAT num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Country, VAT num & GST num")
	public void validate_the_entered_Mobile_Num_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, City, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Mobile_Num_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, City, Bank details & PAN num")
	public void validate_the_entered_Mobile_Num_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, City, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, City, Bank details & VAT num")
	public void validate_the_entered_Mobile_Num_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, City, Bank details & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, City, Bank details & GST num")
	public void validate_the_entered_Mobile_Num_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, City, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, City, PAN num & VAT num")
	public void validate_the_entered_Mobile_Num_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, City, PAN num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, City, PAN num & GST num")
	public void validate_the_entered_Mobile_Num_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, City, VAT num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, City, VAT num & GST num")
	public void validate_the_entered_Mobile_Num_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Mobile_Num_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Bank details, PAN num & VAT num")
	public void validate_the_entered_Mobile_Num_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Bank details, PAN num & GST num")
	public void validate_the_entered_Mobile_Num_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, Bank details, VAT num & GST num")
	public void validate_the_entered_Mobile_Num_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Mobile Num, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Mobile_Num_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Mobile Num, PAN num, VAT num & GST num")
	public void validate_the_entered_Mobile_Num_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, Country & City")
	public void validate_the_save_button_by_entering_Email_ID_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, Country & City")
	public void validate_the_entered_Email_ID_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, Country & Bank details")
	public void validate_the_save_button_by_entering_Email_ID_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, Country & Bank details")
	public void validate_the_entered_Email_ID_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, Country & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, Country & PAN num")
	public void validate_the_entered_Email_ID_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, Country & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, Country & VAT num")
	public void validate_the_entered_Email_ID_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, Country & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, Country & GST num")
	public void validate_the_entered_Email_ID_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, City & Bank details")
	public void validate_the_save_button_by_entering_Email_ID_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, City & Bank details")
	public void validate_the_entered_Email_ID_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, City & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, City & PAN num")
	public void validate_the_entered_Email_ID_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, City & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, City & VAT num")
	public void validate_the_entered_Email_ID_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, City & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, City & GST num")
	public void validate_the_entered_Email_ID_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, Bank details & PAN num")
	public void validate_the_entered_Email_ID_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, Bank details & VAT num")
	public void validate_the_entered_Email_ID_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, Bank details & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, Bank details & GST num")
	public void validate_the_entered_Email_ID_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, PAN num & VAT num")
	public void validate_the_entered_Email_ID_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, PAN num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, PAN num & GST num")
	public void validate_the_entered_Email_ID_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Address, VAT num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Address, VAT num & GST num")
	public void validate_the_entered_Email_ID_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, City & Bank details")
	public void validate_the_save_button_by_entering_Email_ID_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, City & Bank details")
	public void validate_the_entered_Email_ID_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, City & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, City & PAN num")
	public void validate_the_entered_Email_ID_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, City & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, City & VAT num")
	public void validate_the_entered_Email_ID_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, City & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, City & GST num")
	public void validate_the_entered_Email_ID_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, Bank details & PAN num")
	public void validate_the_entered_Email_ID_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, Bank details & VAT num")
	public void validate_the_entered_Email_ID_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, Bank details & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, Bank details & GST num")
	public void validate_the_entered_Email_ID_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, PAN num & VAT num")
	public void validate_the_entered_Email_ID_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, PAN num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, PAN num & GST num")
	public void validate_the_entered_Email_ID_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Country, VAT num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Country, VAT num & GST num")
	public void validate_the_entered_Email_ID_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, City, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Email_ID_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, City, Bank details & PAN num")
	public void validate_the_entered_Email_ID_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, City, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, City, Bank details & VAT num")
	public void validate_the_entered_Email_ID_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, City, Bank details & GST num")
	public void validate_the_save_button_by_entering_Email_ID_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, City, Bank details & GST num")
	public void validate_the_entered_Email_ID_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, City, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, City, PAN num & VAT num")
	public void validate_the_entered_Email_ID_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, City, PAN num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, City, PAN num & GST num")
	public void validate_the_entered_Email_ID_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, City, VAT num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, City, VAT num & GST num")
	public void validate_the_entered_Email_ID_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Email_ID_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Bank details, PAN num & VAT num")
	public void validate_the_entered_Email_ID_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Bank details, PAN num & GST num")
	public void validate_the_entered_Email_ID_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, Bank details, VAT num & GST num")
	public void validate_the_entered_Email_ID_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Email ID, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Email_ID_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Email ID, PAN num, VAT num & GST num")
	public void validate_the_entered_Email_ID_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, City & Bank details")
	public void validate_the_save_button_by_entering_Address_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, City & Bank details")
	public void validate_the_entered_Address_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, City & PAN num")
	public void validate_the_save_button_by_entering_Address_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, City & PAN num")
	public void validate_the_entered_Address_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, City & VAT num")
	public void validate_the_save_button_by_entering_Address_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, City & VAT num")
	public void validate_the_entered_Address_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, City & GST num")
	public void validate_the_save_button_by_entering_Address_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, City & GST num")
	public void validate_the_entered_Address_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Address_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, Bank details & PAN num")
	public void validate_the_entered_Address_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Address_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, Bank details & VAT num")
	public void validate_the_entered_Address_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, Bank details & GST num")
	public void validate_the_save_button_by_entering_Address_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, Bank details & GST num")
	public void validate_the_entered_Address_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Address_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, PAN num & VAT num")
	public void validate_the_entered_Address_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, PAN num & GST num")
	public void validate_the_save_button_by_entering_Address_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, PAN num & GST num")
	public void validate_the_entered_Address_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Country, VAT num & GST num")
	public void validate_the_save_button_by_entering_Address_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Country, VAT num & GST num")
	public void validate_the_entered_Address_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, City, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Address_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, City, Bank details & PAN num")
	public void validate_the_entered_Address_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, City, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Address_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, City, Bank details & VAT num")
	public void validate_the_entered_Address_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, City, Bank details & GST num")
	public void validate_the_save_button_by_entering_Address_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, City, Bank details & GST num")
	public void validate_the_entered_Address_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, City, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Address_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, City, PAN num & VAT num")
	public void validate_the_entered_Address_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, City, PAN num & GST num")
	public void validate_the_save_button_by_entering_Address_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, City, PAN num & GST num")
	public void validate_the_entered_Address_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, City, VAT num & GST num")
	public void validate_the_save_button_by_entering_Address_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, City, VAT num & GST num")
	public void validate_the_entered_Address_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Address_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Bank details, PAN num & VAT num")
	public void validate_the_entered_Address_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_Address_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Bank details, PAN num & GST num")
	public void validate_the_entered_Address_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_Address_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, Bank details, VAT num & GST num")
	public void validate_the_entered_Address_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Address, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Address_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Address, PAN num, VAT num & GST num")
	public void validate_the_entered_Address_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, City, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Country_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, City, Bank details & PAN num")
	public void validate_the_entered_Country_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, City, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Country_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, City, Bank details & VAT num")
	public void validate_the_entered_Country_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, City, Bank details & GST num")
	public void validate_the_save_button_by_entering_Country_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, City, Bank details & GST num")
	public void validate_the_entered_Country_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, City, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Country_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, City, PAN num & VAT num")
	public void validate_the_entered_Country_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, City, PAN num & GST num")
	public void validate_the_save_button_by_entering_Country_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, City, PAN num & GST num")
	public void validate_the_entered_Country_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, City, VAT num & GST num")
	public void validate_the_save_button_by_entering_Country_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, City, VAT num & GST num")
	public void validate_the_entered_Country_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Country_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, Bank details, PAN num & VAT num")
	public void validate_the_entered_Country_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_Country_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, Bank details, PAN num & GST num")
	public void validate_the_entered_Country_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_Country_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, Bank details, VAT num & GST num")
	public void validate_the_entered_Country_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Country, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Country_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Country, PAN num, VAT num & GST num")
	public void validate_the_entered_Country_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a2);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering City, Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_City_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered City, Bank details, PAN num & VAT num")
	public void validate_the_entered_City_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a2);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering City, Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_City_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered City, Bank details, PAN num & GST num")
	public void validate_the_entered_City_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a2);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering City, Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_City_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered City, Bank details, VAT num & GST num")
	public void validate_the_entered_City_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a2);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering City, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_City_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered City, PAN num, VAT num & GST num")
	public void validate_the_entered_City_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a2);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Bank details, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Bank_details_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Partner Name is required!']")).getText();
		Assert.assertEquals("Partner Name is required!", a);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Contact Name is required!']")).getText();
		Assert.assertEquals("Contact Name is required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Bank details, PAN num, VAT num & GST num")
	public void validate_the_entered_Bank_details_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Mobile Num & Email ID")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Mobile Num & Email ID")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_Email_ID() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Mobile Num & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Mobile Num & Address")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}
		
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Mobile Num & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Mobile Num & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Mobile Num & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Mobile Num & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
		
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Mobile Num & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Mobile Num & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Mobile Num & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Mobile Num & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Mobile Num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Mobile Num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Mobile Num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Mobile Num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Mobile_Num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
		
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Email ID & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Email ID & Address")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Email ID & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
 		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Email ID & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Email ID & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Email ID & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Email ID & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Email ID & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Email ID & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Email ID & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Email ID & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
 		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Address & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Address & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Address & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Address & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Address & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Address & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Address & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
		
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Country & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Country & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Country & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Country & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Country & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, City & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, City & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, City & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, City & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Partner Moniker, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Partner_Moniker_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Partner Moniker, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Partner_Moniker_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//input[@placeholder='Partner Moniker']")).getAttribute("value");
		Assert.assertEquals("", a3);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Email ID & Address")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Email ID & Address")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Email_ID_Address() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Email ID & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Email ID & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Email_ID_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Email ID & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Email ID & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Email_ID_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Email ID & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Email ID & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Email_ID_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Email ID & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Email ID & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Email_ID_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Email ID & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Email ID & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Email_ID_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Email ID & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Email ID & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Email_ID_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Address & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Address & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Address & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Address & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Address & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Address & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Address & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Country & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Country & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Country & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Country & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Country & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, City & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, City & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, City & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, City & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Mobile Num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Mobile_Num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Mobile Num, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Mobile_Num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).getAttribute("value");
		Assert.assertEquals("", a4);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Address & Country")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Address & Country")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Address_Country() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Address & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Address & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Address_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Address & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Address & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Address_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Address & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Address & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Address_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Address & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Address & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Address_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Address & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Address & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Address_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a6);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Country & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Country & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Country & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Country & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Country & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, City & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, City & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, City & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, City & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Email ID, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Email ID, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Email_ID_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@placeholder='Email Address']")).getAttribute("value");
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, Country & City")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, Country & City")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Country_City() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, Country & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, Country & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Country_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, Country & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, Country & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Country_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, Country & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, Country & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Country_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, Country & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, Country & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Country_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, City & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, City & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, City & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, City & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Address, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Address, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Address_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//textarea)[1]")).getText();
		Assert.assertEquals("", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, City & Bank details")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, City & Bank details")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_City_Bank_details() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, City & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, City & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_City_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, City & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, City & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_City_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, City & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, City & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_City_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a7);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Country, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Country, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Country_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, City, Bank details & PAN num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, City, Bank details & PAN num")
	public void validate_the_entered_Partner_Name_Contact_Name_City_Bank_details_PAN_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, City, Bank details & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, City, Bank details & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_City_Bank_details_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, City, Bank details & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, City, Bank details & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_City_Bank_details_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, City, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, City, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_City_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, City, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, City, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_City_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, City, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, City, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_City_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[text()='Select'])[1]")).getText();
		Assert.assertEquals("Select", a5);
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[text()='Select'])[2]")).getText();
		Assert.assertEquals("Select", a8);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Bank details, PAN num & VAT num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Bank details, PAN num & VAT num")
	public void validate_the_entered_Partner_Name_Contact_Name_Bank_details_PAN_num_VAT_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Bank details, PAN num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Bank details, PAN num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Bank_details_PAN_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, Bank details, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, Bank details, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_Bank_details_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("(//textarea)[2]")).getText();
		Assert.assertEquals("", a9);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
	
	@Then("Validate the save button by entering Partner Name, Contact Name, PAN num, VAT num & GST num")
	public void validate_the_save_button_by_entering_Partner_Name_Contact_Name_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[text()='Min 2 alphabets are required!']")).getText();
		Assert.assertEquals("Min 2 alphabets are required!", a2);
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[text()='Email address is required!']")).getText();
		Assert.assertEquals("Email address is required!", a3);
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[text()='Mobile number is required!']")).getText();
		Assert.assertEquals("Mobile number is required!", a4);
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[text()='Country is required!']")).getText();
		Assert.assertEquals("Country is required!", a5);
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[text()='City is required!']")).getText();
		Assert.assertEquals("City is required!", a6);
		Thread.sleep(1000);
	}
	
	@Then("Validate the entered Partner Name, Contact Name, PAN num, VAT num & GST num")
	public void validate_the_entered_Partner_Name_Contact_Name_PAN_num_VAT_num_GST_num() throws InterruptedException {
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).getAttribute("value");
		Assert.assertEquals("", a1);
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@placeholder='Contact Name']")).getAttribute("value");
		Assert.assertEquals("", a2);
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//input[@placeholder='PAN']")).getAttribute("value");
		Assert.assertEquals("", a10);
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("//input[@placeholder='VAT']")).getAttribute("value");
		Assert.assertEquals("", a11);
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//input[@placeholder='GST']")).getAttribute("value");
		Assert.assertEquals("", a12);
		Thread.sleep(1000);
	}
}
