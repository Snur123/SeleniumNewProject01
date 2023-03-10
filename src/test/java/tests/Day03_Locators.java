
/* There are 8 selenium locators to locate an element.
id
name
className
tagName
linkText
partialLinkText
xpath ->There are multiple ways to write xpath
css      ->There are multiple ways to write css



 */


package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Day03_Locators {
    @Test
    public void logInTest(){
//        user goes to http://a.testaddressbook.com/sign_in
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 seconds wait in case needed
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Locating the username and typing
        WebElement username = driver.findElement(By.name("username"));//Location username bu name
        username.sendKeys("Admin");// typing Admin
//        Locating the password and typing
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
//        Locating the button and clicking
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
//        Verifying the log in is successful
//        1. We can use default page URL to do assertion
//        2. Or we can locate a CORE ELEMENT on the default page to assert is that element is displayed on the page
//        Login Page : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//        Default Page : https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals("LOGIN FAILED",expectedURL,actualURL);//If login successful PASS, if not FAIL and print message LOGIN FAILED"

    }
}
