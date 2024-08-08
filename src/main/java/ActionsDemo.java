import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Actions a= new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Check-In')]"))).build().perform();
        a.moveToElement(driver.findElement(By.xpath("//input[@id='autosuggest']"))).click().keyDown(Keys.SHIFT).sendKeys("india").doubleClick().build().perform();
    }
}
