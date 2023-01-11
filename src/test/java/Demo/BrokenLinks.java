package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrokenLinks {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//div[text()='Elements']/..//div[@class='icon']")).click();
      WebElement element= driver.findElement(By.xpath("//span[text()='Broken Links - Images']"));
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()",element);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Click Here for Valid Link']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']")).click();




    }
}
