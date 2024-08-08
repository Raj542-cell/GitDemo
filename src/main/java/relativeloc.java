import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativeloc {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameeditbox= driver.findElement(By.xpath("//input[@name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameeditbox)).getText());
        WebElement dob= driver.findElement(By.xpath("//label[@for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dob)).click();
        WebElement check= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(check)).click();
        WebElement rdb= driver.findElement(By.xpath("//label[text()='Employment Status: ']"));
        driver.findElement(with(By.tagName("div")).toRightOf(rdb)).getText();
    }
}
