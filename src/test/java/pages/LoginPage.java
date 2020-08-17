package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.XPATH,using = "/html/body/div[8]/div/div/div/div/div/div/div[1]/a/span[2]")
    public WebElement btnIgnore;

    @FindBy(how = How.ID,using = "accountBtn")
    public WebElement btnAccount;

    @FindBy(how = How.NAME,using = "email")
    public WebElement txtEmail;

    @FindBy(how = How.NAME,using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.ID,using = "loginSubmit")
    public WebElement btnLoginSubmit;

    @FindBy(how = How.XPATH, using = "//*[@id=\"navigation-wrapper\"]/nav/ul/li[1]/a")
    public WebElement btnWoman;

    @FindBy(how = How.XPATH, using = "//*[@id=\"navigation-wrapper\"]/nav/ul/li[2]/a")
    public WebElement btnMan;

    @FindBy(how = How.XPATH, using = "//*[@id=\"navigation-wrapper\"]/nav/ul/li[3]/a")
    public WebElement btnChild;

    @FindBy(how = How.XPATH, using = "//*//*[@id=\"navigation-wrapper\"]/nav/ul/li[4]/a")
    public WebElement btnHome;

    @FindBy(how = How.XPATH, using = "//*[@id=\"navigation-wrapper\"]/nav/ul/li[5]/a")
    public WebElement btnSupermarket;

    @FindBy(how = How.XPATH, using = "//*[@id=\"navigation-wrapper\"]/nav/ul/li[6]/a")
    public WebElement btnCosmetic;

    @FindBy(how = How.XPATH, using = "//*[@id=\"navigation-wrapper\"]/nav/ul/li[7]/a")
    public WebElement btnShoesAndBags;

    @FindBy(how = How.XPATH, using = "//*[@id=\"navigation-wrapper\"]/nav/ul/li[8]/a")
    public WebElement btnWatches;

    @FindBy(how = How.XPATH, using = "//*[@id=\"navigation-wrapper\"]/nav/ul/li[9]/a")
    public WebElement btnElectronics;

    public void ClickAccount()
    {
        btnAccount.submit(); //submit de olabilir - DENE
    }

    public void Login(String email, String password)
    {
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
    }

    public void ClickSubmit()
    {
        btnLoginSubmit.submit();
    }

    public void ClickIgnore(){btnIgnore.click();}

    public void ClickWoman(){btnWoman.click();}

    public void ClickMan(){btnMan.click();}

    public void ClickChild(){btnChild.click();}

    public void ClickHome(){btnHome.click();}

    public void ClickSupermarket(){btnSupermarket.click();}

    public void ClickCosmetic(){btnCosmetic.click();}

    public void ClickShoesAndBags(){btnShoesAndBags.click();}

    public void ClickWatches(){btnWatches.click();}

    public void ClickElectronics(){btnElectronics.click();}

}
