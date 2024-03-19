package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class ResetPasswordSentMessage extends WebTestBase {
    @FindBy(xpath = "//div[@class='wc-block-components-notice-banner__content']")
    WebElement resetPasswordMessagePage;

    public ResetPasswordSentMessage(){

        PageFactory.initElements(driver, this);
    }
    public String resetPasswordMessage(){
            return WebElementUtil.getTextOfElement(resetPasswordMessagePage);
    }
}
