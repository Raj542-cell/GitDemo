import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Base {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Tomato"};

        int j = 0;
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < products.size(); i++) {
//            Brocolli - 1 Kg

            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            // check whether name you extracted is present in array or not
            // convert array into array list
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

            }
            if (j == itemsNeeded.length) {
                break;
            }
        }
    }
}



