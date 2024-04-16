package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wordCloudTest {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qawordcloud.ccbp.tech/");
        WebElement input = driver.findElement(By.xpath("/html/body/div/div[2]/div/input"));
        input.sendKeys("light");
        WebElement add = driver.findElement(By.xpath("/html/body/div/div[2]/div/button"));
        add.click();
        input.clear();
        input.sendKeys("flight");
        add.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
