package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment6 {
    public static void main(String[]rgs){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin", Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
    }
}
