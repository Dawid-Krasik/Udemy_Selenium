import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {


    @Test
    public void openFirefoxGoodlePage(){
        //System.setProperty("webdriver.gecko.driver","D:\\Java_Projects\\Udemy_Selenium\\Udemy_Selenium\\src\\main\\resources\\firefox\\geckodriver.exe");


        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        //System.out.println("Hello!!");
        driver.get("https://www.google.pl/");
    }
    @Test
    public void openChromeGoodlePage(){
        System.setProperty("webdriver.chrome.driver","D:\\Java_Projects\\Udemy_Selenium\\Udemy_Selenium\\src\\main\\resources\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //System.out.println("Hello!!");
        driver.get("https://www.google.pl/");
    }
    public WebDriver getDriver(String browser){
        switch (browser){
            case "chrome":
                String chromePath = "D:\\Java_Projects\\Udemy_Selenium\\Udemy_Selenium\\src\\main\\resources\\chrome\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver",chromePath);
                return  new ChromeDriver();
            default:
                throw  new InvalidArgumentException("Wrong Browser ... try Difrend one ");
        }
    }
}
