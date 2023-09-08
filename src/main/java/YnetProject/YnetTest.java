package YnetProject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static java.lang.Thread.sleep;

public class YnetTest {
    SeleniumBaseForTestngProjects base = new SeleniumBaseForTestngProjects();

    @Test
    public void HomePageAndFont() throws InterruptedException {
        ChromeDriver driver = base.SeleniumInIt("https://www.ynet.co.il/home/0,7340,L-8,00.html");
        System.out.println("HomePage enter successfully");
        WebElement mainTitle = driver.findElement(By.xpath("/html/body/div[11]/div/div/div[1]/div[5]/div[4]/div/div/div/div/div/div[1]/a/h1/span"));
        String fontSize = mainTitle.getCssValue("font-size");
        System.out.println("Fontsize : " + fontSize);
        sleep(2000);
        driver.close();
        System.out.println("HomePage + font test end");
    }

    @Test
    public void MainMenuTestLoop() throws InterruptedException {
        ChromeDriver driver = base.SeleniumInIt("https://www.ynet.co.il/home/0,7340,L-8,00.html");

        List<WebElement> mainMenus = driver.findElements(By.cssSelector(".mainNav a"));

        for (int i = 1; i < mainMenus.size(); i++) {
            try {
                List<WebElement> refreshedMainMenus = driver.findElements(By.cssSelector(".mainNav a")); // Re-fetch elements
                WebElement mainMenu = refreshedMainMenus.get(i);
                mainMenu.click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
                try {
                    // Removing the error messages from run console
                } catch (Exception e) {
                    String errorMessage = e.getMessage();
                    if (errorMessage == null || (!errorMessage.contains("unknown error: cannot determine loading status") && !errorMessage.contains("stale element reference: stale element not found"))) {
                    }
                }
                sleep(3000);
                driver.navigate().back();
                System.out.println("Menu item " + (i) + " enter successfully");
            } catch (Exception e) {
                System.out.println("Error occurred while processing menu item " + (i) + ": " + e.getMessage());
            }
        }
        WebElement mainMenuMore = driver.findElement(By.id("wcm_MenuDisplay_moreBtn"));
        mainMenuMore.click();
        sleep(5000);
        System.out.println("Menu item 14 enter successfully");
        WebElement imgElement = driver.findElement(By.cssSelector("img[src='https://ynet-pic1.yit.co.il/picserver5/wcm_upload/2021/06/02/BylDa46E900/ynet_menu_logo_2x.png']"));
        imgElement.click();
        System.out.println("Logo is clickable");
        sleep(3000);
        driver.close();
        System.out.println("MainMenuTestLoop end");
    }
}
