import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

import java.net.MalformedURLException;
import java.net.URL;

public class dockerChrome {

    public static void main (String args[]) throws MalformedURLException {



        DesiredCapabilities dc = DesiredCapabilities.firefox();

        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
//        System. setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();


        driver.get("https://grafana.com/");
        System.out.println("The Title of page is (Chrome):"+driver.getTitle());
        Reporter.log("google",true);
        driver.quit();

    }
}
