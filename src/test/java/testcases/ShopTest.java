package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.ShopPage;
import testbase.WebTestBase;


public class ShopTest extends WebTestBase {
    HomePage homePage;
    LoginPage loginPage;

    ShopPage shopPage;

    ShopTest(){
        super();
    }
    @BeforeMethod()
    public void preRequisite(){
        initialization();
        homePage=new HomePage();
        loginPage=new LoginPage();
        shopPage=new ShopPage();
    }
    @Test(description = " Verify user is able to select option from DropDown")
    public void verifyUserIsAbleSelectElementFromDropDown(){
        SoftAssert softAssert= new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnShopHomePage();
        homePage.closeFirstAd();
        shopPage.clickOnDropDown();
        shopPage.selectDropDown();
        softAssert.assertEquals(shopPage.getTextOfSelectedElement(),"SHOP");
        softAssert.assertAll();
    }


    @Test(description = "verify shop link is clickable")
    public void verifyShopLinkIsClickable(){
        SoftAssert softAssert= new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnShopHomePage();
        shopPage.clickOnDropDown();
        softAssert.assertEquals(shopPage.getTextOfSelectedElement(),"SHOP");
        softAssert.assertAll();
    }

    @Test(description = "verify user is able to find a product using filters")
    public void verifyFiltersButton(){
        SoftAssert softAssert= new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnShopHomePage();
        homePage.closeFirstAd();
        shopPage.clickOnFiltersBtn();
        softAssert.assertEquals(shopPage.getTextOfSelectedElement(),"SHOP");
        softAssert.assertAll();
    }
    @Test(description = "verify shop dropdown")
    public void VerifyShopDropdown(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAd();
        shopPage.MoveToShopElement();
        softAssert.assertEquals(shopPage.getTextOfSelectedElement(),"SHOP");
        softAssert.assertAll();
    }
    @Test(description = "verify user is able select element on shop dropdown")
    public void selectElementOnShopDropdown(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAd();
        shopPage.MoveToShopElement();
        shopPage.clickOnShopDropDown();
        softAssert.assertEquals(shopPage.getTextOfSelectedElement(),"SHOP");
        softAssert.assertAll();
    }

    @Test(description = "Verify functionality of shop Page ")
    public  void verifyShopPage(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("userName"), prop.getProperty("password"));
        shopPage.clickOnShopLink();
        homePage.closeFirstAd();
        shopPage.sampleProductSelect();
        shopPage.selectWeightFromDropDown();
        shopPage.ShopProducts();
        softAssert.assertEquals(shopPage.grtTextOfYourOrderPage(),"YOUR ORDER" , "Your Order text should be display");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
