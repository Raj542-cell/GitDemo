import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
        List<WebElement> veggies= driver.findElements(By.xpath("//tr/td[1]"));

        List<WebElement> filteredlist= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
                collect(Collectors.toList());
        

    }
}



