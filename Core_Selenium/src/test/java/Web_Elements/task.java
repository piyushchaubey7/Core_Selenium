package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label ='Google apps']")).click();
		
		 
        driver.switchTo().frame(
            driver.findElement(By.xpath("//iframe[@role='presentation']"))
        );
        
        Thread.sleep(3000);

        
        driver.findElement(By.xpath("//span[text()='YouTube']")).click();
        
        Thread.sleep(10000);

        driver.quit();
        
        

		
	}

}
