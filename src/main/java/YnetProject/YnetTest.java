package YnetProject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static java.lang.Thread.sleep;

public class YnetTest {
    SeleniumBaseForTestngProjects base = new SeleniumBaseForTestngProjects();
    @Test
    public void HomePageAndFont() throws InterruptedException {
        ChromeDriver driver =  base.SeleniumInIt("https://www.ynet.co.il/home/0,7340,L-8,00.html");
        System.out.println("HomePage enter successfully");
        WebElement mainTitle = driver.findElement(By.xpath("/html/body/div[11]/div/div/div[1]/div[5]/div[4]/div/div/div/div/div/div[1]/a/h1/span"));
        String fontSize = mainTitle.getCssValue("font-size");
        System.out.println("Fontsize : "+ fontSize);
        sleep(2000);
        driver.close();
        System.out.println("HomePage + font test end");
    }

    /*
    //For loop fail in the second iterate
    @Test
    public void MainMenuTestLoop() throws InterruptedException {
        ChromeDriver driver = base.SeleniumInIt("https://www.ynet.co.il/home/0,7340,L-8,00.html");

        List<WebElement> mainMenus = driver.findElements(By.cssSelector(".mainNav a"));
        int menuCount = mainMenus.size();

        for (int i = 1; i <= menuCount; i++) {
            WebElement mainMenu = mainMenus.get(i);
            mainMenu.click();
            sleep(2000);
            driver.navigate().back();
            System.out.println("Menu item " + i + " enter successfully");
        }

        WebElement mainMenuMore = driver.findElement(By.id("wcm_MenuDisplay_moreBtn"));
        mainMenuMore.click();
        sleep(2000);

        driver.close();
        System.out.println("MainMenuTest end");
    }*/

    @Test
    public void MainMenuTest() throws InterruptedException {
        ChromeDriver driver =  base.SeleniumInIt("https://www.ynet.co.il/home/0,7340,L-8,00.html");
        List<WebElement> mainMenus1 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu1 = mainMenus1.get(1);
        mainMenu1.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("Ynet+ enter successfully");
        List<WebElement> mainMenus2 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu2 = mainMenus2.get(2);
        mainMenu2.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("News enter successfully");
        List<WebElement> mainMenus3 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu3 = mainMenus3.get(3);
        mainMenu3.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("24/7 enter successfully");
        List<WebElement> mainMenus4 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu4 = mainMenus4.get(4);
        mainMenu4.click();
        sleep(5000);//time to load the page
        WebElement imgElement = driver.findElement(By.cssSelector("img[src='https://ynet-pic1.yit.co.il/picserver5/wcm_upload/2021/06/02/BylDa46E900/ynet_menu_logo_2x.png']"));
        imgElement.click();
        System.out.println("Logo is clickable");
        System.out.println("Podcasts enter successfully");
        List<WebElement> mainMenus5 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu5 = mainMenus5.get(5);
        mainMenu5.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("Sport enter successfully");
        List<WebElement> mainMenus6 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu6 = mainMenus6.get(6);
        mainMenu6.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("Economy enter successfully");
        List<WebElement> mainMenus7 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu7 = mainMenus7.get(7);
        mainMenu7.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("Entertaiment enter successfully");
        List<WebElement> mainMenus8 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu8 = mainMenus8.get(8);
        mainMenu8.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("Pplus enter successfully");
        List<WebElement> mainMenus9 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu9 = mainMenus9.get(9);
        mainMenu9.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("Health enter successfully");
        List<WebElement> mainMenus10 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu10 = mainMenus10.get(10);
        mainMenu10.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("Wheels enter successfully");
        List<WebElement> mainMenus11 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu11 = mainMenus11.get(11);
        mainMenu11.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("Digital enter successfully");
        List<WebElement> mainMenus12 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu12 = mainMenus12.get(12);
        mainMenu12.click();
        sleep(5000);//time to load the page
        driver.navigate().back();
        System.out.println("Laisha enter successfully");
        List<WebElement> mainMenus13 = driver.findElements(By.cssSelector(".mainNav a"));
        WebElement mainMenu13 = mainMenus13.get(13);
        mainMenu13.click();
        sleep(5000); //time to load the page
        driver.navigate().back();
        System.out.println("Food enter successfully");
        WebElement mainMenus14 = driver.findElement(By.id("wcm_MenuDisplay_moreBtn"));
        mainMenus14.click();
        sleep(5000);//time to load the page
        driver.close();
        System.out.println("MainMenuTest end");

    }
}
