package Web_Elements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {
	public static void main(String[] args) throws InterruptedException {
		
     WebDriver driver =new ChromeDriver();
     
     driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
     Thread.sleep(2000);
     String pid= driver.getWindowHandle(); // base window ,  address
     
     driver.findElement(By.linkText("Meta Store")).click();
     
     Set<String> cid= driver.getWindowHandles(); // child  windows address
     Thread.sleep(2000);
     
     for(String s:cid)	 
     {
    	   driver.switchTo().window(s);
		   
 		  String title= driver.getTitle();
 		  
 		  if(title.contains("Pay"))
 		  {
 			  break;
 			  
 		  }
 		   
 	   }
     
     
     
     driver.findElement(By.xpath("//div[@aria-label ='Search Meta Store']")).click();
     
     Thread.sleep(2000);
     
    
	}

}
