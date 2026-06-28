package Web_Elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Thread.sleep(2000);
		
		Alert a= driver.switchTo().alert();
		String text =a.getText();
		System.out.println(text);
		a.accept();
		
		Thread.sleep(2000);
		//======================================================================
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Alert a2= driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		String  text2= a2.getText();
		System.out.println(text2);
		
		a2.accept();
		
		Thread.sleep(2000);
		//======================================================================
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Thread.sleep(2000);
		
		Alert a3= driver.switchTo().alert();
		
		String text3=a3.getText();
		System.out.println(text3);
		
		
		a3.dismiss();
		
		Thread.sleep(2000);
		//======================================================================
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Thread.sleep(2000);
		
		Alert s4= driver.switchTo().alert();
		
		String text4=s4.getText();
		System.out.println(text4);
		
		s4.sendKeys("piyush chaubey");
		Thread.sleep(3000);;
		s4.accept();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
