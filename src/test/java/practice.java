import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class practice {
    public static void main ( String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown1 = new Select(dropdown);
        dropdown1.selectByIndex(1);
        dropdown1.selectByValue("USD");
        driver.findElement(By.id("divpaxinfo")).click();
        int i=0;
        while(i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
        driver.findElement(By.xpath("(//a[contains(@class,'ui-state-highlight')])[1]")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        List<WebElement> suggested =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

        for( WebElement option: suggested){
            if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }

        }

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
            System.out.println("Its enabled");

        }
        else
        {
            System.out.println("Its disabled");

        }






    }


}
