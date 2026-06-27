package Web_Elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modals_and_Popups {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		// JS Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(2000);

		Alert a = driver.switchTo().alert();

		System.out.println(a.getText());

		a.accept();


		// JS Confirm - OK
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		a = driver.switchTo().alert();

		System.out.println(a.getText());

		a.accept();


		// JS Confirm - Cancel
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		a = driver.switchTo().alert();

		System.out.println(a.getText());

		a.dismiss();


		// JS Prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		a = driver.switchTo().alert();

		System.out.println(a.getText());

		a.sendKeys("Piyush");

		a.accept();
		
		Thread.sleep(3000);
	}

}
