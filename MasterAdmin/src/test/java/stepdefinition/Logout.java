package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;

public class Logout {
	WebDriver driver;

	public Logout(WebDriver driver) {
		this.driver = driver;
	}

	@And("User Clicked on logout")
	public void User_Clicked_on_logout() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Logout']")).click();
		Thread.sleep(2000);

	}

}
