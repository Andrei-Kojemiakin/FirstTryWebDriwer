package by.kufar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {

        driver.get("https://www.kufar.by/listings");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Куфар в Беларуси - доска бесплатных объявлений | Барахолка в Беларуси"));

        System.out.println("Тест-1 прошёл");

    }
    @Test
    public void firstTest2() {

        driver.get("https://www.kufar.by/listings");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Куфар в Беларуси - доска бесплатных объявлений | Барахолка в Беларуси"));

        System.out.println("Тест-2 прошёл");

    }


}
