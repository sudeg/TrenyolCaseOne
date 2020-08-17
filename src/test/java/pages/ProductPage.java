package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ProductPage {

    public ProductPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div/div/div[2]/div[2]/div[2]/div[4]/button[1]")
    public WebElement bthAddToCart;

    @FindBy(how = How.ID,using = "myBasketListItem")
    public WebElement btnGoToCart;

    public void BuyProduct()
    {
        bthAddToCart.click();
    }

    public void GoToCart()
    {
        btnGoToCart.click();
    }

}
