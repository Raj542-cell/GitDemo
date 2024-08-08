import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practise2 {
    public static void main (String[] args){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        int j=0;
        String[] itemsneeded1={"Cucumber","Beetroot"};
        List<WebElement> productname=driver.findElements(By.xpath("//h4[@class='product-name']"));
        for( int i=0;i<productname.size();i++)
        {
            String[] name = productname.get(i).getText().split("-");
            String formattedname = name[0].trim();

            List itemsneededlist1 = Arrays.asList(itemsneeded1);
            if (itemsneededlist1.contains(formattedname))
            {
                j++;
                List<WebElement> product = driver.findElements(By.xpath("//div[@class='product-action']/button"));
                product.get(i).click();
            }
            if(j==itemsneeded1.length)
            {
                break;
            }


        }
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
        driver.findElement(By.className("promoCode")).sendKeys("Raj");

    }
}
