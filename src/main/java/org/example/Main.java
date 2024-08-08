package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.setProperty("webdriver.gecko.driver","C://Users//bhupathib//Documents//geckodriver.exe");

        WebDriver driver = new ChromeDriver();
        EdgeDriver driver1 = new EdgeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.close();
        driver1.get("https://www.google.com");
        driver1.close();


    }
}