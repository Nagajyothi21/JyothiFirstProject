package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreateCustomer {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin", Keys.TAB, "manager", Keys.TAB, Keys.ENTER);
        driver.findElement((By.xpath("//a[@class='content tasks']"))).click();
        driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
        driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Dhanvi.C");
        driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("I have to create new customer");
        driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
       String Customer= driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();


        System.out.println(Customer);
    }


}
