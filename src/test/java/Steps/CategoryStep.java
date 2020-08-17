package Steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;

import java.util.List;

public class CategoryStep {

    private BaseUtil base;

    public CategoryStep(BaseUtil base)
    {
        this.base = base;
    }

    LoginPage page = new LoginPage(base.Driver);

    public static WebDriver driverOK;

    @Given("User already logged in")
    public void userAlreadyLoggedIn() {
        System.out.println("navigate");
        System.setProperty("webdriver.gecko.driver",
                "/Users/anilyavuz6176gmail.com/Downloads/geckodriver");
        driverOK=new FirefoxDriver();
        driverOK.manage().window().maximize();
        driverOK.get("https://www.trendyol.com");
    }

    @Then("Check images are loaded")
    public void checkImagesAreLoaded() {



        for(int arrowNumber = 0; arrowNumber < 3; arrowNumber++) //Spesifik kategoriye girince markalarin saginda ok bulunuyor, oraya yansiyan markalarin yana kaymasi icin. Kategori markalarinin hepsine bakmak lazim, sayisi manuel ekledim
        {

            Assert.assertEquals(base.Driver.findElement(By.xpath("[@id=\\\"browsing-gw-homepage\\\"]/div/div[1]/div/button[" + arrowNumber +"]")).isDisplayed(), true);

                List<WebElement> items = base.Driver.findElements(By.className("item")); //ordaki marka sayisini aliyor

                int totalElements = items.size();

                for(int number = 0; number<totalElements; number++) //Her bir marka image kontrolu icin donuyor.
                {
                    List<WebElement> elements = base.Driver.findElements(By.xpath("//*[@id=\"browsing-gw-homepage\"]/div/div[" + number + "]/div/div/div/div[3]/div/a/img"));

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





    }
    @And("Enter Woman section")
    public void enterWomanSection() {
        page.ClickWoman();
    }

    @And("Enter Men section")
    public void enterMenSection() {
        page.ClickMan();
    }

    @And("Enter Child section")
    public void enterChildSection() {
        page.ClickChild();
    }

    @And("Enter Home section")
    public void enterHomeSection() {
        page.ClickHome();
    }

    @And("Enter Supermarket section")
    public void enterSupermarketSection() {
        page.ClickSupermarket();
    }

    @And("Enter Cosmetic section")
    public void enterCosmeticSection() {
        page.ClickCosmetic();
    }

    @And("Enter Shoes Bags section")
    public void enterShoesBagsSection() {
        page.ClickShoesAndBags();
    }

    @And("Enter Watches section")
    public void enterWatchesSection() {
        page.ClickWatches();
    }

    @And("Enter Electronics section")
    public void enterElectronicsSection() {
        page.ClickElectronics();
    }
}

