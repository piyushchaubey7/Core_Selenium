package Web_Elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modals_and_Popups {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		
    	Alert alert = driver.switchTo().alert();
    	
    	Thread.sleep(2000);
		

		// Alert Text
		System.out.println(alert.getText());

		// Accept
		alert.accept();

		/*// Dismiss
		alert.dismiss();

		// Prompt
		alert.sendKeys("Piyush");
		alert.accept();
		*/
		
		Thread.sleep(2000);
	}

}
