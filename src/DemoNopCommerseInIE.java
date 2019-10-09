import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DemoNopCommerseInIE {
    public static void main(String[] args) {
        String baseURL = "https://demo.nopcommerce.com/";
        WebDriver driver;

        System.setProperty("webdriver.ie.driver", "driver/MicrosoftWebDriver.exe");
        driver = new InternetExplorerDriver();

        driver.get(baseURL);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement logIn = driver.findElement(By.xpath("//div[@class='master-wrapper-page']//a[@class = 'ico-login']"));
        logIn.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc3456@hotmail.co.uk");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("456internet");

        WebElement logInBtn = driver.findElement(By.xpath("//div[@class ='buttons']//input[@class ='button-1 login-button']"));
        logInBtn.click();

    }
}
