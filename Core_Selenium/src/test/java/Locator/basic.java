package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://automationwithpiyush.vercel.app/locators.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("user_login_field")).sendKeys("Piyush chaubey");
		Thread.sleep(2000);
		driver.findElement(By.name("security_passphrase")).sendKeys("piyush");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Reset Password")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
