import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class chromeTest3 {

    @Test
    public void test3() throws MalformedURLException {

        System.out.println("chrome Test 3");
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);

        driver.get("https://www.cypress.io/");
        System.out.println("The Title of page is (Chrome):"+driver.getTitle());
        driver.quit();

    }

}
