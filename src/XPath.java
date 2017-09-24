import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath {

    public static void main(String[] args) throws InterruptedException {

        String firefoxdriverpath = "C:\\Users\\user\\IdeaProjects\\selenium1\\lib\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", firefoxdriverpath);

// create a new instance of the Firefox driver
        WebDriver firefoxDriver = new FirefoxDriver();

// Open the page we want to open
        firefoxDriver.get("http://www.rediff.com");
        firefoxDriver.findElement(By.xpath(
//                "//span[@id='signin_info']/a[1]")).click();
//                "//span[@id='signin_info']/a[@title='Already a user? Sign in']")).click();
                "html/body/div[2]/div[4]/span[4]/span/a[@title='Already a user? Sign in']")).click();

        firefoxDriver.navigate().to("http:\\google.com");

        Thread.sleep(4000);
        firefoxDriver.navigate().back();

        firefoxDriver.navigate().forward();

        firefoxDriver.navigate().refresh();

    }
}
