import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class practice3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        List<WebElement> text=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        for(WebElement data:text){
            if(data.getText().equalsIgnoreCase("India")){
                data.click();
            }
        }
        WebElement country = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select data= new Select(country);
        data.selectByIndex(3);

    }
}