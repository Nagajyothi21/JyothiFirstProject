package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Forms {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable");
      WebElement element= driver.findElement(By.xpath("//div[text()='Forms']"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",element);
        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Dhnav");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Reddy");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("Dhanv@gmail.com");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.cssSelector("#userNumber")).sendKeys("1234569870");
        Thread.sleep(3000);
      WebElement element1=  driver.findElement(By.id("dateOfBirthInput"));
      executor.executeScript("arguments[0].click()",element1);
      driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).sendKeys("February");
      driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).sendKeys("2022");
     WebElement element2= driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--026 react-datepicker__day--weekend']"));
    executor.executeScript("arguments[0].click()",element2);
    // WebElement dropdown=
             driver.findElement(By.cssSelector("#subjectsInput")).sendKeys("gfhgggju",Keys.SPACE);
       // Select s=new Select(dropdown);
        //s.selectByValue("Chemistry");
       WebElement Checkbox= driver.findElement(By.cssSelector("#hobbies-checkbox-1"));
       executor.executeScript("arguments[0].click()",Checkbox);
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("#uploadPicture")).sendKeys("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Nagajyothi");
       driver.findElement(By.cssSelector("#currentAddress")).sendKeys("xgdrhfhfytrjjdhfh");
       Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[text()='Elements']/..//div[@class='icon']")).click();
//        executor.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//div[text()='Select State']")));
              //  WebElement Dropdown= d executor.executeScript("window.scrollBy(0,2000)");));
//      executor.executeScript("arguments[0].click()",Dropdown);
        driver.findElement(By.xpath("//div[text()='Book Store Application']")).click();
        WebElement StateDropdown =driver.findElement(By.xpath("//div[text()='Select State']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", StateDropdown);

        Select s=new Select(StateDropdown);
        s.selectByIndex(2);


    }
}
