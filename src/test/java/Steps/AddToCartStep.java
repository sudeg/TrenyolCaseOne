package Steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.BrandPage;
import pages.CategoryPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.CategoryPage;

import java.util.concurrent.TimeUnit;

public class AddToCartStep extends BaseUtil {

    public static WebDriver driverOK;

    private BaseUtil base;

    LoginPage page = new LoginPage(driverOK);
    BrandPage brand = new BrandPage(driverOK);
    ProductPage product = new ProductPage(driverOK);
    CategoryPage category = new CategoryPage(driverOK);

    public AddToCartStep(BaseUtil base)
    {
        this.base = base;
    }

    @And("User goes to brand page")
    public void userGoesToBrandPage() {

        System.out.println("navigate");
        System.setProperty("webdriver.gecko.driver",
                "/Users/anilyavuz6176gmail.com/Downloads/geckodriver");
        driverOK=new FirefoxDriver();
        driverOK.manage().window().maximize();
        driverOK.get("https://www.trendyol.com/butik/liste/kadin");
        driverOK.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        category.ClickTrendyolmilla();

    }

    @And("Selects a product")
    public void selectsAProduct() {
        brand.ClickProduct();
    }

    @And("Goes to product page and adds product to cart")
    public void goesToProductPageAndAddsProductToCart() {
        product.BuyProduct();
    }

    @Then("goes to cart page")
    public void goesToCartPage() {
        product.GoToCart();

        Assert.assertEquals(driverOK.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/section/section[1]/div[2]/div/div/div[3]/div[2]")).isDisplayed(), true);

    }
}
