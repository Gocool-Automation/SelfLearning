package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InterviewDemo {
    //Walmart Interview Program
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "Driver path.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement name = driver.findElement(By.xpath("//select[@class='age']/option[2]"));

        Select s = new Select(name);
        s.selectByVisibleText("Hello");
    }

}
