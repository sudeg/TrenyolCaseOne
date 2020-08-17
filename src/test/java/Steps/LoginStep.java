package Steps;

import Base.BaseUtil;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;
import java.util.concurrent.TimeUnit;


public class LoginStep extends BaseUtil {

    public static WebDriver driverOK;

    private BaseUtil base;

    LoginPage page = new LoginPage(driverOK);

    public LoginStep(BaseUtil base)
    {
        this.base = base;
    }

    @Given("Go to website")
    public void goToWebsite() throws Throwable{

        System.out.println("navigate");
        System.setProperty("webdriver.gecko.driver",
                "/Users/anilyavuz6176gmail.com/Downloads/geckodriver");
        driverOK=new FirefoxDriver();
        driverOK.manage().window().maximize();
        driverOK.get("https://www.trendyol.com/butik/liste/kadin");
        driverOK.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("Enter login button")
    public void enterLoginButton() throws Throwable{

        driverOK.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page.ClickAccount();

    }

    @And("Enter email as {string} and password as {string}")
    public void enterUsernameAsAndPasswordAs(String email, String password) throws Throwable{

        page.Login(email,password);

    }

    @And("Click login button")
    public void clickLoginButton() throws Throwable{
        page.ClickSubmit();
    }

    @Then("Main page should be refreshed")
    public void mainPageShouldBeRefreshed() throws Throwable{

      Assert.assertEquals(base.Driver.findElement(By.id("logged-in-container")).isDisplayed(), true);

    }



}
