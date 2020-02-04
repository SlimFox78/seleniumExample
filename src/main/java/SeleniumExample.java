import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\LanitUser14\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().
                implicitlyWait(11, TimeUnit.SECONDS);
        driver.get("http://www.google.com");

        waitTime(10);

        System.out.println("Мы на странице " + driver.getTitle());

        WebElement element = driver.findElement(By.xpath("//input[@name = 'q']"));
//        WebElement element = driver.findElement(By.name("q"));

        driver.manage().window().maximize();

        element.sendKeys("Selenium");

        waitTime(10);

        element.submit();

        driver.quit();
    }

    public static void waitTime(Integer sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
        }
    }
}
