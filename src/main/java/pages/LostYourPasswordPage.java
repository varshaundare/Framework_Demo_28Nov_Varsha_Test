package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class LostYourPasswordPage extends WebTestBase {

    @FindBy(xpath = "//h2[@class='account-title']")
    WebElement lostYourPasswordElement;

    @FindBy(xpath = "//input[@id='user_login']")
    WebElement forgotPasswordEmailIDTextBox;

    @FindBy(xpath = "//input[@class='woocommerce-Button button']")
    WebElement resetPasswordBtn;

    public LostYourPasswordPage() {

        PageFactory.initElements(driver, this);
    }

    public void resetNewPassword(String userName){
        WebElementUtil.sendKeysOnElement(forgotPasswordEmailIDTextBox, userName );
        WebDriverUtil.waitElementUntilClickable(resetPasswordBtn);
    }



}
