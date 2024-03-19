package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class CoffeeFinderPage extends WebTestBase {

    @FindBy(xpath = "//button[@class='mc-closeModal']")
    WebElement closeCoffeePageAd;

    @FindBy(xpath = "//h1[text()='FIND A CAMPOS']")
    WebElement coffeeFinderPage;

    public CoffeeFinderPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickCoffeePageAd(){
        WebDriverUtil.waitElementUntilClickable(closeCoffeePageAd);
    }

    public String getTextOfCoffeeFinderPage(){

        return WebElementUtil.getTextOfElement(coffeeFinderPage);
    }
}
