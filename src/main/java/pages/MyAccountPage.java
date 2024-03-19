package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class MyAccountPage extends WebTestBase {
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountElement;

public MyAccountPage() {

    PageFactory.initElements(driver,this);
}
public String getMyAccountElement(){

    return WebElementUtil.getTextOfElement(myAccountElement);
}
    public String getTextOfMyAccountPage(){

        return WebElementUtil.getTextOfElement(myAccountElement);
    }
}
