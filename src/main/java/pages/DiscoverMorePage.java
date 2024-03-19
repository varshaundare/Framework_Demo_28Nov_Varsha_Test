package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class DiscoverMorePage extends WebTestBase {

    @FindBy(id= "article")
    WebElement discoverMorePage;

    public DiscoverMorePage(){

        PageFactory.initElements(driver, this);
    }

    public String getTextOfDiscoverMorePage(){

        return WebElementUtil.getTextOfElement(discoverMorePage);
    }
}
