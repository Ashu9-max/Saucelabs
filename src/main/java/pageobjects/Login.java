package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
	
	this.driver=driver;
	
	}
	
	public void loginpg(String username, String password) {
	
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.className("submit-button")).click();
		
	}
	}
	


