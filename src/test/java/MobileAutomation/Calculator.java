package MobileAutomation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Calculator {
    static AppiumDriver driver;

    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void openCalculator() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "AOSP on IA Emulator");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);

        System.out.println("Calculator App started");

        //Calculator Button elements
        WebElement zero = driver.findElement(By.id("com.android.calculator2:id/digit_0"));
        WebElement one = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        WebElement four = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
        WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        WebElement six = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        WebElement seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        WebElement eight = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        WebElement nine = driver.findElement(By.id("com.android.calculator2:id/digit_9"));
        WebElement dot = driver.findElement(By.id("com.android.calculator2:id/dec_point"));
        WebElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
        WebElement add = driver.findElement(By.id("com.android.calculator2:id/op_add"));
        WebElement minus = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
        WebElement mul = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        WebElement div = driver.findElement(By.id("com.android.calculator2:id/op_div"));
        WebElement clear = driver.findElement(By.id("com.android.calculator2:id/del"));
        WebElement result = driver.findElement(By.id("com.android.calculator2:id/result"));

        //operations
        two.click();
        add.click();
        three.click();
        equals.click();

        //Printing result
        String res = result.getText();
        System.out.println("\n Result is " + res);
        System.out.println("Completed......");

    }

}
