package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Links {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//div[text()='Elements']/..//div[@class='icon']")).click();
       // JavascriptExecutor jse=(JavascriptExecutor)driver;
       // jse.executeScript("window.scrollBy(0,2000");
       WebElement element =driver.findElement(By.xpath("//span[text()='Links']"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",element);
        driver.findElement(By.id("simpleLink")).click();
        driver.findElement(By.id("dynamicLink")).click();
       // driver.findElement(By.id("#created")).click();
     // System.out.println(driver.findElement(By.id("#linkResponse")).getText());

    }
}
