import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class linksCount {
    public static void main (String[] args) throws InterruptedException {
// 1. give me the count of links on the page
// 2. count of footer section
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footer = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
        System.out.println(footer.findElements(By.tagName("a")).size());
        WebElement columndriver=footer.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
// 3.click on each link in the column and check if the pages are opening
        for (int i=1; i<columndriver.findElements(By.tagName("a")).size();i++)
        {
            String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
            Thread.sleep(5000);
        }
        Set<String> abc= driver.getWindowHandles();
        Iterator<String> it=abc.iterator();
        while(it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }



    }

}
