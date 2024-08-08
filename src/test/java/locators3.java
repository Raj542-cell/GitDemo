import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locators3 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://google.com");
//        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//
//        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
//        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select dropdown = new Select(dropdown1);
        dropdown.selectByIndex(1);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("USD");


    }
}
