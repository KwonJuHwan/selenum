package com.seleniumtest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ObjectUtils;

@SpringBootApplication
public class SeleniumTestApplication {

    public static void main(String[] args) {
        WebDriver chromeDriver = WebDriverUtil.getChromeDriver();
        WebElement title;
        String url = "https://linkareer.com/activity/159112";
        String query = "crossorigin";

        if (!ObjectUtils.isEmpty(chromeDriver)) {
            chromeDriver.get(url);
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            title = chromeDriver.findElement(By.className("title"));
            System.out.println(title.getText());
            WebElement element = chromeDriver.findElement(
                By.xpath("//*[@id=\"__next\"]/div[1]/div/main/div/article/div[1]/div/div/h1"));
            System.out.println(element.getText());
            chromeDriver.quit();

        }

    }

}
