package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.name("q")).sendKeys("iphonex");
        driver.findElement(By.className("L0Z3Pu")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Popularity']")).click();

        String result = driver.findElement(By.xpath("(//div[text()='APPLE iPhone X (Space Gray, 256 GB)'])[1]")).getText();
        Thread.sleep(3000);
        System.out.println(result);
        driver.findElement(By.xpath("(//div[text()='APPLE iPhone X (Space Gray, 256 GB)'])[1]")).click();

        String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Space Gray, 256 GB)']/../../div[2]/div[1]")).getText();
        System.out.println(price);
        driver.quit();
    }
}
