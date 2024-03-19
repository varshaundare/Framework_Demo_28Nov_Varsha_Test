package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class DiscoverMoreSearchPage extends WebTestBase {

    @FindBy(xpath = "//article[@class='content article-inner-content']")
    WebElement discoverMoreSearchPage;
    public DiscoverMoreSearchPage(){

        PageFactory.initElements(driver, this);
    }

    public String getTexOfDiscoverMoreSearchPage(){

        return WebElementUtil.getTextOfElement(discoverMoreSearchPage);
    }
}
