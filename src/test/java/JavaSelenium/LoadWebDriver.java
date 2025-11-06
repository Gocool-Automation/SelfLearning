package JavaSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.TimesPanel;

public class LoadWebDriver {

    public static void main(String[] args) throws Exception {

        //Chrome Driver Loading
        System.setProperty("webdriver.chrome.driver", "E:\\Learning\\Utilities\\ChromeDriver_V111\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //Edge Driver Loading
        //System.setProperty("webdriver.edge.driver", "E:\\Learning\\Utilities\\edgedriver_win64\\msedgedriver.exe");
        //WebDriver driver = new EdgeDriver();

        //Firefox Driver Loading
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-theme btn-sm btn-min-block']")));
        driver.findElement(By.xpath("//a[@class='btn btn-theme btn-sm btn-min-block']"));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }

}
