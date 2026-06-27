package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {
	
	public static void main(String[] arg) throws InterruptedException
	
	{
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://automationwithpiyush.vercel.app/index.html");
		
		
		driver.findElement(By.xpath("//h4[text()='Locators']")).click();
		
		
		Thread.sleep(7000);
		
		// Core Locators 
		driver.findElement(By.id("user_login_field")).sendKeys("Piyush Chaubeuy");
		driver.findElement(By.name("security_passphrase")).sendKeys("Piyush123");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.linkText("Reset Password")).click();
		driver.findElement(By.linkText("Logout User: John Doe")).click();
		driver.findElement(By.linkText("Help Center")).click();
		
		// CSS  Selectors 
		
		driver.findElement(By.cssSelector("#employee-id-input")).sendKeys("Piyush Chaubey");
		driver.findElement(By.cssSelector(".verify-status-btn")).click();
		String  p1= driver.findElement(By.cssSelector(".parent-wrapper > .target-child ")).getText();
		System.out.println(p1);
		driver.findElement(By.cssSelector("input[placeholder='Access Code']")).sendKeys("1234");
		
		//Xpath
		
		String p2= driver.findElement(By.xpath("//p[text()='Navigation Point']")).getText();
		System.out.print(p2);
		
		driver.findElement(By.xpath("//input[@aria-label='search-query']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[text()='Generate Report']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//button[text()='Submit Order 2026']")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox' and @name='user_check'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox' and @name='user_check'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='edit-btn'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='edit-btn'])[1]")).click();
		 
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
