package lesson6;

import com.geekbrains.com.geekbrains.lesson6.FavoritePage;
import com.geekbrains.com.geekbrains.lesson7.CustomLoggerNew;
import com.geekbrains.com.geekbrains.lesson7.CustomLoggerThirdSelenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
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
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Iterator;


@Story(" my alone test")
public class LessonTest6FavoritePage<logEntries> {
    WebDriver driver;
   // EventFiringWebDriver eventFiringWebDriver;
    private final static String DRESS_URL = "https://1001dress.ru";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        //driver = new ChromeDriver();
       // eventFiringWebDriver= new EventFiringWebDriver(new ChromeDriver());
       // eventFiringWebDriver.register(new CustomLoggerThirdSelenium()); 3 selenium
        driver = new EventFiringDecorator( new CustomLoggerNew()).decorate(new ChromeDriver());
        driver.get(DRESS_URL);
    }

    @Test
    @Feature("Избранное")
    @Description("Проверка добавления в избранное")
    void likeBookmark() {
        new FavoritePage(driver)
                .checkBookmark();
    }

    @AfterEach
    void closeServer() {
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        Iterator<LogEntry> iterator = logEntries.iterator();

        while (iterator.hasNext()){
          Allure.addAttachment("Log of browser:",iterator.next().getMessage());
       }
       driver.quit();
    }

}
