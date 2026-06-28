package Window_handles;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program1 {

    public static void main(String[] args) throws InterruptedException {

        // Block Location Permission Popup
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.geolocation", 2); // Block

        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String pid=driver.getWindowHandle();
        Thread.sleep(5000);
        
        driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
        
        Set<String>cid=driver.getWindowHandles();
        Thread.sleep(2000);
        
        for(String i:cid)
        {
        	driver.switchTo().window(i);
        	
        	String title= driver.getTitle();
        	
        	System.out.println(title);
        }
        
        
        Thread.sleep(2000);
        
        driver.switchTo().window(pid);
        
        String ptitle =driver.getTitle();
        
        
        System.out.println(ptitle);
        Thread.sleep(2000);
        
        
        driver.quit();
    }
}