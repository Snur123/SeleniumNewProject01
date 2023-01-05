

    //getPageSource() returns page source code as a string
//We might use this to verify if a certain text exist in the entire page
//Note that pageSource is not used a lot to do assertions
//Because it is too general and can lead false result
     //   TEST CASE:
     //   Test if amazon contains “Registry” on the homepage
       // Create a new class : GetPageSource


      //   	1.Create a new class: VerifyTitleTest
        //	2.Navigate to techproeducation homepage
        //	3.Verify if google title is “Techpro Education | Online It Courses & Bootcamps”
//Class name den dolayi hata verdi.onceki class name uzernde yaptgi icin uymadi. bu class i ben kendim olusturdum cunlu son anda bir degisiklik yapti uzerine.o halini de gormek istedim
    package tests;


    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;


    public class Day02_TitleVerification {
    }
        public static void main(String[] args) {
            System.setProperty("WebDriver.chrome,drive","src/resources/drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.techproeducation.com");


            //get the title
            String actualTitle = driver.getTitle();
            String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";


            //Verify if page title is “Techpro Education | Online It Courses & Bootcamps”

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("ACTUAL TITLE : " + actualTitle);
                System.out.println("BUT EXPECTED TITLE : " + expectedTitle);
            }
            driver.quit();
        }
    }