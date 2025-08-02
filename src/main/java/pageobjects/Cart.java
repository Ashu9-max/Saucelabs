package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {

WebDriver driver;

public Cart(WebDriver driver) {
	
	this.driver = driver;
}

public void cartt() {
	
	driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
	
}

}
