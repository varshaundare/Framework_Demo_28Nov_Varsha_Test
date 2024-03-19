package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    LoginTest(){
    super();
    }

    @BeforeMethod
    public void preRequisite(){
            initialization();
            homePage = new HomePage();
            loginPage = new LoginPage();
            myAccountPage = new MyAccountPage();
    }

    @Test(description = "Verify Login With Valid UserName And ValidPassword")
    public void verifyLoginWithValidUserNameAndValidPassword(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
           homePage.closeFirstAd();
           homePage.clickOnLoginAndRegister();
           loginPage.setLogin(prop.getProperty("userName"),prop.getProperty("password"));
           softAssert.assertEquals(myAccountPage.getMyAccountElement(),"MY ACCOUNT","My account text should be match");
           softAssert.assertAll();
    }

    @Test(description = "Verify Login With Invalid UserName And ValidPassword")
    public void verifyLoginWithInvalidUserNameAndValidPassword(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("Invalidusername"),prop.getProperty("password"));
        softAssert.assertEquals(loginPage.getTextOfErrorMessage(),"ERROR: The username or password you entered is incorrect. Lost your password?","Error message text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Verify Login With Valid UserName And InvalidPassword")
    public void verifyLoginWithValidUserNameAndInvalidPassword(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("userName"),prop.getProperty("Invalidpassword"));
        softAssert.assertEquals(loginPage.getTextOfErrorMessage(),"ERROR: The username or password you entered is incorrect. Lost your password?","Error message text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Verify Login With Invalid UserName And InvalidPassword")
    public void verifyLoginWithInvalidUserNameAndInvalidPassword(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("Invalidusername"),prop.getProperty("Invalidpassword"));
        softAssert.assertEquals(loginPage.getTextOfErrorMessage(),"ERROR: The username or password you entered is incorrect. Lost your password?","Error message text should be match");
        softAssert.assertAll();
    }
@Test (description = "Check if Remember Me TextBox is Selected")
public void checkRememberMeCheckBoxIsSelected(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
       // loginPage.setLogin(prop.getProperty("userName"), prop.getProperty("password"));
        softAssert.assertEquals(loginPage.rememberMeCheckBoxIsSelected(),"True","Checkbox is selected");
    softAssert.assertAll();
}

    @Test(description = "Verify lost your password link is working")
    public void lostYourPasswordLink(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.lostYourPassword();
       softAssert.assertEquals(loginPage.lostYourPassword(),"LOST YOUR","LOST YOUR PASSWORD PAGE should be get open");
        softAssert.assertAll();
    }

    @Test
    public void clickHereToRegister(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.clickHeretoRegister();
        softAssert.assertEquals(loginPage.clickHeretoRegister() ,"REGISTER","REGISTER PAGE should be get open");
        softAssert.assertAll();
    }

    @Test(description = "verify remember me checkbox is enable")
    public void verifyCheckboxIsEnabled(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.rememberMeBoxIsEnabled();
        softAssert.assertEquals(myAccountPage.getMyAccountElement(),"LOG IN");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){

        driver.close();
    }
}
