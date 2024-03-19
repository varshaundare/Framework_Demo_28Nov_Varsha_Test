package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class SearchResultPage extends WebTestBase {
    @FindBy(xpath = "search_results")
    WebElement searchResultPage;

    public SearchResultPage(){
        PageFactory.initElements(driver, this);
    }
    public String getTextOfSearchResultPage(){

        return WebElementUtil.getTextOfElement(searchResultPage);
    }
}
