package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:/Users/msbil/Documents/selennıum dependencıes/drivers/chromedriver.exe");

            // selenyum ile ilgili ilk kodumuz
            //webdriver nesnesi olusturarak chrome driver ikullanilabilir hale getirdik

            WebDriver webDriver = new ChromeDriver();


// driver'ımıza google.com'a gitmesini söyledik.
            webDriver.get("https://google.com");
//driverımızda açık olan pencereyi kapatır.
//webDriver.close();
//driverımı komple kapatıyor
            webDriver.quit();


        }
    }



