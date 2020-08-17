package Steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base)
    {
        this.base = base;
    }

    @Before
    public void InitializeTest()
    {
        System.out.println("Opening the browser: Firefox");

       // System.setProperty("webdriver.firefox.marionette","/Users/anilyavuz6176gmail.com/Downloads/geckodriver.exe");


        System.setProperty(
                "webdriver.gecko.driver",
                "/Users/anilyavuz6176gmail.com/Downloads/geckodriver");

        base.Driver = new FirefoxDriver();
    }

}
