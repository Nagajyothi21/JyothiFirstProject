package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Textbox {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//div[text()='Elements']/..//div[@class='icon']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        driver.findElement(By.id("userName")).sendKeys("Jyothi");
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("jyo@gmail.com");
        driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("abcdefg");
       driver.findElement(By.id("permanentAddress")).sendKeys("hijklm",Keys.TAB,Keys.ENTER);
        //Thread.sleep(3000);
       // driver.findElement(By.id("#submit")).click();
    }
}

