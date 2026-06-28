package ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationwithpiyush.vercel.app/elements.html");
		
		Actions act = new Actions(driver);
		
		
		
	}

}
