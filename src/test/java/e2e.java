import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2e {

    public static void main ( String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[contains(@class,'ui-state-default')])[1]")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Thread.sleep(2000);

        int i=1;
        while(i<5)
        {
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
            i++;
        }
        WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select dropdown = new Select(dropdown1);
        dropdown.selectByIndex(2);
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

    }
}
