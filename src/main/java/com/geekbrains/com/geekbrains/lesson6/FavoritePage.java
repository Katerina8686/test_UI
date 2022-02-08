package com.geekbrains.com.geekbrains.lesson6;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

public class FavoritePage extends BasePage {

    public FavoritePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//nav//ul//li//a[@href='/plus-size']")
    private WebElement plus;
//    @FindBy(xpath = "//img[@class='js-fit'] [@alt='Платье-футляр зеленое с имитацией " +
//            "запаха']/ancestor::div[@class='card__slide swiper-slide swiper-slide-active']")
//    private WebElement dress;
//    @FindBy(xpath = "//a[@id='delay_btn']")
//    private WebElement bookmark;

    @Step("Проверить закладку")
    public void checkBookmark() {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//nav//ul//li//a[@href='/plus-size']")));
        plus.click();

        driver.findElement(By.xpath("//img[@class='js-fit'] [@alt='Платье-футляр зеленое с имитацией " +
                "запаха']/ancestor::div[@class='card__slide swiper-slide swiper-slide-active']")).click();
        WebElement we =driver.findElement(By.xpath("//a[@id='delay_btn']"));
        we.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement we2 = driver.findElement(By.xpath("//a[.='В избранном']"));
        assertThat(we2, isDisplayed());
    }
}
