
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoNopCommerseInChrome {
    public static void main(String[] args) {
        String baseURL = "https://demo.nopcommerce.com/";
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(baseURL);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement logIn = driver.findElement(By.className("ico-login"));
        logIn.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc123@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("123abc");

        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        logInBtn.click();
    }
}
