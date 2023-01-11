package Demo;

import ch.qos.logback.classic.util.ContextInitializer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Button {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//div[text()='Elements']/..//div[@class='icon']")).click();
        Actions act=new Actions(driver);
       act.keyDown(Keys.SHIFT).perform();
       WebElement element= driver.findElement(By.xpath("//span[text()='Buttons']"));
       JavascriptExecutor executor=(JavascriptExecutor) driver;
       executor.executeScript("arguments[0].click()",element);
     WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
     Actions acts=new Actions(driver);
     acts.doubleClick(doubleClick).perform();
        System.out.println( driver.findElement(By.xpath("//p[text()='You have done a double click']")).getText());
      WebElement Right=  driver.findElement(By.xpath("//button[text()='Right Click Me']"));
      acts.contextClick( Right).perform();
      System.out.println(driver.findElement(By.xpath("//p[text()='You have done a right click']")).getText());
     driver.findElement(By.xpath("//button[text()='Click Me']")).click();
     System.out.println(driver.findElement(By.xpath("//p[text()='You have done a dynamic click']")).getText());





    }
}
