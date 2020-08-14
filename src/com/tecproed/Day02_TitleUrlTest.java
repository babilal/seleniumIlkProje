package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    public static void main(String[] args) {


                System.setProperty("webdriver.chrome.driver", "C:/Users/msbil/Documents/selennıum dependencıes/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.get("http://youtube.com");

String sayfabasligi = driver.getTitle();
if (sayfabasligi.contains("video")){
    System.out.println("video kelimesi var");
}else{
        System.out.println("video kelimesi yok") ;

    }
driver.quit();
}}
