package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class BrewGuidesPage extends WebTestBase {
    @FindBy(xpath = "//span[@class ='featured_article-background']")
    WebElement brewGuidePage;
    public BrewGuidesPage(){

        PageFactory.initElements(driver, this);
    }
    public String getTexOfBrewGuidePage(){

        return WebElementUtil.getTextOfElement(brewGuidePage);
    }
}
