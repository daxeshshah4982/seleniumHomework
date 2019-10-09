import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.IOException;

public class DemoNopCommerseInMozilla {
    public static void main(String[] args) throws IOException {
        String baseURL = "https://demo.nopcommerce.com/";
        WebDriver driver;

        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get(baseURL);

        WebElement logIn = driver.findElement(By.className("ico-login"));
        logIn.click();

        WebElement emailField = driver.findElement(By.name("Email"));
        emailField.sendKeys("abcd1234@yahoo.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abcd123456");

        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        logInBtn.click();
    }
}
