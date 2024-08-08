import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windowhandles {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> windows= driver.getWindowHandles(); // parentid , childid, subchildid
        Iterator<String> it=windows.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
        // Please email us at mentor@rahulshettyacademy.com with below template to receive response
        //  mentor@rahulshettyacademy.com with below template to receive response
        String email= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentid);
        driver.findElement(By.id("username")).sendKeys(email);


    }
}