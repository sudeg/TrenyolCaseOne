package Steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.CategoryPage;
import pages.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrandCheckStep {

    private BaseUtil base;

    public BrandCheckStep(BaseUtil base)
    {
        this.base = base;
    }

    public static WebDriver driverOK;
    LoginPage page = new LoginPage(driverOK);
    CategoryPage category = new CategoryPage(driverOK);


    @Given("Go to the website")
    public void goToTheWebsite() {
        System.out.println("navigate");
        System.setProperty("webdriver.gecko.driver",
                "/Users/anilyavuz6176gmail.com/Downloads/geckodriver");
        driverOK=new FirefoxDriver();
        driverOK.manage().window().maximize();
        driverOK.get("https://www.trendyol.com");
    }

    @And("Select a random category")
    public void selectARandomCategory() {
        page.ClickWoman();
    }

    @And("Select a brand")
    public void selectABrand() {
        category.ClickTrendyolmilla();
    }

    @Then("Check brand images are loaded")
    public void checkBrandImagesAreLoaded() {

        List<WebElement> elements = driverOK.findElements(By.cssSelector("img"));

        for (WebElement el:elements)
        {
            Boolean img_loaded = (Boolean) ((JavascriptExecutor)base.Driver).executeScript(
                    "return arguments[0].complete && typeof arguments[0].naturalWidth != \\\"undefined\\\" && arguments[0].naturalWidth > 0"
                    , el);

            if(!img_loaded)
            {
                System.out.println("Image not loaded");
            }
            else
            {
                System.out.println("Image loaded");
            }

        }

    }
}
