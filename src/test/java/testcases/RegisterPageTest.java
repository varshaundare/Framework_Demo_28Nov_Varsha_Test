package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegisterPage;
import testbase.WebTestBase;

public class RegisterPageTest extends WebTestBase {
    HomePage homePage;
    LoginPage loginPage;

    RegisterPage registerPage;

    MyAccountPage myAccountPage;

   /* RegisterTest(){

        super();
    }*/

    @BeforeMethod
    public void preRequisite() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        myAccountPage = new MyAccountPage();
    }

    @Test(description = "Verify Register Page Login With Valid UserName And ValidPassword")
    public void verifyRegisterLoginWithValidUserNameAndValidPassword() {
        SoftAssert softAssert = new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.clickHeretoRegister();
        registerPage.register(prop.getProperty("RegisterUserName"), prop.getProperty("RegisterPassword"));
        softAssert.assertEquals(myAccountPage.getMyAccountElement(),"MY ACCOUNT","My account text should be match");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}