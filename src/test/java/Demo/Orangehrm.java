package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Orangehrm {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.orangehrm.com/");
        driver.findElement(By.className("contact-ohrm")).click();
        driver.findElement(By.className("accept-cookies")).click();
         driver.findElement(By.name("FullNName")).sendKeys("Girija");
        driver.findElement(By.id("Form_submitForm_CompanyName")).sendKeys("TCS");
        driver.findElement(By.id("Form_submitForm_jobTitle")).sendKeys("Automation Analyst");
        WebElement dropdown=driver.findElement(By.name("NoOfEmployees"));
        Select s=new Select(dropdown);
        s.selectByIndex(7);
        driver.findElement(By.id("Form_submitionForm_Contact")).sendKeys("9573912808");
        driver.findElement(By.id("Form_submitForm_Emails")).sendKeys("arun@gmail.com");
        driver.findElement(By.name("Comment")).sendKeys("Love all serve all");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.getTitle();
        //driver.findElement(By.xpath("tips-messages"))

    }
}
