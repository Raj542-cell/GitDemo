import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.SQLOutput;

public class Updateddropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Thread.sleep(2000);

        int i=1;
        while(i<5)
        {
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
            i++;
        }

        driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
//for(int i=1;i<4;i++)
//{
//    driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
//}


//        driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
//        driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
        driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
//        Thread.sleep(3000);
//        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        Thread.sleep(3000);
//        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
            System.out.println("its enabled");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }



    }
}
