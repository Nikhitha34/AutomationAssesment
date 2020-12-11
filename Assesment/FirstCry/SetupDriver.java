package Assesment.FirstCry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
public class SetupDriver {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        String url = "https://www.firstcry.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
