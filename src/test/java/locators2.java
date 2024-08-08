import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locators2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        methodsdemo2 password = new methodsdemo2();
        String pwd = password.getpassword(driver);
//        String pwd= getpassword(driver);
//        locators2 pwd = new locators2();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Raj");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
        driver.close();


    }

//    public static String getpassword() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
//        String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
////        Please use temporary password 'rahulshettyacademy' to Login.
//        String[] password1 = passwordText.split("'");
////       [0]= Please use temporary password
////        [1]= rahulshettyacademy' to Login.
//        String password2 = password1[1].split("'")[0];
////        System.out.println(password2);
//
////        return new String[]{password2};
//        return password2;
//   }
}
