package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class ZalandoAchat {
    public static void zalando(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.kibo.mg/");
        WebElement searchBar = driver.findElement(By.name("s"));
        searchBar.sendKeys("fromage");
        searchBar.submit();
        List<WebElement> searchResults = driver.findElements(By.className("product-miniature"));
        WebElement firstResult = searchResults.get(2);
        firstResult.click();

        driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).sendKeys("3");

        String texteTitre = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/h1")).getText();
        texteTitre = texteTitre.toLowerCase();
        if (texteTitre.contains("fromage")){
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[3]/div/div[2]/button")).click();
            try {
                Thread.sleep(5000); // Attendre 5 secondes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:/Users/inclu/OneDrive/Bureau/screanshootSelenium/screenshot.png");
        srcFile.renameTo(destFile);


    }
}
