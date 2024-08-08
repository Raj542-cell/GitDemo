import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsdemo2 {

    public static void main ( String[] args) throws InterruptedException {

//        methodsdemo2 d2 = new methodsdemo2();
//
//        System.out.println(d2.getpassword());

//        String name =d2.getdata();
//        System.out.println(name);
//        methodsdemo d = new methodsdemo();
//        d.getdata();


    }

    public String getpassword(WebDriver driver) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
        String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
//        Please use temporary password 'rahulshettyacademy' to Login.
        String[] password1 = passwordText.split("'");
//       [0]= Please use temporary password
//        [1]= rahulshettyacademy' to Login.
//        String password2= password1[1].split("'")[0];
//        System.out.println(password2);

        return password1[1];
    }




}
