package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

    public static void main(String[] args) {

        //STEP 1: SET UP

        System.setProperty("WebDriver.chrome.driver","C:\\Users\\buyil\\IdeaProjects\\SeleniumNewProject01\\src\\resources01\\drivers01\\chromedriver.exe");

        // STEP 2: CREATE

        WebDriver driver = new ChromeDriver();


        //STEP 3: WRITE TEST SCRIPTS

        // Steps:
        //Create a new class under : BasicNavigations
        //Create main method
        //Set Path
        //Create chrome driver
        //Maximize the window
        //Open google home page https://www.walmart.com/.
        //On the same class, Navigate to amazon home page https://www.amazon.com/
        //Navigate back to google
        //Navigate forward to amazon
        //Refresh the page
        //Close/Quit the browser



// Maximize the window
      driver.manage().window().maximize();
        //open google home page https://www.walmart.com/

        driver.get("https://www.walmart.com/");

        //On the same class, Navigate to amazon home page https://www.amazon.com/

       // driver.get("https://www.amazon.com/");

        //or

        driver.navigate().to("https://www.amazon.com/");



        ////        Navigate back to walmart
        driver.navigate().back();

        ////        Navigate forward to amazon
        driver.navigate().forward();

        ////        Refresh the page
      driver.navigate().refresh();

        ////        Close/Quit the browser
  //driver.close();
        driver.quit(); // preferable
    }


}
