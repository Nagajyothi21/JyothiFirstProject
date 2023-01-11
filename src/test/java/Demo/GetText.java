package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GetText {
    public static void main(String []args){
        WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.flipkart.com/");
            driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //((WebElement) driver.findElements(By.className("_2KpZ6l _2doB4z"))).click();
            driver.findElement(By.xpath("//button[text()='✕']")).click();
            driver.findElement(By.name("q")).sendKeys("nokia");
            //Thread.sleep(2000);
            List<WebElement> allsug=driver.findElements(By.xpath("//div[@id='container']"));
            for(WebElement sug:allsug)
            {
                System.out.println(sug.getText());
            }



        }
    }



