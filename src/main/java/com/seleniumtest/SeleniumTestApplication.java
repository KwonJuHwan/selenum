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

    public static void main(String[] args) throws InterruptedException {
        WebDriver chromeDriver = WebDriverUtil.getChromeDriver();
        WebElement title;
        String detailUrl = "https://linkareer.com/activity/159112";
        String listUrl = "https://linkareer.com/list/activity";

        chromeDriver.get(listUrl);
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> elements = chromeDriver.findElements(By.className("image-link"));
        WebElement titleLink = elements.get(0);
        titleLink.click();

        Thread.sleep(1000);

        String currentUrl = chromeDriver.getCurrentUrl();
        System.out.println(currentUrl);

        title = chromeDriver.findElement(By.className("title"));
        System.out.println(title.getText());
        chromeDriver.quit();

//        if (!ObjectUtils.isEmpty(chromeDriver)) {
//            chromeDriver.get(detailUrl);
//            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            title = chromeDriver.findElement(By.className("recruitText"));
//            System.out.println(title.getText());
//            WebElement element = chromeDriver.findElement(
//                By.xpath("//*[@id=\"__next\"]/div[1]/div/main/div/article/div[1]/div/div/h1"));
//            System.out.println(element.getText());
//            chromeDriver.quit();
//
//        }

    }

}
