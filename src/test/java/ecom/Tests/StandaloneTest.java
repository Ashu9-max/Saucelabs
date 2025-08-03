package ecom.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.BeforeCart;
import pageobjects.Cart;
import pageobjects.Login;
import pageobjects.Products;

public class StandaloneTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		Login ln = new Login(driver);
		ln.loginpg("visual_user", "secret_sauce");
		
		Thread.sleep(4000);//piyu
		Products pd = new Products(driver);
		pd.productspg();
		
		BeforeCart bc = new BeforeCart(driver);
		bc.beforecart();
		
		Cart ct = new Cart(driver);
		ct.cartt();
		
		
		
		
		//Adding backpack to cart
		
		//
		//driver.findElement(By.className("shopping_cart_link")).click();
		/*
		driver.findElement(By.id("first-name")).sendKeys("Ashutosh");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Medge");
		driver.findElement(By.xpath("//input[@data-test='postalCode']")).sendKeys("400067");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		driver.findElement(By.id("finish")).click();
		
		WebElement element = driver.findElement(By.xpath("//h2[@data-test='complete-header']")); 
		Assert.assertTrue(true, "Thank you for your order!");
		
		driver.findElement(By.className("btn")).click();*/
		
		
		
		
		
		

	}

	

}
