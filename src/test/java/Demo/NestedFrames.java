package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NestedFrames {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']")).click();
       WebElement element= driver.findElement(By.xpath("//span[text()='Nested Frames']"));
       JavascriptExecutor executor=(JavascriptExecutor) driver;
       executor.executeScript("arguments[0].click()",element);
        driver.switchTo().parentFrame();

    }
}
