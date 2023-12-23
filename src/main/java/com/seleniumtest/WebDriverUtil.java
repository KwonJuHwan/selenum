package com.seleniumtest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class WebDriverUtil {
    private static final String WEB_DRIVER_PATH= "C:/chromedriver/chromedriver.exe";

    public static WebDriver getChromeDriver(){
        if (ObjectUtils.isEmpty(System.getProperty("webdriver.chrome.driver"))) {
            System.setProperty("webdriver.chrome.driver", WEB_DRIVER_PATH);
        }

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--lang=ko");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--disable-gpu");

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        return chromeDriver;

    }
    public static void quit(WebDriver driver) {
        if (!ObjectUtils.isEmpty(driver)) {
            driver.quit();
        }
    }

    public static void close(WebDriver driver) {
        if (!ObjectUtils.isEmpty(driver)) {
            driver.close();    	}
    }


}
