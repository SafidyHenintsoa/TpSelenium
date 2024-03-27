package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //WebDriver driver = new ChromeDriver();

       // driver.get("https:google.com");
        //WebElement searchBar = driver.findElement(By.name("q"));
        //searchBar.sendKeys("inclusiv academy");
        //searchBar.submit();
        //driver.findElement(By.cssSelector("h3")).click();

        //driver.quit();

        ZalandoAchat.zalando();
    }
}