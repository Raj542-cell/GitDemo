import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class locators {
    public static void main ( String[] args ) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
//       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://rahulshettyacademy.com/locatorspractice/");
       driver.findElement(By.id("inputUsername")).sendKeys("Raj");
       driver.findElement(By.name("inputPassword")).sendKeys("Raj@123");
       driver.findElement(By.className("submit")).click();
//       driver.close();
        System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
//        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
//        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Raj");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Raj@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
        System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("Raj");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]")).getText(),"You are successfully logged in.");
        System.out.println(driver.findElement(By.xpath("//h2")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(),"Hello Raj,");

        driver.findElement(By.xpath("//button[@class='logout-btn']")).click();




    }
}
