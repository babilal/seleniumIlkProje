package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    // 1 - ilk önce google.com'a gidiniz.
    // 2 - oradan youtube.com'a gidiniz.
    // 3 - google.com'a back methodu ile geri dönünüz.
    // 4 - youtube.com'a geri giniz.(forward methodu ile)
    // 5 - youtube.com'u yenileyiniz (refresh methodu ile)



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/msbil/Documents/selennıum dependencıes/drivers/chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();

    webDriver.get("https://google.com");
        webDriver.navigate().to("https://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();




    }





}
