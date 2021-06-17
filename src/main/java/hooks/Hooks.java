package hooks;

import base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static base.DriverManager.*;

public class Hooks {

    final WebDriver driver = getWebDriver();

    @After
    public void tearDown(Scenario scenario) {
        String screenshotName = scenario.getName().replaceAll(" ", "_");
        try {
            if (scenario.isFailed()) {
                scenario.log("failure");
                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", screenshotName);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        closeDriver();
    }
}
