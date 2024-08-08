import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static dev.failsafe.internal.util.Assert.*;

public class calendar {

    public static void main (String[] args) throws InterruptedException {
        int month=7;
        String year="2027";
        String date="17";
//        String[] expectedlist={month,date,year};
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
        driver.findElement(By.className("react-calendar__navigation__label")).click();
        driver.findElement(By.className("react-calendar__navigation__label")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(month-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();

       List<WebElement> actualList= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

       for( int i=0;i<actualList.size();i++)
       {
           System.out.println(actualList.get(i).getAttribute("value"));
//           Assert.assertEquals(actualList.get(i).getAttribute("value"),)

       }


    }
}
