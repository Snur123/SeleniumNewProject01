import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass01 {

    public static void main(String[] args) {



System.setProperty("WebDriver.chrome,drive","src/resources/drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.techproeducation.com");
    }
}