package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

        Thread.sleep(3000);

        driver.switchTo().frame("mce_0_ifr");

        driver.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("tinymce")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("tinymce")).sendKeys("Hello Piyush");

        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}