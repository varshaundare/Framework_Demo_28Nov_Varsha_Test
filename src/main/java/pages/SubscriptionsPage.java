package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class SubscriptionsPage extends WebTestBase {

    @FindBy(xpath = "//div[@class = 'filter-bar__inner__section__results']")
    WebElement subscriptionPage;

    public SubscriptionsPage() {

        PageFactory.initElements(driver, this);
    }

    public String getTexOfSubscriptionPage() {

        return WebElementUtil.getTextOfElement(subscriptionPage);
    }
}