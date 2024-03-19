package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class LoginPage extends WebTestBase {
    @FindBy(id = "username")
    WebElement userNameTextBox;

     @FindBy(id = "password")
     WebElement passwordTextBox;

     @FindBy(name = "login")
     WebElement loginBtn;

     @FindBy(xpath = "//div[text()=': The username or password you entered is incorrect. ']")
     WebElement errorMessage;

     @FindBy(xpath = "//input[@class='woocommerce-Input woocommerce-Input--checkbox']")
     WebElement rememberMeCheckBox;

     @FindBy (xpath = "//a[text()= 'Lost your password?']")
     WebElement lostPassword;

     @FindBy(xpath = "//a[text()='Click here']")
     WebElement clickHereToRegister;

  public LoginPage(){

        PageFactory.initElements(driver,this);
    }
    public void setLogin(String userName, String password ){
      WebElementUtil.sendKeysOnElement(userNameTextBox,userName);
      WebElementUtil.sendKeysOnElement(passwordTextBox,password);
    // another way we used
        // userNameTextBox.sendKeys();
        WebDriverUtil.waitElementUntilClickable(rememberMeCheckBox);
       // WebElementUtil.clickableElement(rememberMeCheckBox);
        WebDriverUtil.waitElementUntilClickable(loginBtn);
    }

  public String lostYourPassword(){

      return WebDriverUtil.waitElementUntilClickable(lostPassword);
  }
    public String clickHeretoRegister(){
       return WebDriverUtil.waitElementUntilClickable(clickHereToRegister);

    }

    public String getTextOfErrorMessage(){

      return WebElementUtil.getTextOfElement(errorMessage);
    }
    public String rememberMeCheckBoxIsSelected(){
       WebElementUtil.clickableElement(rememberMeCheckBox);
       return null;
    }

    public void rememberMeBoxIsEnabled(){
        WebElementUtil.selectElement(rememberMeCheckBox);
    }
    public String clickOnLostPassword(){
      WebElementUtil.clickableElement(lostPassword);
      return null;
    }
}
