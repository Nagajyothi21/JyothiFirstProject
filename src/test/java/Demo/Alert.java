package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Alert {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable");
//        driver.findElement(By.xpath("//div[text()='Elements']/..//div[@class='icon']")).click();
        driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']")).click();
        WebElement element=driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",element);
        driver.findElement(By.xpath("//button[text()='New Tab']")).click();

        driver.findElement(By.xpath("//button[text()='New Window']")).click();
       driver.findElement(By.xpath("//button[text()='New Window Message']")).click();
//       System.out.println(message);



    }
}
