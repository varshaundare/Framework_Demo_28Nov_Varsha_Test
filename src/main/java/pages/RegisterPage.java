package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class RegisterPage extends WebTestBase {

    @FindBy(xpath = "//h2[text()='Register']")
    WebElement registerPageElement;

    @FindBy(id="reg_email")
    WebElement registerPageEmailID;

    @FindBy(id ="reg_password")
    WebElement registerPagePassword;

    @FindBy(id="mailchimp_woocommerce_newsletter")
    WebElement registerPageCheckBox;

    @FindBy(name = "register")
    WebElement registerPageRegisterBtn;

    public void registerPage() {

        PageFactory.initElements(driver,this);
    }

    public RegisterPage(){

        PageFactory.initElements(driver,this);
    }

    public void register(String RegisterUserName , String RegisterPassword){
        WebElementUtil.sendKeysOnElement(registerPageEmailID, RegisterUserName);
        WebElementUtil.sendKeysOnElement(registerPagePassword, RegisterPassword);
        WebDriverUtil.waitElementUntilClickable(registerPageCheckBox);
        WebDriverUtil.waitElementUntilClickable(registerPageRegisterBtn);
    }
    public String registerElement(){

        return WebDriverUtil.waitElementUntilClickable(registerPageElement);
    }


}
