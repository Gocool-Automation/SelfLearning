package WebDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class LoadDriver {
    public static void main(String[] args) throws InterruptedException {
        //Chrome Driver Loading
        System.setProperty("webdriver.chrome.driver", "E:\\Learning\\Utilities\\ChromeDriver_V111\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Edge Driver Loading
        //System.setProperty("webdriver.edge.driver", "E:\\Learning\\Utilities\\edgedriver_win64\\msedgedriver.exe");
        //WebDriver driver = new EdgeDriver();

        //Firefox Driver Loading
        //WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("www.google.com");
        //driver.navigate().to("www.google.com");
        //driver.get("https://rahulshettyacademy.com");

        /*&
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-theme btn-sm btn-min-block']")));
        driver.findElement(By.xpath("//a[@class='btn btn-theme btn-sm btn-min-block']"));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

         */
        driver.quit();
    }
}
