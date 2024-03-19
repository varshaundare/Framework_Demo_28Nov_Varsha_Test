package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class LostYourPasswordPageTest extends WebTestBase {
    HomePage homePage;
    LoginPage loginPage;
    LostYourPasswordPage lostYourPasswordPage;
    ResetPasswordSentMessage resetPasswordSentMessage;
    MyAccountPage myAccountPage;

  /*   ResetPasswordTest(){
        super();
    }*/

    @BeforeMethod
    public void preRequisite(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        lostYourPasswordPage = new LostYourPasswordPage();
        resetPasswordSentMessage = new ResetPasswordSentMessage();
    }

    @Test(description = "Verify Login With Valid UserName")
    public void verifyLoginWithValidUserName(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.lostYourPassword();
        lostYourPasswordPage.resetNewPassword(prop.getProperty("userName"));
        softAssert.assertEquals(resetPasswordSentMessage.resetPasswordMessage(),"Password reset email has been sent.","Password reset email has been sent.");
        softAssert.assertAll();
    }

    @Test(description = "Verify Login With InValid UserName")
    public void verifyLoginWithInValidUserName(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.lostYourPassword();
        lostYourPasswordPage.resetNewPassword(prop.getProperty("Invalidusername"));
        softAssert.assertEquals(resetPasswordSentMessage.resetPasswordMessage(),"THANK YOU","Password reset email has been sent.");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){

        driver.close();
    }

}

