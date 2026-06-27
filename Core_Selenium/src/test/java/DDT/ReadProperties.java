package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    public static void main(String[] args) throws IOException {

        // File ka path
        FileInputStream fis =
                new FileInputStream("src/test/resources/config.properties");

        // Properties object
        Properties prop = new Properties();
        
       

        // Load file
        prop.load(fis);

        // Read data
        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        // Print data
        System.out.println("Browser : " + browser);
        System.out.println("URL : " + url);
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);

        fis.close();
    }
}