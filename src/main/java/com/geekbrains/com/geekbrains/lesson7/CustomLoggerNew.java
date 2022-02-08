package com.geekbrains.com.geekbrains.lesson7;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import java.io.ByteArrayInputStream;

public class CustomLoggerNew implements WebDriverListener {
    public void beforeClick(WebElement element) {
        System.out.println("Before click");
        Allure.step("Going to click"+ element.getText());
    }

    public void beforeQuit(WebDriver driver) {
        Allure.addAttachment("ScreenShot page",
                new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));

    }
}
