package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.function.BooleanSupplier;

public class LessonTest5 {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private final static String Dress_URL="https://1001dress.ru";

    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void initDriver() {
      driver= new ChromeDriver();
      webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
      actions = new Actions(driver);
      driver.get(Dress_URL);
    }

    @Test
    void addDressInFavorite() throws InterruptedException {
        driver.findElement(By.xpath("//nav//ul//li//a[@href='/plus-size']")).click();
        driver.findElement(By.xpath("//img[@class='js-fit'] [@alt='Платье-футляр зеленое с имитацией " +
                "запаха']/ancestor::div[@class='card__slide swiper-slide swiper-slide-active']")).click();
        WebElement we =driver.findElement(By.xpath("//a[@id='delay_btn']"));
        we.click();
        //webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='В избранном']"));
        Thread.sleep(4000);
        WebElement we2 = driver.findElement(By.xpath("//a[.='В избранном']"));
        Assertions.assertTrue(we2 != null);

    }
   //Не смогла правильно прописать webDrierWait пробовала несколко разных способов, но тест всеравно
    // падал, можно будет пояснить в чем я ошиблась.



    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
