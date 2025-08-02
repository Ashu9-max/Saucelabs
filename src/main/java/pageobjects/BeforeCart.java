package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeforeCart {

	WebDriver driver;
	
	public BeforeCart(WebDriver driver) {
		
		this.driver=driver;	
	}
	
	public void beforecart() {
		
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
		
	}
	
	
}
