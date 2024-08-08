import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

//import java.io.File;

public class miscelleanous {
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("cookiename");
        driver.get("https://google.com");

        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\bhupathib\\screenshot.png"));

    }
}
