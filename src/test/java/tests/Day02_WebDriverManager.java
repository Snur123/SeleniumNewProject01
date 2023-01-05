
package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day02_WebDriverManager {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");
        //We no longer need to use System.setProperty. We can use WebDriverManager API
        WebDriverManager.chromedriver().setup();
        //REST IS THE SAME
        //Create driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //going to the page
        //Test if amazon contains “Registry” on the homepage
        driver.get("https://www.amazon.com/");
        String pageSource = driver.getPageSource();

        String expectedWord = "Registry";

        if(pageSource.contains(expectedWord)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("PAGE SOURCE : "+pageSource);
            System.out.println("EXPECTED WORD : "+expectedWord);
        }
        driver.quit();
    }
}
