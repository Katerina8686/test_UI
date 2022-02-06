package lesson6;

import com.geekbrains.com.geekbrains.lesson6.FavoritePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LessonTest6FavoritePage {
    WebDriver driver;
    //EventFiringWebDriver eventFiringWebDriver;
    private final static String DRESS_URL = "https://1001dress.ru";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        //driver = new ChromeDriver();
        //eventFiringWebDriver = new EventFiringWebDriver(new ChromeDriver());
        //eventFiringWebDriver.register(new CustomLoggerThirdSelenium());   3 selenium
        driver = new ChromeDriver();
        driver.get(DRESS_URL);
    }

    @Test
    void likeBookmark() {
        new FavoritePage(driver)
                .checkBookmark();
    }
}
