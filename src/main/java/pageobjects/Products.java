package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {
	
	WebDriver driver;
	
	public Products( WebDriver driver) {
		this.driver = driver;
		
	}
		 
	public void productspg() {
		
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
		driver.findElement(By.id("add-to-cart")).click();
	}
	
	
}
