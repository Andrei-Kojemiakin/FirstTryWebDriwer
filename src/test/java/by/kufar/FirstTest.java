package by.kufar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "f:\\Job\\Java\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.kufar.by/listings");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Куфар в Беларуси - доска бесплатных объявлений | Барахолка в Беларуси"));


        driver.quit();
    }

}
