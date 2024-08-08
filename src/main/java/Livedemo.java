import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

import static dev.failsafe.internal.util.Assert.*;

public class Livedemo {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        // click on column
        driver.findElement(By.xpath("//tr/th[1]")).click();
        // capture all webelements into list
        List<WebElement> elementslist= driver.findElements(By.xpath("//tr/td[1]"));
        // capture text of all wedelements into new list
        List<String> originallist= elementslist.stream().map(s->s.getText()).collect(Collectors.toList());
        // sort on the original list of step 3 --> sorted list
        List<String> sortedlist= originallist.stream().sorted().collect(Collectors.toList());
        // compare original list vs sorted list
//        Assert.assertTrue(originallist.equals(sortedlist));
        List<String> price;
        // scan the name column with gettext->Rice-> print the price of the rice
        do
        {
            List<WebElement> rows= driver.findElements(By.xpath("//tr/td[1]"));
            price = rows.stream().filter(s -> s.getText().contains("Chocolate"))
                    .map(s -> getpriceveggie(s)).collect(Collectors.toList());
            price.forEach(a -> System.out.println(a));
            if (price.size() < 1)
            {
                driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
            }
        }while (price.size()<1);

    }

    private static String getpriceveggie(WebElement s) {

        String pricevalue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return pricevalue;
    }
}
