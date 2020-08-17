package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class BrandPage {

    public BrandPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div/div/div[2]/div[2]/div[3]/div/div[1]/div[1]/a/div[1]/div/img")
    public WebElement btnProduct;

    public void ClickProduct()
    {
        btnProduct.click();
    }


}
