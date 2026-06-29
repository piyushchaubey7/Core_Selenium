package ScreenShort;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWithDateTime {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();

        // Current Date & Time
        String timeStamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss"));

        // Take Screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String path = System.getProperty("user.dir") + "\\Screenshots";

        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        File destination = new File(path + "\\Screenshot_" + timeStamp + ".png");

        Files.copy(source, destination);
        System.out.println("Screenshot Saved Successfully");
        System.out.println("Location: " + destination.getAbsolutePath());

        driver.quit();
    }
}