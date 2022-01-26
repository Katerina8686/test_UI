package com.geekbrains.com.geekbrains;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KinoPoiskTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://1001dress.ru/all-dresses");
        driver.findElement(By.xpath("//a[@href='/coats'] [@class='header__subnav-item  ']")).click();
        driver.findElement(By.xpath("//img[@itemprop='image'] [@alt='Жилет бордовый " +
                "стеганый']/ancestor::div[@class='card__slide swiper-slide swiper-slide-active']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='delay_btn']")).click();
        Thread.sleep( 5000);
        driver.quit();
        // Я изначально делала тест на КиноПоиске, но там у меня сначала начали возникать ситуации с тем,что
        // сначала мой тестовый аккаунт заблочили, потом через раз стали  присылать капчу, но самая основная
        // проблема была в том, что когда я зохидила в браузер сама, т.е.без автотеста там на главной странице меню
        // было отображенно всё наполнение меню срузу, т.е.элементы были все визуализированны, а когда запускается
        // тест, там
        // нужно мышку пододвинуть к определенной картинке, чтобы список появился, короче я с этим мучалась мучалась
        // при этом что у меня каждый раз стало всплывать окно ссообщением "похоже вы не человек"
        // я стала пытыться реализовывать другие тестовые сценарии на КиноПоиске, т.е. чтобы отпала необходимость
        // взаимодействовать с меню, пытылась на главной странице работать с кнопкой, которая запускает просмотор
        //  того фильма который сейчас на главном банере, сценарий неплохо отрабатывал, но тут до меня дошло,
        // что возможно когда Вы будете проверять ДЗ фильм на главном банере будет другой и сценарий станет неактуальным
        // третий сценарий тоже на КиноПоиске пыталась тестировать возможность кпопку "попробывать плюс"
        // но там на последнем шаге тоже возникала сложность почему-то не происходил клик, корочее я это все пишу,
        // чтобы пояснить почему у меня class KinoPoiskTest называется, внизу закоментированные строки кода, с
        // которым я возилас, вообщем времени не остпвалось и я решила по-быстрому какой-то простецкий сайт взять
        //и написать тест, как то так)))))


        //WebDriverWait WebDriverWait = new WebDriverWait(driver , 5);//Selenium3
        //WebDriverWait webDriverWait = new WebDriverWait(driver , Duration.ofSeconds(7));
       // WebElement loginButton = driver.findElement(By.xpath("//button[.='Войти']"));
        //loginButton.click();
        //driver.findElement(By.xpath("//button[.='Войти']")).click();
        //driver.findElement(By.id("passp-field-login")).sendKeys("test1testka@yandex.ru");
        //driver.findElement(By.xpath("//button[@id='passp:sign-in']")).click();
        //Thread.sleep( 2000);
        //webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By.id("passp-field-passwd"))));
        //driver .findElement(By.id("passp-field-passwd")).sendKeys( "test11test");
       // driver.findElement(By.id("passp:sign-in")).click();
        //Thread.sleep(3000);
       // webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath
        // ("//button[@data-t='button:action']"))));
        //Thread.sleep( 2000);
       // driver.findElement(By.xpath("//button[@data-t='button:action']")).click();
        //Thread.sleep( 10000);
       // driver.findElement(By.xpath("//a[.='Попробовать Плюс']")).click();
       // Thread.sleep(3000);
       // driver.findElement(By.xpath("//span[@class='Button__inner--25lVW']")).click();
        //driver.findElement(By.xpath("//a[.='Фильмы'][@href='/lists/films/1/']")).click();

        //Thread.sleep( 7000);
       //driver.quit();

    }
}
