import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSlcheck {

    public static void main (String[] args){
        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        Proxy proxy=new Proxy();
        proxy.setHttpProxy("8888");
        options.setCapability("proxy",proxy);

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
    }
}
