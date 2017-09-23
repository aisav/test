import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleTest {

    public static void main(String[] args) {

        String firefoxdriverpath = "C:\\Users\\user\\IdeaProjects\\selenium1\\lib\\geckodriver.exe";
        WebDriver driver;

        System.setProperty("webdriver.gecko.driver", firefoxdriverpath);

// create a new instance of the Firefox driver
        driver = new FirefoxDriver();

// Open the page we want to open
        driver.get("http://www.yahoo.com");

//Defining Expected Title
        String expectedTitle = "Yahoo";
//Getting the actual Title
        String actualTitle = null;
        actualTitle=driver.getTitle();

//Validating the test case
        if (actualTitle.contentEquals(expectedTitle))
        {
            System.out.println("Test Passed!");
        }
        else
        {
            System.out.println("Test Failed");
        }

        driver.manage().window().maximize();

//        driver.close();
//        driver.quit();
    }
}
