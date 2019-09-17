import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class firefoxTest {

    @Test
    public void test4() throws MalformedURLException {

        System.out.println("firefox Test");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);

        driver.get("https://stackoverflow.com/");
        System.out.println("The Title of page is (Firefox):"+driver.getTitle());
        driver.quit();

    }

}
