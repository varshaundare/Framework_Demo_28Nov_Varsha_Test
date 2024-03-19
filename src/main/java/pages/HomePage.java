package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.ActionsUtil;
import util.WebDriverUtil;
import util.WebElementUtil;

public class HomePage extends WebTestBase {
   // @FindBy(className = "newsletter__close newsletter__trigger")
   //or we can use
     @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeAd;

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
         // or we can use
        // @FindBy(xpath = "//span[text()='Log in or Register']")
   WebElement loginAndResister;

    @FindBy(xpath = "//a[text()='Café Finder']")
    WebElement coffeeFinderHomePage;

    @FindBy(xpath = "//a[text()='Our Story']")
    WebElement ourStoryHomePage;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shopHomePage;

    @FindBy(xpath = "(//a[text()='Subscriptions'])[2]")
    WebElement subscriptionsHomePage;

    @FindBy(xpath = "//a[text()='Brew Guides']")
    WebElement brewGuidesHomePage;

    @FindBy(xpath = "//a[text()='News']")
    WebElement newsHomePage;

    @FindBy(xpath = "//a[text()='Wholesale']")
    WebElement wholesaleHomePage;

    @FindBy(xpath = "//input[@id='searchsubmit']")
    WebElement searchHomePage;
    @FindBy(xpath = "//input[@id='s']")
    WebElement sendDataInSearch;

    @FindBy(xpath = "//a[@class='mini-cart']")
    WebElement miniCartHomePage;

    @FindBy(xpath = "//li[@class='user-controls__ul__li user-controls__ul__li--newsletter']")
    WebElement emailHomePage;

    @FindBy(xpath = "//a[text()='DISCOVER MORE']")
    //@FindBy(xpath = "//a[@class='carousel__content__a button button--primary']")
   // @FindBy(xpath = "//h1[@class='carousel__content__title carousel__content__title--lighter-text']")
    WebElement discoverMoreHomePageBtn;

   public HomePage(){
       PageFactory.initElements(driver, this);
    }

    public void closeFirstAd(){
       //closeAd.click();                                 // we can declare like this
        WebDriverUtil.waitElementUntilClickable(closeAd);
    }

    public void ClickOnDiscoverMoreBtn(){
        WebDriverUtil.waitElementUntilClickable(discoverMoreHomePageBtn);
    }
    public void moveToCoffeeFinderHomePage(){
        ActionsUtil.moveToElement(coffeeFinderHomePage);
    }

    public void ClickOnCoffeeFinderHomePage(){
       WebDriverUtil.waitElementUntilClickable(coffeeFinderHomePage);
    }

    public void moveToOurStoryHomePage(){
        ActionsUtil.moveToElement(ourStoryHomePage);
    }

    public void clickOnOurStoryHomePage(){
       WebDriverUtil.waitElementUntilClickable(ourStoryHomePage);
    }

    public void moveToShopHomePage(){
        ActionsUtil.moveToElement(shopHomePage);
    }
    public void clickOnShopHomePage(){
       WebDriverUtil.waitElementUntilClickable(shopHomePage);
    }

    public void moveToSubscriptionsHomePage(){
        ActionsUtil.moveToElement(subscriptionsHomePage);
    }

    public void clickOnSubscriptionsHomePage(){
       WebDriverUtil.waitElementUntilClickable(subscriptionsHomePage);
    }

    public void moveToBrewGuidesHomePage(){
        ActionsUtil.moveToElement(brewGuidesHomePage);
    }
    public void clickOnBrewGuidesHomePage(){
       WebDriverUtil.waitElementUntilClickable(brewGuidesHomePage);
    }

    public void moveToNewsHomePage(){
        ActionsUtil.moveToElement(newsHomePage);
    }
    public void clickOnNewsHomePage(){
       WebDriverUtil.waitElementUntilClickable(newsHomePage);
    }

    public void moveToWholesaleHomePage(){
        ActionsUtil.moveToElement(wholesaleHomePage);
    }
    public void clickOnWholesaleHomePage(){
       WebDriverUtil.waitElementUntilClickable(wholesaleHomePage);
    }

    public void clickOnSearchHomePage(){
       WebDriverUtil.waitElementUntilClickable(sendDataInSearch);
    }
    public void clickOnEmailHomePage(){
       WebDriverUtil.waitElementUntilClickable(emailHomePage);
    }
    public void moveToDiscoverMoreHomePageBtn(){
        ActionsUtil.moveToElement(discoverMoreHomePageBtn);
    }
    public void clickOnDiscoverMoreHomePageBtn(){
       WebDriverUtil.waitElementUntilClickable(discoverMoreHomePageBtn);
    }
    public void clickOnLoginAndRegister(){
       WebDriverUtil.waitElementUntilClickable(loginAndResister);
    }
    public void searchElementOnHomePage( String searchData){
        WebDriverUtil.waitElementUntilClickable(sendDataInSearch);
        WebElementUtil.sendKeysOnElement(sendDataInSearch, searchData );
        ActionsUtil.keyBoardEnterKey(sendDataInSearch);
    }
}
