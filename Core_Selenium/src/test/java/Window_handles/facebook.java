package Window_handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String pid=driver.getWindowHandle(); //homepage /base  id /address return
		System.out.println(pid);
		
		driver.findElement(By.linkText("Meta Store")).click();
		
		Set<String> cid=driver.getWindowHandles(); // return all window address 
		
		for(String i:cid)
		{
			driver.switchTo().window(i);
			
			String title=driver.getTitle();
			
			if(title.contains("Meta Store"))
			{
				break;
			}
		}
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//span[text()='Shop']")).click();
		Thread.sleep(4000);
		
		
		
		driver.switchTo().window(pid);
		Thread.sleep(3000);
		String ptitle=driver.getTitle();
		
		System.out.println(ptitle);
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		
		
	
		
		
		driver.quit();
		
		
	}

}
