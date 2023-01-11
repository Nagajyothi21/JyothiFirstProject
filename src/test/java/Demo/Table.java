package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Table {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//div[text()='Elements']/..//div[@class='icon']")).click();
       WebElement element= driver.findElement(By.xpath("//span[text()='Web Tables']"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",element);
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("jhgh");
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("dhanV@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("29");
        driver.findElement(By.xpath("//input[@placeholder='Salary']")).sendKeys("44543");
        driver.findElement(By.xpath("//input[@placeholder='Department']")).sendKeys("jytid");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("abc");
        driver.findElement(By.xpath("//div[@class='input-group-append']")).click();

    }
}


