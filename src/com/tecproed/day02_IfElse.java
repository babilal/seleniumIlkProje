package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_IfElse {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/msbil/Documents/selennıum dependencıes/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        //countains --- bir kelimenin bir yazi+


        String amazonTittle =driver.getTitle();

        if (amazonTittle.contains ("car")) {
            System.out.println("car kelimesini iceriyor");
        }else{
            System.out.println("car kelimesini icermiyor");

        }
           driver.quit();

    }


}
