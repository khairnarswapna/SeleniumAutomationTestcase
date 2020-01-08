import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpandDown {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org/download");
        //typecasting driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 1; i < 10; i++) {
        //scroll down on the webpage
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(2000);
        }
        for (int i = 1; i < 10; i++) {
        //scroll up on the webpage
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(2000);
        }
    }
}
