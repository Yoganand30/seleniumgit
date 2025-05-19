package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("login_field")).sendKeys("Yoganand30");
        driver.findElement(By.id("password")).sendKeys("Yoganand@1234");
        driver.findElement(By.name("commit")).click();
    }
}
