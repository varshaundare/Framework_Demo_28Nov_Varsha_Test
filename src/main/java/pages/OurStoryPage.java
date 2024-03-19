package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class OurStoryPage extends WebTestBase {

    @FindBy(xpath = "//h1[text()='our history']")
    WebElement ourStoryPage;

    public OurStoryPage(){

        PageFactory.initElements(driver, this);
    }
    public String getTexOfOurStoryPage(){

        return WebElementUtil.getTextOfElement(ourStoryPage);
    }

}
