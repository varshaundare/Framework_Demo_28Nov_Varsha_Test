package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class WholesalePage extends WebTestBase {
    @FindBy(xpath = "//div[@class='grid-x align-middle align-center']")
    WebElement wholesalePage;
    public WholesalePage(){

        PageFactory.initElements(driver, this);
    }
    public String getTexOfWholesalePage(){

        return WebElementUtil.getTextOfElement(wholesalePage);
    }
}
