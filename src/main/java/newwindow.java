import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class newwindow {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //switching window
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles= driver.getWindowHandles();
        Iterator<String> it =handles.iterator();
        String parentwd= it.next();
        String childwd= it.next();
        driver.switchTo().window(childwd);
        driver.get("https://rahulshettyacademy.com/");
        String coursename= driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p')]"))
                .get(1).getText();
        driver.switchTo().window(parentwd);
        driver.manage().window().maximize();
        WebElement name =driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']"));
        name.sendKeys(coursename);

        //Screen shot
        File file= name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("logo.png"));

        //get height and width
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());




    }
}
