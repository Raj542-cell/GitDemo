//import dev.failsafe.internal.util.Assert;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class javascriptexec {
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");

        List<WebElement> values= driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
        int sum=0;
        for(int i=0;i<values.size();i++)
        {
          sum =sum+Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
        int value=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
//        Assert.assertEquals(sum,value);

    }
}
