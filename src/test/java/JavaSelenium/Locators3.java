package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Learning\\Utilities\\ChromeDriver_V96\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Traversing from Sibling - Child to Parent
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

    }

}
