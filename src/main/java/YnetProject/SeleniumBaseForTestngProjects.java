package YnetProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SeleniumBaseForTestngProjects {
    public ChromeDriver SeleniumInIt(String url) {
        System.out.println("Starting test :");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*"); //fix for chrome driver version 111
        WebDriverManager.chromedriver();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));

        driver.get(url);
        return driver;
    }
    public void seleniumClose(ChromeDriver driver) {
        driver.close();
    }

}
