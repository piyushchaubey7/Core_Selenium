package Web_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class  GUI_Input_Forms{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationwithpiyush.vercel.app/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[text()='Web Elements']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Piyush Chaubey");
		
		driver.findElement(By.id("email")).sendKeys("Piyush9026@gmail.com");
		
		driver.findElement(By.id("address")).sendKeys("Varanasi");
		
		// radio button
		
		driver.findElement(By.xpath("//input[@value='male']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Female']")).click();
		
		Thread.sleep(2000);
		//==============================================================
		// checkbox
		
		driver.findElement(By.id("sunday")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("monday")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Tuesday']")).click();
		
		
		// ==========================================================
		
		//DropDown
		
		WebElement dropdown =driver.findElement(By.id("country"));
		Select option= new Select(dropdown);
		// Select by visible Text
		
		option.selectByVisibleText("India");
		
		Thread.sleep(2000);
		// select by indexing
		
		option.selectByIndex(3);
		
		Thread.sleep(2000);
		
		// Select by value
		
		option.selectByValue("uk");
		
		Thread.sleep(1000);
		
		// Retrive All Options===
		List<WebElement>options=option.getOptions();
		
		for(WebElement op:options)
		{
			String value=op.getText();
			
			System.out.println(value);
			
			if(value.equals("China"))
			{
				op.click();
				break;
			}
		}
		
		
		Thread.sleep(2000);
		
		
		//============================================
		
		
		// date picker
//		String day = "15";
//		String month = "January";
//		String year = "2028";
		
		
		//driver.findElement(By.id("datepicker")).sendKeys("15-08-2002");
		
		
		driver.findElement(By.id("datepicker"))
	      .sendKeys("07-12-2002", Keys.TAB);
/*
		while(true)
		{
		    String actual =
		    driver.findElement(By.className("ui-datepicker-title")).getText();

		    if(actual.equals(month + " " + year))
		    {
		        break;
		    }

		    driver.findElement(By.xpath("//span[text()='Next']")).click();
		}

		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
*/
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("submit-btn")).click();
		Thread.sleep(2000);
		
		
		
		driver.quit();
		
	}

}
