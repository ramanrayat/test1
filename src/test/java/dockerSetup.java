import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class dockerSetup {

    @BeforeTest
    void startDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start startDockerGrid.bat");
        Thread.sleep(35000);
    }

    @AfterTest
    void stopDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start stopDockerGrid.bat");
        Thread.sleep(5000);
        Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
    }
}
