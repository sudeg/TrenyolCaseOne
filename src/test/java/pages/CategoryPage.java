package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CategoryPage {

    public CategoryPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/div[1]/div/div/div/div[3]")
    public WebElement btnTrendyolmilla;


    public void ClickTrendyolmilla(){btnTrendyolmilla.click();}


}
