package lesson6;

import com.geekbrains.com.geekbrains.lesson6.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringDecorator;

import java.util.Iterator;

public class LessonTest6LoginPage {
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
        new LoginPage(driver)
                .checkBookmark();
    }
}
