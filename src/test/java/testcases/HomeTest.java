package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;
import util.WebElementUtil;

public class HomeTest extends WebTestBase {
    HomePage homePage;
    CoffeeFinderPage coffeeFinderPage;
    OurStoryPage ourStoryPage;
    ShopPage shopPage;
    SubscriptionsPage subscriptionsPage;
    BrewGuidesPage brewGuidesPage;
    NewsPage newsPage;
    WholesalePage wholesalePage;

    SearchResultPage searchResultPage;

    DiscoverMoreSearchPage discoverMoreSearchPage;


    @BeforeMethod
    public void preRequisite(){
        initialization();
        homePage = new HomePage();
        coffeeFinderPage = new CoffeeFinderPage();
        ourStoryPage = new OurStoryPage();
        shopPage = new ShopPage();
        subscriptionsPage = new SubscriptionsPage();
        brewGuidesPage = new BrewGuidesPage();
        newsPage = new NewsPage();
        wholesalePage = new WholesalePage();
        searchResultPage = new SearchResultPage();
        discoverMoreSearchPage = new DiscoverMoreSearchPage();
    }

    @Test(description = "Mouse over on Coffee Finder so it shows dropdown option")
    public void mouseOverOnCoffeeFinder(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.moveToCoffeeFinderHomePage();
        softAssert.assertAll();
    }


@Test(description = "Click on Coffee Finder so next page get open")
public void clickOnCoffeeFinder(){
    SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
    homePage.closeFirstAd();
    homePage.ClickOnCoffeeFinderHomePage();
    softAssert.assertEquals(coffeeFinderPage.getTextOfCoffeeFinderPage() ,"FIND A CAMPOS \n" + "CAFE NEAR YOU","Coffee Finder Page text should be match");
    softAssert.assertAll();
}

@Test(description = "Mouse over on our story so it shows dropdown option")
public void mouseOverOnOurStory(){
    SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
    homePage.closeFirstAd();
    homePage.moveToOurStoryHomePage();
    softAssert.assertAll();
}

    @Test(description = "Click on Our Story so next page get open")
    public void clickOnOurStoryPage(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnOurStoryHomePage();
        softAssert.assertEquals(ourStoryPage.getTexOfOurStoryPage() ,"OUR HISTORY\n","Our Story Page text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Mouse over on Shop so it shows dropdown option")
    public void mouseOverOnShop(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.moveToShopHomePage();
        softAssert.assertAll();
    }

    @Test(description = "Click on Shop so next page get open")
    public void clickOnShop(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnShopHomePage();
        softAssert.assertEquals(shopPage.getTextOfSelectedElement() ,"SHOWING 22 OF 108 RESULTS","Shop Page text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Mouse over on Subscription so it shows dropdown option")
    public void mouseOverOnSubscription(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.moveToSubscriptionsHomePage();
        softAssert.assertAll();
    }

    @Test(description = "Click on Subscription so next page get open")
    public void clickOnSubscription(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnSubscriptionsHomePage();
        softAssert.assertEquals(subscriptionsPage.getTexOfSubscriptionPage() ,"SHOWING 2 OF 2 RESULTS","Subscription Page text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Mouse over on Brew Guides so it shows dropdown option")
    public void mouseOverOnBrewGuides(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.moveToBrewGuidesHomePage();
        softAssert.assertAll();
    }

    @Test(description = "Click on  Brew Guides so next page get open")
    public void clickOnBrewGuides(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnBrewGuidesHomePage();
        softAssert.assertEquals(brewGuidesPage.getTexOfBrewGuidePage() ,"\n" + "FEATURED ARTICLE\n" + "HOW TO BREW: ESPRESSO AT HOME\n","Brew Guides Page text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Mouse over on News so it shows dropdown option")
    public void mouseOverOnNews(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.moveToNewsHomePage();
        softAssert.assertAll();
    }

    @Test(description = "Click on News so next page get open")
    public void clickOnNews(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnNewsHomePage();
        softAssert.assertEquals(newsPage.getTexOfNewsPage() ,"\n" + "FEATURED ARTICLE\n" + "HOME COMPOSTABLE TAKEAWAY CUPS","News Page text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Mouse over on Whole Sale so it shows dropdown option")
    public void mouseOverOnWholeSale(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.moveToWholesaleHomePage();
        softAssert.assertAll();
    }

    @Test(description = "Click on Whole Sale so next page get open")
    public void clickOnWholeSale(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnWholesaleHomePage();
        softAssert.assertEquals(wholesalePage.getTexOfWholesalePage() ,"PARTNERING WITH CAMPOS","Wholesale Page text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Mouse over on Discover More so it shows dropdown option")
    public void mouseOverOnDiscoverMore(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.moveToDiscoverMoreHomePageBtn();
        softAssert.assertAll();
    }

    @Test(description = "Click on Discover More button so next page get open")
    public void clickOnDiscoverMore(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnDiscoverMoreHomePageBtn();
        softAssert.assertEquals(discoverMoreSearchPage.getTexOfDiscoverMoreSearchPage() ,"CUP OF EXCELLENCE® MONTH AT CAMPOS","Page text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Click on Search so we can add data in textbox")
    public void clickOnSearch(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.clickOnSearchHomePage();
        softAssert.assertAll();
    }

    @Test
    public void searchDataOnHomePage(){
        SoftAssert softAssert=new SoftAssert();                            // for validation compulsary we have to use softassert object
        homePage.closeFirstAd();
        homePage.searchElementOnHomePage(prop.getProperty("searchData"));
        softAssert.assertEquals(searchResultPage.getTextOfSearchResultPage(),"DARK CITY","Result page copy should match");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
