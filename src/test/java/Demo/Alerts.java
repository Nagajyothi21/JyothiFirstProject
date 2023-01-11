package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']")).click();
        WebElement element=driver.findElement(By.xpath("//span[text()='Alerts']"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",element);
        driver.findElement(By.cssSelector("#alertButton")).click();
        Alert alt=driver.switchTo().alert();
//        alt.getText();
        alt.accept();
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        alt.accept();
        driver.findElement(By.id("confirmButton")).click();
        alt.accept();
       WebElement button= driver.findElement(By.id("promtButton"));
       executor.executeScript("arguments[0].click()",button);
       alt.sendKeys("buhui");
        alt.accept();
//        alt.sendKeys("jhjf");

    }
}
