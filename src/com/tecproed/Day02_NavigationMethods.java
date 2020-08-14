package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        // java projemize chrome driver i tanittik
        System.setProperty("webdriver.chrome.driver", "C:/Users/msbil/Documents/selennıum dependencıes/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        // driver e google  a gitmesini soyledik
        webDriver.get("https://google.com");
        //get komutu ile ayni ilsemi yapar
        webDriver.navigate().to("https://amazon.com");

        // navigate().back() komutu  bir onceki sayfaya gider
        webDriver.navigate().back();
        //   navigate().forward(); metodu geri  geldigimiz sayfaya ileri yonde gitmeyi saglar
        webDriver.navigate().forward();
        //navigate().refresh(); sayfayi yenilemeye yariyor
        webDriver.navigate().refresh();





    }
}
