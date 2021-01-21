package by.kufar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "f:\\Job\\Java\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test start");
    }

    @Test
    public void firstTest() {

        driver.get("https://www.kufar.by/listings");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Куфар в Беларуси - доска бесплатных объявлений | Барахолка в Беларуси"));

    }
    @Test
    public void firstTest2() {

        driver.get("https://www.kufar.by/listings");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Куфар в Беларуси - доска бесплатных объявлений | Барахолка в Беларуси"));

    }

    @After
    public void close() {
        System.out.println("Test closed");
        driver.quit();
    }
}
