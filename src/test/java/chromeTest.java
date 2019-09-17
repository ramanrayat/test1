import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class chromeTest {

    @Test
    public void test1() throws MalformedURLException {

        System.out.println("chrome Test 1");
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);

        driver.get("https://www.google.com/");
        System.out.println("The Title of page is (Chrome):"+driver.getTitle());
        driver.quit();

    }

}
