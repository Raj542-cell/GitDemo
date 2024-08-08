import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Additems {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] itemsNeeded={"Cucumber","Brocolli","Beetroot","Tomato"};
        int j = 0;
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        Thread.sleep(3000);
        for (int i = 0; i < products.size(); i++)
        {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            // check whether name you extracted is present in array or not
            // convert array into array list
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedName))
            {
                j++;
//                Thread.sleep(1000);
                List<WebElement> product = driver.findElements(By.xpath("//div[@class='product-action']/button"));
                product.get(i).click();

            }
            if (j == itemsNeeded.length)
            {
                break;
            }
        }

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));

        driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));

        System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());


    }
}

